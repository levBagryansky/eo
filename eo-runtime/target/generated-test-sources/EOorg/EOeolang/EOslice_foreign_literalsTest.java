
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="192" loc="Φ.org.eolang.slice-foreign-literals" name="slice-foreign-literals" original-name="slice-foreign-literals" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="193" loc="Φ.org.eolang.slice-foreign-literals.φ" name="@" pos="2"> 
//     <o base=".slice" line="194" loc="Φ.org.eolang.slice-foreign-literals.φ.α0" pos="12"> 
//       <o base="org.eolang.string" data="string" line="194" loc="Φ.org.eolang.slice-foreign-literals.φ.α0.ρ" pos="4">\u043F\u0440\u0438\u0432\u0435\u0442</o>
//       <o base="org.eolang.int" data="int" line="195" loc="Φ.org.eolang.slice-foreign-literals.φ.α0.α0" pos="6">0</o>
//       <o base="org.eolang.int" data="int" line="196" loc="Φ.org.eolang.slice-foreign-literals.φ.α0.α1" pos="6">1</o>
//     </o>
//     <o base=".equal-to" line="197" loc="Φ.org.eolang.slice-foreign-literals.φ.α1" pos="5"> 
//       <o base="$" line="197" loc="Φ.org.eolang.slice-foreign-literals.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.string" data="string" line="197" loc="Φ.org.eolang.slice-foreign-literals.φ.α1.α0" pos="15">\u043F</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "slice-foreign-literalsTest", oname = "slice-foreign-literals", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/string-tests.eo")
public final class EOslice_foreign_literalsTest extends PhDefault {
  public EOslice_foreign_literalsTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 193, 2, "Φ.org.eolang.slice-foreign-literals.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_1_base = new PhLocated(ret_1_base, 194, 4, "Φ.org.eolang.slice-foreign-literals.φ.α0.ρ");
          ret_1_base = new PhWith(ret_1_base, "Δ", new Data.Value<>("\u043F\u0440\u0438\u0432\u0435\u0442"));
        Phi ret_1 = new PhMethod(ret_1_base, "slice");
          ret_1 = new PhLocated(ret_1, 194, 12, "Φ.org.eolang.slice-foreign-literals.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_1 = new PhLocated(ret_1_1, 195, 6, "Φ.org.eolang.slice-foreign-literals.φ.α0.α0");
            ret_1_1 = new PhWith(ret_1_1, "Δ", new Data.Value<>(0L));
          Phi ret_1_2 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_2 = new PhLocated(ret_1_2, 196, 6, "Φ.org.eolang.slice-foreign-literals.φ.α0.α1");
            ret_1_2 = new PhWith(ret_1_2, "Δ", new Data.Value<>(1L));
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
          ret_1 = new PhWith(ret_1, 1, ret_1_2);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 197, 4, "Φ.org.eolang.slice-foreign-literals.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 197, 5, "Φ.org.eolang.slice-foreign-literals.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 197, 15, "Φ.org.eolang.slice-foreign-literals.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>("\u043F"));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
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
