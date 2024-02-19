package org.eolang.maven.IRmanipulating;

public class Named implements Node {
    final String name;
    final Expression left;

    public Named(String name, Expression left) {
        this.name = name;
        this.left = left;
    }
}
