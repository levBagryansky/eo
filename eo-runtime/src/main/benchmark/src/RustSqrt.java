package benchmark.src;

import EOorg.EOeolang.EOrust;
import org.eolang.*;

@XmirObject(name = "rust-sqrtTest", oname = "rust-sqrt", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/rust-tests.eo")
public final class RustSqrt extends PhDefault {

    public static void main(String[] args) {
        System.out.println(EOrust.class);
        RustSqrt rustSqrt = new RustSqrt();
        new Dataized(rustSqrt).take();
    }

    public RustSqrt() {
        this.add("a", new AtOnce(new AtComposite(this, rho -> {
            Phi ret = new EOorg.EOeolang.EOfloat(Phi.Φ);
            ret = new PhLocated(ret, 242, 2, "Φ.org.eolang.rust-sqrt.a");
            ret = new PhWith(ret, "Δ", new Data.Value<>(4.0d));
            return ret;
        })));
        this.add("sqrt", new AtOnce(new AtComposite(this, rho -> {
            Phi ret_base_base_base = Phi.Φ;
            ret_base_base_base = new PhLocated(ret_base_base_base, 243, 2, "Φ.org.eolang.rust-sqrt.sqrt.ρ.ρ.ρ");
            Phi ret_base_base = new PhMethod(ret_base_base_base, "org");
            ret_base_base = new PhLocated(ret_base_base, 243, 2, "Φ.org.eolang.rust-sqrt.sqrt.ρ.ρ");
            Phi ret_base = new PhMethod(ret_base_base, "eolang");
            ret_base = new PhLocated(ret_base, 243, 2, "Φ.org.eolang.rust-sqrt.sqrt.ρ");
            Phi ret = new PhMethod(ret_base, "rust");
            ret = new PhLocated(ret, 243, 4, "Φ.org.eolang.rust-sqrt.sqrt");
            ret = new PhCopy(ret);
            Phi ret_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
            ret_1 = new PhLocated(ret_1, 244, 4, "Φ.org.eolang.rust-sqrt.sqrt.α0");
            ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>("use eo_env::EOEnv;\nuse eo_env::eo_enum::EO;\nuse eo_env::eo_enum::EO::{EOFloat};\nuse byteorder::{BigEndian, ReadBytesExt};\n\npub fn foo(env: &mut EOEnv) -> EO {\n  let v = env.find(\"^.a\") as u32;\n  let bytes_a = env.dataize(v).unwrap();\n  let mut arr_a = unsafe { &*(&bytes_a[0..] as *const _  as *const [u8]) };\n  let a = arr_a.read_f64::<BigEndian>().unwrap();\n\n  EOFloat(a.sqrt())\n}"));
            Phi ret_2 = Phi.Φ.attr("org").get().attr("eolang").get().attr("tuple").get();
            ret_2 = new PhLocated(ret_2, 259, 4, "Φ.org.eolang.rust-sqrt.sqrt.α1");
            Phi[] ret_2_a = new Phi[2];
            Phi ret_2_a0 = new EOω1t1$EOt2$EOa0(rho);
            ret_2_a0 = new PhLocated(ret_2_a0, 260, 6, "Φ.org.eolang.rust-sqrt.sqrt.α1.α0");
            ret_2_a[0] = ret_2_a0;
            Phi ret_2_a1 = new EOorg.EOeolang.EOstring(Phi.Φ);
            ret_2_a1 = new PhLocated(ret_2_a1, 261, 6, "Φ.org.eolang.rust-sqrt.sqrt.α1.α1");
            ret_2_a1 = new PhWith(ret_2_a1, "Δ", new Data.Value<>("byteorder:1.4.3"));
            ret_2_a[1] = ret_2_a1;
            ret_2 = new PhWith(new PhCopy(ret_2), "Δ", new Data.Value<Phi[]>(ret_2_a));
            ret = new PhWith(ret, 0, ret_1);
            ret = new PhWith(ret, 1, ret_2);
            return ret;
        })));
        this.add("φ", new AtOnce(new AtComposite(this, rho -> {
            Phi ret_base = new PhMethod(rho, "sqrt");
            ret_base = new PhLocated(ret_base, 263, 4, "Φ.org.eolang.rust-sqrt.φ.ρ");
            Phi ret = new PhMethod(ret_base, "eq");
            ret = new PhLocated(ret, 262, 2, "Φ.org.eolang.rust-sqrt.φ");
            ret = new PhCopy(ret);
            Phi ret_1 = new EOorg.EOeolang.EOfloat(Phi.Φ);
            ret_1 = new PhLocated(ret_1, 264, 4, "Φ.org.eolang.rust-sqrt.φ.α0");
            ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(2.0d));
            ret = new PhWith(ret, 0, ret_1);
            return ret;
        })));
    }


    // <o abstract="" ancestors="1" line="260" loc="Φ.org.eolang.rust-sqrt$t1$t2$a0" name="rust-sqrt$t1$t2$a0" parent="rust-sqrt" pos="6"/>
    @XmirObject(name = "ω1t1$t2$a0", oname = "ω1t1$t2$a0", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/rust-tests.eo")
    public final class EOω1t1$EOt2$EOa0 extends PhDefault {
        public EOω1t1$EOt2$EOa0(final Phi sigma) {
            super(sigma);
        }
    }
}
