
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="114" loc="Φ.org.eolang.right-with-odd-neg" name="right-with-odd-neg" original-name="right-with-odd-neg" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="115" loc="Φ.org.eolang.right-with-odd-neg.φ" name="@" pos="2"> 
//     <o base=".right" line="116" loc="Φ.org.eolang.right-with-odd-neg.φ.α0" pos="16"> 
//       <o base=".as-bytes" line="116" loc="Φ.org.eolang.right-with-odd-neg.φ.α0.ρ" pos="7"> 
//         <o base="org.eolang.int" data="int" line="116" loc="Φ.org.eolang.right-with-odd-neg.φ.α0.ρ.ρ" pos="4">-37</o>
//       </o>
//       <o base="org.eolang.int" data="int" line="116" loc="Φ.org.eolang.right-with-odd-neg.φ.α0.α0" pos="23">3</o>
//     </o>
//     <o base=".not" line="117" loc="Φ.org.eolang.right-with-odd-neg.φ.α1" pos="5"> 
//       <o base="$" line="117" loc="Φ.org.eolang.right-with-odd-neg.φ.α1.ρ" pos="4"/>
//       <o base=".equal-to" line="118" loc="Φ.org.eolang.right-with-odd-neg.φ.α1.α0" pos="7"> 
//         <o base="$" line="118" loc="Φ.org.eolang.right-with-odd-neg.φ.α1.α0.ρ" pos="6"/>
//         <o base=".as-bytes" line="119" loc="Φ.org.eolang.right-with-odd-neg.φ.α1.α0.α0" pos="9"> 
//           <o base="org.eolang.int" data="int" line="119" loc="Φ.org.eolang.right-with-odd-neg.φ.α1.α0.α0.ρ" pos="8">4</o>
//         </o>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "right-with-odd-negTest", oname = "right-with-odd-neg", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bytes-tests.eo")
public final class EOright_with_odd_negTest extends PhDefault {
  public EOright_with_odd_negTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 115, 2, "Φ.org.eolang.right-with-odd-neg.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base_base = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1_base_base = new PhLocated(ret_1_base_base, 116, 4, "Φ.org.eolang.right-with-odd-neg.φ.α0.ρ.ρ");
          ret_1_base_base = new PhWith(ret_1_base_base, "Δ", new Data.Value<>(-37L));
        Phi ret_1_base = new PhMethod(ret_1_base_base, "as-bytes");
          ret_1_base = new PhLocated(ret_1_base, 116, 7, "Φ.org.eolang.right-with-odd-neg.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "right");
          ret_1 = new PhLocated(ret_1, 116, 16, "Φ.org.eolang.right-with-odd-neg.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_1 = new PhLocated(ret_1_1, 116, 23, "Φ.org.eolang.right-with-odd-neg.φ.α0.α0");
            ret_1_1 = new PhWith(ret_1_1, "Δ", new Data.Value<>(3L));
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 117, 4, "Φ.org.eolang.right-with-odd-neg.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "not");
          ret_2 = new PhLocated(ret_2, 117, 5, "Φ.org.eolang.right-with-odd-neg.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = rho;
            ret_2_1_base = new PhLocated(ret_2_1_base, 118, 6, "Φ.org.eolang.right-with-odd-neg.φ.α1.α0.ρ");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "equal-to");
            ret_2_1 = new PhLocated(ret_2_1, 118, 7, "Φ.org.eolang.right-with-odd-neg.φ.α1.α0");
          ret_2_1 = new PhCopy(ret_2_1);
            Phi ret_2_1_1_base = new EOorg.EOeolang.EOint(Phi.Φ);
              ret_2_1_1_base = new PhLocated(ret_2_1_1_base, 119, 8, "Φ.org.eolang.right-with-odd-neg.φ.α1.α0.α0.ρ");
              ret_2_1_1_base = new PhWith(ret_2_1_1_base, "Δ", new Data.Value<>(4L));
            Phi ret_2_1_1 = new PhMethod(ret_2_1_1_base, "as-bytes");
              ret_2_1_1 = new PhLocated(ret_2_1_1, 119, 9, "Φ.org.eolang.right-with-odd-neg.φ.α1.α0.α0");
            ret_2_1 = new PhWith(ret_2_1, 0, ret_2_1_1);
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOright_with_odd_negTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
