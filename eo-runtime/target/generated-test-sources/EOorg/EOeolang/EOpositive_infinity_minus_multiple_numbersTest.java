
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="415" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers" name="positive-infinity-minus-multiple-numbers" original-name="positive-infinity-minus-multiple-numbers" pos="0"> 
//   <o base="org.eolang.positive-infinity" const="" line="416" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers.pos-inf" name="pos-inf" pos="2"/>
//   <o base="org.eolang.hamcrest.assert-that" line="417" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers.φ" name="@" pos="2"> 
//     <o base=".minus" line="418" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers.φ.α0" pos="11"> 
//       <o base="pos-inf" line="418" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers.φ.α0.ρ" pos="4" ref="416"/>
//       <o base="org.eolang.int" data="int" line="418" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers.φ.α0.α0" pos="18">42</o>
//       <o base="org.eolang.float" data="float" line="418" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers.φ.α0.α1" pos="21">-22.1</o>
//       <o base="org.eolang.int" data="int" line="418" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers.φ.α0.α2" pos="27">30</o>
//     </o>
//     <o base=".equal-to" line="419" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers.φ.α1" pos="5"> 
//       <o base="$" line="419" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers.φ.α1.ρ" pos="4"/>
//       <o base="pos-inf" line="419" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers.φ.α1.α0" pos="15" ref="416"/>
//     </o>
//   </o>
// </o>
@XmirObject(name = "positive-infinity-minus-multiple-numbersTest", oname = "positive-infinity-minus-multiple-numbers", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/positive-infinity-tests.eo")
public final class EOpositive_infinity_minus_multiple_numbersTest extends PhDefault {
  public EOpositive_infinity_minus_multiple_numbersTest() {
    this.add("pos-inf", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("positive-infinity").get();
        ret = new PhLocated(ret, 416, 2, "Φ.org.eolang.positive-infinity-minus-multiple-numbers.pos-inf");
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 417, 2, "Φ.org.eolang.positive-infinity-minus-multiple-numbers.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(rho, "pos-inf");
          ret_1_base = new PhLocated(ret_1_base, 418, 4, "Φ.org.eolang.positive-infinity-minus-multiple-numbers.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "minus");
          ret_1 = new PhLocated(ret_1, 418, 11, "Φ.org.eolang.positive-infinity-minus-multiple-numbers.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_1 = new PhLocated(ret_1_1, 418, 18, "Φ.org.eolang.positive-infinity-minus-multiple-numbers.φ.α0.α0");
            ret_1_1 = new PhWith(ret_1_1, "Δ", new Data.Value<>(42L));
          Phi ret_1_2 = new EOorg.EOeolang.EOfloat(Phi.Φ);
            ret_1_2 = new PhLocated(ret_1_2, 418, 21, "Φ.org.eolang.positive-infinity-minus-multiple-numbers.φ.α0.α1");
            ret_1_2 = new PhWith(ret_1_2, "Δ", new Data.Value<>(-22.1d));
          Phi ret_1_3 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_3 = new PhLocated(ret_1_3, 418, 27, "Φ.org.eolang.positive-infinity-minus-multiple-numbers.φ.α0.α2");
            ret_1_3 = new PhWith(ret_1_3, "Δ", new Data.Value<>(30L));
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
          ret_1 = new PhWith(ret_1, 1, ret_1_2);
          ret_1 = new PhWith(ret_1, 2, ret_1_3);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 419, 4, "Φ.org.eolang.positive-infinity-minus-multiple-numbers.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 419, 5, "Φ.org.eolang.positive-infinity-minus-multiple-numbers.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new PhMethod(rho, "pos-inf");
            ret_2_1 = new PhLocated(ret_2_1, 419, 15, "Φ.org.eolang.positive-infinity-minus-multiple-numbers.φ.α1.α0");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOpositive_infinity_minus_multiple_numbersTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
