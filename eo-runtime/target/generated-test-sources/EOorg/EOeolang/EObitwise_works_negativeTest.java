
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="288" loc="Φ.org.eolang.bitwise-works-negative" name="bitwise-works-negative" original-name="bitwise-works-negative" pos="0"> 
//   <o base=".eq" line="289" loc="Φ.org.eolang.bitwise-works-negative.φ" name="@" pos="2"> 
//     <o base=".as-int" line="290" loc="Φ.org.eolang.bitwise-works-negative.φ.ρ" pos="4"> 
//       <o base=".or" line="291" loc="Φ.org.eolang.bitwise-works-negative.φ.ρ.ρ" pos="6"> 
//         <o base=".as-bytes" line="292" loc="Φ.org.eolang.bitwise-works-negative.φ.ρ.ρ.ρ" pos="12"> 
//           <o base="org.eolang.int" data="int" line="292" loc="Φ.org.eolang.bitwise-works-negative.φ.ρ.ρ.ρ.ρ" pos="8">-127</o>
//         </o>
//         <o base=".as-bytes" line="293" loc="Φ.org.eolang.bitwise-works-negative.φ.ρ.ρ.α0" pos="11"> 
//           <o base="org.eolang.int" data="int" line="293" loc="Φ.org.eolang.bitwise-works-negative.φ.ρ.ρ.α0.ρ" pos="8">127</o>
//         </o>
//       </o>
//     </o>
//     <o base="org.eolang.int" data="int" line="294" loc="Φ.org.eolang.bitwise-works-negative.φ.α0" pos="4">-1</o>
//   </o>
// </o>
@XmirObject(name = "bitwise-works-negativeTest", oname = "bitwise-works-negative", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bytes-tests.eo")
public final class EObitwise_works_negativeTest extends PhDefault {
    
  public EObitwise_works_negativeTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base_base_base = new EOorg.EOeolang.EOint(Phi.Φ);
        ret_base_base_base_base = new PhLocated(ret_base_base_base_base, 292, 8, "Φ.org.eolang.bitwise-works-negative.φ.ρ.ρ.ρ.ρ");
        ret_base_base_base_base = new PhWith(ret_base_base_base_base, "Δ", new Data.Value<>(-127L));
      Phi ret_base_base_base = new PhMethod(ret_base_base_base_base, "as-bytes");
        ret_base_base_base = new PhLocated(ret_base_base_base, 292, 12, "Φ.org.eolang.bitwise-works-negative.φ.ρ.ρ.ρ");
      Phi ret_base_base = new PhMethod(ret_base_base_base, "or");
        ret_base_base = new PhLocated(ret_base_base, 291, 6, "Φ.org.eolang.bitwise-works-negative.φ.ρ.ρ");
      ret_base_base = new PhCopy(ret_base_base);
        Phi ret_base_base_1_base = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_base_base_1_base = new PhLocated(ret_base_base_1_base, 293, 8, "Φ.org.eolang.bitwise-works-negative.φ.ρ.ρ.α0.ρ");
          ret_base_base_1_base = new PhWith(ret_base_base_1_base, "Δ", new Data.Value<>(127L));
        Phi ret_base_base_1 = new PhMethod(ret_base_base_1_base, "as-bytes");
          ret_base_base_1 = new PhLocated(ret_base_base_1, 293, 11, "Φ.org.eolang.bitwise-works-negative.φ.ρ.ρ.α0");
        ret_base_base = new PhWith(ret_base_base, 0, ret_base_base_1);
      Phi ret_base = new PhMethod(ret_base_base, "as-int");
        ret_base = new PhLocated(ret_base, 290, 4, "Φ.org.eolang.bitwise-works-negative.φ.ρ");
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 289, 2, "Φ.org.eolang.bitwise-works-negative.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 294, 4, "Φ.org.eolang.bitwise-works-negative.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(-1L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EObitwise_works_negativeTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
