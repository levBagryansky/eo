
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="36" loc="Φ.org.eolang.nop-is-true-despite-arguments" name="nop-is-true-despite-arguments" original-name="nop-is-true-despite-arguments" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="37" loc="Φ.org.eolang.nop-is-true-despite-arguments.φ" name="@" pos="2"> 
//     <o base="org.eolang.nop" line="38" loc="Φ.org.eolang.nop-is-true-despite-arguments.φ.α0" pos="4"> 
//       <o base="org.eolang.string" data="string" line="39" loc="Φ.org.eolang.nop-is-true-despite-arguments.φ.α0.α0" pos="6">abc</o>
//       <o base="org.eolang.int" data="int" line="40" loc="Φ.org.eolang.nop-is-true-despite-arguments.φ.α0.α1" pos="6">1</o>
//       <o base="org.eolang.float" data="float" line="41" loc="Φ.org.eolang.nop-is-true-despite-arguments.φ.α0.α2" pos="6">1.0</o>
//     </o>
//     <o base=".equal-to" line="42" loc="Φ.org.eolang.nop-is-true-despite-arguments.φ.α1" pos="5"> 
//       <o base="$" line="42" loc="Φ.org.eolang.nop-is-true-despite-arguments.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.bool" data="bool" line="42" loc="Φ.org.eolang.nop-is-true-despite-arguments.φ.α1.α0" pos="15">TRUE</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "nop-is-true-despite-argumentsTest", oname = "nop-is-true-despite-arguments", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/nop-tests.eo")
public final class EOnop_is_true_despite_argumentsTest extends PhDefault {
  public EOnop_is_true_despite_argumentsTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 37, 2, "Φ.org.eolang.nop-is-true-despite-arguments.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("nop").get();
          ret_1 = new PhLocated(ret_1, 38, 4, "Φ.org.eolang.nop-is-true-despite-arguments.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
            ret_1_1 = new PhLocated(ret_1_1, 39, 6, "Φ.org.eolang.nop-is-true-despite-arguments.φ.α0.α0");
            ret_1_1 = new PhWith(ret_1_1, "Δ", new Data.Value<>("abc"));
          Phi ret_1_2 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_2 = new PhLocated(ret_1_2, 40, 6, "Φ.org.eolang.nop-is-true-despite-arguments.φ.α0.α1");
            ret_1_2 = new PhWith(ret_1_2, "Δ", new Data.Value<>(1L));
          Phi ret_1_3 = new EOorg.EOeolang.EOfloat(Phi.Φ);
            ret_1_3 = new PhLocated(ret_1_3, 41, 6, "Φ.org.eolang.nop-is-true-despite-arguments.φ.α0.α2");
            ret_1_3 = new PhWith(ret_1_3, "Δ", new Data.Value<>(1.0d));
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
          ret_1 = new PhWith(ret_1, 1, ret_1_2);
          ret_1 = new PhWith(ret_1, 2, ret_1_3);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 42, 4, "Φ.org.eolang.nop-is-true-despite-arguments.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 42, 5, "Φ.org.eolang.nop-is-true-despite-arguments.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EObool(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 42, 15, "Φ.org.eolang.nop-is-true-despite-arguments.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(Boolean.TRUE));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOnop_is_true_despite_argumentsTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
