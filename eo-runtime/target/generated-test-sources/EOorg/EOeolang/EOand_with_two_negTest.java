
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="145" loc="Φ.org.eolang.and-with-two-neg" name="and-with-two-neg" original-name="and-with-two-neg" pos="0"> 
//   <o base=".not" line="146" loc="Φ.org.eolang.and-with-two-neg.φ" name="@" pos="2"> 
//     <o base=".eq" line="147" loc="Φ.org.eolang.and-with-two-neg.φ.ρ" pos="4"> 
//       <o base=".and" line="148" loc="Φ.org.eolang.and-with-two-neg.φ.ρ.ρ" pos="17"> 
//         <o base=".as-bytes" line="148" loc="Φ.org.eolang.and-with-two-neg.φ.ρ.ρ.ρ" pos="8"> 
//           <o base="org.eolang.int" data="int" line="148" loc="Φ.org.eolang.and-with-two-neg.φ.ρ.ρ.ρ.ρ" pos="6">-6</o>
//         </o>
//         <o base=".as-bytes" line="148" loc="Φ.org.eolang.and-with-two-neg.φ.ρ.ρ.α0" pos="25" scope="scope-a129a35b-cd35-4c12-bf53-6cdb31654155"> 
//           <o base="org.eolang.int" data="int" line="148" loc="Φ.org.eolang.and-with-two-neg.φ.ρ.ρ.α0.ρ" pos="23" scope="scope-a129a35b-cd35-4c12-bf53-6cdb31654155">-4</o>
//         </o>
//       </o>
//       <o base=".as-bytes" line="149" loc="Φ.org.eolang.and-with-two-neg.φ.ρ.α0" pos="7"> 
//         <o base="org.eolang.int" data="int" line="149" loc="Φ.org.eolang.and-with-two-neg.φ.ρ.α0.ρ" pos="6">7</o>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "and-with-two-negTest", oname = "and-with-two-neg", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bytes-tests.eo")
public final class EOand_with_two_negTest extends PhDefault {
    
  public EOand_with_two_negTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base_base_base = new EOorg.EOeolang.EOint(Phi.Φ);
        ret_base_base_base_base = new PhLocated(ret_base_base_base_base, 148, 6, "Φ.org.eolang.and-with-two-neg.φ.ρ.ρ.ρ.ρ");
        ret_base_base_base_base = new PhWith(ret_base_base_base_base, "Δ", new Data.Value<>(-6L));
      Phi ret_base_base_base = new PhMethod(ret_base_base_base_base, "as-bytes");
        ret_base_base_base = new PhLocated(ret_base_base_base, 148, 8, "Φ.org.eolang.and-with-two-neg.φ.ρ.ρ.ρ");
      Phi ret_base_base = new PhMethod(ret_base_base_base, "and");
        ret_base_base = new PhLocated(ret_base_base, 148, 17, "Φ.org.eolang.and-with-two-neg.φ.ρ.ρ");
      ret_base_base = new PhCopy(ret_base_base);
        Phi ret_base_base_1_base = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_base_base_1_base = new PhLocated(ret_base_base_1_base, 148, 23, "Φ.org.eolang.and-with-two-neg.φ.ρ.ρ.α0.ρ");
          ret_base_base_1_base = new PhWith(ret_base_base_1_base, "Δ", new Data.Value<>(-4L));
        Phi ret_base_base_1 = new PhMethod(ret_base_base_1_base, "as-bytes");
          ret_base_base_1 = new PhLocated(ret_base_base_1, 148, 25, "Φ.org.eolang.and-with-two-neg.φ.ρ.ρ.α0");
        ret_base_base = new PhWith(ret_base_base, 0, ret_base_base_1);
      Phi ret_base = new PhMethod(ret_base_base, "eq");
        ret_base = new PhLocated(ret_base, 147, 4, "Φ.org.eolang.and-with-two-neg.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1_base = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_base_1_base = new PhLocated(ret_base_1_base, 149, 6, "Φ.org.eolang.and-with-two-neg.φ.ρ.α0.ρ");
          ret_base_1_base = new PhWith(ret_base_1_base, "Δ", new Data.Value<>(7L));
        Phi ret_base_1 = new PhMethod(ret_base_1_base, "as-bytes");
          ret_base_1 = new PhLocated(ret_base_1, 149, 7, "Φ.org.eolang.and-with-two-neg.φ.ρ.α0");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "not");
        ret = new PhLocated(ret, 146, 2, "Φ.org.eolang.and-with-two-neg.φ");
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOand_with_two_negTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
