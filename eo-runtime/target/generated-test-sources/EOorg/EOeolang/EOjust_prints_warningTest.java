
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="30" loc="Φ.org.eolang.just-prints-warning" name="just-prints-warning" original-name="just-prints-warning" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="31" loc="Φ.org.eolang.just-prints-warning.φ" name="@" pos="2"> 
//     <o base="org.eolang.cti" line="32" loc="Φ.org.eolang.just-prints-warning.φ.α0" pos="4"> 
//       <o base=".times" line="33" loc="Φ.org.eolang.just-prints-warning.φ.α0.α0" pos="7"> 
//         <o base="org.eolang.int" data="int" line="33" loc="Φ.org.eolang.just-prints-warning.φ.α0.α0.ρ" pos="6">2</o>
//         <o base="org.eolang.int" data="int" line="33" loc="Φ.org.eolang.just-prints-warning.φ.α0.α0.α0" pos="14">2</o>
//       </o>
//       <o base="org.eolang.string" data="string" line="34" loc="Φ.org.eolang.just-prints-warning.φ.α0.α1" pos="6">warning</o>
//       <o base="org.eolang.string" data="string" line="35" loc="Φ.org.eolang.just-prints-warning.φ.α0.α2" pos="6">This method is deprecated!</o>
//     </o>
//     <o base=".equal-to" line="36" loc="Φ.org.eolang.just-prints-warning.φ.α1" pos="5"> 
//       <o base="$" line="36" loc="Φ.org.eolang.just-prints-warning.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.int" data="int" line="36" loc="Φ.org.eolang.just-prints-warning.φ.α1.α0" pos="15">4</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "just-prints-warningTest", oname = "just-prints-warning", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/cti-test.eo")
public final class EOjust_prints_warningTest extends PhDefault {
  public EOjust_prints_warningTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 31, 2, "Φ.org.eolang.just-prints-warning.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("cti").get();
          ret_1 = new PhLocated(ret_1, 32, 4, "Φ.org.eolang.just-prints-warning.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1_base = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_1_base = new PhLocated(ret_1_1_base, 33, 6, "Φ.org.eolang.just-prints-warning.φ.α0.α0.ρ");
            ret_1_1_base = new PhWith(ret_1_1_base, "Δ", new Data.Value<>(2L));
          Phi ret_1_1 = new PhMethod(ret_1_1_base, "times");
            ret_1_1 = new PhLocated(ret_1_1, 33, 7, "Φ.org.eolang.just-prints-warning.φ.α0.α0");
          ret_1_1 = new PhCopy(ret_1_1);
            Phi ret_1_1_1 = new EOorg.EOeolang.EOint(Phi.Φ);
              ret_1_1_1 = new PhLocated(ret_1_1_1, 33, 14, "Φ.org.eolang.just-prints-warning.φ.α0.α0.α0");
              ret_1_1_1 = new PhWith(ret_1_1_1, "Δ", new Data.Value<>(2L));
            ret_1_1 = new PhWith(ret_1_1, 0, ret_1_1_1);
          Phi ret_1_2 = new EOorg.EOeolang.EOstring(Phi.Φ);
            ret_1_2 = new PhLocated(ret_1_2, 34, 6, "Φ.org.eolang.just-prints-warning.φ.α0.α1");
            ret_1_2 = new PhWith(ret_1_2, "Δ", new Data.Value<>("warning"));
          Phi ret_1_3 = new EOorg.EOeolang.EOstring(Phi.Φ);
            ret_1_3 = new PhLocated(ret_1_3, 35, 6, "Φ.org.eolang.just-prints-warning.φ.α0.α2");
            ret_1_3 = new PhWith(ret_1_3, "Δ", new Data.Value<>("This method is deprecated!"));
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
          ret_1 = new PhWith(ret_1, 1, ret_1_2);
          ret_1 = new PhWith(ret_1, 2, ret_1_3);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 36, 4, "Φ.org.eolang.just-prints-warning.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 36, 5, "Φ.org.eolang.just-prints-warning.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 36, 15, "Φ.org.eolang.just-prints-warning.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(4L));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOjust_prints_warningTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
