package org.eolang.maven.IRmanipulating;

import java.util.List;

public class Abstraction extends Expression {

    final List<FreeeAttribute> frees;

    final List<BoundAttribute> bounds;

    public Abstraction(List<FreeeAttribute> frees, List<BoundAttribute> bound) {
        this.frees = frees;
        this.bound = bound;
    }
}
