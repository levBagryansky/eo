package org.eolang.maven.IRmanipulating;

import java.util.List;

public class Application extends Expression {

    Expression source;
    final List<Expression> args;

    public Application(final Expression source, final List<Expression> args) {
        this.source = source;
        this.args = args;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(this.source);
        for (final Expression arg: args) {
            final String[] lines = arg.toString().split("\n");
            for (final String line: lines) {
                builder.append("\n").append("  ").append(line);
            }
        }
        return builder.toString();
    }
}
