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
        System.out.println();
    }

    @Test
    void romanKorostinskiy() {
        final IRBuilder builder = new IRSimpleBuilder();
        builder.with("world", new Abstraction(new ArrayList<>(), new ArrayList<>()));
        final Link world = builder.getLinkTo("world");
        builder.with("obj1", new Abstraction(new ArrayList<>(), new ArrayList<>()));
        final Link obj1 = builder.getLinkTo("obj1");
        builder.with("obj2", new Abstraction(new ArrayList<>(), new ArrayList<>()));
        final Link obj2 = builder.getLinkTo("obj2");
        builder.with("obj3", new Abstraction(new ArrayList<>(), new ArrayList<>()));
        final Link obj3 = builder.getLinkTo("obj3");
        builder.with(
            "person",
            new Abstraction(
                new ArrayList<>(),
                new ListOf<>(
                    new BoundAttribute("@", new DotNotation(new Application(world, new ListOf<>(obj1)), new Application(obj2, new ListOf<>(obj3))))
                )
            )
        );
        builder.with(
            "person2",
            new Abstraction(
                new ArrayList<>(),
                new ListOf<>(
                    new BoundAttribute("@", new Application(obj1, new ListOf<>(obj2, obj3)))
                )
            )
        );
        IR ir = builder.build();
        System.out.println(ir);
    }
}
