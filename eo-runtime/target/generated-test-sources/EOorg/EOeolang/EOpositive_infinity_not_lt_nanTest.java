
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="77" loc="Φ.org.eolang.positive-infinity-not-lt-nan" name="positive-infinity-not-lt-nan" original-name="positive-infinity-not-lt-nan" pos="0"> 
//   <o base=".eq" line="78" loc="Φ.org.eolang.positive-infinity-not-lt-nan.φ" name="@" pos="2"> 
//     <o base=".lt" line="79" loc="Φ.org.eolang.positive-infinity-not-lt-nan.φ.ρ" pos="21"> 
//       <o base="org.eolang.positive-infinity" line="79" loc="Φ.org.eolang.positive-infinity-not-lt-nan.φ.ρ.ρ" pos="4"/>
//       <o base="org.eolang.nan" line="79" loc="Φ.org.eolang.positive-infinity-not-lt-nan.φ.ρ.α0" pos="25"/>
//     </o>
//     <o base="org.eolang.bool" data="bool" line="80" loc="Φ.org.eolang.positive-infinity-not-lt-nan.φ.α0" pos="4">FALSE</o>
//   </o>
// </o>
@XmirObject(name = "positive-infinity-not-lt-nanTest", oname = "positive-infinity-not-lt-nan", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/positive-infinity-tests.eo")
public final class EOpositive_infinity_not_lt_nanTest extends PhDefault {
    
  public EOpositive_infinity_not_lt_nanTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("positive-infinity").get();
        ret_base_base = new PhLocated(ret_base_base, 79, 4, "Φ.org.eolang.positive-infinity-not-lt-nan.φ.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "lt");
        ret_base = new PhLocated(ret_base, 79, 21, "Φ.org.eolang.positive-infinity-not-lt-nan.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("nan").get();
          ret_base_1 = new PhLocated(ret_base_1, 79, 25, "Φ.org.eolang.positive-infinity-not-lt-nan.φ.ρ.α0");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 78, 2, "Φ.org.eolang.positive-infinity-not-lt-nan.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EObool(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 80, 4, "Φ.org.eolang.positive-infinity-not-lt-nan.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(Boolean.FALSE));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOpositive_infinity_not_lt_nanTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
