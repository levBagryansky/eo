package org.eolang.maven.IRmanipulating;

import org.cactoos.list.ListOf;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class IRdemoTest {

    @Test
    void buildsSimpleEO() {
        final IRBuilder builder = new IRSimpleBuilder();
        builder.with("world", new Abstraction(new ArrayList<>(), new ArrayList<>()));
        final Link world = builder.getLinkTo("world");
        builder.with(
            "person",
            new Abstraction(
                new ArrayList<>(),
                new ListOf<>(
                    new BoundAttribute("@", world)
                )
            )
        );
        IR ir = builder.build();
        System.out.println(ir);
    }
}
