
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="41" loc="Φ.org.eolang.positive-infinity-not-eq-negative-infinity" name="positive-infinity-not-eq-negative-infinity" original-name="positive-infinity-not-eq-negative-infinity" pos="0"> 
//   <o base=".not" line="42" loc="Φ.org.eolang.positive-infinity-not-eq-negative-infinity.φ" name="@" pos="2"> 
//     <o base=".eq" line="43" loc="Φ.org.eolang.positive-infinity-not-eq-negative-infinity.φ.ρ" pos="4"> 
//       <o base="org.eolang.positive-infinity" line="44" loc="Φ.org.eolang.positive-infinity-not-eq-negative-infinity.φ.ρ.ρ" pos="6"/>
//       <o base="org.eolang.negative-infinity" line="45" loc="Φ.org.eolang.positive-infinity-not-eq-negative-infinity.φ.ρ.α0" pos="6"/>
//     </o>
//   </o>
// </o>
@XmirObject(name = "positive-infinity-not-eq-negative-infinityTest", oname = "positive-infinity-not-eq-negative-infinity", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/positive-infinity-tests.eo")
public final class EOpositive_infinity_not_eq_negative_infinityTest extends PhDefault {
    
  public EOpositive_infinity_not_eq_negative_infinityTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("positive-infinity").get();
        ret_base_base = new PhLocated(ret_base_base, 44, 6, "Φ.org.eolang.positive-infinity-not-eq-negative-infinity.φ.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "eq");
        ret_base = new PhLocated(ret_base, 43, 4, "Φ.org.eolang.positive-infinity-not-eq-negative-infinity.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("negative-infinity").get();
          ret_base_1 = new PhLocated(ret_base_1, 45, 6, "Φ.org.eolang.positive-infinity-not-eq-negative-infinity.φ.ρ.α0");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "not");
        ret = new PhLocated(ret, 42, 2, "Φ.org.eolang.positive-infinity-not-eq-negative-infinity.φ");
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
