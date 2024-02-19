package org.eolang.maven.IRmanipulating;

public class BoundAttribute implements Attribute {
    final String name;
    final Expression left;

    public BoundAttribute(String name, Expression left) {
        this.name = name;
        this.left = left;
    }
}
