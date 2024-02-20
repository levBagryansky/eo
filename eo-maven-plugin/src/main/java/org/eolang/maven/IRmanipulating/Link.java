package org.eolang.maven.IRmanipulating;


public class Link extends Expression {

    Attribute source;

    public Link(Attribute source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return  source.name();
    }
}
