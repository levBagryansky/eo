
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="36" loc="Φ.org.eolang.negative-infinity-eq-negative-infinity" name="negative-infinity-eq-negative-infinity" original-name="negative-infinity-eq-negative-infinity" pos="0"> 
//   <o base="org.eolang.negative-infinity" const="" line="37" loc="Φ.org.eolang.negative-infinity-eq-negative-infinity.neg-inf" name="neg-inf" pos="2"/>
//   <o base="org.eolang.hamcrest.assert-that" line="38" loc="Φ.org.eolang.negative-infinity-eq-negative-infinity.φ" name="@" pos="2"> 
//     <o base="neg-inf" line="39" loc="Φ.org.eolang.negative-infinity-eq-negative-infinity.φ.α0" pos="4" ref="37"/>
//     <o base=".equal-to" line="40" loc="Φ.org.eolang.negative-infinity-eq-negative-infinity.φ.α1" pos="5"> 
//       <o base="$" line="40" loc="Φ.org.eolang.negative-infinity-eq-negative-infinity.φ.α1.ρ" pos="4"/>
//       <o base="neg-inf" line="40" loc="Φ.org.eolang.negative-infinity-eq-negative-infinity.φ.α1.α0" pos="15" ref="37"/>
//     </o>
//   </o>
// </o>
@XmirObject(name = "negative-infinity-eq-negative-infinityTest", oname = "negative-infinity-eq-negative-infinity", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/negative-infinity-tests.eo")
public final class EOnegative_infinity_eq_negative_infinityTest extends PhDefault {
  public EOnegative_infinity_eq_negative_infinityTest() {
    this.add("neg-inf", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("negative-infinity").get();
        ret = new PhLocated(ret, 37, 2, "Φ.org.eolang.negative-infinity-eq-negative-infinity.neg-inf");
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 38, 2, "Φ.org.eolang.negative-infinity-eq-negative-infinity.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new PhMethod(rho, "neg-inf");
          ret_1 = new PhLocated(ret_1, 39, 4, "Φ.org.eolang.negative-infinity-eq-negative-infinity.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 40, 4, "Φ.org.eolang.negative-infinity-eq-negative-infinity.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 40, 5, "Φ.org.eolang.negative-infinity-eq-negative-infinity.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new PhMethod(rho, "neg-inf");
            ret_2_1 = new PhLocated(ret_2_1, 40, 15, "Φ.org.eolang.negative-infinity-eq-negative-infinity.φ.α1.α0");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOnegative_infinity_eq_negative_infinityTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
