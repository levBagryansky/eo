
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="178" loc="Φ.org.eolang.slice-escape-sequences-line-break" name="slice-escape-sequences-line-break" original-name="slice-escape-sequences-line-break" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="179" loc="Φ.org.eolang.slice-escape-sequences-line-break.φ" name="@" pos="2"> 
//     <o base=".slice" line="180" loc="Φ.org.eolang.slice-escape-sequences-line-break.φ.α0" pos="8"> 
//       <o base="org.eolang.string" data="string" line="180" loc="Φ.org.eolang.slice-escape-sequences-line-break.φ.α0.ρ" pos="4">\n</o>
//       <o base="org.eolang.int" data="int" line="181" loc="Φ.org.eolang.slice-escape-sequences-line-break.φ.α0.α0" pos="6">0</o>
//       <o base=".length" line="182" loc="Φ.org.eolang.slice-escape-sequences-line-break.φ.α0.α1" pos="10"> 
//         <o base="org.eolang.string" data="string" line="182" loc="Φ.org.eolang.slice-escape-sequences-line-break.φ.α0.α1.ρ" pos="6">\n</o>
//       </o>
//     </o>
//     <o base=".equal-to" line="183" loc="Φ.org.eolang.slice-escape-sequences-line-break.φ.α1" pos="5"> 
//       <o base="$" line="183" loc="Φ.org.eolang.slice-escape-sequences-line-break.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.string" data="string" line="183" loc="Φ.org.eolang.slice-escape-sequences-line-break.φ.α1.α0" pos="15">\n</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "slice-escape-sequences-line-breakTest", oname = "slice-escape-sequences-line-break", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/string-tests.eo")
public final class EOslice_escape_sequences_line_breakTest extends PhDefault {
  public EOslice_escape_sequences_line_breakTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 179, 2, "Φ.org.eolang.slice-escape-sequences-line-break.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_1_base = new PhLocated(ret_1_base, 180, 4, "Φ.org.eolang.slice-escape-sequences-line-break.φ.α0.ρ");
          ret_1_base = new PhWith(ret_1_base, "Δ", new Data.Value<>("\n"));
        Phi ret_1 = new PhMethod(ret_1_base, "slice");
          ret_1 = new PhLocated(ret_1, 180, 8, "Φ.org.eolang.slice-escape-sequences-line-break.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_1 = new PhLocated(ret_1_1, 181, 6, "Φ.org.eolang.slice-escape-sequences-line-break.φ.α0.α0");
            ret_1_1 = new PhWith(ret_1_1, "Δ", new Data.Value<>(0L));
          Phi ret_1_2_base = new EOorg.EOeolang.EOstring(Phi.Φ);
            ret_1_2_base = new PhLocated(ret_1_2_base, 182, 6, "Φ.org.eolang.slice-escape-sequences-line-break.φ.α0.α1.ρ");
            ret_1_2_base = new PhWith(ret_1_2_base, "Δ", new Data.Value<>("\n"));
          Phi ret_1_2 = new PhMethod(ret_1_2_base, "length");
            ret_1_2 = new PhLocated(ret_1_2, 182, 10, "Φ.org.eolang.slice-escape-sequences-line-break.φ.α0.α1");
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
          ret_1 = new PhWith(ret_1, 1, ret_1_2);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 183, 4, "Φ.org.eolang.slice-escape-sequences-line-break.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 183, 5, "Φ.org.eolang.slice-escape-sequences-line-break.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 183, 15, "Φ.org.eolang.slice-escape-sequences-line-break.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>("\n"));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOslice_escape_sequences_line_breakTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
