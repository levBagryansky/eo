package org.eolang.maven.IRmanipulating;

import java.util.List;

public class IR implements Node {
    final List<BoundAttribute> attrs;

    public IR(List<BoundAttribute> attributes) {
        this.attrs = attributes;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (final BoundAttribute attr: attrs) {
            builder.append(attr);
            builder.append("\n");
        }
        return builder.deleteCharAt(builder.length()-1).toString();
    }
}
