
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="176" loc="Φ.org.eolang.slice-escape-sequences-line-break" name="slice-escape-sequences-line-break" original-name="slice-escape-sequences-line-break" pos="0"> 
//   <o base=".eq" line="177" loc="Φ.org.eolang.slice-escape-sequences-line-break.φ" name="@" pos="2"> 
//     <o base=".slice" line="178" loc="Φ.org.eolang.slice-escape-sequences-line-break.φ.ρ" pos="8"> 
//       <o base="org.eolang.string" data="string" line="178" loc="Φ.org.eolang.slice-escape-sequences-line-break.φ.ρ.ρ" pos="4">\n</o>
//       <o base="org.eolang.int" data="int" line="179" loc="Φ.org.eolang.slice-escape-sequences-line-break.φ.ρ.α0" pos="6">0</o>
//       <o base=".length" line="180" loc="Φ.org.eolang.slice-escape-sequences-line-break.φ.ρ.α1" pos="10"> 
//         <o base="org.eolang.string" data="string" line="180" loc="Φ.org.eolang.slice-escape-sequences-line-break.φ.ρ.α1.ρ" pos="6">\n</o>
//       </o>
//     </o>
//     <o base="org.eolang.string" data="string" line="181" loc="Φ.org.eolang.slice-escape-sequences-line-break.φ.α0" pos="4">\n</o>
//   </o>
// </o>
@XmirObject(name = "slice-escape-sequences-line-breakTest", oname = "slice-escape-sequences-line-break", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/string-tests.eo")
public final class EOslice_escape_sequences_line_breakTest extends PhDefault {
    
  public EOslice_escape_sequences_line_breakTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new EOorg.EOeolang.EOstring(Phi.Φ);
        ret_base_base = new PhLocated(ret_base_base, 178, 4, "Φ.org.eolang.slice-escape-sequences-line-break.φ.ρ.ρ");
        ret_base_base = new PhWith(ret_base_base, "Δ", new Data.Value<>("\n"));
      Phi ret_base = new PhMethod(ret_base_base, "slice");
        ret_base = new PhLocated(ret_base, 178, 8, "Φ.org.eolang.slice-escape-sequences-line-break.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_base_1 = new PhLocated(ret_base_1, 179, 6, "Φ.org.eolang.slice-escape-sequences-line-break.φ.ρ.α0");
          ret_base_1 = new PhWith(ret_base_1, "Δ", new Data.Value<>(0L));
        Phi ret_base_2_base = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_base_2_base = new PhLocated(ret_base_2_base, 180, 6, "Φ.org.eolang.slice-escape-sequences-line-break.φ.ρ.α1.ρ");
          ret_base_2_base = new PhWith(ret_base_2_base, "Δ", new Data.Value<>("\n"));
        Phi ret_base_2 = new PhMethod(ret_base_2_base, "length");
          ret_base_2 = new PhLocated(ret_base_2, 180, 10, "Φ.org.eolang.slice-escape-sequences-line-break.φ.ρ.α1");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
        ret_base = new PhWith(ret_base, 1, ret_base_2);
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 177, 2, "Φ.org.eolang.slice-escape-sequences-line-break.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 181, 4, "Φ.org.eolang.slice-escape-sequences-line-break.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>("\n"));
        ret = new PhWith(ret, 0, ret_1);
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
