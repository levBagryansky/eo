
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="78" loc="Φ.org.eolang.leq-false" name="leq-false" original-name="leq-false" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="79" loc="Φ.org.eolang.leq-false.φ" name="@" pos="2"> 
//     <o base=".lte" line="80" loc="Φ.org.eolang.leq-false.φ.α0" pos="4"> 
//       <o base="org.eolang.float" data="float" line="81" loc="Φ.org.eolang.leq-false.φ.α0.ρ" pos="6">0.9</o>
//       <o base="org.eolang.float" data="float" line="82" loc="Φ.org.eolang.leq-false.φ.α0.α0" pos="6">-10.11</o>
//     </o>
//     <o base=".equal-to" line="83" loc="Φ.org.eolang.leq-false.φ.α1" pos="5"> 
//       <o base="$" line="83" loc="Φ.org.eolang.leq-false.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.bool" data="bool" line="83" loc="Φ.org.eolang.leq-false.φ.α1.α0" pos="15">FALSE</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "leq-falseTest", oname = "leq-false", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/float-tests.eo")
public final class EOleq_falseTest extends PhDefault {
  public EOleq_falseTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 79, 2, "Φ.org.eolang.leq-false.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new EOorg.EOeolang.EOfloat(Phi.Φ);
          ret_1_base = new PhLocated(ret_1_base, 81, 6, "Φ.org.eolang.leq-false.φ.α0.ρ");
          ret_1_base = new PhWith(ret_1_base, "Δ", new Data.Value<>(0.9d));
        Phi ret_1 = new PhMethod(ret_1_base, "lte");
          ret_1 = new PhLocated(ret_1, 80, 4, "Φ.org.eolang.leq-false.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOorg.EOeolang.EOfloat(Phi.Φ);
            ret_1_1 = new PhLocated(ret_1_1, 82, 6, "Φ.org.eolang.leq-false.φ.α0.α0");
            ret_1_1 = new PhWith(ret_1_1, "Δ", new Data.Value<>(-10.11d));
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 83, 4, "Φ.org.eolang.leq-false.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 83, 5, "Φ.org.eolang.leq-false.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EObool(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 83, 15, "Φ.org.eolang.leq-false.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(Boolean.FALSE));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOleq_falseTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
