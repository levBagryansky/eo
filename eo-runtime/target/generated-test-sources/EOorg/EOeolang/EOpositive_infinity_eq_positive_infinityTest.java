
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="35" loc="Φ.org.eolang.positive-infinity-eq-positive-infinity" name="positive-infinity-eq-positive-infinity" original-name="positive-infinity-eq-positive-infinity" pos="0"> 
//   <o base="org.eolang.positive-infinity" line="36" loc="Φ.org.eolang.positive-infinity-eq-positive-infinity.pos-inf" name="pos-inf" pos="2"/>
//   <o base=".eq" line="37" loc="Φ.org.eolang.positive-infinity-eq-positive-infinity.φ" name="@" pos="2"> 
//     <o base="pos-inf" line="38" loc="Φ.org.eolang.positive-infinity-eq-positive-infinity.φ.ρ" pos="4" ref="36"/>
//     <o base="pos-inf" line="39" loc="Φ.org.eolang.positive-infinity-eq-positive-infinity.φ.α0" pos="4" ref="36"/>
//   </o>
// </o>
@XmirObject(name = "positive-infinity-eq-positive-infinityTest", oname = "positive-infinity-eq-positive-infinity", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/positive-infinity-tests.eo")
public final class EOpositive_infinity_eq_positive_infinityTest extends PhDefault {
    
  public EOpositive_infinity_eq_positive_infinityTest() {
    this.add("pos-inf", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("positive-infinity").get();
        ret = new PhLocated(ret, 36, 2, "Φ.org.eolang.positive-infinity-eq-positive-infinity.pos-inf");
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "pos-inf");
        ret_base = new PhLocated(ret_base, 38, 4, "Φ.org.eolang.positive-infinity-eq-positive-infinity.φ.ρ");
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 37, 2, "Φ.org.eolang.positive-infinity-eq-positive-infinity.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new PhMethod(rho, "pos-inf");
          ret_1 = new PhLocated(ret_1, 39, 4, "Φ.org.eolang.positive-infinity-eq-positive-infinity.φ.α0");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOpositive_infinity_eq_positive_infinityTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
