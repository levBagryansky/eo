
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="90" loc="Φ.org.eolang.negative-infinity-lt-float" name="negative-infinity-lt-float" original-name="negative-infinity-lt-float" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="91" loc="Φ.org.eolang.negative-infinity-lt-float.φ" name="@" pos="2"> 
//     <o base="org.eolang.negative-infinity" line="92" loc="Φ.org.eolang.negative-infinity-lt-float.φ.α0" pos="4"/>
//     <o base=".less-than" line="93" loc="Φ.org.eolang.negative-infinity-lt-float.φ.α1" pos="5"> 
//       <o base="$" line="93" loc="Φ.org.eolang.negative-infinity-lt-float.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.float" data="float" line="93" loc="Φ.org.eolang.negative-infinity-lt-float.φ.α1.α0" pos="16">42.5</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "negative-infinity-lt-floatTest", oname = "negative-infinity-lt-float", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/negative-infinity-tests.eo")
public final class EOnegative_infinity_lt_floatTest extends PhDefault {
  public EOnegative_infinity_lt_floatTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 91, 2, "Φ.org.eolang.negative-infinity-lt-float.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("negative-infinity").get();
          ret_1 = new PhLocated(ret_1, 92, 4, "Φ.org.eolang.negative-infinity-lt-float.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 93, 4, "Φ.org.eolang.negative-infinity-lt-float.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "less-than");
          ret_2 = new PhLocated(ret_2, 93, 5, "Φ.org.eolang.negative-infinity-lt-float.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EOfloat(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 93, 16, "Φ.org.eolang.negative-infinity-lt-float.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(42.5d));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOnegative_infinity_lt_floatTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
