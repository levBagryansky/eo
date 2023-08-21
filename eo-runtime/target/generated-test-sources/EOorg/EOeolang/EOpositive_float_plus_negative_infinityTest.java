
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="439" loc="Φ.org.eolang.positive-float-plus-negative-infinity" name="positive-float-plus-negative-infinity" original-name="positive-float-plus-negative-infinity" pos="0"> 
//   <o base="org.eolang.negative-infinity" const="" line="440" loc="Φ.org.eolang.positive-float-plus-negative-infinity.neg-inf" name="neg-inf" pos="2"/>
//   <o base="org.eolang.hamcrest.assert-that" line="441" loc="Φ.org.eolang.positive-float-plus-negative-infinity.φ" name="@" pos="2"> 
//     <o base=".plus" line="442" loc="Φ.org.eolang.positive-float-plus-negative-infinity.φ.α0" pos="8"> 
//       <o base="org.eolang.float" data="float" line="442" loc="Φ.org.eolang.positive-float-plus-negative-infinity.φ.α0.ρ" pos="4">42.5</o>
//       <o base="neg-inf" line="442" loc="Φ.org.eolang.positive-float-plus-negative-infinity.φ.α0.α0" pos="14" ref="440"/>
//     </o>
//     <o base=".equal-to" line="443" loc="Φ.org.eolang.positive-float-plus-negative-infinity.φ.α1" pos="5"> 
//       <o base="$" line="443" loc="Φ.org.eolang.positive-float-plus-negative-infinity.φ.α1.ρ" pos="4"/>
//       <o base="neg-inf" line="443" loc="Φ.org.eolang.positive-float-plus-negative-infinity.φ.α1.α0" pos="15" ref="440"/>
//     </o>
//   </o>
// </o>
@XmirObject(name = "positive-float-plus-negative-infinityTest", oname = "positive-float-plus-negative-infinity", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/float-tests.eo")
public final class EOpositive_float_plus_negative_infinityTest extends PhDefault {
  public EOpositive_float_plus_negative_infinityTest() {
    this.add("neg-inf", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("negative-infinity").get();
        ret = new PhLocated(ret, 440, 2, "Φ.org.eolang.positive-float-plus-negative-infinity.neg-inf");
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 441, 2, "Φ.org.eolang.positive-float-plus-negative-infinity.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new EOorg.EOeolang.EOfloat(Phi.Φ);
          ret_1_base = new PhLocated(ret_1_base, 442, 4, "Φ.org.eolang.positive-float-plus-negative-infinity.φ.α0.ρ");
          ret_1_base = new PhWith(ret_1_base, "Δ", new Data.Value<>(42.5d));
        Phi ret_1 = new PhMethod(ret_1_base, "plus");
          ret_1 = new PhLocated(ret_1, 442, 8, "Φ.org.eolang.positive-float-plus-negative-infinity.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new PhMethod(rho, "neg-inf");
            ret_1_1 = new PhLocated(ret_1_1, 442, 14, "Φ.org.eolang.positive-float-plus-negative-infinity.φ.α0.α0");
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 443, 4, "Φ.org.eolang.positive-float-plus-negative-infinity.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 443, 5, "Φ.org.eolang.positive-float-plus-negative-infinity.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new PhMethod(rho, "neg-inf");
            ret_2_1 = new PhLocated(ret_2_1, 443, 15, "Φ.org.eolang.positive-float-plus-negative-infinity.φ.α1.α0");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOpositive_float_plus_negative_infinityTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}