
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="341" loc="Φ.org.eolang.negative-infinity-plus-negative-float" name="negative-infinity-plus-negative-float" original-name="negative-infinity-plus-negative-float" pos="0"> 
//   <o base="org.eolang.negative-infinity" const="" line="342" loc="Φ.org.eolang.negative-infinity-plus-negative-float.neg-inf" name="neg-inf" pos="2"/>
//   <o base="org.eolang.hamcrest.assert-that" line="343" loc="Φ.org.eolang.negative-infinity-plus-negative-float.φ" name="@" pos="2"> 
//     <o base=".plus" line="344" loc="Φ.org.eolang.negative-infinity-plus-negative-float.φ.α0" pos="11"> 
//       <o base="neg-inf" line="344" loc="Φ.org.eolang.negative-infinity-plus-negative-float.φ.α0.ρ" pos="4" ref="342"/>
//       <o base="org.eolang.float" data="float" line="344" loc="Φ.org.eolang.negative-infinity-plus-negative-float.φ.α0.α0" pos="17">-42.5</o>
//     </o>
//     <o base=".equal-to" line="345" loc="Φ.org.eolang.negative-infinity-plus-negative-float.φ.α1" pos="5"> 
//       <o base="$" line="345" loc="Φ.org.eolang.negative-infinity-plus-negative-float.φ.α1.ρ" pos="4"/>
//       <o base="neg-inf" line="345" loc="Φ.org.eolang.negative-infinity-plus-negative-float.φ.α1.α0" pos="15" ref="342"/>
//     </o>
//   </o>
// </o>
@XmirObject(name = "negative-infinity-plus-negative-floatTest", oname = "negative-infinity-plus-negative-float", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/negative-infinity-tests.eo")
public final class EOnegative_infinity_plus_negative_floatTest extends PhDefault {
  public EOnegative_infinity_plus_negative_floatTest() {
    this.add("neg-inf", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("negative-infinity").get();
        ret = new PhLocated(ret, 342, 2, "Φ.org.eolang.negative-infinity-plus-negative-float.neg-inf");
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 343, 2, "Φ.org.eolang.negative-infinity-plus-negative-float.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(rho, "neg-inf");
          ret_1_base = new PhLocated(ret_1_base, 344, 4, "Φ.org.eolang.negative-infinity-plus-negative-float.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "plus");
          ret_1 = new PhLocated(ret_1, 344, 11, "Φ.org.eolang.negative-infinity-plus-negative-float.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOorg.EOeolang.EOfloat(Phi.Φ);
            ret_1_1 = new PhLocated(ret_1_1, 344, 17, "Φ.org.eolang.negative-infinity-plus-negative-float.φ.α0.α0");
            ret_1_1 = new PhWith(ret_1_1, "Δ", new Data.Value<>(-42.5d));
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 345, 4, "Φ.org.eolang.negative-infinity-plus-negative-float.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 345, 5, "Φ.org.eolang.negative-infinity-plus-negative-float.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new PhMethod(rho, "neg-inf");
            ret_2_1 = new PhLocated(ret_2_1, 345, 15, "Φ.org.eolang.negative-infinity-plus-negative-float.φ.α1.α0");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOnegative_infinity_plus_negative_floatTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
