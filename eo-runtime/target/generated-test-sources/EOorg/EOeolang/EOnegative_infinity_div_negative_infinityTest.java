
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="471" loc="Φ.org.eolang.negative-infinity-div-negative-infinity" name="negative-infinity-div-negative-infinity" original-name="negative-infinity-div-negative-infinity" pos="0"> 
//   <o base="org.eolang.negative-infinity" const="" line="472" loc="Φ.org.eolang.negative-infinity-div-negative-infinity.neg-inf" name="neg-inf" pos="2"/>
//   <o base="org.eolang.hamcrest.assert-that" line="473" loc="Φ.org.eolang.negative-infinity-div-negative-infinity.φ" name="@" pos="2"> 
//     <o base=".as-bytes" line="474" loc="Φ.org.eolang.negative-infinity-div-negative-infinity.φ.α0" pos="4"> 
//       <o base=".div" line="475" loc="Φ.org.eolang.negative-infinity-div-negative-infinity.φ.α0.ρ" pos="13"> 
//         <o base="neg-inf" line="475" loc="Φ.org.eolang.negative-infinity-div-negative-infinity.φ.α0.ρ.ρ" pos="6" ref="472"/>
//         <o base="neg-inf" line="475" loc="Φ.org.eolang.negative-infinity-div-negative-infinity.φ.α0.ρ.α0" pos="18" ref="472"/>
//       </o>
//     </o>
//     <o base=".equal-to" line="476" loc="Φ.org.eolang.negative-infinity-div-negative-infinity.φ.α1" pos="5"> 
//       <o base="$" line="476" loc="Φ.org.eolang.negative-infinity-div-negative-infinity.φ.α1.ρ" pos="4"/>
//       <o base=".as-bytes" line="476" loc="Φ.org.eolang.negative-infinity-div-negative-infinity.φ.α1.α0" pos="18"> 
//         <o base="org.eolang.nan" line="476" loc="Φ.org.eolang.negative-infinity-div-negative-infinity.φ.α1.α0.ρ" pos="15"/>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "negative-infinity-div-negative-infinityTest", oname = "negative-infinity-div-negative-infinity", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/negative-infinity-tests.eo")
public final class EOnegative_infinity_div_negative_infinityTest extends PhDefault {
  public EOnegative_infinity_div_negative_infinityTest() {
    this.add("neg-inf", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("negative-infinity").get();
        ret = new PhLocated(ret, 472, 2, "Φ.org.eolang.negative-infinity-div-negative-infinity.neg-inf");
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 473, 2, "Φ.org.eolang.negative-infinity-div-negative-infinity.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base_base = new PhMethod(rho, "neg-inf");
          ret_1_base_base = new PhLocated(ret_1_base_base, 475, 6, "Φ.org.eolang.negative-infinity-div-negative-infinity.φ.α0.ρ.ρ");
        Phi ret_1_base = new PhMethod(ret_1_base_base, "div");
          ret_1_base = new PhLocated(ret_1_base, 475, 13, "Φ.org.eolang.negative-infinity-div-negative-infinity.φ.α0.ρ");
        ret_1_base = new PhCopy(ret_1_base);
          Phi ret_1_base_1 = new PhMethod(rho, "neg-inf");
            ret_1_base_1 = new PhLocated(ret_1_base_1, 475, 18, "Φ.org.eolang.negative-infinity-div-negative-infinity.φ.α0.ρ.α0");
          ret_1_base = new PhWith(ret_1_base, 0, ret_1_base_1);
        Phi ret_1 = new PhMethod(ret_1_base, "as-bytes");
          ret_1 = new PhLocated(ret_1, 474, 4, "Φ.org.eolang.negative-infinity-div-negative-infinity.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 476, 4, "Φ.org.eolang.negative-infinity-div-negative-infinity.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 476, 5, "Φ.org.eolang.negative-infinity-div-negative-infinity.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("nan").get();
            ret_2_1_base = new PhLocated(ret_2_1_base, 476, 15, "Φ.org.eolang.negative-infinity-div-negative-infinity.φ.α1.α0.ρ");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "as-bytes");
            ret_2_1 = new PhLocated(ret_2_1, 476, 18, "Φ.org.eolang.negative-infinity-div-negative-infinity.φ.α1.α0");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOnegative_infinity_div_negative_infinityTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
