
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="242" loc="Φ.org.eolang.not-with-zero" name="not-with-zero" original-name="not-with-zero" pos="0"> 
//   <o base=".not" line="243" loc="Φ.org.eolang.not-with-zero.φ" name="@" pos="2"> 
//     <o base=".eq" line="244" loc="Φ.org.eolang.not-with-zero.φ.ρ" pos="4"> 
//       <o base=".as-bytes" line="245" loc="Φ.org.eolang.not-with-zero.φ.ρ.ρ" pos="7"> 
//         <o base="org.eolang.int" data="int" line="245" loc="Φ.org.eolang.not-with-zero.φ.ρ.ρ.ρ" pos="6">0</o>
//       </o>
//       <o base=".not" line="246" loc="Φ.org.eolang.not-with-zero.φ.ρ.α0" pos="16"> 
//         <o base=".as-bytes" line="246" loc="Φ.org.eolang.not-with-zero.φ.ρ.α0.ρ" pos="7"> 
//           <o base="org.eolang.int" data="int" line="246" loc="Φ.org.eolang.not-with-zero.φ.ρ.α0.ρ.ρ" pos="6">0</o>
//         </o>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "not-with-zeroTest", oname = "not-with-zero", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bytes-tests.eo")
public final class EOnot_with_zeroTest extends PhDefault {
    
  public EOnot_with_zeroTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base_base = new EOorg.EOeolang.EOint(Phi.Φ);
        ret_base_base_base = new PhLocated(ret_base_base_base, 245, 6, "Φ.org.eolang.not-with-zero.φ.ρ.ρ.ρ");
        ret_base_base_base = new PhWith(ret_base_base_base, "Δ", new Data.Value<>(0L));
      Phi ret_base_base = new PhMethod(ret_base_base_base, "as-bytes");
        ret_base_base = new PhLocated(ret_base_base, 245, 7, "Φ.org.eolang.not-with-zero.φ.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "eq");
        ret_base = new PhLocated(ret_base, 244, 4, "Φ.org.eolang.not-with-zero.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1_base_base = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_base_1_base_base = new PhLocated(ret_base_1_base_base, 246, 6, "Φ.org.eolang.not-with-zero.φ.ρ.α0.ρ.ρ");
          ret_base_1_base_base = new PhWith(ret_base_1_base_base, "Δ", new Data.Value<>(0L));
        Phi ret_base_1_base = new PhMethod(ret_base_1_base_base, "as-bytes");
          ret_base_1_base = new PhLocated(ret_base_1_base, 246, 7, "Φ.org.eolang.not-with-zero.φ.ρ.α0.ρ");
        Phi ret_base_1 = new PhMethod(ret_base_1_base, "not");
          ret_base_1 = new PhLocated(ret_base_1, 246, 16, "Φ.org.eolang.not-with-zero.φ.ρ.α0");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "not");
        ret = new PhLocated(ret, 243, 2, "Φ.org.eolang.not-with-zero.φ");
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOnot_with_zeroTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
