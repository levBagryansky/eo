package benchmark;

import benchmark.src.EoSqrt;
import org.eolang.Dataized;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

public class EoSqrtFull {

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public static void dataize() {
        new Dataized(new EoSqrt()).take();
    }
}
