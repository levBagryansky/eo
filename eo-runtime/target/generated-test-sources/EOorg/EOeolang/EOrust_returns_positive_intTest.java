
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="29" loc="Φ.org.eolang.rust-returns-positive-int" name="rust-returns-positive-int" original-name="rust-returns-positive-int" pos="0"> 
//   <o base=".rust" line="30" loc="Φ.org.eolang.rust-returns-positive-int.r" name="r" pos="4"> 
//     <o base=".eolang" line="30" loc="Φ.org.eolang.rust-returns-positive-int.r.ρ" pos="2"> 
//       <o base=".org" line="30" loc="Φ.org.eolang.rust-returns-positive-int.r.ρ.ρ" pos="2"> 
//         <o base="Q" line="30" loc="Φ.org.eolang.rust-returns-positive-int.r.ρ.ρ.ρ" pos="2"/>
//       </o>
//     </o>
//     <o base="org.eolang.string" data="string" line="31" loc="Φ.org.eolang.rust-returns-positive-int.r.α0" pos="4">use eo_env::EOEnv;\nuse eo_env::eo_enum::EO;\nuse eo_env::eo_enum::EO::{EOInt};\n\npub fn foo(_env: &mut EOEnv) -> Option<EO> {\n  println!(\"Hello world from rust\");\n  Some(EOInt(2))\n}</o>
//     <o base="org.eolang.tuple" data="tuple" line="41" loc="Φ.org.eolang.rust-returns-positive-int.r.α1" pos="4"> 
//       <o base="rust-returns-positive-int$t0$t2$a0" cut="4" line="42" loc="Φ.org.eolang.rust-returns-positive-int.r.α1.α0" pos="6" ref="42"/>
//     </o>
//   </o>
//   <o base=".eq" line="43" loc="Φ.org.eolang.rust-returns-positive-int.φ" name="@" pos="2"> 
//     <o base="r" line="44" loc="Φ.org.eolang.rust-returns-positive-int.φ.ρ" pos="4" ref="30"/>
//     <o base="org.eolang.int" data="int" line="45" loc="Φ.org.eolang.rust-returns-positive-int.φ.α0" pos="4">2</o>
//   </o>
// </o>
@XmirObject(name = "rust-returns-positive-intTest", oname = "rust-returns-positive-int", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/rust-tests.eo")
public final class EOrust_returns_positive_intTest extends PhDefault {
    
  public EOrust_returns_positive_intTest() {
    this.add("r", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base_base = Phi.Φ;
        ret_base_base_base = new PhLocated(ret_base_base_base, 30, 2, "Φ.org.eolang.rust-returns-positive-int.r.ρ.ρ.ρ");
      Phi ret_base_base = new PhMethod(ret_base_base_base, "org");
        ret_base_base = new PhLocated(ret_base_base, 30, 2, "Φ.org.eolang.rust-returns-positive-int.r.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "eolang");
        ret_base = new PhLocated(ret_base, 30, 2, "Φ.org.eolang.rust-returns-positive-int.r.ρ");
      Phi ret = new PhMethod(ret_base, "rust");
        ret = new PhLocated(ret, 30, 4, "Φ.org.eolang.rust-returns-positive-int.r");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 31, 4, "Φ.org.eolang.rust-returns-positive-int.r.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>("use eo_env::EOEnv;\nuse eo_env::eo_enum::EO;\nuse eo_env::eo_enum::EO::{EOInt};\n\npub fn foo(_env: &mut EOEnv) -> Option<EO> {\n  println!(\"Hello world from rust\");\n  Some(EOInt(2))\n}"));
        Phi ret_2 = Phi.Φ.attr("org").get().attr("eolang").get().attr("tuple").get();
          ret_2 = new PhLocated(ret_2, 41, 4, "Φ.org.eolang.rust-returns-positive-int.r.α1");
          Phi[] ret_2_a = new Phi[1];
          Phi ret_2_a0 = new EOω1t0$EOt2$EOa0(rho);
            ret_2_a0 = new PhLocated(ret_2_a0, 42, 6, "Φ.org.eolang.rust-returns-positive-int.r.α1.α0");
          ret_2_a[0] = ret_2_a0;
          ret_2 = new PhWith(new PhCopy(ret_2), "Δ", new Data.Value<Phi[]>(ret_2_a));
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "r");
        ret_base = new PhLocated(ret_base, 44, 4, "Φ.org.eolang.rust-returns-positive-int.φ.ρ");
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 43, 2, "Φ.org.eolang.rust-returns-positive-int.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 45, 4, "Φ.org.eolang.rust-returns-positive-int.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(2L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOrust_returns_positive_intTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="42" loc="Φ.org.eolang.rust-returns-positive-int$t0$t2$a0" name="rust-returns-positive-int$t0$t2$a0" parent="rust-returns-positive-int" pos="6"/>
@XmirObject(name = "ω1t0$t2$a0", oname = "ω1t0$t2$a0", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/rust-tests.eo")
public final class EOω1t0$EOt2$EOa0 extends PhDefault {
    
  public EOω1t0$EOt2$EOa0(final Phi sigma) {
    super(sigma);
  }
}
}
