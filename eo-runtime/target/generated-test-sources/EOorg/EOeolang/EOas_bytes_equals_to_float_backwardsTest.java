
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="471" loc="Φ.org.eolang.as-bytes-equals-to-float-backwards" name="as-bytes-equals-to-float-backwards" original-name="as-bytes-equals-to-float-backwards" pos="0"> 
//   <o base=".eq" line="472" loc="Φ.org.eolang.as-bytes-equals-to-float-backwards.φ" name="@" pos="2"> 
//     <o base=".as-bytes" line="473" loc="Φ.org.eolang.as-bytes-equals-to-float-backwards.φ.ρ" pos="13"> 
//       <o base="org.eolang.float" data="float" line="473" loc="Φ.org.eolang.as-bytes-equals-to-float-backwards.φ.ρ.ρ" pos="4">3.1415926</o>
//     </o>
//     <o base="org.eolang.float" data="float" line="474" loc="Φ.org.eolang.as-bytes-equals-to-float-backwards.φ.α0" pos="4">3.1415926</o>
//   </o>
// </o>
@XmirObject(name = "as-bytes-equals-to-float-backwardsTest", oname = "as-bytes-equals-to-float-backwards", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/float-tests.eo")
public final class EOas_bytes_equals_to_float_backwardsTest extends PhDefault {
    
  public EOas_bytes_equals_to_float_backwardsTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new EOorg.EOeolang.EOfloat(Phi.Φ);
        ret_base_base = new PhLocated(ret_base_base, 473, 4, "Φ.org.eolang.as-bytes-equals-to-float-backwards.φ.ρ.ρ");
        ret_base_base = new PhWith(ret_base_base, "Δ", new Data.Value<>(3.1415926d));
      Phi ret_base = new PhMethod(ret_base_base, "as-bytes");
        ret_base = new PhLocated(ret_base, 473, 13, "Φ.org.eolang.as-bytes-equals-to-float-backwards.φ.ρ");
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 472, 2, "Φ.org.eolang.as-bytes-equals-to-float-backwards.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOfloat(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 474, 4, "Φ.org.eolang.as-bytes-equals-to-float-backwards.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(3.1415926d));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOas_bytes_equals_to_float_backwardsTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
