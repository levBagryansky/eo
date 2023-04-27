/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016-2023 Objectionary.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.eolang.maven.rust_project;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.cactoos.list.ListOf;
import org.eolang.maven.footprint.FtDefault;
import org.eolang.maven.util.Home;

/**
 * Uniquely converts the insert into the name for jni function.
 * @since 0.30
 */
public final class Names {

    /**
     * Target directory.
     * @checkstyle MemberNameCheck (7 lines)
     */
    private final Path dest;

    /**
     * All names.
     */
    private final ConcurrentHashMap<String, String> all;

    /**
     * Prefix for the name.
     */
    private final String prefix;

    /**
     * Ctor.
     * @param target Directory where to serialize names.
     * @throws IOException If any issues with IO.
     */
    @SuppressWarnings("PMD.ConstructorOnlyInitializesOrCallOtherConstructors")
    public Names(final Path target) throws IOException {
        this.dest = target.resolve("names");
        this.prefix = target.toString().toLowerCase(Locale.ENGLISH).replaceAll("[^a-z0-9]", "x");
        if (this.dest.toFile().exists()) {
            this.all = Names.load(this.dest);
        } else {
            this.all = new ConcurrentHashMap<>();
        }
    }

    /**
     * Assign the new name to the function.
     * @param code Code of the function.
     * @param dependencies Function dependencies.
     * @return The name.
     */
    public String name(final String code, final String dependencies) {
        return this.all.computeIfAbsent(
            new ListOf<>(code, dependencies).toString(),
            key -> String.format(
                "%s%d",
                this.prefix,
                this.all.size()
            )
        );
    }

    /**
     * Saves the function to name dispatching table.
     * @throws IOException If any issues with IO.
     */
    public void save() throws IOException {
        Files.createDirectories(this.dest.getParent());
        StringWriter sw = new StringWriter();

        CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
            .setHeader(new String[]{"code", "name"})
            .build();

        try (final CSVPrinter printer = new CSVPrinter(sw, csvFormat)) {
            this.all.forEach((code, name) -> {
                try {
                    printer.printRecord(code, name);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            new Home(this.dest.getParent()).save(
                sw.toString(),
                this.dest.getFileName()
            );
        }

    }

    /**
     * Loads the table.
     * @param src Path where to install from.
     * @return The map.
     * @throws IOException If any issues with IO.
     */
    private static ConcurrentHashMap<String, String> load(final Path src) throws IOException {
        final String content = new FtDefault(src.getParent()).load(
            src.getFileName().toString(),
            ""
        );
        CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
            .setHeader("code", "name")
            .setSkipHeaderRecord(true)
            .build();

        Iterable<CSVRecord> records = csvFormat
            .parse(new StringReader(content));

        ConcurrentHashMap<String, String> res = new ConcurrentHashMap<>();
        for (CSVRecord record : records) {
            res.put(record.get("code"), record.get("name"));
        }
        return res;
    }
}
