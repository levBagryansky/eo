
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="311" loc="Φ.org.eolang.positive-infinity-plus-negative-infinity" name="positive-infinity-plus-negative-infinity" original-name="positive-infinity-plus-negative-infinity" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="312" loc="Φ.org.eolang.positive-infinity-plus-negative-infinity.φ" name="@" pos="2"> 
//     <o base=".as-bytes" line="313" loc="Φ.org.eolang.positive-infinity-plus-negative-infinity.φ.α0" pos="4"> 
//       <o base=".plus" line="314" loc="Φ.org.eolang.positive-infinity-plus-negative-infinity.φ.α0.ρ" pos="23"> 
//         <o base="org.eolang.positive-infinity" line="314" loc="Φ.org.eolang.positive-infinity-plus-negative-infinity.φ.α0.ρ.ρ" pos="6"/>
//         <o base="org.eolang.negative-infinity" line="314" loc="Φ.org.eolang.positive-infinity-plus-negative-infinity.φ.α0.ρ.α0" pos="29"/>
//       </o>
//     </o>
//     <o base=".equal-to" line="315" loc="Φ.org.eolang.positive-infinity-plus-negative-infinity.φ.α1" pos="5"> 
//       <o base="$" line="315" loc="Φ.org.eolang.positive-infinity-plus-negative-infinity.φ.α1.ρ" pos="4"/>
//       <o base=".as-bytes" line="315" loc="Φ.org.eolang.positive-infinity-plus-negative-infinity.φ.α1.α0" pos="18"> 
//         <o base="org.eolang.nan" line="315" loc="Φ.org.eolang.positive-infinity-plus-negative-infinity.φ.α1.α0.ρ" pos="15"/>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "positive-infinity-plus-negative-infinityTest", oname = "positive-infinity-plus-negative-infinity", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/positive-infinity-tests.eo")
public final class EOpositive_infinity_plus_negative_infinityTest extends PhDefault {
  public EOpositive_infinity_plus_negative_infinityTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 312, 2, "Φ.org.eolang.positive-infinity-plus-negative-infinity.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("positive-infinity").get();
          ret_1_base_base = new PhLocated(ret_1_base_base, 314, 6, "Φ.org.eolang.positive-infinity-plus-negative-infinity.φ.α0.ρ.ρ");
        Phi ret_1_base = new PhMethod(ret_1_base_base, "plus");
          ret_1_base = new PhLocated(ret_1_base, 314, 23, "Φ.org.eolang.positive-infinity-plus-negative-infinity.φ.α0.ρ");
        ret_1_base = new PhCopy(ret_1_base);
          Phi ret_1_base_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("negative-infinity").get();
            ret_1_base_1 = new PhLocated(ret_1_base_1, 314, 29, "Φ.org.eolang.positive-infinity-plus-negative-infinity.φ.α0.ρ.α0");
          ret_1_base = new PhWith(ret_1_base, 0, ret_1_base_1);
        Phi ret_1 = new PhMethod(ret_1_base, "as-bytes");
          ret_1 = new PhLocated(ret_1, 313, 4, "Φ.org.eolang.positive-infinity-plus-negative-infinity.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 315, 4, "Φ.org.eolang.positive-infinity-plus-negative-infinity.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 315, 5, "Φ.org.eolang.positive-infinity-plus-negative-infinity.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("nan").get();
            ret_2_1_base = new PhLocated(ret_2_1_base, 315, 15, "Φ.org.eolang.positive-infinity-plus-negative-infinity.φ.α1.α0.ρ");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "as-bytes");
            ret_2_1 = new PhLocated(ret_2_1, 315, 18, "Φ.org.eolang.positive-infinity-plus-negative-infinity.φ.α1.α0");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOpositive_infinity_plus_negative_infinityTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
