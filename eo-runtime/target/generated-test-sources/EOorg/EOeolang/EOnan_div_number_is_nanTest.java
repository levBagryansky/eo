
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="98" loc="Φ.org.eolang.nan-div-number-is-nan" name="nan-div-number-is-nan" original-name="nan-div-number-is-nan" pos="0"> 
//   <o base="org.eolang.nan" const="" line="99" loc="Φ.org.eolang.nan-div-number-is-nan.not-a-number" name="not-a-number" pos="2"/>
//   <o base=".eq" line="100" loc="Φ.org.eolang.nan-div-number-is-nan.φ" name="@" pos="2"> 
//     <o base=".as-bytes" line="101" loc="Φ.org.eolang.nan-div-number-is-nan.φ.ρ" pos="25"> 
//       <o base="nan-div-number-is-nan$t1$t0$generated-scope-241b5703-ff2b-47a5-b200-3276ff237961" cut="86" line="101" loc="Φ.org.eolang.nan-div-number-is-nan.φ.ρ.generated-scope-241b5703-ff2b-47a5-b200-3276ff237961" name="generated-scope-241b5703-ff2b-47a5-b200-3276ff237961" pos="17" ref="101"> 
//         <o as="not-a-number" base="not-a-number" level="1" loc="Φ.org.eolang.nan-div-number-is-nan.φ.ρ.generated-scope-241b5703-ff2b-47a5-b200-3276ff237961.α0" ref="99"/>
//       </o>
//     </o>
//     <o base=".as-bytes" line="102" loc="Φ.org.eolang.nan-div-number-is-nan.φ.α0" pos="16"> 
//       <o base="not-a-number" line="102" loc="Φ.org.eolang.nan-div-number-is-nan.φ.α0.ρ" pos="4" ref="99"/>
//     </o>
//   </o>
// </o>
@XmirObject(name = "nan-div-number-is-nanTest", oname = "nan-div-number-is-nan", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/nan-tests.eo")
public final class EOnan_div_number_is_nanTest extends PhDefault {
    
  public EOnan_div_number_is_nanTest() {
    this.add("not-a-number", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("nan").get();
        ret = new PhLocated(ret, 99, 2, "Φ.org.eolang.nan-div-number-is-nan.not-a-number");
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new EOω1t1$EOt0$EOgenerated_scope_241b5703_ff2b_47a5_b200_3276ff237961(rho);
        ret_base_base = new PhLocated(ret_base_base, 101, 17, "Φ.org.eolang.nan-div-number-is-nan.φ.ρ.generated-scope-241b5703-ff2b-47a5-b200-3276ff237961");
      Phi ret_base = new PhMethod(ret_base_base, "as-bytes");
        ret_base = new PhLocated(ret_base, 101, 25, "Φ.org.eolang.nan-div-number-is-nan.φ.ρ");
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 100, 2, "Φ.org.eolang.nan-div-number-is-nan.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(rho, "not-a-number");
          ret_1_base = new PhLocated(ret_1_base, 102, 4, "Φ.org.eolang.nan-div-number-is-nan.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "as-bytes");
          ret_1 = new PhLocated(ret_1, 102, 16, "Φ.org.eolang.nan-div-number-is-nan.φ.α0");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOnan_div_number_is_nanTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="101" loc="Φ.org.eolang.nan-div-number-is-nan$t1$t0$generated-scope-241b5703-ff2b-47a5-b200-3276ff237961" name="nan-div-number-is-nan$t1$t0$generated-scope-241b5703-ff2b-47a5-b200-3276ff237961" original-name="generated-scope-241b5703-ff2b-47a5-b200-3276ff237961" parent="nan-div-number-is-nan" pos="17"> 
//   <o base=".div" line="101" loc="Φ.org.eolang.nan-div-number-is-nan$t1$t0$generated-scope-241b5703-ff2b-47a5-b200-3276ff237961.org.eolang.scope-241b5703-ff2b-47a5-b200-3276ff237961" name="org.eolang.scope-241b5703-ff2b-47a5-b200-3276ff237961" pos="17" scope="scope-241b5703-ff2b-47a5-b200-3276ff237961"> 
//     <o base="not-a-number" line="101" loc="Φ.org.eolang.nan-div-number-is-nan$t1$t0$generated-scope-241b5703-ff2b-47a5-b200-3276ff237961.org.eolang.scope-241b5703-ff2b-47a5-b200-3276ff237961.ρ" pos="5" ref="101.99.454" scope="scope-241b5703-ff2b-47a5-b200-3276ff237961"/>
//     <o base="org.eolang.int" data="int" line="101" loc="Φ.org.eolang.nan-div-number-is-nan$t1$t0$generated-scope-241b5703-ff2b-47a5-b200-3276ff237961.org.eolang.scope-241b5703-ff2b-47a5-b200-3276ff237961.α0" pos="22" scope="scope-241b5703-ff2b-47a5-b200-3276ff237961">42</o>
//   </o>
//   <o base="org.eolang.scope-241b5703-ff2b-47a5-b200-3276ff237961" line="101" loc="Φ.org.eolang.nan-div-number-is-nan$t1$t0$generated-scope-241b5703-ff2b-47a5-b200-3276ff237961.φ" name="@" pos="17" ref="101"/>
//   <o level="1" line="101.99.454" loc="Φ.org.eolang.nan-div-number-is-nan$t1$t0$generated-scope-241b5703-ff2b-47a5-b200-3276ff237961.not-a-number" name="not-a-number"/>
// </o>
@XmirObject(name = "ω1t1$t0$generated-scope-241b5703-ff2b-47a5-b200-3276ff237961", oname = "generated-scope-241b5703-ff2b-47a5-b200-3276ff237961", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/nan-tests.eo")
public final class EOω1t1$EOt0$EOgenerated_scope_241b5703_ff2b_47a5_b200_3276ff237961 extends PhDefault {
    
  public EOω1t1$EOt0$EOgenerated_scope_241b5703_ff2b_47a5_b200_3276ff237961(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-241b5703-ff2b-47a5-b200-3276ff237961", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(new PhMethod(rho, "σ"), "not-a-number");
        ret_base = new PhLocated(ret_base, 101, 5, "Φ.org.eolang.nan-div-number-is-nan$t1$t0$generated-scope-241b5703-ff2b-47a5-b200-3276ff237961.org.eolang.scope-241b5703-ff2b-47a5-b200-3276ff237961.ρ");
      Phi ret = new PhMethod(ret_base, "div");
        ret = new PhLocated(ret, 101, 17, "Φ.org.eolang.nan-div-number-is-nan$t1$t0$generated-scope-241b5703-ff2b-47a5-b200-3276ff237961.org.eolang.scope-241b5703-ff2b-47a5-b200-3276ff237961");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 101, 22, "Φ.org.eolang.nan-div-number-is-nan$t1$t0$generated-scope-241b5703-ff2b-47a5-b200-3276ff237961.org.eolang.scope-241b5703-ff2b-47a5-b200-3276ff237961.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(42L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-241b5703-ff2b-47a5-b200-3276ff237961");
        ret = new PhLocated(ret, 101, 17, "Φ.org.eolang.nan-div-number-is-nan$t1$t0$generated-scope-241b5703-ff2b-47a5-b200-3276ff237961.φ");
      return ret;
    })));
  }
}
}
