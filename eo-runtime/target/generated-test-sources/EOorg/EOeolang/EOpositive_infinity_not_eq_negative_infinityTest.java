
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="42" loc="Φ.org.eolang.positive-infinity-not-eq-negative-infinity" name="positive-infinity-not-eq-negative-infinity" original-name="positive-infinity-not-eq-negative-infinity" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="43" loc="Φ.org.eolang.positive-infinity-not-eq-negative-infinity.φ" name="@" pos="2"> 
//     <o base="org.eolang.positive-infinity" line="44" loc="Φ.org.eolang.positive-infinity-not-eq-negative-infinity.φ.α0" pos="4"/>
//     <o base=".not" line="45" loc="Φ.org.eolang.positive-infinity-not-eq-negative-infinity.φ.α1" pos="5"> 
//       <o base="$" line="45" loc="Φ.org.eolang.positive-infinity-not-eq-negative-infinity.φ.α1.ρ" pos="4"/>
//       <o base=".equal-to" line="46" loc="Φ.org.eolang.positive-infinity-not-eq-negative-infinity.φ.α1.α0" pos="7"> 
//         <o base="$" line="46" loc="Φ.org.eolang.positive-infinity-not-eq-negative-infinity.φ.α1.α0.ρ" pos="6"/>
//         <o base="org.eolang.negative-infinity" line="46" loc="Φ.org.eolang.positive-infinity-not-eq-negative-infinity.φ.α1.α0.α0" pos="17"/>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "positive-infinity-not-eq-negative-infinityTest", oname = "positive-infinity-not-eq-negative-infinity", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/positive-infinity-tests.eo")
public final class EOpositive_infinity_not_eq_negative_infinityTest extends PhDefault {
  public EOpositive_infinity_not_eq_negative_infinityTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 43, 2, "Φ.org.eolang.positive-infinity-not-eq-negative-infinity.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("positive-infinity").get();
          ret_1 = new PhLocated(ret_1, 44, 4, "Φ.org.eolang.positive-infinity-not-eq-negative-infinity.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 45, 4, "Φ.org.eolang.positive-infinity-not-eq-negative-infinity.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "not");
          ret_2 = new PhLocated(ret_2, 45, 5, "Φ.org.eolang.positive-infinity-not-eq-negative-infinity.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = rho;
            ret_2_1_base = new PhLocated(ret_2_1_base, 46, 6, "Φ.org.eolang.positive-infinity-not-eq-negative-infinity.φ.α1.α0.ρ");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "equal-to");
            ret_2_1 = new PhLocated(ret_2_1, 46, 7, "Φ.org.eolang.positive-infinity-not-eq-negative-infinity.φ.α1.α0");
          ret_2_1 = new PhCopy(ret_2_1);
            Phi ret_2_1_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("negative-infinity").get();
              ret_2_1_1 = new PhLocated(ret_2_1_1, 46, 17, "Φ.org.eolang.positive-infinity-not-eq-negative-infinity.φ.α1.α0.α0");
            ret_2_1 = new PhWith(ret_2_1, 0, ret_2_1_1);
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOpositive_infinity_not_eq_negative_infinityTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}