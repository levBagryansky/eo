
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="235" loc="Φ.org.eolang.rust-copy-not-fails" name="rust-copy-not-fails" original-name="rust-copy-not-fails" pos="0"> 
//   <o base="org.eolang.int" data="int" line="236" loc="Φ.org.eolang.rust-copy-not-fails.a" name="a" pos="2">123</o>
//   <o base=".rust" line="237" loc="Φ.org.eolang.rust-copy-not-fails.copy" name="copy" pos="4"> 
//     <o base=".eolang" line="237" loc="Φ.org.eolang.rust-copy-not-fails.copy.ρ" pos="2"> 
//       <o base=".org" line="237" loc="Φ.org.eolang.rust-copy-not-fails.copy.ρ.ρ" pos="2"> 
//         <o base="Q" line="237" loc="Φ.org.eolang.rust-copy-not-fails.copy.ρ.ρ.ρ" pos="2"/>
//       </o>
//     </o>
//     <o base="org.eolang.string" data="string" line="238" loc="Φ.org.eolang.rust-copy-not-fails.copy.α0" pos="4">use eo_env::EOEnv;\nuse eo_env::eo_enum::EO;\nuse eo_env::eo_enum::EO::{EOVertex};\npub fn foo(env: &mut EOEnv) -> Option<EO> {\n  let v = env.find(\"$.^.a\")?;\n  let copy = env.copy(v)?;\n  Some(EOVertex(copy))\n}</o>
//     <o base="org.eolang.tuple" data="tuple" line="248" loc="Φ.org.eolang.rust-copy-not-fails.copy.α1" pos="4"> 
//       <o base="rust-copy-not-fails$t1$t2$a0" cut="137" line="249" loc="Φ.org.eolang.rust-copy-not-fails.copy.α1.α0" pos="6" ref="249"/>
//     </o>
//   </o>
//   <o base=".eq" line="250" loc="Φ.org.eolang.rust-copy-not-fails.φ" name="@" pos="2"> 
//     <o base="copy" line="251" loc="Φ.org.eolang.rust-copy-not-fails.φ.ρ" pos="4" ref="237"/>
//     <o base="org.eolang.int" data="int" line="252" loc="Φ.org.eolang.rust-copy-not-fails.φ.α0" pos="4">123</o>
//   </o>
// </o>
@XmirObject(name = "rust-copy-not-failsTest", oname = "rust-copy-not-fails", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/rust-tests.eo")
public final class EOrust_copy_not_failsTest extends PhDefault {
    
  public EOrust_copy_not_failsTest() {
    this.add("a", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOorg.EOeolang.EOint(Phi.Φ);
        ret = new PhLocated(ret, 236, 2, "Φ.org.eolang.rust-copy-not-fails.a");
        ret = new PhWith(ret, "Δ", new Data.Value<>(123L));
      return ret;
    })));
    this.add("copy", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base_base = Phi.Φ;
        ret_base_base_base = new PhLocated(ret_base_base_base, 237, 2, "Φ.org.eolang.rust-copy-not-fails.copy.ρ.ρ.ρ");
      Phi ret_base_base = new PhMethod(ret_base_base_base, "org");
        ret_base_base = new PhLocated(ret_base_base, 237, 2, "Φ.org.eolang.rust-copy-not-fails.copy.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "eolang");
        ret_base = new PhLocated(ret_base, 237, 2, "Φ.org.eolang.rust-copy-not-fails.copy.ρ");
      Phi ret = new PhMethod(ret_base, "rust");
        ret = new PhLocated(ret, 237, 4, "Φ.org.eolang.rust-copy-not-fails.copy");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 238, 4, "Φ.org.eolang.rust-copy-not-fails.copy.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>("use eo_env::EOEnv;\nuse eo_env::eo_enum::EO;\nuse eo_env::eo_enum::EO::{EOVertex};\npub fn foo(env: &mut EOEnv) -> Option<EO> {\n  let v = env.find(\"$.^.a\")?;\n  let copy = env.copy(v)?;\n  Some(EOVertex(copy))\n}"));
        Phi ret_2 = Phi.Φ.attr("org").get().attr("eolang").get().attr("tuple").get();
          ret_2 = new PhLocated(ret_2, 248, 4, "Φ.org.eolang.rust-copy-not-fails.copy.α1");
          Phi[] ret_2_a = new Phi[1];
          Phi ret_2_a0 = new EOω1t1$EOt2$EOa0(rho);
            ret_2_a0 = new PhLocated(ret_2_a0, 249, 6, "Φ.org.eolang.rust-copy-not-fails.copy.α1.α0");
          ret_2_a[0] = ret_2_a0;
          ret_2 = new PhWith(new PhCopy(ret_2), "Δ", new Data.Value<Phi[]>(ret_2_a));
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "copy");
        ret_base = new PhLocated(ret_base, 251, 4, "Φ.org.eolang.rust-copy-not-fails.φ.ρ");
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 250, 2, "Φ.org.eolang.rust-copy-not-fails.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 252, 4, "Φ.org.eolang.rust-copy-not-fails.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(123L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOrust_copy_not_failsTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="249" loc="Φ.org.eolang.rust-copy-not-fails$t1$t2$a0" name="rust-copy-not-fails$t1$t2$a0" parent="rust-copy-not-fails" pos="6"/>
@XmirObject(name = "ω1t1$t2$a0", oname = "ω1t1$t2$a0", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/rust-tests.eo")
public final class EOω1t1$EOt2$EOa0 extends PhDefault {
    
  public EOω1t1$EOt2$EOa0(final Phi sigma) {
    super(sigma);
  }
}
}
