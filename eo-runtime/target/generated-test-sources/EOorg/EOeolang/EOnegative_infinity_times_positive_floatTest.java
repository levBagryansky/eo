
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="219" loc="Φ.org.eolang.negative-infinity-times-positive-float" name="negative-infinity-times-positive-float" original-name="negative-infinity-times-positive-float" pos="0"> 
//   <o base="org.eolang.negative-infinity" const="" line="220" loc="Φ.org.eolang.negative-infinity-times-positive-float.neg-inf" name="neg-inf" pos="2"/>
//   <o base="org.eolang.hamcrest.assert-that" line="221" loc="Φ.org.eolang.negative-infinity-times-positive-float.φ" name="@" pos="2"> 
//     <o base=".times" line="222" loc="Φ.org.eolang.negative-infinity-times-positive-float.φ.α0" pos="11"> 
//       <o base="neg-inf" line="222" loc="Φ.org.eolang.negative-infinity-times-positive-float.φ.α0.ρ" pos="4" ref="220"/>
//       <o base="org.eolang.float" data="float" line="222" loc="Φ.org.eolang.negative-infinity-times-positive-float.φ.α0.α0" pos="18">42.5</o>
//     </o>
//     <o base=".equal-to" line="223" loc="Φ.org.eolang.negative-infinity-times-positive-float.φ.α1" pos="5"> 
//       <o base="$" line="223" loc="Φ.org.eolang.negative-infinity-times-positive-float.φ.α1.ρ" pos="4"/>
//       <o base="neg-inf" line="223" loc="Φ.org.eolang.negative-infinity-times-positive-float.φ.α1.α0" pos="15" ref="220"/>
//     </o>
//   </o>
// </o>
@XmirObject(name = "negative-infinity-times-positive-floatTest", oname = "negative-infinity-times-positive-float", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/negative-infinity-tests.eo")
public final class EOnegative_infinity_times_positive_floatTest extends PhDefault {
  public EOnegative_infinity_times_positive_floatTest() {
    this.add("neg-inf", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("negative-infinity").get();
        ret = new PhLocated(ret, 220, 2, "Φ.org.eolang.negative-infinity-times-positive-float.neg-inf");
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 221, 2, "Φ.org.eolang.negative-infinity-times-positive-float.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(rho, "neg-inf");
          ret_1_base = new PhLocated(ret_1_base, 222, 4, "Φ.org.eolang.negative-infinity-times-positive-float.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "times");
          ret_1 = new PhLocated(ret_1, 222, 11, "Φ.org.eolang.negative-infinity-times-positive-float.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOorg.EOeolang.EOfloat(Phi.Φ);
            ret_1_1 = new PhLocated(ret_1_1, 222, 18, "Φ.org.eolang.negative-infinity-times-positive-float.φ.α0.α0");
            ret_1_1 = new PhWith(ret_1_1, "Δ", new Data.Value<>(42.5d));
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 223, 4, "Φ.org.eolang.negative-infinity-times-positive-float.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 223, 5, "Φ.org.eolang.negative-infinity-times-positive-float.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new PhMethod(rho, "neg-inf");
            ret_2_1 = new PhLocated(ret_2_1, 223, 15, "Φ.org.eolang.negative-infinity-times-positive-float.φ.α1.α0");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOnegative_infinity_times_positive_floatTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
