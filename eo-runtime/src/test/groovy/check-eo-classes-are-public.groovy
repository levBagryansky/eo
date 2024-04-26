/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2016-2024 Objectionary.com
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

import com.sun.org.apache.bcel.internal.classfile.ClassParser
import com.sun.org.apache.bcel.internal.classfile.JavaClass
import java.nio.file.Files
import java.nio.file.Path
import java.util.stream.Collectors
import java.util.stream.Stream

println 'Verify that all java classes named with EO are public'
Path[] sources = [
    basedir.toPath().resolve("target").resolve("classes"),
    basedir.toPath().resolve("target").resolve("test-classes"),
]
Collection<JavaClass> violations = stream_of(sources)
  .filter(it -> {
    println(it.toString())
    it.toString().endsWith(".class") &&
      it.toFile().getName().startsWith("EO")
  })
  .map(path -> new ClassParser(path.toString()).parse())
  .filter (clazz -> should_be_public(clazz))
  .filter (clazz -> !clazz.isPublic())
  .collect(Collectors.toList())
if (!violations.isEmpty()) {
  throw new IllegalStateException(
    String.format(
      "Not all EO classes are public: %s\n",
      violations
    )
  )
}

static Stream<Path> stream_of(Path[] paths) {
    println("start")
    Stream<Path> accum = Stream.empty()
    println("mid")
    for (path in paths) {
        accum = Stream.concat(
            accum,
            Files.walk(path)
        )
        println("mid")
    }
    println("finish")
    return accum
}

static boolean should_be_public(JavaClass clazz) {
    return clazz.className.startsWith("EO") &&
      !clazz.isNested() &&
      !clazz.className.endsWith("Test")
}
