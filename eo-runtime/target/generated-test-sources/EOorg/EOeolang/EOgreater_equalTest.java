
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="58" loc="Φ.org.eolang.greater-equal" name="greater-equal" original-name="greater-equal" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="59" loc="Φ.org.eolang.greater-equal.φ" name="@" pos="2"> 
//     <o base="org.eolang.float" data="float" line="60" loc="Φ.org.eolang.greater-equal.φ.α0" pos="4">0.7</o>
//     <o base=".not" line="61" loc="Φ.org.eolang.greater-equal.φ.α1" pos="5"> 
//       <o base="$" line="61" loc="Φ.org.eolang.greater-equal.φ.α1.ρ" pos="4"/>
//       <o base=".greater-than" line="62" loc="Φ.org.eolang.greater-equal.φ.α1.α0" pos="7"> 
//         <o base="$" line="62" loc="Φ.org.eolang.greater-equal.φ.α1.α0.ρ" pos="6"/>
//         <o base="org.eolang.float" data="float" line="62" loc="Φ.org.eolang.greater-equal.φ.α1.α0.α0" pos="21">0.7</o>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "greater-equalTest", oname = "greater-equal", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/float-tests.eo")
public final class EOgreater_equalTest extends PhDefault {
  public EOgreater_equalTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 59, 2, "Φ.org.eolang.greater-equal.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOfloat(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 60, 4, "Φ.org.eolang.greater-equal.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(0.7d));
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 61, 4, "Φ.org.eolang.greater-equal.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "not");
          ret_2 = new PhLocated(ret_2, 61, 5, "Φ.org.eolang.greater-equal.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = rho;
            ret_2_1_base = new PhLocated(ret_2_1_base, 62, 6, "Φ.org.eolang.greater-equal.φ.α1.α0.ρ");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "greater-than");
            ret_2_1 = new PhLocated(ret_2_1, 62, 7, "Φ.org.eolang.greater-equal.φ.α1.α0");
          ret_2_1 = new PhCopy(ret_2_1);
            Phi ret_2_1_1 = new EOorg.EOeolang.EOfloat(Phi.Φ);
              ret_2_1_1 = new PhLocated(ret_2_1_1, 62, 21, "Φ.org.eolang.greater-equal.φ.α1.α0.α0");
              ret_2_1_1 = new PhWith(ret_2_1_1, "Δ", new Data.Value<>(0.7d));
            ret_2_1 = new PhWith(ret_2_1, 0, ret_2_1_1);
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOgreater_equalTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
