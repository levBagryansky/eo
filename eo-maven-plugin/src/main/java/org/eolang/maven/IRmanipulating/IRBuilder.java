package org.eolang.maven.IRmanipulating;

import java.util.ArrayList;
import java.util.List;

public class IRBuilder {

    final List<BoundAttribute> attrs;

    public IRBuilder() {
        this.attrs = new ArrayList<>();
    }

    public IRBuilder with(final String name, final Expression expression) {
        this.with(new BoundAttribute(name, expression));
        return this;
    }

    public IRBuilder with(final BoundAttribute bound) {
        this.attrs.add(bound);
        return this;
    }

    public Link getLinkTo(final String name) {
        final Attribute source = attrs.stream().filter(attr -> name.equals(attr.name())).findFirst().orElseThrow(
            () -> new IllegalArgumentException(String.format("No attribute %s found", name))
        );
        return new Link(source);
    }

    public IR build() {
        return new IR(attrs);
    }
}
