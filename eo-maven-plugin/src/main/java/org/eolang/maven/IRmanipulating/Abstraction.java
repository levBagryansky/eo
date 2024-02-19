package org.eolang.maven.IRmanipulating;

import java.util.List;

public class Abstraction extends Expression {

    final List<String> frees;

    final List<BoundAttribute> bound;

    public Abstraction(List<String> frees, List<BoundAttribute> bound) {
        this.frees = frees;
        this.bound = bound;
    }
}
