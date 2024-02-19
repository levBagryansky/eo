package org.eolang.maven.IRmanipulating;

import java.util.List;

public class Abstraction extends Expression {

    final List<String> frees;

    final List<Named> bound;

    public Abstraction(List<String> frees, List<Named> bound) {
        this.frees = frees;
        this.bound = bound;
    }
}
