
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="319" loc="Φ.org.eolang.bitwise-works-negative" name="bitwise-works-negative" original-name="bitwise-works-negative" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="320" loc="Φ.org.eolang.bitwise-works-negative.φ" name="@" pos="2"> 
//     <o base=".as-int" line="321" loc="Φ.org.eolang.bitwise-works-negative.φ.α0" pos="4"> 
//       <o base=".or" line="322" loc="Φ.org.eolang.bitwise-works-negative.φ.α0.ρ" pos="6"> 
//         <o base=".as-bytes" line="323" loc="Φ.org.eolang.bitwise-works-negative.φ.α0.ρ.ρ" pos="12"> 
//           <o base="org.eolang.int" data="int" line="323" loc="Φ.org.eolang.bitwise-works-negative.φ.α0.ρ.ρ.ρ" pos="8">-127</o>
//         </o>
//         <o base=".as-bytes" line="324" loc="Φ.org.eolang.bitwise-works-negative.φ.α0.ρ.α0" pos="11"> 
//           <o base="org.eolang.int" data="int" line="324" loc="Φ.org.eolang.bitwise-works-negative.φ.α0.ρ.α0.ρ" pos="8">127</o>
//         </o>
//       </o>
//     </o>
//     <o base=".equal-to" line="325" loc="Φ.org.eolang.bitwise-works-negative.φ.α1" pos="5"> 
//       <o base="$" line="325" loc="Φ.org.eolang.bitwise-works-negative.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.int" data="int" line="325" loc="Φ.org.eolang.bitwise-works-negative.φ.α1.α0" pos="15">-1</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "bitwise-works-negativeTest", oname = "bitwise-works-negative", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bytes-tests.eo")
public final class EObitwise_works_negativeTest extends PhDefault {
  public EObitwise_works_negativeTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 320, 2, "Φ.org.eolang.bitwise-works-negative.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base_base_base = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1_base_base_base = new PhLocated(ret_1_base_base_base, 323, 8, "Φ.org.eolang.bitwise-works-negative.φ.α0.ρ.ρ.ρ");
          ret_1_base_base_base = new PhWith(ret_1_base_base_base, "Δ", new Data.Value<>(-127L));
        Phi ret_1_base_base = new PhMethod(ret_1_base_base_base, "as-bytes");
          ret_1_base_base = new PhLocated(ret_1_base_base, 323, 12, "Φ.org.eolang.bitwise-works-negative.φ.α0.ρ.ρ");
        Phi ret_1_base = new PhMethod(ret_1_base_base, "or");
          ret_1_base = new PhLocated(ret_1_base, 322, 6, "Φ.org.eolang.bitwise-works-negative.φ.α0.ρ");
        ret_1_base = new PhCopy(ret_1_base);
          Phi ret_1_base_1_base = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_base_1_base = new PhLocated(ret_1_base_1_base, 324, 8, "Φ.org.eolang.bitwise-works-negative.φ.α0.ρ.α0.ρ");
            ret_1_base_1_base = new PhWith(ret_1_base_1_base, "Δ", new Data.Value<>(127L));
          Phi ret_1_base_1 = new PhMethod(ret_1_base_1_base, "as-bytes");
            ret_1_base_1 = new PhLocated(ret_1_base_1, 324, 11, "Φ.org.eolang.bitwise-works-negative.φ.α0.ρ.α0");
          ret_1_base = new PhWith(ret_1_base, 0, ret_1_base_1);
        Phi ret_1 = new PhMethod(ret_1_base, "as-int");
          ret_1 = new PhLocated(ret_1, 321, 4, "Φ.org.eolang.bitwise-works-negative.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 325, 4, "Φ.org.eolang.bitwise-works-negative.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 325, 5, "Φ.org.eolang.bitwise-works-negative.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 325, 15, "Φ.org.eolang.bitwise-works-negative.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(-1L));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
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
