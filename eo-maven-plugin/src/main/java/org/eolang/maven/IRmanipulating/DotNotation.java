package org.eolang.maven.IRmanipulating;

public class DotNotation extends Expression {
    final Expression left;
    final Expression right;

    public DotNotation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(".").append(right.toString());
        final String[] lines = left.toString().split("\n");
        for (final String line: lines) {
            builder.append("\n").append("  ").append(line);
        }
        return builder.toString();
    }
}