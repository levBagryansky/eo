
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="102" loc="Φ.org.eolang.compares-two-different-strings" name="compares-two-different-strings" original-name="compares-two-different-strings" pos="0"> 
//   <o base=".not" line="103" loc="Φ.org.eolang.compares-two-different-strings.φ" name="@" pos="2"> 
//     <o base=".eq" line="104" loc="Φ.org.eolang.compares-two-different-strings.φ.ρ" pos="4"> 
//       <o base="org.eolang.string" data="string" line="105" loc="Φ.org.eolang.compares-two-different-strings.φ.ρ.ρ" pos="6">Hello</o>
//       <o base="org.eolang.string" data="string" line="106" loc="Φ.org.eolang.compares-two-different-strings.φ.ρ.α0" pos="6">Good bye</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "compares-two-different-stringsTest", oname = "compares-two-different-strings", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/string-tests.eo")
public final class EOcompares_two_different_stringsTest extends PhDefault {
    
  public EOcompares_two_different_stringsTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new EOorg.EOeolang.EOstring(Phi.Φ);
        ret_base_base = new PhLocated(ret_base_base, 105, 6, "Φ.org.eolang.compares-two-different-strings.φ.ρ.ρ");
        ret_base_base = new PhWith(ret_base_base, "Δ", new Data.Value<>("Hello"));
      Phi ret_base = new PhMethod(ret_base_base, "eq");
        ret_base = new PhLocated(ret_base, 104, 4, "Φ.org.eolang.compares-two-different-strings.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_base_1 = new PhLocated(ret_base_1, 106, 6, "Φ.org.eolang.compares-two-different-strings.φ.ρ.α0");
          ret_base_1 = new PhWith(ret_base_1, "Δ", new Data.Value<>("Good bye"));
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "not");
        ret = new PhLocated(ret, 103, 2, "Φ.org.eolang.compares-two-different-strings.φ");
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOcompares_two_different_stringsTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
