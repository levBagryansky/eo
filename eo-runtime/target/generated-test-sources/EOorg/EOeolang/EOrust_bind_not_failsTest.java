
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="207" loc="Φ.org.eolang.rust-bind-not-fails" name="rust-bind-not-fails" original-name="rust-bind-not-fails" pos="0"> 
//   <o base="org.eolang.int" data="int" line="208" loc="Φ.org.eolang.rust-bind-not-fails.a" name="a" pos="2">1</o>
//   <o base="org.eolang.int" data="int" line="209" loc="Φ.org.eolang.rust-bind-not-fails.b" name="b" pos="2">2</o>
//   <o base=".rust" line="210" loc="Φ.org.eolang.rust-bind-not-fails.insert" name="insert" pos="4"> 
//     <o base=".eolang" line="210" loc="Φ.org.eolang.rust-bind-not-fails.insert.ρ" pos="2"> 
//       <o base=".org" line="210" loc="Φ.org.eolang.rust-bind-not-fails.insert.ρ.ρ" pos="2"> 
//         <o base="Q" line="210" loc="Φ.org.eolang.rust-bind-not-fails.insert.ρ.ρ.ρ" pos="2"/>
//       </o>
//     </o>
//     <o base="org.eolang.string" data="string" line="211" loc="Φ.org.eolang.rust-bind-not-fails.insert.α0" pos="4">use eo_env::EOEnv;\nuse eo_env::eo_enum::EO;\nuse eo_env::eo_enum::EO::{EOInt};\npub fn foo(env: &mut EOEnv) -> Option<EO> {\n  let v1 = env.find(\"$.^.a\")?;\n  let v2 = env.find(\"$.^.b\")?;\n  env.bind(v1 , v2, \"EO-att\")?;\n  Some(EOInt(0 as i64))\n}</o>
//     <o base="org.eolang.tuple" data="tuple" line="222" loc="Φ.org.eolang.rust-bind-not-fails.insert.α1" pos="4"> 
//       <o base="rust-bind-not-fails$t2$t2$a0" cut="117" line="223" loc="Φ.org.eolang.rust-bind-not-fails.insert.α1.α0" pos="6" ref="223"/>
//     </o>
//   </o>
//   <o base="org.eolang.try" line="224" loc="Φ.org.eolang.rust-bind-not-fails.res" name="res" pos="2"> 
//     <o base="rust-bind-not-fails$t3$a0" cut="120" line="225" loc="Φ.org.eolang.rust-bind-not-fails.res.α0" pos="4" ref="225"> 
//       <o as="insert" base="insert" level="1" loc="Φ.org.eolang.rust-bind-not-fails.res.α0.α0" ref="210"/>
//     </o>
//     <o base="rust-bind-not-fails$t3$a1" cut="122" line="227" loc="Φ.org.eolang.rust-bind-not-fails.res.α1" pos="4" ref="227"/>
//     <o base="org.eolang.nop" line="229" loc="Φ.org.eolang.rust-bind-not-fails.res.α2" pos="4"/>
//   </o>
//   <o base="org.eolang.nop" line="230" loc="Φ.org.eolang.rust-bind-not-fails.φ" name="@" pos="2"> 
//     <o base=".eq" line="231" loc="Φ.org.eolang.rust-bind-not-fails.φ.α0" pos="4"> 
//       <o base="res" line="232" loc="Φ.org.eolang.rust-bind-not-fails.φ.α0.ρ" pos="6" ref="224"/>
//       <o base="org.eolang.string" data="string" line="233" loc="Φ.org.eolang.rust-bind-not-fails.φ.α0.α0" pos="6">Rust insert failed</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "rust-bind-not-failsTest", oname = "rust-bind-not-fails", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/rust-tests.eo")
public final class EOrust_bind_not_failsTest extends PhDefault {
    
  public EOrust_bind_not_failsTest() {
    this.add("a", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOorg.EOeolang.EOint(Phi.Φ);
        ret = new PhLocated(ret, 208, 2, "Φ.org.eolang.rust-bind-not-fails.a");
        ret = new PhWith(ret, "Δ", new Data.Value<>(1L));
      return ret;
    })));
    this.add("b", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOorg.EOeolang.EOint(Phi.Φ);
        ret = new PhLocated(ret, 209, 2, "Φ.org.eolang.rust-bind-not-fails.b");
        ret = new PhWith(ret, "Δ", new Data.Value<>(2L));
      return ret;
    })));
    this.add("insert", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base_base = Phi.Φ;
        ret_base_base_base = new PhLocated(ret_base_base_base, 210, 2, "Φ.org.eolang.rust-bind-not-fails.insert.ρ.ρ.ρ");
      Phi ret_base_base = new PhMethod(ret_base_base_base, "org");
        ret_base_base = new PhLocated(ret_base_base, 210, 2, "Φ.org.eolang.rust-bind-not-fails.insert.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "eolang");
        ret_base = new PhLocated(ret_base, 210, 2, "Φ.org.eolang.rust-bind-not-fails.insert.ρ");
      Phi ret = new PhMethod(ret_base, "rust");
        ret = new PhLocated(ret, 210, 4, "Φ.org.eolang.rust-bind-not-fails.insert");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 211, 4, "Φ.org.eolang.rust-bind-not-fails.insert.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>("use eo_env::EOEnv;\nuse eo_env::eo_enum::EO;\nuse eo_env::eo_enum::EO::{EOInt};\npub fn foo(env: &mut EOEnv) -> Option<EO> {\n  let v1 = env.find(\"$.^.a\")?;\n  let v2 = env.find(\"$.^.b\")?;\n  env.bind(v1 , v2, \"EO-att\")?;\n  Some(EOInt(0 as i64))\n}"));
        Phi ret_2 = Phi.Φ.attr("org").get().attr("eolang").get().attr("tuple").get();
          ret_2 = new PhLocated(ret_2, 222, 4, "Φ.org.eolang.rust-bind-not-fails.insert.α1");
          Phi[] ret_2_a = new Phi[1];
          Phi ret_2_a0 = new EOω1t2$EOt2$EOa0(rho);
            ret_2_a0 = new PhLocated(ret_2_a0, 223, 6, "Φ.org.eolang.rust-bind-not-fails.insert.α1.α0");
          ret_2_a[0] = ret_2_a0;
          ret_2 = new PhWith(new PhCopy(ret_2), "Δ", new Data.Value<Phi[]>(ret_2_a));
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
    this.add("res", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("try").get();
        ret = new PhLocated(ret, 224, 2, "Φ.org.eolang.rust-bind-not-fails.res");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOω1t3$EOa0(rho);
          ret_1 = new PhLocated(ret_1, 225, 4, "Φ.org.eolang.rust-bind-not-fails.res.α0");
        Phi ret_2 = new EOω1t3$EOa1(rho);
          ret_2 = new PhLocated(ret_2, 227, 4, "Φ.org.eolang.rust-bind-not-fails.res.α1");
        Phi ret_3 = Phi.Φ.attr("org").get().attr("eolang").get().attr("nop").get();
          ret_3 = new PhLocated(ret_3, 229, 4, "Φ.org.eolang.rust-bind-not-fails.res.α2");
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
        ret = new PhWith(ret, 2, ret_3);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("nop").get();
        ret = new PhLocated(ret, 230, 2, "Φ.org.eolang.rust-bind-not-fails.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(rho, "res");
          ret_1_base = new PhLocated(ret_1_base, 232, 6, "Φ.org.eolang.rust-bind-not-fails.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "eq");
          ret_1 = new PhLocated(ret_1, 231, 4, "Φ.org.eolang.rust-bind-not-fails.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
            ret_1_1 = new PhLocated(ret_1_1, 233, 6, "Φ.org.eolang.rust-bind-not-fails.φ.α0.α0");
            ret_1_1 = new PhWith(ret_1_1, "Δ", new Data.Value<>("Rust insert failed"));
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOrust_bind_not_failsTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="223" loc="Φ.org.eolang.rust-bind-not-fails$t2$t2$a0" name="rust-bind-not-fails$t2$t2$a0" parent="rust-bind-not-fails" pos="6"/>
@XmirObject(name = "ω1t2$t2$a0", oname = "ω1t2$t2$a0", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/rust-tests.eo")
public final class EOω1t2$EOt2$EOa0 extends PhDefault {
    
  public EOω1t2$EOt2$EOa0(final Phi sigma) {
    super(sigma);
  }
}

// <o abstract="" ancestors="1" line="225" loc="Φ.org.eolang.rust-bind-not-fails$t3$a0" name="rust-bind-not-fails$t3$a0" parent="rust-bind-not-fails" pos="4"> 
//   <o base="insert" line="226" loc="Φ.org.eolang.rust-bind-not-fails$t3$a0.φ" name="@" pos="6" ref="225.210.458"/>
//   <o level="1" line="225.210.458" loc="Φ.org.eolang.rust-bind-not-fails$t3$a0.insert" name="insert"/>
// </o>
@XmirObject(name = "ω1t3$a0", oname = "ω1t3$a0", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/rust-tests.eo")
public final class EOω1t3$EOa0 extends PhDefault {
    
  public EOω1t3$EOa0(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(new PhMethod(rho, "σ"), "insert");
        ret = new PhLocated(ret, 226, 6, "Φ.org.eolang.rust-bind-not-fails$t3$a0.φ");
      return ret;
    })));
  }
}

// <o abstract="" ancestors="1" line="227" loc="Φ.org.eolang.rust-bind-not-fails$t3$a1" name="rust-bind-not-fails$t3$a1" parent="rust-bind-not-fails" pos="4"> 
//   <o line="227" loc="Φ.org.eolang.rust-bind-not-fails$t3$a1.e" name="e" pos="5"/>
//   <o base="e" line="228" loc="Φ.org.eolang.rust-bind-not-fails$t3$a1.φ" name="@" pos="6" ref="227"/>
// </o>
@XmirObject(name = "ω1t3$a1", oname = "ω1t3$a1", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/rust-tests.eo")
public final class EOω1t3$EOa1 extends PhDefault {
    
  public EOω1t3$EOa1(final Phi sigma) {
    super(sigma);
    this.add("e", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "e");
        ret = new PhLocated(ret, 228, 6, "Φ.org.eolang.rust-bind-not-fails$t3$a1.φ");
      return ret;
    })));
  }
}
}
