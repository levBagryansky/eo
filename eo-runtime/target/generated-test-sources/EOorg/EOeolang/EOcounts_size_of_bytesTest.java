
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="47" loc="Φ.org.eolang.counts-size-of-bytes" name="counts-size-of-bytes" original-name="counts-size-of-bytes" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="48" loc="Φ.org.eolang.counts-size-of-bytes.φ" name="@" pos="2"> 
//     <o base=".size" line="49" loc="Φ.org.eolang.counts-size-of-bytes.φ.α0" pos="4"> 
//       <o base="org.eolang.bytes" data="bytes" line="50" loc="Φ.org.eolang.counts-size-of-bytes.φ.α0.ρ" pos="6">F1 20 5F EC B5 90 32</o>
//     </o>
//     <o base=".equal-to" line="51" loc="Φ.org.eolang.counts-size-of-bytes.φ.α1" pos="5"> 
//       <o base="$" line="51" loc="Φ.org.eolang.counts-size-of-bytes.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.int" data="int" line="51" loc="Φ.org.eolang.counts-size-of-bytes.φ.α1.α0" pos="15">7</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "counts-size-of-bytesTest", oname = "counts-size-of-bytes", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bytes-tests.eo")
public final class EOcounts_size_of_bytesTest extends PhDefault {
  public EOcounts_size_of_bytesTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 48, 2, "Φ.org.eolang.counts-size-of-bytes.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new EOorg.EOeolang.EObytes(Phi.Φ);
          ret_1_base = new PhLocated(ret_1_base, 50, 6, "Φ.org.eolang.counts-size-of-bytes.φ.α0.ρ");
          ret_1_base = new PhWith(ret_1_base, "Δ", new Data.Value<>(new byte[] {(byte) 0xF1, (byte) 0x20, (byte) 0x5F, (byte) 0xEC, (byte) 0xB5, (byte) 0x90, (byte) 0x32}));
        Phi ret_1 = new PhMethod(ret_1_base, "size");
          ret_1 = new PhLocated(ret_1, 49, 4, "Φ.org.eolang.counts-size-of-bytes.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 51, 4, "Φ.org.eolang.counts-size-of-bytes.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 51, 5, "Φ.org.eolang.counts-size-of-bytes.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 51, 15, "Φ.org.eolang.counts-size-of-bytes.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(7L));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
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
