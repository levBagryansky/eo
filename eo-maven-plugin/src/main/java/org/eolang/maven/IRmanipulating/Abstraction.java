package org.eolang.maven.IRmanipulating;

import java.util.ArrayList;
import java.util.List;

public class Abstraction extends Expression {

    final List<FreeAttribute> frees;

    final List<BoundAttribute> bounds;

    public Abstraction(List<FreeAttribute> frees, List<BoundAttribute> bound) {
        this.frees = frees;
        this.bounds = bound;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("[");
        frees.forEach(att -> builder.append(att.name()).append(" "));
        builder.append("]");
        builder.append("\n");
        bounds.forEach(att -> {
            final String[] lines = att.toString().split("\n");
            for (final String line : lines) {
                builder.append("").append(line).append("\n");
            }
        });
        return builder.deleteCharAt(builder.length()-1).toString();
    }
}
