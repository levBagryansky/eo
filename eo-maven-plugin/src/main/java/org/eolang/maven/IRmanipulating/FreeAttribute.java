package org.eolang.maven.IRmanipulating;

public class FreeAttribute implements Attribute {
    private String name;

    public FreeAttribute(final String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }
}
