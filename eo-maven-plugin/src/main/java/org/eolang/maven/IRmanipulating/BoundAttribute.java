package org.eolang.maven.IRmanipulating;

public class BoundAttribute implements Attribute {
    String name;
    final Expression left;

    public BoundAttribute(String name, Expression left) {
        this.name = name;
        this.left = left;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String toString() {
        final String[] left = this.left.toString().split("\n");
        final StringBuilder builder = new StringBuilder();
        builder.append(left[0]).append(" > ").append(name).append("\n");
        if (left.length > 1) {
            for (int i = 1; i < left.length; i++) {
                builder.append("").append(left[i]).append("\n");
            }
        }
        return builder.deleteCharAt(builder.length()-1).toString();
    }
}
