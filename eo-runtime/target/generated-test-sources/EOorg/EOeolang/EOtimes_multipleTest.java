
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="256" loc="Φ.org.eolang.times-multiple" name="times-multiple" original-name="times-multiple" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="257" loc="Φ.org.eolang.times-multiple.φ" name="@" pos="2"> 
//     <o base=".times" line="258" loc="Φ.org.eolang.times-multiple.φ.α0" pos="4"> 
//       <o base="org.eolang.float" data="float" line="259" loc="Φ.org.eolang.times-multiple.φ.α0.ρ" pos="6">-0.5745</o>
//       <o base="org.eolang.float" data="float" line="260" loc="Φ.org.eolang.times-multiple.φ.α0.α0" pos="6">0.311985</o>
//       <o base="org.eolang.float" data="float" line="261" loc="Φ.org.eolang.times-multiple.φ.α0.α1" pos="6">3.232</o>
//       <o base="org.eolang.float" data="float" line="262" loc="Φ.org.eolang.times-multiple.φ.α0.α2" pos="6">-2.532</o>
//     </o>
//     <o base=".equal-to" line="263" loc="Φ.org.eolang.times-multiple.φ.α1" pos="5"> 
//       <o base="$" line="263" loc="Φ.org.eolang.times-multiple.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.float" data="float" line="263" loc="Φ.org.eolang.times-multiple.φ.α1.α0" pos="15">1.4667591307996803</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "times-multipleTest", oname = "times-multiple", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/float-tests.eo")
public final class EOtimes_multipleTest extends PhDefault {
  public EOtimes_multipleTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 257, 2, "Φ.org.eolang.times-multiple.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new EOorg.EOeolang.EOfloat(Phi.Φ);
          ret_1_base = new PhLocated(ret_1_base, 259, 6, "Φ.org.eolang.times-multiple.φ.α0.ρ");
          ret_1_base = new PhWith(ret_1_base, "Δ", new Data.Value<>(-0.5745d));
        Phi ret_1 = new PhMethod(ret_1_base, "times");
          ret_1 = new PhLocated(ret_1, 258, 4, "Φ.org.eolang.times-multiple.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOorg.EOeolang.EOfloat(Phi.Φ);
            ret_1_1 = new PhLocated(ret_1_1, 260, 6, "Φ.org.eolang.times-multiple.φ.α0.α0");
            ret_1_1 = new PhWith(ret_1_1, "Δ", new Data.Value<>(0.311985d));
          Phi ret_1_2 = new EOorg.EOeolang.EOfloat(Phi.Φ);
            ret_1_2 = new PhLocated(ret_1_2, 261, 6, "Φ.org.eolang.times-multiple.φ.α0.α1");
            ret_1_2 = new PhWith(ret_1_2, "Δ", new Data.Value<>(3.232d));
          Phi ret_1_3 = new EOorg.EOeolang.EOfloat(Phi.Φ);
            ret_1_3 = new PhLocated(ret_1_3, 262, 6, "Φ.org.eolang.times-multiple.φ.α0.α2");
            ret_1_3 = new PhWith(ret_1_3, "Δ", new Data.Value<>(-2.532d));
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
          ret_1 = new PhWith(ret_1, 1, ret_1_2);
          ret_1 = new PhWith(ret_1, 2, ret_1_3);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 263, 4, "Φ.org.eolang.times-multiple.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 263, 5, "Φ.org.eolang.times-multiple.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EOfloat(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 263, 15, "Φ.org.eolang.times-multiple.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(1.4667591307996803d));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOtimes_multipleTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
