
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="149" loc="Φ.org.eolang.positive-infinity-gt-float" name="positive-infinity-gt-float" original-name="positive-infinity-gt-float" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="150" loc="Φ.org.eolang.positive-infinity-gt-float.φ" name="@" pos="2"> 
//     <o base="org.eolang.positive-infinity" line="151" loc="Φ.org.eolang.positive-infinity-gt-float.φ.α0" pos="4"/>
//     <o base=".greater-than" line="152" loc="Φ.org.eolang.positive-infinity-gt-float.φ.α1" pos="5"> 
//       <o base="$" line="152" loc="Φ.org.eolang.positive-infinity-gt-float.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.float" data="float" line="152" loc="Φ.org.eolang.positive-infinity-gt-float.φ.α1.α0" pos="19">42.5</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "positive-infinity-gt-floatTest", oname = "positive-infinity-gt-float", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/positive-infinity-tests.eo")
public final class EOpositive_infinity_gt_floatTest extends PhDefault {
  public EOpositive_infinity_gt_floatTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 150, 2, "Φ.org.eolang.positive-infinity-gt-float.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("positive-infinity").get();
          ret_1 = new PhLocated(ret_1, 151, 4, "Φ.org.eolang.positive-infinity-gt-float.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 152, 4, "Φ.org.eolang.positive-infinity-gt-float.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "greater-than");
          ret_2 = new PhLocated(ret_2, 152, 5, "Φ.org.eolang.positive-infinity-gt-float.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EOfloat(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 152, 19, "Φ.org.eolang.positive-infinity-gt-float.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(42.5d));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOpositive_infinity_gt_floatTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}