
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="46" loc="Φ.org.eolang.counts-size-of-bytes" name="counts-size-of-bytes" original-name="counts-size-of-bytes" pos="0"> 
//   <o base=".eq" line="47" loc="Φ.org.eolang.counts-size-of-bytes.φ" name="@" pos="2"> 
//     <o base=".size" line="48" loc="Φ.org.eolang.counts-size-of-bytes.φ.ρ" pos="4"> 
//       <o base="org.eolang.bytes" data="bytes" line="49" loc="Φ.org.eolang.counts-size-of-bytes.φ.ρ.ρ" pos="6">F1 20 5F EC B5 90 32</o>
//     </o>
//     <o base="org.eolang.int" data="int" line="50" loc="Φ.org.eolang.counts-size-of-bytes.φ.α0" pos="4">7</o>
//   </o>
// </o>
@XmirObject(name = "counts-size-of-bytesTest", oname = "counts-size-of-bytes", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bytes-tests.eo")
public final class EOcounts_size_of_bytesTest extends PhDefault {
    
  public EOcounts_size_of_bytesTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new EOorg.EOeolang.EObytes(Phi.Φ);
        ret_base_base = new PhLocated(ret_base_base, 49, 6, "Φ.org.eolang.counts-size-of-bytes.φ.ρ.ρ");
        ret_base_base = new PhWith(ret_base_base, "Δ", new Data.Value<>(new byte[] {(byte) 0xF1, (byte) 0x20, (byte) 0x5F, (byte) 0xEC, (byte) 0xB5, (byte) 0x90, (byte) 0x32}));
      Phi ret_base = new PhMethod(ret_base_base, "size");
        ret_base = new PhLocated(ret_base, 48, 4, "Φ.org.eolang.counts-size-of-bytes.φ.ρ");
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 47, 2, "Φ.org.eolang.counts-size-of-bytes.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 50, 4, "Φ.org.eolang.counts-size-of-bytes.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(7L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOcounts_size_of_bytesTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
