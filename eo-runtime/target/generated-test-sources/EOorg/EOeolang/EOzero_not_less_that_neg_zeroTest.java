
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="148" loc="Φ.org.eolang.zero-not-less-that-neg-zero" name="zero-not-less-that-neg-zero" original-name="zero-not-less-that-neg-zero" pos="0"> 
//   <o base=".eq" line="149" loc="Φ.org.eolang.zero-not-less-that-neg-zero.φ" name="@" pos="2"> 
//     <o base=".lt" line="150" loc="Φ.org.eolang.zero-not-less-that-neg-zero.φ.ρ" pos="7"> 
//       <o base="org.eolang.float" data="float" line="150" loc="Φ.org.eolang.zero-not-less-that-neg-zero.φ.ρ.ρ" pos="4">0.0</o>
//       <o base="org.eolang.float" data="float" line="150" loc="Φ.org.eolang.zero-not-less-that-neg-zero.φ.ρ.α0" pos="11">-0.0</o>
//     </o>
//     <o base="org.eolang.bool" data="bool" line="151" loc="Φ.org.eolang.zero-not-less-that-neg-zero.φ.α0" pos="4">FALSE</o>
//   </o>
// </o>
@XmirObject(name = "zero-not-less-that-neg-zeroTest", oname = "zero-not-less-that-neg-zero", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/float-tests.eo")
public final class EOzero_not_less_that_neg_zeroTest extends PhDefault {
    
  public EOzero_not_less_that_neg_zeroTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new EOorg.EOeolang.EOfloat(Phi.Φ);
        ret_base_base = new PhLocated(ret_base_base, 150, 4, "Φ.org.eolang.zero-not-less-that-neg-zero.φ.ρ.ρ");
        ret_base_base = new PhWith(ret_base_base, "Δ", new Data.Value<>(0.0d));
      Phi ret_base = new PhMethod(ret_base_base, "lt");
        ret_base = new PhLocated(ret_base, 150, 7, "Φ.org.eolang.zero-not-less-that-neg-zero.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new EOorg.EOeolang.EOfloat(Phi.Φ);
          ret_base_1 = new PhLocated(ret_base_1, 150, 11, "Φ.org.eolang.zero-not-less-that-neg-zero.φ.ρ.α0");
          ret_base_1 = new PhWith(ret_base_1, "Δ", new Data.Value<>(-0.0d));
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 149, 2, "Φ.org.eolang.zero-not-less-that-neg-zero.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EObool(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 151, 4, "Φ.org.eolang.zero-not-less-that-neg-zero.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(Boolean.FALSE));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOzero_not_less_that_neg_zeroTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
