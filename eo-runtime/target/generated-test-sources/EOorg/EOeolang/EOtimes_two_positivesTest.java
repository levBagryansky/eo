
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="214" loc="Φ.org.eolang.times-two-positives" name="times-two-positives" original-name="times-two-positives" pos="0"> 
//   <o base=".eq" line="215" loc="Φ.org.eolang.times-two-positives.φ" name="@" pos="2"> 
//     <o base=".times" line="216" loc="Φ.org.eolang.times-two-positives.φ.ρ" pos="4"> 
//       <o base="org.eolang.float" data="float" line="217" loc="Φ.org.eolang.times-two-positives.φ.ρ.ρ" pos="6">574.5</o>
//       <o base="org.eolang.float" data="float" line="218" loc="Φ.org.eolang.times-two-positives.φ.ρ.α0" pos="6">311.985</o>
//     </o>
//     <o base="org.eolang.float" data="float" line="219" loc="Φ.org.eolang.times-two-positives.φ.α0" pos="4">179235.3825</o>
//   </o>
// </o>
@XmirObject(name = "times-two-positivesTest", oname = "times-two-positives", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/float-tests.eo")
public final class EOtimes_two_positivesTest extends PhDefault {
    
  public EOtimes_two_positivesTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new EOorg.EOeolang.EOfloat(Phi.Φ);
        ret_base_base = new PhLocated(ret_base_base, 217, 6, "Φ.org.eolang.times-two-positives.φ.ρ.ρ");
        ret_base_base = new PhWith(ret_base_base, "Δ", new Data.Value<>(574.5d));
      Phi ret_base = new PhMethod(ret_base_base, "times");
        ret_base = new PhLocated(ret_base, 216, 4, "Φ.org.eolang.times-two-positives.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new EOorg.EOeolang.EOfloat(Phi.Φ);
          ret_base_1 = new PhLocated(ret_base_1, 218, 6, "Φ.org.eolang.times-two-positives.φ.ρ.α0");
          ret_base_1 = new PhWith(ret_base_1, "Δ", new Data.Value<>(311.985d));
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 215, 2, "Φ.org.eolang.times-two-positives.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOfloat(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 219, 4, "Φ.org.eolang.times-two-positives.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(179235.3825d));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOtimes_two_positivesTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
