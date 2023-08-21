
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="379" loc="Φ.org.eolang.positive-infinity-minus-negative-infinity" name="positive-infinity-minus-negative-infinity" original-name="positive-infinity-minus-negative-infinity" pos="0"> 
//   <o base="org.eolang.positive-infinity" const="" line="380" loc="Φ.org.eolang.positive-infinity-minus-negative-infinity.pos-inf" name="pos-inf" pos="2"/>
//   <o base="org.eolang.hamcrest.assert-that" line="381" loc="Φ.org.eolang.positive-infinity-minus-negative-infinity.φ" name="@" pos="2"> 
//     <o base=".minus" line="382" loc="Φ.org.eolang.positive-infinity-minus-negative-infinity.φ.α0" pos="11"> 
//       <o base="pos-inf" line="382" loc="Φ.org.eolang.positive-infinity-minus-negative-infinity.φ.α0.ρ" pos="4" ref="380"/>
//       <o base="org.eolang.negative-infinity" line="382" loc="Φ.org.eolang.positive-infinity-minus-negative-infinity.φ.α0.α0" pos="18"/>
//     </o>
//     <o base=".equal-to" line="383" loc="Φ.org.eolang.positive-infinity-minus-negative-infinity.φ.α1" pos="5"> 
//       <o base="$" line="383" loc="Φ.org.eolang.positive-infinity-minus-negative-infinity.φ.α1.ρ" pos="4"/>
//       <o base="pos-inf" line="383" loc="Φ.org.eolang.positive-infinity-minus-negative-infinity.φ.α1.α0" pos="15" ref="380"/>
//     </o>
//   </o>
// </o>
@XmirObject(name = "positive-infinity-minus-negative-infinityTest", oname = "positive-infinity-minus-negative-infinity", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/positive-infinity-tests.eo")
public final class EOpositive_infinity_minus_negative_infinityTest extends PhDefault {
  public EOpositive_infinity_minus_negative_infinityTest() {
    this.add("pos-inf", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("positive-infinity").get();
        ret = new PhLocated(ret, 380, 2, "Φ.org.eolang.positive-infinity-minus-negative-infinity.pos-inf");
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 381, 2, "Φ.org.eolang.positive-infinity-minus-negative-infinity.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(rho, "pos-inf");
          ret_1_base = new PhLocated(ret_1_base, 382, 4, "Φ.org.eolang.positive-infinity-minus-negative-infinity.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "minus");
          ret_1 = new PhLocated(ret_1, 382, 11, "Φ.org.eolang.positive-infinity-minus-negative-infinity.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("negative-infinity").get();
            ret_1_1 = new PhLocated(ret_1_1, 382, 18, "Φ.org.eolang.positive-infinity-minus-negative-infinity.φ.α0.α0");
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 383, 4, "Φ.org.eolang.positive-infinity-minus-negative-infinity.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 383, 5, "Φ.org.eolang.positive-infinity-minus-negative-infinity.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new PhMethod(rho, "pos-inf");
            ret_2_1 = new PhLocated(ret_2_1, 383, 15, "Φ.org.eolang.positive-infinity-minus-negative-infinity.φ.α1.α0");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOpositive_infinity_minus_negative_infinityTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}