
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="379" loc="Φ.org.eolang.positive-float-minus-positive-infinity" name="positive-float-minus-positive-infinity" original-name="positive-float-minus-positive-infinity" pos="0"> 
//   <o base=".eq" line="380" loc="Φ.org.eolang.positive-float-minus-positive-infinity.φ" name="@" pos="2"> 
//     <o base=".minus" line="381" loc="Φ.org.eolang.positive-float-minus-positive-infinity.φ.ρ" pos="8"> 
//       <o base="org.eolang.float" data="float" line="381" loc="Φ.org.eolang.positive-float-minus-positive-infinity.φ.ρ.ρ" pos="4">42.5</o>
//       <o base="org.eolang.positive-infinity" line="381" loc="Φ.org.eolang.positive-float-minus-positive-infinity.φ.ρ.α0" pos="15"/>
//     </o>
//     <o base="org.eolang.negative-infinity" line="382" loc="Φ.org.eolang.positive-float-minus-positive-infinity.φ.α0" pos="4"/>
//   </o>
// </o>
@XmirObject(name = "positive-float-minus-positive-infinityTest", oname = "positive-float-minus-positive-infinity", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/float-tests.eo")
public final class EOpositive_float_minus_positive_infinityTest extends PhDefault {
    
  public EOpositive_float_minus_positive_infinityTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new EOorg.EOeolang.EOfloat(Phi.Φ);
        ret_base_base = new PhLocated(ret_base_base, 381, 4, "Φ.org.eolang.positive-float-minus-positive-infinity.φ.ρ.ρ");
        ret_base_base = new PhWith(ret_base_base, "Δ", new Data.Value<>(42.5d));
      Phi ret_base = new PhMethod(ret_base_base, "minus");
        ret_base = new PhLocated(ret_base, 381, 8, "Φ.org.eolang.positive-float-minus-positive-infinity.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("positive-infinity").get();
          ret_base_1 = new PhLocated(ret_base_1, 381, 15, "Φ.org.eolang.positive-float-minus-positive-infinity.φ.ρ.α0");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 380, 2, "Φ.org.eolang.positive-float-minus-positive-infinity.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("negative-infinity").get();
          ret_1 = new PhLocated(ret_1, 382, 4, "Φ.org.eolang.positive-float-minus-positive-infinity.φ.α0");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOpositive_float_minus_positive_infinityTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
