
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="336" loc="Φ.org.eolang.concat-bools-as-bytes" name="concat-bools-as-bytes" original-name="concat-bools-as-bytes" pos="0"> 
//   <o base=".as-bytes" line="337" loc="Φ.org.eolang.concat-bools-as-bytes.b1" name="b1" pos="6"> 
//     <o base="org.eolang.bool" data="bool" line="337" loc="Φ.org.eolang.concat-bools-as-bytes.b1.ρ" pos="2">TRUE</o>
//   </o>
//   <o base=".as-bytes" line="338" loc="Φ.org.eolang.concat-bools-as-bytes.b2" name="b2" pos="7"> 
//     <o base="org.eolang.bool" data="bool" line="338" loc="Φ.org.eolang.concat-bools-as-bytes.b2.ρ" pos="2">FALSE</o>
//   </o>
//   <o base="org.eolang.hamcrest.assert-that" line="339" loc="Φ.org.eolang.concat-bools-as-bytes.φ" name="@" pos="2"> 
//     <o base=".concat" line="340" loc="Φ.org.eolang.concat-bools-as-bytes.φ.α0" pos="4"> 
//       <o base="b1" line="341" loc="Φ.org.eolang.concat-bools-as-bytes.φ.α0.ρ" pos="6" ref="337"/>
//       <o base="b2" line="342" loc="Φ.org.eolang.concat-bools-as-bytes.φ.α0.α0" pos="6" ref="338"/>
//     </o>
//     <o base=".equal-to" line="343" loc="Φ.org.eolang.concat-bools-as-bytes.φ.α1" pos="5"> 
//       <o base="$" line="343" loc="Φ.org.eolang.concat-bools-as-bytes.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.bytes" data="bytes" line="343" loc="Φ.org.eolang.concat-bools-as-bytes.φ.α1.α0" pos="15">01 00</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "concat-bools-as-bytesTest", oname = "concat-bools-as-bytes", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bytes-tests.eo")
public final class EOconcat_bools_as_bytesTest extends PhDefault {
  public EOconcat_bools_as_bytesTest() {
    this.add("b1", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new EOorg.EOeolang.EObool(Phi.Φ);
        ret_base = new PhLocated(ret_base, 337, 2, "Φ.org.eolang.concat-bools-as-bytes.b1.ρ");
        ret_base = new PhWith(ret_base, "Δ", new Data.Value<>(Boolean.TRUE));
      Phi ret = new PhMethod(ret_base, "as-bytes");
        ret = new PhLocated(ret, 337, 6, "Φ.org.eolang.concat-bools-as-bytes.b1");
      return ret;
    })));
    this.add("b2", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new EOorg.EOeolang.EObool(Phi.Φ);
        ret_base = new PhLocated(ret_base, 338, 2, "Φ.org.eolang.concat-bools-as-bytes.b2.ρ");
        ret_base = new PhWith(ret_base, "Δ", new Data.Value<>(Boolean.FALSE));
      Phi ret = new PhMethod(ret_base, "as-bytes");
        ret = new PhLocated(ret, 338, 7, "Φ.org.eolang.concat-bools-as-bytes.b2");
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 339, 2, "Φ.org.eolang.concat-bools-as-bytes.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(rho, "b1");
          ret_1_base = new PhLocated(ret_1_base, 341, 6, "Φ.org.eolang.concat-bools-as-bytes.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "concat");
          ret_1 = new PhLocated(ret_1, 340, 4, "Φ.org.eolang.concat-bools-as-bytes.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new PhMethod(rho, "b2");
            ret_1_1 = new PhLocated(ret_1_1, 342, 6, "Φ.org.eolang.concat-bools-as-bytes.φ.α0.α0");
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 343, 4, "Φ.org.eolang.concat-bools-as-bytes.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 343, 5, "Φ.org.eolang.concat-bools-as-bytes.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EObytes(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 343, 15, "Φ.org.eolang.concat-bools-as-bytes.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(new byte[] {(byte) 0x01, (byte) 0x00}));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOconcat_bools_as_bytesTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}