
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="190" loc="Φ.org.eolang.slice-foreign-literals" name="slice-foreign-literals" original-name="slice-foreign-literals" pos="0"> 
//   <o base=".eq" line="191" loc="Φ.org.eolang.slice-foreign-literals.φ" name="@" pos="2"> 
//     <o base=".slice" line="192" loc="Φ.org.eolang.slice-foreign-literals.φ.ρ" pos="12"> 
//       <o base="org.eolang.string" data="string" line="192" loc="Φ.org.eolang.slice-foreign-literals.φ.ρ.ρ" pos="4">\u043F\u0440\u0438\u0432\u0435\u0442</o>
//       <o base="org.eolang.int" data="int" line="193" loc="Φ.org.eolang.slice-foreign-literals.φ.ρ.α0" pos="6">0</o>
//       <o base="org.eolang.int" data="int" line="194" loc="Φ.org.eolang.slice-foreign-literals.φ.ρ.α1" pos="6">1</o>
//     </o>
//     <o base="org.eolang.string" data="string" line="195" loc="Φ.org.eolang.slice-foreign-literals.φ.α0" pos="4">\u043F</o>
//   </o>
// </o>
@XmirObject(name = "slice-foreign-literalsTest", oname = "slice-foreign-literals", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/string-tests.eo")
public final class EOslice_foreign_literalsTest extends PhDefault {
    
  public EOslice_foreign_literalsTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new EOorg.EOeolang.EOstring(Phi.Φ);
        ret_base_base = new PhLocated(ret_base_base, 192, 4, "Φ.org.eolang.slice-foreign-literals.φ.ρ.ρ");
        ret_base_base = new PhWith(ret_base_base, "Δ", new Data.Value<>("\u043F\u0440\u0438\u0432\u0435\u0442"));
      Phi ret_base = new PhMethod(ret_base_base, "slice");
        ret_base = new PhLocated(ret_base, 192, 12, "Φ.org.eolang.slice-foreign-literals.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_base_1 = new PhLocated(ret_base_1, 193, 6, "Φ.org.eolang.slice-foreign-literals.φ.ρ.α0");
          ret_base_1 = new PhWith(ret_base_1, "Δ", new Data.Value<>(0L));
        Phi ret_base_2 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_base_2 = new PhLocated(ret_base_2, 194, 6, "Φ.org.eolang.slice-foreign-literals.φ.ρ.α1");
          ret_base_2 = new PhWith(ret_base_2, "Δ", new Data.Value<>(1L));
        ret_base = new PhWith(ret_base, 0, ret_base_1);
        ret_base = new PhWith(ret_base, 1, ret_base_2);
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 191, 2, "Φ.org.eolang.slice-foreign-literals.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 195, 4, "Φ.org.eolang.slice-foreign-literals.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>("\u043F"));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOslice_foreign_literalsTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
