
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="108" loc="Φ.org.eolang.supports-escape-sequences" name="supports-escape-sequences" original-name="supports-escape-sequences" pos="0"> 
//   <o base=".eq" line="109" loc="Φ.org.eolang.supports-escape-sequences.φ" name="@" pos="2"> 
//     <o base="org.eolang.string" data="string" line="110" loc="Φ.org.eolang.supports-escape-sequences.φ.ρ" pos="4">Hello, \u0434\u0440\u0443\u0433!\n</o>
//     <o base="org.eolang.string" data="string" line="111" loc="Φ.org.eolang.supports-escape-sequences.φ.α0" pos="4">Hello, \u0434\u0440\u0443\u0433!\n</o>
//   </o>
// </o>
@XmirObject(name = "supports-escape-sequencesTest", oname = "supports-escape-sequences", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/string-tests.eo")
public final class EOsupports_escape_sequencesTest extends PhDefault {
    
  public EOsupports_escape_sequencesTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new EOorg.EOeolang.EOstring(Phi.Φ);
        ret_base = new PhLocated(ret_base, 110, 4, "Φ.org.eolang.supports-escape-sequences.φ.ρ");
        ret_base = new PhWith(ret_base, "Δ", new Data.Value<>("Hello, \u0434\u0440\u0443\u0433!\n"));
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 109, 2, "Φ.org.eolang.supports-escape-sequences.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 111, 4, "Φ.org.eolang.supports-escape-sequences.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>("Hello, \u0434\u0440\u0443\u0433!\n"));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOsupports_escape_sequencesTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
