
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="312" loc="Φ.org.eolang.concat-with-empty" name="concat-with-empty" original-name="concat-with-empty" pos="0"> 
//   <o base=".eq" line="313" loc="Φ.org.eolang.concat-with-empty.φ" name="@" pos="2"> 
//     <o base=".concat" line="314" loc="Φ.org.eolang.concat-with-empty.φ.ρ" pos="4"> 
//       <o base="org.eolang.bytes" data="bytes" line="315" loc="Φ.org.eolang.concat-with-empty.φ.ρ.ρ" pos="6">05 5E 78</o>
//       <o base="org.eolang.bytes" data="bytes" line="316" loc="Φ.org.eolang.concat-with-empty.φ.ρ.α0" pos="6"/>
//     </o>
//     <o base="org.eolang.bytes" data="bytes" line="317" loc="Φ.org.eolang.concat-with-empty.φ.α0" pos="4">05 5E 78</o>
//   </o>
// </o>
@XmirObject(name = "concat-with-emptyTest", oname = "concat-with-empty", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bytes-tests.eo")
public final class EOconcat_with_emptyTest extends PhDefault {
    
  public EOconcat_with_emptyTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new EOorg.EOeolang.EObytes(Phi.Φ);
        ret_base_base = new PhLocated(ret_base_base, 315, 6, "Φ.org.eolang.concat-with-empty.φ.ρ.ρ");
        ret_base_base = new PhWith(ret_base_base, "Δ", new Data.Value<>(new byte[] {(byte) 0x05, (byte) 0x5E, (byte) 0x78}));
      Phi ret_base = new PhMethod(ret_base_base, "concat");
        ret_base = new PhLocated(ret_base, 314, 4, "Φ.org.eolang.concat-with-empty.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new EOorg.EOeolang.EObytes(Phi.Φ);
          ret_base_1 = new PhLocated(ret_base_1, 316, 6, "Φ.org.eolang.concat-with-empty.φ.ρ.α0");
          ret_base_1 = new PhWith(ret_base_1, "Δ", new Data.Value<>(new byte[] {}));
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 313, 2, "Φ.org.eolang.concat-with-empty.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EObytes(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 317, 4, "Φ.org.eolang.concat-with-empty.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(new byte[] {(byte) 0x05, (byte) 0x5E, (byte) 0x78}));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOconcat_with_emptyTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
