
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="103" loc="Φ.org.eolang.nan-div-number-is-nan" name="nan-div-number-is-nan" original-name="nan-div-number-is-nan" pos="0"> 
//   <o base="org.eolang.nan" const="" line="104" loc="Φ.org.eolang.nan-div-number-is-nan.not-a-number" name="not-a-number" pos="2"/>
//   <o base="org.eolang.hamcrest.assert-that" line="105" loc="Φ.org.eolang.nan-div-number-is-nan.φ" name="@" pos="2"> 
//     <o base=".as-bytes" line="106" loc="Φ.org.eolang.nan-div-number-is-nan.φ.α0" pos="25"> 
//       <o base="nan-div-number-is-nan$t1$t0$generated-scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd" cut="112" line="106" loc="Φ.org.eolang.nan-div-number-is-nan.φ.α0.generated-scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd" name="generated-scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd" pos="17" ref="106"> 
//         <o as="not-a-number" base="not-a-number" level="1" loc="Φ.org.eolang.nan-div-number-is-nan.φ.α0.generated-scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd.α0" ref="104"/>
//       </o>
//     </o>
//     <o base=".equal-to" line="107" loc="Φ.org.eolang.nan-div-number-is-nan.φ.α1" pos="5"> 
//       <o base="$" line="107" loc="Φ.org.eolang.nan-div-number-is-nan.φ.α1.ρ" pos="4"/>
//       <o base=".as-bytes" line="107" loc="Φ.org.eolang.nan-div-number-is-nan.φ.α1.α0" pos="27"> 
//         <o base="not-a-number" line="107" loc="Φ.org.eolang.nan-div-number-is-nan.φ.α1.α0.ρ" pos="15" ref="104"/>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "nan-div-number-is-nanTest", oname = "nan-div-number-is-nan", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/nan-tests.eo")
public final class EOnan_div_number_is_nanTest extends PhDefault {
  public EOnan_div_number_is_nanTest() {
    this.add("not-a-number", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("nan").get();
        ret = new PhLocated(ret, 104, 2, "Φ.org.eolang.nan-div-number-is-nan.not-a-number");
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 105, 2, "Φ.org.eolang.nan-div-number-is-nan.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new EOω1t1$EOt0$EOgenerated_scope_71eb5c23_81a7_4f0c_a41b_6df99da731cd(rho);
          ret_1_base = new PhLocated(ret_1_base, 106, 17, "Φ.org.eolang.nan-div-number-is-nan.φ.α0.generated-scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd");
        Phi ret_1 = new PhMethod(ret_1_base, "as-bytes");
          ret_1 = new PhLocated(ret_1, 106, 25, "Φ.org.eolang.nan-div-number-is-nan.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 107, 4, "Φ.org.eolang.nan-div-number-is-nan.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 107, 5, "Φ.org.eolang.nan-div-number-is-nan.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = new PhMethod(rho, "not-a-number");
            ret_2_1_base = new PhLocated(ret_2_1_base, 107, 15, "Φ.org.eolang.nan-div-number-is-nan.φ.α1.α0.ρ");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "as-bytes");
            ret_2_1 = new PhLocated(ret_2_1, 107, 27, "Φ.org.eolang.nan-div-number-is-nan.φ.α1.α0");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
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

// <o abstract="" ancestors="1" line="106" loc="Φ.org.eolang.nan-div-number-is-nan$t1$t0$generated-scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd" name="nan-div-number-is-nan$t1$t0$generated-scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd" original-name="generated-scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd" parent="nan-div-number-is-nan" pos="17"> 
//   <o base=".div" line="106" loc="Φ.org.eolang.nan-div-number-is-nan$t1$t0$generated-scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd.org.eolang.scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd" name="org.eolang.scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd" pos="17" scope="scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd"> 
//     <o base="not-a-number" line="106" loc="Φ.org.eolang.nan-div-number-is-nan$t1$t0$generated-scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd.org.eolang.scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd.ρ" pos="5" ref="106.104.456" scope="scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd"/>
//     <o base="org.eolang.int" data="int" line="106" loc="Φ.org.eolang.nan-div-number-is-nan$t1$t0$generated-scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd.org.eolang.scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd.α0" pos="22" scope="scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd">42</o>
//   </o>
//   <o base="org.eolang.scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd" line="106" loc="Φ.org.eolang.nan-div-number-is-nan$t1$t0$generated-scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd.φ" name="@" pos="17" ref="106"/>
//   <o level="1" line="106.104.456" loc="Φ.org.eolang.nan-div-number-is-nan$t1$t0$generated-scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd.not-a-number" name="not-a-number"/>
// </o>
@XmirObject(name = "ω1t1$t0$generated-scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd", oname = "generated-scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/nan-tests.eo")
public final class EOω1t1$EOt0$EOgenerated_scope_71eb5c23_81a7_4f0c_a41b_6df99da731cd extends PhDefault {
  public EOω1t1$EOt0$EOgenerated_scope_71eb5c23_81a7_4f0c_a41b_6df99da731cd(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(new PhMethod(rho, "σ"), "not-a-number");
        ret_base = new PhLocated(ret_base, 106, 5, "Φ.org.eolang.nan-div-number-is-nan$t1$t0$generated-scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd.org.eolang.scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd.ρ");
      Phi ret = new PhMethod(ret_base, "div");
        ret = new PhLocated(ret, 106, 17, "Φ.org.eolang.nan-div-number-is-nan$t1$t0$generated-scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd.org.eolang.scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 106, 22, "Φ.org.eolang.nan-div-number-is-nan$t1$t0$generated-scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd.org.eolang.scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(42L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd");
        ret = new PhLocated(ret, 106, 17, "Φ.org.eolang.nan-div-number-is-nan$t1$t0$generated-scope-71eb5c23-81a7-4f0c-a41b-6df99da731cd.φ");
      return ret;
    })));
  }
}
}
