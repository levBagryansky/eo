
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="352" loc="Φ.org.eolang.eight-byte-numbers-xor-as-int" name="eight-byte-numbers-xor-as-int" original-name="eight-byte-numbers-xor-as-int" pos="0"> 
//   <o base=".eq" line="353" loc="Φ.org.eolang.eight-byte-numbers-xor-as-int.φ" name="@" pos="2"> 
//     <o base=".as-int" line="354" loc="Φ.org.eolang.eight-byte-numbers-xor-as-int.φ.ρ" pos="4"> 
//       <o base=".xor" line="355" loc="Φ.org.eolang.eight-byte-numbers-xor-as-int.φ.ρ.ρ" pos="6"> 
//         <o base=".as-bytes" line="356" loc="Φ.org.eolang.eight-byte-numbers-xor-as-int.φ.ρ.ρ.ρ" pos="8"> 
//           <o base="org.eolang.int" data="int" line="357" loc="Φ.org.eolang.eight-byte-numbers-xor-as-int.φ.ρ.ρ.ρ.ρ" pos="10">1823872398572932454</o>
//         </o>
//         <o base=".as-bytes" line="358" loc="Φ.org.eolang.eight-byte-numbers-xor-as-int.φ.ρ.ρ.α0" pos="8"> 
//           <o base="org.eolang.int" data="int" line="359" loc="Φ.org.eolang.eight-byte-numbers-xor-as-int.φ.ρ.ρ.α0.ρ" pos="10">1284294810240192840</o>
//         </o>
//       </o>
//     </o>
//     <o base="org.eolang.int" data="int" line="360" loc="Φ.org.eolang.eight-byte-numbers-xor-as-int.φ.α0" pos="4">620662338699844654</o>
//   </o>
// </o>
@XmirObject(name = "eight-byte-numbers-xor-as-intTest", oname = "eight-byte-numbers-xor-as-int", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bytes-tests.eo")
public final class EOeight_byte_numbers_xor_as_intTest extends PhDefault {
    
  public EOeight_byte_numbers_xor_as_intTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base_base_base = new EOorg.EOeolang.EOint(Phi.Φ);
        ret_base_base_base_base = new PhLocated(ret_base_base_base_base, 357, 10, "Φ.org.eolang.eight-byte-numbers-xor-as-int.φ.ρ.ρ.ρ.ρ");
        ret_base_base_base_base = new PhWith(ret_base_base_base_base, "Δ", new Data.Value<>(1823872398572932454L));
      Phi ret_base_base_base = new PhMethod(ret_base_base_base_base, "as-bytes");
        ret_base_base_base = new PhLocated(ret_base_base_base, 356, 8, "Φ.org.eolang.eight-byte-numbers-xor-as-int.φ.ρ.ρ.ρ");
      Phi ret_base_base = new PhMethod(ret_base_base_base, "xor");
        ret_base_base = new PhLocated(ret_base_base, 355, 6, "Φ.org.eolang.eight-byte-numbers-xor-as-int.φ.ρ.ρ");
      ret_base_base = new PhCopy(ret_base_base);
        Phi ret_base_base_1_base = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_base_base_1_base = new PhLocated(ret_base_base_1_base, 359, 10, "Φ.org.eolang.eight-byte-numbers-xor-as-int.φ.ρ.ρ.α0.ρ");
          ret_base_base_1_base = new PhWith(ret_base_base_1_base, "Δ", new Data.Value<>(1284294810240192840L));
        Phi ret_base_base_1 = new PhMethod(ret_base_base_1_base, "as-bytes");
          ret_base_base_1 = new PhLocated(ret_base_base_1, 358, 8, "Φ.org.eolang.eight-byte-numbers-xor-as-int.φ.ρ.ρ.α0");
        ret_base_base = new PhWith(ret_base_base, 0, ret_base_base_1);
      Phi ret_base = new PhMethod(ret_base_base, "as-int");
        ret_base = new PhLocated(ret_base, 354, 4, "Φ.org.eolang.eight-byte-numbers-xor-as-int.φ.ρ");
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 353, 2, "Φ.org.eolang.eight-byte-numbers-xor-as-int.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 360, 4, "Φ.org.eolang.eight-byte-numbers-xor-as-int.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(620662338699844654L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOeight_byte_numbers_xor_as_intTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
