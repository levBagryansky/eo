
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="38" loc="Φ.org.eolang.size-of-part-is-correct" name="size-of-part-is-correct" original-name="size-of-part-is-correct" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="39" loc="Φ.org.eolang.size-of-part-is-correct.φ" name="@" pos="2"> 
//     <o base=".size" line="40" loc="Φ.org.eolang.size-of-part-is-correct.φ.α0" pos="4"> 
//       <o base=".slice" line="41" loc="Φ.org.eolang.size-of-part-is-correct.φ.α0.ρ" pos="6"> 
//         <o base="org.eolang.bytes" data="bytes" line="42" loc="Φ.org.eolang.size-of-part-is-correct.φ.α0.ρ.ρ" pos="8">20 1F EE B5 90 EE BB</o>
//         <o base="org.eolang.int" data="int" line="43" loc="Φ.org.eolang.size-of-part-is-correct.φ.α0.ρ.α0" pos="8">2</o>
//         <o base="org.eolang.int" data="int" line="44" loc="Φ.org.eolang.size-of-part-is-correct.φ.α0.ρ.α1" pos="8">3</o>
//       </o>
//     </o>
//     <o base=".equal-to" line="45" loc="Φ.org.eolang.size-of-part-is-correct.φ.α1" pos="5"> 
//       <o base="$" line="45" loc="Φ.org.eolang.size-of-part-is-correct.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.int" data="int" line="45" loc="Φ.org.eolang.size-of-part-is-correct.φ.α1.α0" pos="15">3</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "size-of-part-is-correctTest", oname = "size-of-part-is-correct", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bytes-tests.eo")
public final class EOsize_of_part_is_correctTest extends PhDefault {
  public EOsize_of_part_is_correctTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 39, 2, "Φ.org.eolang.size-of-part-is-correct.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base_base = new EOorg.EOeolang.EObytes(Phi.Φ);
          ret_1_base_base = new PhLocated(ret_1_base_base, 42, 8, "Φ.org.eolang.size-of-part-is-correct.φ.α0.ρ.ρ");
          ret_1_base_base = new PhWith(ret_1_base_base, "Δ", new Data.Value<>(new byte[] {(byte) 0x20, (byte) 0x1F, (byte) 0xEE, (byte) 0xB5, (byte) 0x90, (byte) 0xEE, (byte) 0xBB}));
        Phi ret_1_base = new PhMethod(ret_1_base_base, "slice");
          ret_1_base = new PhLocated(ret_1_base, 41, 6, "Φ.org.eolang.size-of-part-is-correct.φ.α0.ρ");
        ret_1_base = new PhCopy(ret_1_base);
          Phi ret_1_base_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_base_1 = new PhLocated(ret_1_base_1, 43, 8, "Φ.org.eolang.size-of-part-is-correct.φ.α0.ρ.α0");
            ret_1_base_1 = new PhWith(ret_1_base_1, "Δ", new Data.Value<>(2L));
          Phi ret_1_base_2 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_base_2 = new PhLocated(ret_1_base_2, 44, 8, "Φ.org.eolang.size-of-part-is-correct.φ.α0.ρ.α1");
            ret_1_base_2 = new PhWith(ret_1_base_2, "Δ", new Data.Value<>(3L));
          ret_1_base = new PhWith(ret_1_base, 0, ret_1_base_1);
          ret_1_base = new PhWith(ret_1_base, 1, ret_1_base_2);
        Phi ret_1 = new PhMethod(ret_1_base, "size");
          ret_1 = new PhLocated(ret_1, 40, 4, "Φ.org.eolang.size-of-part-is-correct.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 45, 4, "Φ.org.eolang.size-of-part-is-correct.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 45, 5, "Φ.org.eolang.size-of-part-is-correct.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 45, 15, "Φ.org.eolang.size-of-part-is-correct.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(3L));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOsize_of_part_is_correctTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
