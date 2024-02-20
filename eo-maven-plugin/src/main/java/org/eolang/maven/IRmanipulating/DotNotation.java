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
        final String[] rightLines = right.toString().split("\n");
        builder.append(".").append(rightLines[0]);
        final String[] leftLines = left.toString().split("\n");
        for (final String line: leftLines) {
            builder.append("\n").append("  ").append(line);
        }
        for (int i = 1; i < rightLines.length; i++) {
            builder.append("\n").append(rightLines[i]);
        }
        return builder.toString();
    }
}
