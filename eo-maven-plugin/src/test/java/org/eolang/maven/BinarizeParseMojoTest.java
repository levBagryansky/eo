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
package org.eolang.maven;

import java.nio.file.Path;
import java.util.Map;
import org.cactoos.text.TextOf;
import org.eolang.jucs.ClasspathSource;
import org.eolang.maven.rust.Names;
import org.eolang.xax.XaxStory;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;

/**
 * Test case for {@link BinarizeParseMojo}.
 *
 * @since 0.1
 */
@Execution(ExecutionMode.CONCURRENT)
final class BinarizeParseMojoTest {

    @Test
    void parsesSimpleEoProgram(@TempDir final Path temp) throws Exception {
        final Path src = BinarizeMojoTest.SRC.resolve("simple-rust.eo");
        final FakeMaven maven;
        synchronized (BinarizeParseMojoTest.class) {
            maven = new FakeMaven(temp).withProgram(src);
        }
        final Map<String, Path> res = maven
            .execute(new FakeMaven.BinarizeParse())
            .result();
        final String function = String.format(
            "%s0",
            Names.PREFIX
        );
        final String rust = String.format(
            "target/binarize/codes/%s.rs",
            function
        );
        MatcherAssert.assertThat(
            res, Matchers.hasKey(rust)
        );
        MatcherAssert.assertThat(
            new TextOf(res.get(rust)).asString(),
            Matchers.stringContainsInOrder(
                "use rand::Rng;",
                "pub fn foo(_env: &EOEnv) -> Option<EO> {",
                "  let mut rng = rand::thread_rng();",
                "  print!(\"Hello world\");",
                "  let i = rng.gen::<i64>();",
                "  Some(EOInt(i))",
                "}"
            )
        );
        MatcherAssert.assertThat(
            new TextOf(
                res.get(
                    String.format(
                        "target/generated/EOrust/natives/%s.java",
                        function
                    )
                )
            ).asString(),
            Matchers.containsString("public static native byte[]")
        );
    }

    @Test
    void binarizesTwiceRustProgram(@TempDir final Path temp) throws Exception {
        final Path src = BinarizeMojoTest.SRC.resolve("twice-rust.eo");
        final FakeMaven maven;
        synchronized (BinarizeParseMojoTest.class) {
            maven = new FakeMaven(temp).withProgram(src);
        }
        final Map<String, Path> res = maven
            .execute(new FakeMaven.BinarizeParse())
            .result();
        final String one = String.format(
            "target/binarize/codes/%s0.rs",
            Names.PREFIX
        );
        final String two = String.format(
            "target/binarize/codes/%s1.rs",
            Names.PREFIX
        );
        MatcherAssert.assertThat(
            res, Matchers.hasKey(one)
        );
        MatcherAssert.assertThat(
            res, Matchers.hasKey(two)
        );
        MatcherAssert.assertThat(
            new TextOf(res.get(one)).asString(),
            Matchers.stringContainsInOrder(
                "use eo_env::eo_enum::EO;",
                "use eo_env::eo_enum::EO::{EOInt};",
                "pub fn foo(_env: &EOEnv) -> Option<EO> {",
                "println!(\"{}\", x);"
            )
        );
        MatcherAssert.assertThat(
            new TextOf(res.get(two)).asString(),
            Matchers.stringContainsInOrder(
                "use eo_env::eo_enum::EO;",
                "use eo_env::eo_enum::EO::{EOInt};",
                "pub fn foo(_env: &EOEnv) -> Option<EO> {",
                "print!(\"Hello 大 2\");"
            )
        );
    }

    @ParameterizedTest
    @ClasspathSource(value = "org/eolang/maven/binarize/add_rust/", glob = "**.yaml")
    void createsDependenciesSection(final String yaml) {
        MatcherAssert.assertThat(
            new XaxStory(yaml),
            Matchers.is(true)
        );
    }

    @Test
    void createsCorrectRustProject(@TempDir final Path temp) throws Exception {
        final FakeMaven maven;
        synchronized (BinarizeParseMojoTest.class) {
            maven = new FakeMaven(temp)
                .withProgram(BinarizeMojoTest.SRC.resolve("simple-rust.eo"))
                .withProgram(BinarizeMojoTest.SRC.resolve("twice-rust.eo"));
        }
        final Map<String, Path> res = maven
            .execute(new FakeMaven.BinarizeParse())
            .result();
        final String dir = String.format(
            "target/Lib/%s1/",
            Names.PREFIX
        );
        final String cargo = dir.concat("Cargo.toml");
        final String lib = dir.concat("src/lib.rs");
        final String module = String.format(
            "%ssrc/foo.rs",
            dir
        );
        MatcherAssert.assertThat(
            res, Matchers.hasKey(cargo)
        );
        MatcherAssert.assertThat(
            res, Matchers.hasKey(lib)
        );
        MatcherAssert.assertThat(
            res, Matchers.hasKey(module)
        );
        MatcherAssert.assertThat(
            new TextOf(res.get(cargo)).asString(),
            Matchers.stringContainsInOrder(
                "[lib]",
                "crate-type = [\"cdylib\"]",
                "[dependencies]",
                "jni = \"0.21.1\""
            )
        );
        MatcherAssert.assertThat(
            new TextOf(res.get(cargo)).asString(),
            Matchers.stringContainsInOrder(
                "[dependencies]",
                "rand = \"0.5.5\""
            )
        );
    }

}
