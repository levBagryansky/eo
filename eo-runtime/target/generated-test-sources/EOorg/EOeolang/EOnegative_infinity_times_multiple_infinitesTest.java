
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="279" loc="Φ.org.eolang.negative-infinity-times-multiple-infinites" name="negative-infinity-times-multiple-infinites" original-name="negative-infinity-times-multiple-infinites" pos="0"> 
//   <o base="org.eolang.negative-infinity" const="" line="280" loc="Φ.org.eolang.negative-infinity-times-multiple-infinites.neg-inf" name="neg-inf" pos="2"/>
//   <o base="org.eolang.positive-infinity" const="" line="281" loc="Φ.org.eolang.negative-infinity-times-multiple-infinites.pos-inf" name="pos-inf" pos="2"/>
//   <o base="org.eolang.hamcrest.assert-that" line="282" loc="Φ.org.eolang.negative-infinity-times-multiple-infinites.φ" name="@" pos="2"> 
//     <o base=".times" line="283" loc="Φ.org.eolang.negative-infinity-times-multiple-infinites.φ.α0" pos="11"> 
//       <o base="neg-inf" line="283" loc="Φ.org.eolang.negative-infinity-times-multiple-infinites.φ.α0.ρ" pos="4" ref="280"/>
//       <o base="pos-inf" line="283" loc="Φ.org.eolang.negative-infinity-times-multiple-infinites.φ.α0.α0" pos="18" ref="281"/>
//       <o base="neg-inf" line="283" loc="Φ.org.eolang.negative-infinity-times-multiple-infinites.φ.α0.α1" pos="26" ref="280"/>
//       <o base="pos-inf" line="283" loc="Φ.org.eolang.negative-infinity-times-multiple-infinites.φ.α0.α2" pos="34" ref="281"/>
//       <o base="pos-inf" line="283" loc="Φ.org.eolang.negative-infinity-times-multiple-infinites.φ.α0.α3" pos="42" ref="281"/>
//     </o>
//     <o base=".equal-to" line="284" loc="Φ.org.eolang.negative-infinity-times-multiple-infinites.φ.α1" pos="5"> 
//       <o base="$" line="284" loc="Φ.org.eolang.negative-infinity-times-multiple-infinites.φ.α1.ρ" pos="4"/>
//       <o base="pos-inf" line="284" loc="Φ.org.eolang.negative-infinity-times-multiple-infinites.φ.α1.α0" pos="15" ref="281"/>
//     </o>
//   </o>
// </o>
@XmirObject(name = "negative-infinity-times-multiple-infinitesTest", oname = "negative-infinity-times-multiple-infinites", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/negative-infinity-tests.eo")
public final class EOnegative_infinity_times_multiple_infinitesTest extends PhDefault {
  public EOnegative_infinity_times_multiple_infinitesTest() {
    this.add("neg-inf", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("negative-infinity").get();
        ret = new PhLocated(ret, 280, 2, "Φ.org.eolang.negative-infinity-times-multiple-infinites.neg-inf");
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("pos-inf", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("positive-infinity").get();
        ret = new PhLocated(ret, 281, 2, "Φ.org.eolang.negative-infinity-times-multiple-infinites.pos-inf");
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 282, 2, "Φ.org.eolang.negative-infinity-times-multiple-infinites.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(rho, "neg-inf");
          ret_1_base = new PhLocated(ret_1_base, 283, 4, "Φ.org.eolang.negative-infinity-times-multiple-infinites.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "times");
          ret_1 = new PhLocated(ret_1, 283, 11, "Φ.org.eolang.negative-infinity-times-multiple-infinites.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new PhMethod(rho, "pos-inf");
            ret_1_1 = new PhLocated(ret_1_1, 283, 18, "Φ.org.eolang.negative-infinity-times-multiple-infinites.φ.α0.α0");
          Phi ret_1_2 = new PhMethod(rho, "neg-inf");
            ret_1_2 = new PhLocated(ret_1_2, 283, 26, "Φ.org.eolang.negative-infinity-times-multiple-infinites.φ.α0.α1");
          Phi ret_1_3 = new PhMethod(rho, "pos-inf");
            ret_1_3 = new PhLocated(ret_1_3, 283, 34, "Φ.org.eolang.negative-infinity-times-multiple-infinites.φ.α0.α2");
          Phi ret_1_4 = new PhMethod(rho, "pos-inf");
            ret_1_4 = new PhLocated(ret_1_4, 283, 42, "Φ.org.eolang.negative-infinity-times-multiple-infinites.φ.α0.α3");
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
          ret_1 = new PhWith(ret_1, 1, ret_1_2);
          ret_1 = new PhWith(ret_1, 2, ret_1_3);
          ret_1 = new PhWith(ret_1, 3, ret_1_4);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 284, 4, "Φ.org.eolang.negative-infinity-times-multiple-infinites.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 284, 5, "Φ.org.eolang.negative-infinity-times-multiple-infinites.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new PhMethod(rho, "pos-inf");
            ret_2_1 = new PhLocated(ret_2_1, 284, 15, "Φ.org.eolang.negative-infinity-times-multiple-infinites.φ.α1.α0");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOnegative_infinity_times_multiple_infinitesTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}