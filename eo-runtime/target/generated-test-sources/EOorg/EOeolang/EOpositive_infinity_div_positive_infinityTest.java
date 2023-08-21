
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="476" loc="Φ.org.eolang.positive-infinity-div-positive-infinity" name="positive-infinity-div-positive-infinity" original-name="positive-infinity-div-positive-infinity" pos="0"> 
//   <o base="org.eolang.positive-infinity" const="" line="477" loc="Φ.org.eolang.positive-infinity-div-positive-infinity.pos-inf" name="pos-inf" pos="2"/>
//   <o base="org.eolang.hamcrest.assert-that" line="478" loc="Φ.org.eolang.positive-infinity-div-positive-infinity.φ" name="@" pos="2"> 
//     <o base=".as-bytes" line="479" loc="Φ.org.eolang.positive-infinity-div-positive-infinity.φ.α0" pos="4"> 
//       <o base=".div" line="480" loc="Φ.org.eolang.positive-infinity-div-positive-infinity.φ.α0.ρ" pos="13"> 
//         <o base="pos-inf" line="480" loc="Φ.org.eolang.positive-infinity-div-positive-infinity.φ.α0.ρ.ρ" pos="6" ref="477"/>
//         <o base="pos-inf" line="480" loc="Φ.org.eolang.positive-infinity-div-positive-infinity.φ.α0.ρ.α0" pos="18" ref="477"/>
//       </o>
//     </o>
//     <o base=".equal-to" line="481" loc="Φ.org.eolang.positive-infinity-div-positive-infinity.φ.α1" pos="5"> 
//       <o base="$" line="481" loc="Φ.org.eolang.positive-infinity-div-positive-infinity.φ.α1.ρ" pos="4"/>
//       <o base=".as-bytes" line="481" loc="Φ.org.eolang.positive-infinity-div-positive-infinity.φ.α1.α0" pos="18"> 
//         <o base="org.eolang.nan" line="481" loc="Φ.org.eolang.positive-infinity-div-positive-infinity.φ.α1.α0.ρ" pos="15"/>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "positive-infinity-div-positive-infinityTest", oname = "positive-infinity-div-positive-infinity", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/positive-infinity-tests.eo")
public final class EOpositive_infinity_div_positive_infinityTest extends PhDefault {
  public EOpositive_infinity_div_positive_infinityTest() {
    this.add("pos-inf", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("positive-infinity").get();
        ret = new PhLocated(ret, 477, 2, "Φ.org.eolang.positive-infinity-div-positive-infinity.pos-inf");
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 478, 2, "Φ.org.eolang.positive-infinity-div-positive-infinity.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base_base = new PhMethod(rho, "pos-inf");
          ret_1_base_base = new PhLocated(ret_1_base_base, 480, 6, "Φ.org.eolang.positive-infinity-div-positive-infinity.φ.α0.ρ.ρ");
        Phi ret_1_base = new PhMethod(ret_1_base_base, "div");
          ret_1_base = new PhLocated(ret_1_base, 480, 13, "Φ.org.eolang.positive-infinity-div-positive-infinity.φ.α0.ρ");
        ret_1_base = new PhCopy(ret_1_base);
          Phi ret_1_base_1 = new PhMethod(rho, "pos-inf");
            ret_1_base_1 = new PhLocated(ret_1_base_1, 480, 18, "Φ.org.eolang.positive-infinity-div-positive-infinity.φ.α0.ρ.α0");
          ret_1_base = new PhWith(ret_1_base, 0, ret_1_base_1);
        Phi ret_1 = new PhMethod(ret_1_base, "as-bytes");
          ret_1 = new PhLocated(ret_1, 479, 4, "Φ.org.eolang.positive-infinity-div-positive-infinity.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 481, 4, "Φ.org.eolang.positive-infinity-div-positive-infinity.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 481, 5, "Φ.org.eolang.positive-infinity-div-positive-infinity.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("nan").get();
            ret_2_1_base = new PhLocated(ret_2_1_base, 481, 15, "Φ.org.eolang.positive-infinity-div-positive-infinity.φ.α1.α0.ρ");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "as-bytes");
            ret_2_1 = new PhLocated(ret_2_1, 481, 18, "Φ.org.eolang.positive-infinity-div-positive-infinity.φ.α1.α0");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOpositive_infinity_div_positive_infinityTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}