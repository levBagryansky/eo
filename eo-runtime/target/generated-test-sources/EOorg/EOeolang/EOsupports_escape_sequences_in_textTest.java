
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="115" loc="Φ.org.eolang.supports-escape-sequences-in-text" name="supports-escape-sequences-in-text" original-name="supports-escape-sequences-in-text" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="116" loc="Φ.org.eolang.supports-escape-sequences-in-text.φ" name="@" pos="2"> 
//     <o base="org.eolang.string" data="string" line="117" loc="Φ.org.eolang.supports-escape-sequences-in-text.φ.α0" pos="4">Hello, \u0434\u0440\u0443\u0433!\n</o>
//     <o base=".equal-to" line="120" loc="Φ.org.eolang.supports-escape-sequences-in-text.φ.α1" pos="5"> 
//       <o base="$" line="120" loc="Φ.org.eolang.supports-escape-sequences-in-text.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.string" data="string" line="120" loc="Φ.org.eolang.supports-escape-sequences-in-text.φ.α1.α0" pos="15">Hello, \u0434\u0440\u0443\u0433!\n</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "supports-escape-sequences-in-textTest", oname = "supports-escape-sequences-in-text", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/string-tests.eo")
public final class EOsupports_escape_sequences_in_textTest extends PhDefault {
  public EOsupports_escape_sequences_in_textTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 116, 2, "Φ.org.eolang.supports-escape-sequences-in-text.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 117, 4, "Φ.org.eolang.supports-escape-sequences-in-text.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>("Hello, \u0434\u0440\u0443\u0433!\n"));
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 120, 4, "Φ.org.eolang.supports-escape-sequences-in-text.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 120, 5, "Φ.org.eolang.supports-escape-sequences-in-text.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 120, 15, "Φ.org.eolang.supports-escape-sequences-in-text.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>("Hello, \u0434\u0440\u0443\u0433!\n"));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOsupports_escape_sequences_in_textTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
