
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="322" loc="Φ.org.eolang.minus-multiple-args" name="minus-multiple-args" original-name="minus-multiple-args" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="323" loc="Φ.org.eolang.minus-multiple-args.φ" name="@" pos="2"> 
//     <o base=".minus" line="324" loc="Φ.org.eolang.minus-multiple-args.φ.α0" pos="7"> 
//       <o base="org.eolang.int" data="int" line="324" loc="Φ.org.eolang.minus-multiple-args.φ.α0.ρ" pos="4">123</o>
//       <o base="org.eolang.int" data="int" line="324" loc="Φ.org.eolang.minus-multiple-args.φ.α0.α0" pos="14">-12</o>
//       <o base="org.eolang.int" data="int" line="324" loc="Φ.org.eolang.minus-multiple-args.φ.α0.α1" pos="18">135</o>
//       <o base="org.eolang.int" data="int" line="324" loc="Φ.org.eolang.minus-multiple-args.φ.α0.α2" pos="22">235</o>
//       <o base="org.eolang.int" data="int" line="324" loc="Φ.org.eolang.minus-multiple-args.φ.α0.α3" pos="26">0</o>
//     </o>
//     <o base=".equal-to" line="325" loc="Φ.org.eolang.minus-multiple-args.φ.α1" pos="5"> 
//       <o base="$" line="325" loc="Φ.org.eolang.minus-multiple-args.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.int" data="int" line="325" loc="Φ.org.eolang.minus-multiple-args.φ.α1.α0" pos="15">-235</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "minus-multiple-argsTest", oname = "minus-multiple-args", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/int-tests.eo")
public final class EOminus_multiple_argsTest extends PhDefault {
  public EOminus_multiple_argsTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 323, 2, "Φ.org.eolang.minus-multiple-args.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1_base = new PhLocated(ret_1_base, 324, 4, "Φ.org.eolang.minus-multiple-args.φ.α0.ρ");
          ret_1_base = new PhWith(ret_1_base, "Δ", new Data.Value<>(123L));
        Phi ret_1 = new PhMethod(ret_1_base, "minus");
          ret_1 = new PhLocated(ret_1, 324, 7, "Φ.org.eolang.minus-multiple-args.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_1 = new PhLocated(ret_1_1, 324, 14, "Φ.org.eolang.minus-multiple-args.φ.α0.α0");
            ret_1_1 = new PhWith(ret_1_1, "Δ", new Data.Value<>(-12L));
          Phi ret_1_2 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_2 = new PhLocated(ret_1_2, 324, 18, "Φ.org.eolang.minus-multiple-args.φ.α0.α1");
            ret_1_2 = new PhWith(ret_1_2, "Δ", new Data.Value<>(135L));
          Phi ret_1_3 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_3 = new PhLocated(ret_1_3, 324, 22, "Φ.org.eolang.minus-multiple-args.φ.α0.α2");
            ret_1_3 = new PhWith(ret_1_3, "Δ", new Data.Value<>(235L));
          Phi ret_1_4 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_4 = new PhLocated(ret_1_4, 324, 26, "Φ.org.eolang.minus-multiple-args.φ.α0.α3");
            ret_1_4 = new PhWith(ret_1_4, "Δ", new Data.Value<>(0L));
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
          ret_1 = new PhWith(ret_1, 1, ret_1_2);
          ret_1 = new PhWith(ret_1, 2, ret_1_3);
          ret_1 = new PhWith(ret_1, 3, ret_1_4);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 325, 4, "Φ.org.eolang.minus-multiple-args.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 325, 5, "Φ.org.eolang.minus-multiple-args.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 325, 15, "Φ.org.eolang.minus-multiple-args.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(-235L));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOminus_multiple_argsTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
