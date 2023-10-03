package benchmark;

import EOorg.EOeolang.EOrust;
import EOorg.EOeolang.EOrust_sqrtTest;
import benchmark.src.EoSqrt;
import benchmark.src.RustSqrt;
import org.eolang.Dataized;
import org.eolang.Phi;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

public class BenchmarkRunner {
    public static void main(String[] args) throws Exception {
        Object obj = new Dataized(new EOrust_sqrtTest()).take();
        org.openjdk.jmh.Main.main(args);
    }

//    @Benchmark
//    @BenchmarkMode(Mode.AverageTime)
    // 0.041 s
    public void eoSqrtFUll() {
        new Dataized(new EoSqrt()).take();
    }


    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void rustSqrtFull() {
        new Dataized(new RustSqrt()).take();
    }
}
