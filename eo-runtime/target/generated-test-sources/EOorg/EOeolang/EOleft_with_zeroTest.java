
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="64" loc="Φ.org.eolang.left-with-zero" name="left-with-zero" original-name="left-with-zero" pos="0"> 
//   <o base=".not" line="65" loc="Φ.org.eolang.left-with-zero.φ" name="@" pos="2"> 
//     <o base=".eq" line="66" loc="Φ.org.eolang.left-with-zero.φ.ρ" pos="4"> 
//       <o base=".left" line="67" loc="Φ.org.eolang.left-with-zero.φ.ρ.ρ" pos="16"> 
//         <o base=".as-bytes" line="67" loc="Φ.org.eolang.left-with-zero.φ.ρ.ρ.ρ" pos="7"> 
//           <o base="org.eolang.int" data="int" line="67" loc="Φ.org.eolang.left-with-zero.φ.ρ.ρ.ρ.ρ" pos="6">2</o>
//         </o>
//         <o base="org.eolang.int" data="int" line="67" loc="Φ.org.eolang.left-with-zero.φ.ρ.ρ.α0" pos="22">0</o>
//       </o>
//       <o base=".as-bytes" line="68" loc="Φ.org.eolang.left-with-zero.φ.ρ.α0" pos="8"> 
//         <o base="org.eolang.int" data="int" line="68" loc="Φ.org.eolang.left-with-zero.φ.ρ.α0.ρ" pos="6">-3</o>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "left-with-zeroTest", oname = "left-with-zero", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bytes-tests.eo")
public final class EOleft_with_zeroTest extends PhDefault {
    
  public EOleft_with_zeroTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base_base_base = new EOorg.EOeolang.EOint(Phi.Φ);
        ret_base_base_base_base = new PhLocated(ret_base_base_base_base, 67, 6, "Φ.org.eolang.left-with-zero.φ.ρ.ρ.ρ.ρ");
        ret_base_base_base_base = new PhWith(ret_base_base_base_base, "Δ", new Data.Value<>(2L));
      Phi ret_base_base_base = new PhMethod(ret_base_base_base_base, "as-bytes");
        ret_base_base_base = new PhLocated(ret_base_base_base, 67, 7, "Φ.org.eolang.left-with-zero.φ.ρ.ρ.ρ");
      Phi ret_base_base = new PhMethod(ret_base_base_base, "left");
        ret_base_base = new PhLocated(ret_base_base, 67, 16, "Φ.org.eolang.left-with-zero.φ.ρ.ρ");
      ret_base_base = new PhCopy(ret_base_base);
        Phi ret_base_base_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_base_base_1 = new PhLocated(ret_base_base_1, 67, 22, "Φ.org.eolang.left-with-zero.φ.ρ.ρ.α0");
          ret_base_base_1 = new PhWith(ret_base_base_1, "Δ", new Data.Value<>(0L));
        ret_base_base = new PhWith(ret_base_base, 0, ret_base_base_1);
      Phi ret_base = new PhMethod(ret_base_base, "eq");
        ret_base = new PhLocated(ret_base, 66, 4, "Φ.org.eolang.left-with-zero.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1_base = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_base_1_base = new PhLocated(ret_base_1_base, 68, 6, "Φ.org.eolang.left-with-zero.φ.ρ.α0.ρ");
          ret_base_1_base = new PhWith(ret_base_1_base, "Δ", new Data.Value<>(-3L));
        Phi ret_base_1 = new PhMethod(ret_base_1_base, "as-bytes");
          ret_base_1 = new PhLocated(ret_base_1, 68, 8, "Φ.org.eolang.left-with-zero.φ.ρ.α0");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "not");
        ret = new PhLocated(ret, 65, 2, "Φ.org.eolang.left-with-zero.φ");
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOleft_with_zeroTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
