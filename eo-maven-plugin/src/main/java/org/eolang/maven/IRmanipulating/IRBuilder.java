package org.eolang.maven.IRmanipulating;

public interface IRBuilder {
    IRSimpleBuilder with(final String name, final Expression expression);

    IRSimpleBuilder with(final BoundAttribute bound);

    Link getLinkTo(final String name);

    IR build();
}
