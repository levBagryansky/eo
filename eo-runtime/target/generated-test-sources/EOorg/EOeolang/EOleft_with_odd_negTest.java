
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="73" loc="Φ.org.eolang.left-with-odd-neg" name="left-with-odd-neg" original-name="left-with-odd-neg" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="74" loc="Φ.org.eolang.left-with-odd-neg.φ" name="@" pos="2"> 
//     <o base=".left" line="75" loc="Φ.org.eolang.left-with-odd-neg.φ.α0" pos="16"> 
//       <o base=".as-bytes" line="75" loc="Φ.org.eolang.left-with-odd-neg.φ.α0.ρ" pos="7"> 
//         <o base="org.eolang.int" data="int" line="75" loc="Φ.org.eolang.left-with-odd-neg.φ.α0.ρ.ρ" pos="4">-17</o>
//       </o>
//       <o base="org.eolang.int" data="int" line="75" loc="Φ.org.eolang.left-with-odd-neg.φ.α0.α0" pos="22">1</o>
//     </o>
//     <o base=".not" line="76" loc="Φ.org.eolang.left-with-odd-neg.φ.α1" pos="5"> 
//       <o base="$" line="76" loc="Φ.org.eolang.left-with-odd-neg.φ.α1.ρ" pos="4"/>
//       <o base=".equal-to" line="77" loc="Φ.org.eolang.left-with-odd-neg.φ.α1.α0" pos="7"> 
//         <o base="$" line="77" loc="Φ.org.eolang.left-with-odd-neg.φ.α1.α0.ρ" pos="6"/>
//         <o base=".as-bytes" line="78" loc="Φ.org.eolang.left-with-odd-neg.φ.α1.α0.α0" pos="10"> 
//           <o base="org.eolang.int" data="int" line="78" loc="Φ.org.eolang.left-with-odd-neg.φ.α1.α0.α0.ρ" pos="8">33</o>
//         </o>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "left-with-odd-negTest", oname = "left-with-odd-neg", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bytes-tests.eo")
public final class EOleft_with_odd_negTest extends PhDefault {
  public EOleft_with_odd_negTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 74, 2, "Φ.org.eolang.left-with-odd-neg.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base_base = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1_base_base = new PhLocated(ret_1_base_base, 75, 4, "Φ.org.eolang.left-with-odd-neg.φ.α0.ρ.ρ");
          ret_1_base_base = new PhWith(ret_1_base_base, "Δ", new Data.Value<>(-17L));
        Phi ret_1_base = new PhMethod(ret_1_base_base, "as-bytes");
          ret_1_base = new PhLocated(ret_1_base, 75, 7, "Φ.org.eolang.left-with-odd-neg.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "left");
          ret_1 = new PhLocated(ret_1, 75, 16, "Φ.org.eolang.left-with-odd-neg.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_1 = new PhLocated(ret_1_1, 75, 22, "Φ.org.eolang.left-with-odd-neg.φ.α0.α0");
            ret_1_1 = new PhWith(ret_1_1, "Δ", new Data.Value<>(1L));
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 76, 4, "Φ.org.eolang.left-with-odd-neg.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "not");
          ret_2 = new PhLocated(ret_2, 76, 5, "Φ.org.eolang.left-with-odd-neg.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = rho;
            ret_2_1_base = new PhLocated(ret_2_1_base, 77, 6, "Φ.org.eolang.left-with-odd-neg.φ.α1.α0.ρ");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "equal-to");
            ret_2_1 = new PhLocated(ret_2_1, 77, 7, "Φ.org.eolang.left-with-odd-neg.φ.α1.α0");
          ret_2_1 = new PhCopy(ret_2_1);
            Phi ret_2_1_1_base = new EOorg.EOeolang.EOint(Phi.Φ);
              ret_2_1_1_base = new PhLocated(ret_2_1_1_base, 78, 8, "Φ.org.eolang.left-with-odd-neg.φ.α1.α0.α0.ρ");
              ret_2_1_1_base = new PhWith(ret_2_1_1_base, "Δ", new Data.Value<>(33L));
            Phi ret_2_1_1 = new PhMethod(ret_2_1_1_base, "as-bytes");
              ret_2_1_1 = new PhLocated(ret_2_1_1, 78, 10, "Φ.org.eolang.left-with-odd-neg.φ.α1.α0.α0");
            ret_2_1 = new PhWith(ret_2_1, 0, ret_2_1_1);
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOleft_with_odd_negTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}