
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="73" loc="Φ.org.eolang.compares-string-with-negative-infinity" name="compares-string-with-negative-infinity" original-name="compares-string-with-negative-infinity" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="74" loc="Φ.org.eolang.compares-string-with-negative-infinity.φ" name="@" pos="2"> 
//     <o base="org.eolang.negative-infinity" line="75" loc="Φ.org.eolang.compares-string-with-negative-infinity.φ.α0" pos="4"/>
//     <o base=".not" line="76" loc="Φ.org.eolang.compares-string-with-negative-infinity.φ.α1" pos="5"> 
//       <o base="$" line="76" loc="Φ.org.eolang.compares-string-with-negative-infinity.φ.α1.ρ" pos="4"/>
//       <o base=".equal-to" line="77" loc="Φ.org.eolang.compares-string-with-negative-infinity.φ.α1.α0" pos="7"> 
//         <o base="$" line="77" loc="Φ.org.eolang.compares-string-with-negative-infinity.φ.α1.α0.ρ" pos="6"/>
//         <o base="org.eolang.string" data="string" line="77" loc="Φ.org.eolang.compares-string-with-negative-infinity.φ.α1.α0.α0" pos="17">\u0434\u0440\u0443\u0433</o>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "compares-string-with-negative-infinityTest", oname = "compares-string-with-negative-infinity", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/string-tests.eo")
public final class EOcompares_string_with_negative_infinityTest extends PhDefault {
  public EOcompares_string_with_negative_infinityTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 74, 2, "Φ.org.eolang.compares-string-with-negative-infinity.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("negative-infinity").get();
          ret_1 = new PhLocated(ret_1, 75, 4, "Φ.org.eolang.compares-string-with-negative-infinity.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 76, 4, "Φ.org.eolang.compares-string-with-negative-infinity.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "not");
          ret_2 = new PhLocated(ret_2, 76, 5, "Φ.org.eolang.compares-string-with-negative-infinity.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = rho;
            ret_2_1_base = new PhLocated(ret_2_1_base, 77, 6, "Φ.org.eolang.compares-string-with-negative-infinity.φ.α1.α0.ρ");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "equal-to");
            ret_2_1 = new PhLocated(ret_2_1, 77, 7, "Φ.org.eolang.compares-string-with-negative-infinity.φ.α1.α0");
          ret_2_1 = new PhCopy(ret_2_1);
            Phi ret_2_1_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
              ret_2_1_1 = new PhLocated(ret_2_1_1, 77, 17, "Φ.org.eolang.compares-string-with-negative-infinity.φ.α1.α0.α0");
              ret_2_1_1 = new PhWith(ret_2_1_1, "Δ", new Data.Value<>("\u0434\u0440\u0443\u0433"));
            ret_2_1 = new PhWith(ret_2_1, 0, ret_2_1_1);
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOcompares_string_with_negative_infinityTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}