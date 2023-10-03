package benchmark;

import benchmark.src.RustSqrt;
import org.eolang.Dataized;

public class RustSqrtFull {


    public static void dataize() {
        new Dataized(new RustSqrt()).take();
    }
}
