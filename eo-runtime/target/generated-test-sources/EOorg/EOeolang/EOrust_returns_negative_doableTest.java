
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="86" loc="Φ.org.eolang.rust-returns-negative-doable" name="rust-returns-negative-doable" original-name="rust-returns-negative-doable" pos="0"> 
//   <o base=".rust" line="87" loc="Φ.org.eolang.rust-returns-negative-doable.r" name="r" pos="4"> 
//     <o base=".eolang" line="87" loc="Φ.org.eolang.rust-returns-negative-doable.r.ρ" pos="2"> 
//       <o base=".org" line="87" loc="Φ.org.eolang.rust-returns-negative-doable.r.ρ.ρ" pos="2"> 
//         <o base="Q" line="87" loc="Φ.org.eolang.rust-returns-negative-doable.r.ρ.ρ.ρ" pos="2"/>
//       </o>
//     </o>
//     <o base="org.eolang.string" data="string" line="88" loc="Φ.org.eolang.rust-returns-negative-doable.r.α0" pos="4">use eo_env::EOEnv;\nuse eo_env::eo_enum::EO;\nuse eo_env::eo_enum::EO::{EOFloat};\n\npub fn foo(_env: &mut EOEnv) -> EO {\n  EOFloat(-1.23456789)\n}</o>
//     <o base="org.eolang.tuple" data="tuple" line="97" loc="Φ.org.eolang.rust-returns-negative-doable.r.α1" pos="4"> 
//       <o base="rust-returns-negative-doable$t0$t2$a0" cut="43" line="98" loc="Φ.org.eolang.rust-returns-negative-doable.r.α1.α0" pos="6" ref="98"/>
//     </o>
//   </o>
//   <o base="org.eolang.hamcrest.assert-that" line="99" loc="Φ.org.eolang.rust-returns-negative-doable.φ" name="@" pos="2"> 
//     <o base="r" line="100" loc="Φ.org.eolang.rust-returns-negative-doable.φ.α0" pos="4" ref="87"/>
//     <o base=".equal-to" line="101" loc="Φ.org.eolang.rust-returns-negative-doable.φ.α1" pos="5"> 
//       <o base="$" line="101" loc="Φ.org.eolang.rust-returns-negative-doable.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.float" data="float" line="102" loc="Φ.org.eolang.rust-returns-negative-doable.φ.α1.α0" pos="6">-1.23456789</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "rust-returns-negative-doableTest", oname = "rust-returns-negative-doable", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/rust-tests.eo")
public final class EOrust_returns_negative_doableTest extends PhDefault {
  public EOrust_returns_negative_doableTest() {
    this.add("r", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base_base = Phi.Φ;
        ret_base_base_base = new PhLocated(ret_base_base_base, 87, 2, "Φ.org.eolang.rust-returns-negative-doable.r.ρ.ρ.ρ");
      Phi ret_base_base = new PhMethod(ret_base_base_base, "org");
        ret_base_base = new PhLocated(ret_base_base, 87, 2, "Φ.org.eolang.rust-returns-negative-doable.r.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "eolang");
        ret_base = new PhLocated(ret_base, 87, 2, "Φ.org.eolang.rust-returns-negative-doable.r.ρ");
      Phi ret = new PhMethod(ret_base, "rust");
        ret = new PhLocated(ret, 87, 4, "Φ.org.eolang.rust-returns-negative-doable.r");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 88, 4, "Φ.org.eolang.rust-returns-negative-doable.r.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>("use eo_env::EOEnv;\nuse eo_env::eo_enum::EO;\nuse eo_env::eo_enum::EO::{EOFloat};\n\npub fn foo(_env: &mut EOEnv) -> EO {\n  EOFloat(-1.23456789)\n}"));
        Phi ret_2 = Phi.Φ.attr("org").get().attr("eolang").get().attr("tuple").get();
          ret_2 = new PhLocated(ret_2, 97, 4, "Φ.org.eolang.rust-returns-negative-doable.r.α1");
          Phi[] ret_2_a = new Phi[1];
          Phi ret_2_a0 = new EOω1t0$EOt2$EOa0(rho);
            ret_2_a0 = new PhLocated(ret_2_a0, 98, 6, "Φ.org.eolang.rust-returns-negative-doable.r.α1.α0");
          ret_2_a[0] = ret_2_a0;
          ret_2 = new PhWith(new PhCopy(ret_2), "Δ", new Data.Value<Phi[]>(ret_2_a));
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 99, 2, "Φ.org.eolang.rust-returns-negative-doable.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new PhMethod(rho, "r");
          ret_1 = new PhLocated(ret_1, 100, 4, "Φ.org.eolang.rust-returns-negative-doable.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 101, 4, "Φ.org.eolang.rust-returns-negative-doable.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 101, 5, "Φ.org.eolang.rust-returns-negative-doable.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EOfloat(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 102, 6, "Φ.org.eolang.rust-returns-negative-doable.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(-1.23456789d));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOrust_returns_negative_doableTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="98" loc="Φ.org.eolang.rust-returns-negative-doable$t0$t2$a0" name="rust-returns-negative-doable$t0$t2$a0" parent="rust-returns-negative-doable" pos="6"/>
@XmirObject(name = "ω1t0$t2$a0", oname = "ω1t0$t2$a0", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/rust-tests.eo")
public final class EOω1t0$EOt2$EOa0 extends PhDefault {
  public EOω1t0$EOt2$EOa0(final Phi sigma) {
    super(sigma);
  }
}
}
