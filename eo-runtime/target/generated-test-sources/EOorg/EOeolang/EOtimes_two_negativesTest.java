
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="242" loc="Φ.org.eolang.times-two-negatives" name="times-two-negatives" original-name="times-two-negatives" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="243" loc="Φ.org.eolang.times-two-negatives.φ" name="@" pos="2"> 
//     <o base=".times" line="244" loc="Φ.org.eolang.times-two-negatives.φ.α0" pos="4"> 
//       <o base="org.eolang.float" data="float" line="245" loc="Φ.org.eolang.times-two-negatives.φ.α0.ρ" pos="6">-574.5</o>
//       <o base="org.eolang.float" data="float" line="246" loc="Φ.org.eolang.times-two-negatives.φ.α0.α0" pos="6">-311.985</o>
//     </o>
//     <o base=".equal-to" line="247" loc="Φ.org.eolang.times-two-negatives.φ.α1" pos="5"> 
//       <o base="$" line="247" loc="Φ.org.eolang.times-two-negatives.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.float" data="float" line="247" loc="Φ.org.eolang.times-two-negatives.φ.α1.α0" pos="15">179235.3825</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "times-two-negativesTest", oname = "times-two-negatives", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/float-tests.eo")
public final class EOtimes_two_negativesTest extends PhDefault {
  public EOtimes_two_negativesTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 243, 2, "Φ.org.eolang.times-two-negatives.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new EOorg.EOeolang.EOfloat(Phi.Φ);
          ret_1_base = new PhLocated(ret_1_base, 245, 6, "Φ.org.eolang.times-two-negatives.φ.α0.ρ");
          ret_1_base = new PhWith(ret_1_base, "Δ", new Data.Value<>(-574.5d));
        Phi ret_1 = new PhMethod(ret_1_base, "times");
          ret_1 = new PhLocated(ret_1, 244, 4, "Φ.org.eolang.times-two-negatives.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOorg.EOeolang.EOfloat(Phi.Φ);
            ret_1_1 = new PhLocated(ret_1_1, 246, 6, "Φ.org.eolang.times-two-negatives.φ.α0.α0");
            ret_1_1 = new PhWith(ret_1_1, "Δ", new Data.Value<>(-311.985d));
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 247, 4, "Φ.org.eolang.times-two-negatives.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 247, 5, "Φ.org.eolang.times-two-negatives.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EOfloat(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 247, 15, "Φ.org.eolang.times-two-negatives.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(179235.3825d));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOtimes_two_negativesTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
