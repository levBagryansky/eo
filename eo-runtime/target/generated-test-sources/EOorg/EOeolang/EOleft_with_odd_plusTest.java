
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="100" loc="Φ.org.eolang.left-with-odd-plus" name="left-with-odd-plus" original-name="left-with-odd-plus" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="101" loc="Φ.org.eolang.left-with-odd-plus.φ" name="@" pos="2"> 
//     <o base=".left" line="102" loc="Φ.org.eolang.left-with-odd-plus.φ.α0" pos="14"> 
//       <o base=".as-bytes" line="102" loc="Φ.org.eolang.left-with-odd-plus.φ.α0.ρ" pos="5"> 
//         <o base="org.eolang.int" data="int" line="102" loc="Φ.org.eolang.left-with-odd-plus.φ.α0.ρ.ρ" pos="4">5</o>
//       </o>
//       <o base="org.eolang.int" data="int" line="102" loc="Φ.org.eolang.left-with-odd-plus.φ.α0.α0" pos="20">3</o>
//     </o>
//     <o base=".not" line="103" loc="Φ.org.eolang.left-with-odd-plus.φ.α1" pos="5"> 
//       <o base="$" line="103" loc="Φ.org.eolang.left-with-odd-plus.φ.α1.ρ" pos="4"/>
//       <o base=".equal-to" line="104" loc="Φ.org.eolang.left-with-odd-plus.φ.α1.α0" pos="7"> 
//         <o base="$" line="104" loc="Φ.org.eolang.left-with-odd-plus.φ.α1.α0.ρ" pos="6"/>
//         <o base=".as-bytes" line="105" loc="Φ.org.eolang.left-with-odd-plus.φ.α1.α0.α0" pos="11"> 
//           <o base="org.eolang.int" data="int" line="105" loc="Φ.org.eolang.left-with-odd-plus.φ.α1.α0.α0.ρ" pos="8">-41</o>
//         </o>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "left-with-odd-plusTest", oname = "left-with-odd-plus", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bytes-tests.eo")
public final class EOleft_with_odd_plusTest extends PhDefault {
  public EOleft_with_odd_plusTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 101, 2, "Φ.org.eolang.left-with-odd-plus.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base_base = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1_base_base = new PhLocated(ret_1_base_base, 102, 4, "Φ.org.eolang.left-with-odd-plus.φ.α0.ρ.ρ");
          ret_1_base_base = new PhWith(ret_1_base_base, "Δ", new Data.Value<>(5L));
        Phi ret_1_base = new PhMethod(ret_1_base_base, "as-bytes");
          ret_1_base = new PhLocated(ret_1_base, 102, 5, "Φ.org.eolang.left-with-odd-plus.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "left");
          ret_1 = new PhLocated(ret_1, 102, 14, "Φ.org.eolang.left-with-odd-plus.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_1 = new PhLocated(ret_1_1, 102, 20, "Φ.org.eolang.left-with-odd-plus.φ.α0.α0");
            ret_1_1 = new PhWith(ret_1_1, "Δ", new Data.Value<>(3L));
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 103, 4, "Φ.org.eolang.left-with-odd-plus.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "not");
          ret_2 = new PhLocated(ret_2, 103, 5, "Φ.org.eolang.left-with-odd-plus.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = rho;
            ret_2_1_base = new PhLocated(ret_2_1_base, 104, 6, "Φ.org.eolang.left-with-odd-plus.φ.α1.α0.ρ");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "equal-to");
            ret_2_1 = new PhLocated(ret_2_1, 104, 7, "Φ.org.eolang.left-with-odd-plus.φ.α1.α0");
          ret_2_1 = new PhCopy(ret_2_1);
            Phi ret_2_1_1_base = new EOorg.EOeolang.EOint(Phi.Φ);
              ret_2_1_1_base = new PhLocated(ret_2_1_1_base, 105, 8, "Φ.org.eolang.left-with-odd-plus.φ.α1.α0.α0.ρ");
              ret_2_1_1_base = new PhWith(ret_2_1_1_base, "Δ", new Data.Value<>(-41L));
            Phi ret_2_1_1 = new PhMethod(ret_2_1_1_base, "as-bytes");
              ret_2_1_1 = new PhLocated(ret_2_1_1, 105, 11, "Φ.org.eolang.left-with-odd-plus.φ.α1.α0.α0");
            ret_2_1 = new PhWith(ret_2_1, 0, ret_2_1_1);
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOleft_with_odd_plusTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
