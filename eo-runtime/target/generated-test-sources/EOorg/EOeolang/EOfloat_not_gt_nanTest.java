
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="343" loc="Φ.org.eolang.float-not-gt-nan" name="float-not-gt-nan" original-name="float-not-gt-nan" pos="0"> 
//   <o base=".eq" line="344" loc="Φ.org.eolang.float-not-gt-nan.φ" name="@" pos="2"> 
//     <o base=".gt" line="345" loc="Φ.org.eolang.float-not-gt-nan.φ.ρ" pos="8"> 
//       <o base="org.eolang.float" data="float" line="345" loc="Φ.org.eolang.float-not-gt-nan.φ.ρ.ρ" pos="4">52.3</o>
//       <o base="org.eolang.nan" line="345" loc="Φ.org.eolang.float-not-gt-nan.φ.ρ.α0" pos="12"/>
//     </o>
//     <o base="org.eolang.bool" data="bool" line="346" loc="Φ.org.eolang.float-not-gt-nan.φ.α0" pos="4">FALSE</o>
//   </o>
// </o>
@XmirObject(name = "float-not-gt-nanTest", oname = "float-not-gt-nan", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/float-tests.eo")
public final class EOfloat_not_gt_nanTest extends PhDefault {
    
  public EOfloat_not_gt_nanTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new EOorg.EOeolang.EOfloat(Phi.Φ);
        ret_base_base = new PhLocated(ret_base_base, 345, 4, "Φ.org.eolang.float-not-gt-nan.φ.ρ.ρ");
        ret_base_base = new PhWith(ret_base_base, "Δ", new Data.Value<>(52.3d));
      Phi ret_base = new PhMethod(ret_base_base, "gt");
        ret_base = new PhLocated(ret_base, 345, 8, "Φ.org.eolang.float-not-gt-nan.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("nan").get();
          ret_base_1 = new PhLocated(ret_base_1, 345, 12, "Φ.org.eolang.float-not-gt-nan.φ.ρ.α0");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 344, 2, "Φ.org.eolang.float-not-gt-nan.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EObool(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 346, 4, "Φ.org.eolang.float-not-gt-nan.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(Boolean.FALSE));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOfloat_not_gt_nanTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
