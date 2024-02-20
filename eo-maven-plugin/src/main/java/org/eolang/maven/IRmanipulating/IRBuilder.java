package org.eolang.maven.IRmanipulating;

import java.util.ArrayList;
import java.util.List;

public class IRBuilder {

    final List<BoundAttribute> attrs;

    public IRBuilder() {
        this.attrs = new ArrayList<>();
    }

    public IRBuilder with(final String name, final Expression expression) {
        this.attrs.add(
            new BoundAttribute(name, expression)
        );
        return this;
    }
}
