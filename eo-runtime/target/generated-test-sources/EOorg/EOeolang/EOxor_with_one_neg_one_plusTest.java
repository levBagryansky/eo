
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="250" loc="Φ.org.eolang.xor-with-one-neg-one-plus" name="xor-with-one-neg-one-plus" original-name="xor-with-one-neg-one-plus" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="251" loc="Φ.org.eolang.xor-with-one-neg-one-plus.φ" name="@" pos="2"> 
//     <o base=".xor" line="252" loc="Φ.org.eolang.xor-with-one-neg-one-plus.φ.α0" pos="16"> 
//       <o base=".as-bytes" line="252" loc="Φ.org.eolang.xor-with-one-neg-one-plus.φ.α0.ρ" pos="7"> 
//         <o base="org.eolang.int" data="int" line="252" loc="Φ.org.eolang.xor-with-one-neg-one-plus.φ.α0.ρ.ρ" pos="4">-36</o>
//       </o>
//       <o base=".as-bytes" line="252" loc="Φ.org.eolang.xor-with-one-neg-one-plus.φ.α0.α0" pos="24" scope="scope-9568af44-7040-4b0c-8d35-95f631a189ea"> 
//         <o base="org.eolang.int" data="int" line="252" loc="Φ.org.eolang.xor-with-one-neg-one-plus.φ.α0.α0.ρ" pos="22" scope="scope-9568af44-7040-4b0c-8d35-95f631a189ea">43</o>
//       </o>
//     </o>
//     <o base=".not" line="253" loc="Φ.org.eolang.xor-with-one-neg-one-plus.φ.α1" pos="5"> 
//       <o base="$" line="253" loc="Φ.org.eolang.xor-with-one-neg-one-plus.φ.α1.ρ" pos="4"/>
//       <o base=".equal-to" line="254" loc="Φ.org.eolang.xor-with-one-neg-one-plus.φ.α1.α0" pos="7"> 
//         <o base="$" line="254" loc="Φ.org.eolang.xor-with-one-neg-one-plus.φ.α1.α0.ρ" pos="6"/>
//         <o base=".as-bytes" line="255" loc="Φ.org.eolang.xor-with-one-neg-one-plus.φ.α1.α0.α0" pos="9"> 
//           <o base="org.eolang.int" data="int" line="255" loc="Φ.org.eolang.xor-with-one-neg-one-plus.φ.α1.α0.α0.ρ" pos="8">8</o>
//         </o>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "xor-with-one-neg-one-plusTest", oname = "xor-with-one-neg-one-plus", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bytes-tests.eo")
public final class EOxor_with_one_neg_one_plusTest extends PhDefault {
  public EOxor_with_one_neg_one_plusTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 251, 2, "Φ.org.eolang.xor-with-one-neg-one-plus.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base_base = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1_base_base = new PhLocated(ret_1_base_base, 252, 4, "Φ.org.eolang.xor-with-one-neg-one-plus.φ.α0.ρ.ρ");
          ret_1_base_base = new PhWith(ret_1_base_base, "Δ", new Data.Value<>(-36L));
        Phi ret_1_base = new PhMethod(ret_1_base_base, "as-bytes");
          ret_1_base = new PhLocated(ret_1_base, 252, 7, "Φ.org.eolang.xor-with-one-neg-one-plus.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "xor");
          ret_1 = new PhLocated(ret_1, 252, 16, "Φ.org.eolang.xor-with-one-neg-one-plus.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1_base = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_1_base = new PhLocated(ret_1_1_base, 252, 22, "Φ.org.eolang.xor-with-one-neg-one-plus.φ.α0.α0.ρ");
            ret_1_1_base = new PhWith(ret_1_1_base, "Δ", new Data.Value<>(43L));
          Phi ret_1_1 = new PhMethod(ret_1_1_base, "as-bytes");
            ret_1_1 = new PhLocated(ret_1_1, 252, 24, "Φ.org.eolang.xor-with-one-neg-one-plus.φ.α0.α0");
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 253, 4, "Φ.org.eolang.xor-with-one-neg-one-plus.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "not");
          ret_2 = new PhLocated(ret_2, 253, 5, "Φ.org.eolang.xor-with-one-neg-one-plus.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = rho;
            ret_2_1_base = new PhLocated(ret_2_1_base, 254, 6, "Φ.org.eolang.xor-with-one-neg-one-plus.φ.α1.α0.ρ");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "equal-to");
            ret_2_1 = new PhLocated(ret_2_1, 254, 7, "Φ.org.eolang.xor-with-one-neg-one-plus.φ.α1.α0");
          ret_2_1 = new PhCopy(ret_2_1);
            Phi ret_2_1_1_base = new EOorg.EOeolang.EOint(Phi.Φ);
              ret_2_1_1_base = new PhLocated(ret_2_1_1_base, 255, 8, "Φ.org.eolang.xor-with-one-neg-one-plus.φ.α1.α0.α0.ρ");
              ret_2_1_1_base = new PhWith(ret_2_1_1_base, "Δ", new Data.Value<>(8L));
            Phi ret_2_1_1 = new PhMethod(ret_2_1_1_base, "as-bytes");
              ret_2_1_1 = new PhLocated(ret_2_1_1, 255, 9, "Φ.org.eolang.xor-with-one-neg-one-plus.φ.α1.α0.α0");
            ret_2_1 = new PhWith(ret_2_1, 0, ret_2_1_1);
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOxor_with_one_neg_one_plusTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
