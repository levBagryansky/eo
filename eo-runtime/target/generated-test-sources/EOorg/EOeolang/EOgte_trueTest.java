
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="85" loc="Φ.org.eolang.gte-true" name="gte-true" original-name="gte-true" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="86" loc="Φ.org.eolang.gte-true.φ" name="@" pos="2"> 
//     <o base=".gte" line="87" loc="Φ.org.eolang.gte-true.φ.α0" pos="4"> 
//       <o base="org.eolang.float" data="float" line="88" loc="Φ.org.eolang.gte-true.φ.α0.ρ" pos="6">-1000.1</o>
//       <o base="org.eolang.float" data="float" line="89" loc="Φ.org.eolang.gte-true.φ.α0.α0" pos="6">-1100.1</o>
//     </o>
//     <o base=".equal-to" line="90" loc="Φ.org.eolang.gte-true.φ.α1" pos="5"> 
//       <o base="$" line="90" loc="Φ.org.eolang.gte-true.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.bool" data="bool" line="90" loc="Φ.org.eolang.gte-true.φ.α1.α0" pos="15">TRUE</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "gte-trueTest", oname = "gte-true", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/float-tests.eo")
public final class EOgte_trueTest extends PhDefault {
  public EOgte_trueTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 86, 2, "Φ.org.eolang.gte-true.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new EOorg.EOeolang.EOfloat(Phi.Φ);
          ret_1_base = new PhLocated(ret_1_base, 88, 6, "Φ.org.eolang.gte-true.φ.α0.ρ");
          ret_1_base = new PhWith(ret_1_base, "Δ", new Data.Value<>(-1000.1d));
        Phi ret_1 = new PhMethod(ret_1_base, "gte");
          ret_1 = new PhLocated(ret_1, 87, 4, "Φ.org.eolang.gte-true.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOorg.EOeolang.EOfloat(Phi.Φ);
            ret_1_1 = new PhLocated(ret_1_1, 89, 6, "Φ.org.eolang.gte-true.φ.α0.α0");
            ret_1_1 = new PhWith(ret_1_1, "Δ", new Data.Value<>(-1100.1d));
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 90, 4, "Φ.org.eolang.gte-true.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 90, 5, "Φ.org.eolang.gte-true.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EObool(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 90, 15, "Φ.org.eolang.gte-true.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(Boolean.TRUE));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOgte_trueTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
