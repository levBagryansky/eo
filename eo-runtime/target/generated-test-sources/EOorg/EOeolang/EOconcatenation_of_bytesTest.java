
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="327" loc="Φ.org.eolang.concatenation-of-bytes" name="concatenation-of-bytes" original-name="concatenation-of-bytes" pos="0"> 
//   <o base="org.eolang.bytes" data="bytes" line="328" loc="Φ.org.eolang.concatenation-of-bytes.a" name="a" pos="2">02 EF D4 05 5E 78 3A</o>
//   <o base="org.eolang.bytes" data="bytes" line="329" loc="Φ.org.eolang.concatenation-of-bytes.b" name="b" pos="2">12 33 C1 B5 5E 71 55</o>
//   <o base="org.eolang.hamcrest.assert-that" line="330" loc="Φ.org.eolang.concatenation-of-bytes.φ" name="@" pos="2"> 
//     <o base=".concat" line="331" loc="Φ.org.eolang.concatenation-of-bytes.φ.α0" pos="5"> 
//       <o base="a" line="331" loc="Φ.org.eolang.concatenation-of-bytes.φ.α0.ρ" pos="4" ref="328"/>
//       <o base="b" line="331" loc="Φ.org.eolang.concatenation-of-bytes.φ.α0.α0" pos="13" ref="329"/>
//     </o>
//     <o base=".is" line="332" loc="Φ.org.eolang.concatenation-of-bytes.φ.α1" pos="5"> 
//       <o base="$" line="332" loc="Φ.org.eolang.concatenation-of-bytes.φ.α1.ρ" pos="4"/>
//       <o base=".equal-to" line="333" loc="Φ.org.eolang.concatenation-of-bytes.φ.α1.α0" pos="7"> 
//         <o base="$" line="333" loc="Φ.org.eolang.concatenation-of-bytes.φ.α1.α0.ρ" pos="6"/>
//         <o base="org.eolang.bytes" data="bytes" line="334" loc="Φ.org.eolang.concatenation-of-bytes.φ.α1.α0.α0" pos="8">02 EF D4 05 5E 78 3A 12 33 C1 B5 5E 71 55</o>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "concatenation-of-bytesTest", oname = "concatenation-of-bytes", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bytes-tests.eo")
public final class EOconcatenation_of_bytesTest extends PhDefault {
  public EOconcatenation_of_bytesTest() {
    this.add("a", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOorg.EOeolang.EObytes(Phi.Φ);
        ret = new PhLocated(ret, 328, 2, "Φ.org.eolang.concatenation-of-bytes.a");
        ret = new PhWith(ret, "Δ", new Data.Value<>(new byte[] {(byte) 0x02, (byte) 0xEF, (byte) 0xD4, (byte) 0x05, (byte) 0x5E, (byte) 0x78, (byte) 0x3A}));
      return ret;
    })));
    this.add("b", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOorg.EOeolang.EObytes(Phi.Φ);
        ret = new PhLocated(ret, 329, 2, "Φ.org.eolang.concatenation-of-bytes.b");
        ret = new PhWith(ret, "Δ", new Data.Value<>(new byte[] {(byte) 0x12, (byte) 0x33, (byte) 0xC1, (byte) 0xB5, (byte) 0x5E, (byte) 0x71, (byte) 0x55}));
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 330, 2, "Φ.org.eolang.concatenation-of-bytes.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(rho, "a");
          ret_1_base = new PhLocated(ret_1_base, 331, 4, "Φ.org.eolang.concatenation-of-bytes.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "concat");
          ret_1 = new PhLocated(ret_1, 331, 5, "Φ.org.eolang.concatenation-of-bytes.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new PhMethod(rho, "b");
            ret_1_1 = new PhLocated(ret_1_1, 331, 13, "Φ.org.eolang.concatenation-of-bytes.φ.α0.α0");
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 332, 4, "Φ.org.eolang.concatenation-of-bytes.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "is");
          ret_2 = new PhLocated(ret_2, 332, 5, "Φ.org.eolang.concatenation-of-bytes.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = rho;
            ret_2_1_base = new PhLocated(ret_2_1_base, 333, 6, "Φ.org.eolang.concatenation-of-bytes.φ.α1.α0.ρ");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "equal-to");
            ret_2_1 = new PhLocated(ret_2_1, 333, 7, "Φ.org.eolang.concatenation-of-bytes.φ.α1.α0");
          ret_2_1 = new PhCopy(ret_2_1);
            Phi ret_2_1_1 = new EOorg.EOeolang.EObytes(Phi.Φ);
              ret_2_1_1 = new PhLocated(ret_2_1_1, 334, 8, "Φ.org.eolang.concatenation-of-bytes.φ.α1.α0.α0");
              ret_2_1_1 = new PhWith(ret_2_1_1, "Δ", new Data.Value<>(new byte[] {(byte) 0x02, (byte) 0xEF, (byte) 0xD4, (byte) 0x05, (byte) 0x5E, (byte) 0x78, (byte) 0x3A, (byte) 0x12, (byte) 0x33, (byte) 0xC1, (byte) 0xB5, (byte) 0x5E, (byte) 0x71, (byte) 0x55}));
            ret_2_1 = new PhWith(ret_2_1, 0, ret_2_1_1);
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOconcatenation_of_bytesTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}