
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="59" loc="Φ.org.eolang.positive-infinity-not-eq-float" name="positive-infinity-not-eq-float" original-name="positive-infinity-not-eq-float" pos="0"> 
//   <o base=".not" line="60" loc="Φ.org.eolang.positive-infinity-not-eq-float.φ" name="@" pos="2"> 
//     <o base=".eq" line="61" loc="Φ.org.eolang.positive-infinity-not-eq-float.φ.ρ" pos="4"> 
//       <o base="org.eolang.positive-infinity" line="62" loc="Φ.org.eolang.positive-infinity-not-eq-float.φ.ρ.ρ" pos="6"/>
//       <o base="org.eolang.float" data="float" line="63" loc="Φ.org.eolang.positive-infinity-not-eq-float.φ.ρ.α0" pos="6">42.5</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "positive-infinity-not-eq-floatTest", oname = "positive-infinity-not-eq-float", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/positive-infinity-tests.eo")
public final class EOpositive_infinity_not_eq_floatTest extends PhDefault {
    
  public EOpositive_infinity_not_eq_floatTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("positive-infinity").get();
        ret_base_base = new PhLocated(ret_base_base, 62, 6, "Φ.org.eolang.positive-infinity-not-eq-float.φ.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "eq");
        ret_base = new PhLocated(ret_base, 61, 4, "Φ.org.eolang.positive-infinity-not-eq-float.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new EOorg.EOeolang.EOfloat(Phi.Φ);
          ret_base_1 = new PhLocated(ret_base_1, 63, 6, "Φ.org.eolang.positive-infinity-not-eq-float.φ.ρ.α0");
          ret_base_1 = new PhWith(ret_base_1, "Δ", new Data.Value<>(42.5d));
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "not");
        ret = new PhLocated(ret, 60, 2, "Φ.org.eolang.positive-infinity-not-eq-float.φ");
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOpositive_infinity_not_eq_floatTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
