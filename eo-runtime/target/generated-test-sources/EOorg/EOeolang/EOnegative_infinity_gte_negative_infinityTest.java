
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="155" loc="Φ.org.eolang.negative-infinity-gte-negative-infinity" name="negative-infinity-gte-negative-infinity" original-name="negative-infinity-gte-negative-infinity" pos="0"> 
//   <o base="org.eolang.negative-infinity" const="" line="156" loc="Φ.org.eolang.negative-infinity-gte-negative-infinity.neg-inf" name="neg-inf" pos="2"/>
//   <o base="org.eolang.hamcrest.assert-that" line="157" loc="Φ.org.eolang.negative-infinity-gte-negative-infinity.φ" name="@" pos="2"> 
//     <o base=".gte" line="158" loc="Φ.org.eolang.negative-infinity-gte-negative-infinity.φ.α0" pos="11"> 
//       <o base="neg-inf" line="158" loc="Φ.org.eolang.negative-infinity-gte-negative-infinity.φ.α0.ρ" pos="4" ref="156"/>
//       <o base="neg-inf" line="158" loc="Φ.org.eolang.negative-infinity-gte-negative-infinity.φ.α0.α0" pos="16" ref="156"/>
//     </o>
//     <o base=".equal-to" line="159" loc="Φ.org.eolang.negative-infinity-gte-negative-infinity.φ.α1" pos="5"> 
//       <o base="$" line="159" loc="Φ.org.eolang.negative-infinity-gte-negative-infinity.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.bool" data="bool" line="159" loc="Φ.org.eolang.negative-infinity-gte-negative-infinity.φ.α1.α0" pos="15">TRUE</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "negative-infinity-gte-negative-infinityTest", oname = "negative-infinity-gte-negative-infinity", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/negative-infinity-tests.eo")
public final class EOnegative_infinity_gte_negative_infinityTest extends PhDefault {
  public EOnegative_infinity_gte_negative_infinityTest() {
    this.add("neg-inf", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("negative-infinity").get();
        ret = new PhLocated(ret, 156, 2, "Φ.org.eolang.negative-infinity-gte-negative-infinity.neg-inf");
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 157, 2, "Φ.org.eolang.negative-infinity-gte-negative-infinity.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(rho, "neg-inf");
          ret_1_base = new PhLocated(ret_1_base, 158, 4, "Φ.org.eolang.negative-infinity-gte-negative-infinity.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "gte");
          ret_1 = new PhLocated(ret_1, 158, 11, "Φ.org.eolang.negative-infinity-gte-negative-infinity.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new PhMethod(rho, "neg-inf");
            ret_1_1 = new PhLocated(ret_1_1, 158, 16, "Φ.org.eolang.negative-infinity-gte-negative-infinity.φ.α0.α0");
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 159, 4, "Φ.org.eolang.negative-infinity-gte-negative-infinity.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 159, 5, "Φ.org.eolang.negative-infinity-gte-negative-infinity.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EObool(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 159, 15, "Φ.org.eolang.negative-infinity-gte-negative-infinity.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(Boolean.TRUE));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOnegative_infinity_gte_negative_infinityTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}