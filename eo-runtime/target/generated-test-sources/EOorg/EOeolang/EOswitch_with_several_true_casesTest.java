
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="56" loc="Φ.org.eolang.switch-with-several-true-cases" name="switch-with-several-true-cases" original-name="switch-with-several-true-cases" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="57" loc="Φ.org.eolang.switch-with-several-true-cases.φ" name="@" pos="2"> 
//     <o base="org.eolang.switch" line="58" loc="Φ.org.eolang.switch-with-several-true-cases.φ.α0" pos="4"> 
//       <o base="org.eolang.tuple" data="tuple" line="59" loc="Φ.org.eolang.switch-with-several-true-cases.φ.α0.α0" pos="6"> 
//         <o base="org.eolang.bool" data="bool" line="60" loc="Φ.org.eolang.switch-with-several-true-cases.φ.α0.α0.α0" pos="8">TRUE</o>
//         <o base="org.eolang.string" data="string" line="61" loc="Φ.org.eolang.switch-with-several-true-cases.φ.α0.α0.α1" pos="8">TRUE1</o>
//       </o>
//       <o base="org.eolang.tuple" data="tuple" line="62" loc="Φ.org.eolang.switch-with-several-true-cases.φ.α0.α1" pos="6"> 
//         <o base="org.eolang.bool" data="bool" line="63" loc="Φ.org.eolang.switch-with-several-true-cases.φ.α0.α1.α0" pos="8">FALSE</o>
//         <o base="org.eolang.string" data="string" line="64" loc="Φ.org.eolang.switch-with-several-true-cases.φ.α0.α1.α1" pos="8">FALSE</o>
//       </o>
//       <o base="org.eolang.tuple" data="tuple" line="65" loc="Φ.org.eolang.switch-with-several-true-cases.φ.α0.α2" pos="6"> 
//         <o base="org.eolang.bool" data="bool" line="66" loc="Φ.org.eolang.switch-with-several-true-cases.φ.α0.α2.α0" pos="8">TRUE</o>
//         <o base="org.eolang.string" data="string" line="67" loc="Φ.org.eolang.switch-with-several-true-cases.φ.α0.α2.α1" pos="8">TRUE2</o>
//       </o>
//     </o>
//     <o base=".equal-to" line="68" loc="Φ.org.eolang.switch-with-several-true-cases.φ.α1" pos="5"> 
//       <o base="$" line="68" loc="Φ.org.eolang.switch-with-several-true-cases.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.string" data="string" line="68" loc="Φ.org.eolang.switch-with-several-true-cases.φ.α1.α0" pos="15">TRUE1</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "switch-with-several-true-casesTest", oname = "switch-with-several-true-cases", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/switch-tests.eo")
public final class EOswitch_with_several_true_casesTest extends PhDefault {
  public EOswitch_with_several_true_casesTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 57, 2, "Φ.org.eolang.switch-with-several-true-cases.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("switch").get();
          ret_1 = new PhLocated(ret_1, 58, 4, "Φ.org.eolang.switch-with-several-true-cases.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("tuple").get();
            ret_1_1 = new PhLocated(ret_1_1, 59, 6, "Φ.org.eolang.switch-with-several-true-cases.φ.α0.α0");
            Phi[] ret_1_1_a = new Phi[2];
            Phi ret_1_1_a0 = new EOorg.EOeolang.EObool(Phi.Φ);
              ret_1_1_a0 = new PhLocated(ret_1_1_a0, 60, 8, "Φ.org.eolang.switch-with-several-true-cases.φ.α0.α0.α0");
              ret_1_1_a0 = new PhWith(ret_1_1_a0, "Δ", new Data.Value<>(Boolean.TRUE));
            ret_1_1_a[0] = ret_1_1_a0;
            Phi ret_1_1_a1 = new EOorg.EOeolang.EOstring(Phi.Φ);
              ret_1_1_a1 = new PhLocated(ret_1_1_a1, 61, 8, "Φ.org.eolang.switch-with-several-true-cases.φ.α0.α0.α1");
              ret_1_1_a1 = new PhWith(ret_1_1_a1, "Δ", new Data.Value<>("TRUE1"));
            ret_1_1_a[1] = ret_1_1_a1;
            ret_1_1 = new PhWith(new PhCopy(ret_1_1), "Δ", new Data.Value<Phi[]>(ret_1_1_a));
          Phi ret_1_2 = Phi.Φ.attr("org").get().attr("eolang").get().attr("tuple").get();
            ret_1_2 = new PhLocated(ret_1_2, 62, 6, "Φ.org.eolang.switch-with-several-true-cases.φ.α0.α1");
            Phi[] ret_1_2_a = new Phi[2];
            Phi ret_1_2_a0 = new EOorg.EOeolang.EObool(Phi.Φ);
              ret_1_2_a0 = new PhLocated(ret_1_2_a0, 63, 8, "Φ.org.eolang.switch-with-several-true-cases.φ.α0.α1.α0");
              ret_1_2_a0 = new PhWith(ret_1_2_a0, "Δ", new Data.Value<>(Boolean.FALSE));
            ret_1_2_a[0] = ret_1_2_a0;
            Phi ret_1_2_a1 = new EOorg.EOeolang.EOstring(Phi.Φ);
              ret_1_2_a1 = new PhLocated(ret_1_2_a1, 64, 8, "Φ.org.eolang.switch-with-several-true-cases.φ.α0.α1.α1");
              ret_1_2_a1 = new PhWith(ret_1_2_a1, "Δ", new Data.Value<>("FALSE"));
            ret_1_2_a[1] = ret_1_2_a1;
            ret_1_2 = new PhWith(new PhCopy(ret_1_2), "Δ", new Data.Value<Phi[]>(ret_1_2_a));
          Phi ret_1_3 = Phi.Φ.attr("org").get().attr("eolang").get().attr("tuple").get();
            ret_1_3 = new PhLocated(ret_1_3, 65, 6, "Φ.org.eolang.switch-with-several-true-cases.φ.α0.α2");
            Phi[] ret_1_3_a = new Phi[2];
            Phi ret_1_3_a0 = new EOorg.EOeolang.EObool(Phi.Φ);
              ret_1_3_a0 = new PhLocated(ret_1_3_a0, 66, 8, "Φ.org.eolang.switch-with-several-true-cases.φ.α0.α2.α0");
              ret_1_3_a0 = new PhWith(ret_1_3_a0, "Δ", new Data.Value<>(Boolean.TRUE));
            ret_1_3_a[0] = ret_1_3_a0;
            Phi ret_1_3_a1 = new EOorg.EOeolang.EOstring(Phi.Φ);
              ret_1_3_a1 = new PhLocated(ret_1_3_a1, 67, 8, "Φ.org.eolang.switch-with-several-true-cases.φ.α0.α2.α1");
              ret_1_3_a1 = new PhWith(ret_1_3_a1, "Δ", new Data.Value<>("TRUE2"));
            ret_1_3_a[1] = ret_1_3_a1;
            ret_1_3 = new PhWith(new PhCopy(ret_1_3), "Δ", new Data.Value<Phi[]>(ret_1_3_a));
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
          ret_1 = new PhWith(ret_1, 1, ret_1_2);
          ret_1 = new PhWith(ret_1, 2, ret_1_3);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 68, 4, "Φ.org.eolang.switch-with-several-true-cases.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 68, 5, "Φ.org.eolang.switch-with-several-true-cases.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 68, 15, "Φ.org.eolang.switch-with-several-true-cases.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>("TRUE1"));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOswitch_with_several_true_casesTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
