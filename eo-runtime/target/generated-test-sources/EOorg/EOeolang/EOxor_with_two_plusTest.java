
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="243" loc="Φ.org.eolang.xor-with-two-plus" name="xor-with-two-plus" original-name="xor-with-two-plus" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="244" loc="Φ.org.eolang.xor-with-two-plus.φ" name="@" pos="2"> 
//     <o base=".xor" line="245" loc="Φ.org.eolang.xor-with-two-plus.φ.α0" pos="15"> 
//       <o base=".as-bytes" line="245" loc="Φ.org.eolang.xor-with-two-plus.φ.α0.ρ" pos="6"> 
//         <o base="org.eolang.int" data="int" line="245" loc="Φ.org.eolang.xor-with-two-plus.φ.α0.ρ.ρ" pos="4">53</o>
//       </o>
//       <o base=".as-bytes" line="245" loc="Φ.org.eolang.xor-with-two-plus.φ.α0.α0" pos="23" scope="scope-0f589685-7d5f-4cb3-8086-d1038912b017"> 
//         <o base="org.eolang.int" data="int" line="245" loc="Φ.org.eolang.xor-with-two-plus.φ.α0.α0.ρ" pos="21" scope="scope-0f589685-7d5f-4cb3-8086-d1038912b017">24</o>
//       </o>
//     </o>
//     <o base=".not" line="246" loc="Φ.org.eolang.xor-with-two-plus.φ.α1" pos="5"> 
//       <o base="$" line="246" loc="Φ.org.eolang.xor-with-two-plus.φ.α1.ρ" pos="4"/>
//       <o base=".equal-to" line="247" loc="Φ.org.eolang.xor-with-two-plus.φ.α1.α0" pos="7"> 
//         <o base="$" line="247" loc="Φ.org.eolang.xor-with-two-plus.φ.α1.α0.ρ" pos="6"/>
//         <o base=".as-bytes" line="248" loc="Φ.org.eolang.xor-with-two-plus.φ.α1.α0.α0" pos="11"> 
//           <o base="org.eolang.int" data="int" line="248" loc="Φ.org.eolang.xor-with-two-plus.φ.α1.α0.α0.ρ" pos="8">-46</o>
//         </o>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "xor-with-two-plusTest", oname = "xor-with-two-plus", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bytes-tests.eo")
public final class EOxor_with_two_plusTest extends PhDefault {
  public EOxor_with_two_plusTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 244, 2, "Φ.org.eolang.xor-with-two-plus.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base_base = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1_base_base = new PhLocated(ret_1_base_base, 245, 4, "Φ.org.eolang.xor-with-two-plus.φ.α0.ρ.ρ");
          ret_1_base_base = new PhWith(ret_1_base_base, "Δ", new Data.Value<>(53L));
        Phi ret_1_base = new PhMethod(ret_1_base_base, "as-bytes");
          ret_1_base = new PhLocated(ret_1_base, 245, 6, "Φ.org.eolang.xor-with-two-plus.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "xor");
          ret_1 = new PhLocated(ret_1, 245, 15, "Φ.org.eolang.xor-with-two-plus.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1_base = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_1_base = new PhLocated(ret_1_1_base, 245, 21, "Φ.org.eolang.xor-with-two-plus.φ.α0.α0.ρ");
            ret_1_1_base = new PhWith(ret_1_1_base, "Δ", new Data.Value<>(24L));
          Phi ret_1_1 = new PhMethod(ret_1_1_base, "as-bytes");
            ret_1_1 = new PhLocated(ret_1_1, 245, 23, "Φ.org.eolang.xor-with-two-plus.φ.α0.α0");
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 246, 4, "Φ.org.eolang.xor-with-two-plus.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "not");
          ret_2 = new PhLocated(ret_2, 246, 5, "Φ.org.eolang.xor-with-two-plus.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = rho;
            ret_2_1_base = new PhLocated(ret_2_1_base, 247, 6, "Φ.org.eolang.xor-with-two-plus.φ.α1.α0.ρ");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "equal-to");
            ret_2_1 = new PhLocated(ret_2_1, 247, 7, "Φ.org.eolang.xor-with-two-plus.φ.α1.α0");
          ret_2_1 = new PhCopy(ret_2_1);
            Phi ret_2_1_1_base = new EOorg.EOeolang.EOint(Phi.Φ);
              ret_2_1_1_base = new PhLocated(ret_2_1_1_base, 248, 8, "Φ.org.eolang.xor-with-two-plus.φ.α1.α0.α0.ρ");
              ret_2_1_1_base = new PhWith(ret_2_1_1_base, "Δ", new Data.Value<>(-46L));
            Phi ret_2_1_1 = new PhMethod(ret_2_1_1_base, "as-bytes");
              ret_2_1_1 = new PhLocated(ret_2_1_1, 248, 11, "Φ.org.eolang.xor-with-two-plus.φ.α1.α0.α0");
            ret_2_1 = new PhWith(ret_2_1, 0, ret_2_1_1);
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOxor_with_two_plusTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}