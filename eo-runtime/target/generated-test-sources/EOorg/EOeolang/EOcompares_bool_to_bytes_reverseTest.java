
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="119" loc="Φ.org.eolang.compares-bool-to-bytes-reverse" name="compares-bool-to-bytes-reverse" original-name="compares-bool-to-bytes-reverse" pos="0"> 
//   <o base=".and" line="120" loc="Φ.org.eolang.compares-bool-to-bytes-reverse.φ" name="@" pos="2"> 
//     <o base=".eq" line="121" loc="Φ.org.eolang.compares-bool-to-bytes-reverse.φ.ρ" pos="16"> 
//       <o base=".as-bytes" line="121" loc="Φ.org.eolang.compares-bool-to-bytes-reverse.φ.ρ.ρ" pos="7"> 
//         <o base="org.eolang.bytes" data="bytes" line="121" loc="Φ.org.eolang.compares-bool-to-bytes-reverse.φ.ρ.ρ.ρ" pos="4">01</o>
//       </o>
//       <o base="org.eolang.bool" data="bool" line="121" loc="Φ.org.eolang.compares-bool-to-bytes-reverse.φ.ρ.α0" pos="20">TRUE</o>
//     </o>
//     <o base=".eq" line="122" loc="Φ.org.eolang.compares-bool-to-bytes-reverse.φ.α0" pos="16"> 
//       <o base=".as-bytes" line="122" loc="Φ.org.eolang.compares-bool-to-bytes-reverse.φ.α0.ρ" pos="7"> 
//         <o base="org.eolang.bytes" data="bytes" line="122" loc="Φ.org.eolang.compares-bool-to-bytes-reverse.φ.α0.ρ.ρ" pos="4">00</o>
//       </o>
//       <o base="org.eolang.bool" data="bool" line="122" loc="Φ.org.eolang.compares-bool-to-bytes-reverse.φ.α0.α0" pos="20">FALSE</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "compares-bool-to-bytes-reverseTest", oname = "compares-bool-to-bytes-reverse", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bool-tests.eo")
public final class EOcompares_bool_to_bytes_reverseTest extends PhDefault {
    
  public EOcompares_bool_to_bytes_reverseTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base_base = new EOorg.EOeolang.EObytes(Phi.Φ);
        ret_base_base_base = new PhLocated(ret_base_base_base, 121, 4, "Φ.org.eolang.compares-bool-to-bytes-reverse.φ.ρ.ρ.ρ");
        ret_base_base_base = new PhWith(ret_base_base_base, "Δ", new Data.Value<>(new byte[] {(byte) 0x01}));
      Phi ret_base_base = new PhMethod(ret_base_base_base, "as-bytes");
        ret_base_base = new PhLocated(ret_base_base, 121, 7, "Φ.org.eolang.compares-bool-to-bytes-reverse.φ.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "eq");
        ret_base = new PhLocated(ret_base, 121, 16, "Φ.org.eolang.compares-bool-to-bytes-reverse.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new EOorg.EOeolang.EObool(Phi.Φ);
          ret_base_1 = new PhLocated(ret_base_1, 121, 20, "Φ.org.eolang.compares-bool-to-bytes-reverse.φ.ρ.α0");
          ret_base_1 = new PhWith(ret_base_1, "Δ", new Data.Value<>(Boolean.TRUE));
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "and");
        ret = new PhLocated(ret, 120, 2, "Φ.org.eolang.compares-bool-to-bytes-reverse.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base_base = new EOorg.EOeolang.EObytes(Phi.Φ);
          ret_1_base_base = new PhLocated(ret_1_base_base, 122, 4, "Φ.org.eolang.compares-bool-to-bytes-reverse.φ.α0.ρ.ρ");
          ret_1_base_base = new PhWith(ret_1_base_base, "Δ", new Data.Value<>(new byte[] {(byte) 0x00}));
        Phi ret_1_base = new PhMethod(ret_1_base_base, "as-bytes");
          ret_1_base = new PhLocated(ret_1_base, 122, 7, "Φ.org.eolang.compares-bool-to-bytes-reverse.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "eq");
          ret_1 = new PhLocated(ret_1, 122, 16, "Φ.org.eolang.compares-bool-to-bytes-reverse.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOorg.EOeolang.EObool(Phi.Φ);
            ret_1_1 = new PhLocated(ret_1_1, 122, 20, "Φ.org.eolang.compares-bool-to-bytes-reverse.φ.α0.α0");
            ret_1_1 = new PhWith(ret_1_1, "Δ", new Data.Value<>(Boolean.FALSE));
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOcompares_bool_to_bytes_reverseTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
