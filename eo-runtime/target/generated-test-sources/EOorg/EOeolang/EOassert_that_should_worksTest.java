
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="38" loc="Φ.org.eolang.assert-that-should-works" name="assert-that-should-works" original-name="assert-that-should-works" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="39" loc="Φ.org.eolang.assert-that-should-works.φ" name="@" pos="2"> 
//     <o base="org.eolang.string" data="string" line="40" loc="Φ.org.eolang.assert-that-should-works.φ.α0" pos="4">anything</o>
//     <o base=".is" line="41" loc="Φ.org.eolang.assert-that-should-works.φ.α1" pos="5"> 
//       <o base="$" line="41" loc="Φ.org.eolang.assert-that-should-works.φ.α1.ρ" pos="4"/>
//       <o base=".anything" line="42" loc="Φ.org.eolang.assert-that-should-works.φ.α1.α0" pos="7"> 
//         <o base="$" line="42" loc="Φ.org.eolang.assert-that-should-works.φ.α1.α0.ρ" pos="6"/>
//       </o>
//     </o>
//     <o base="org.eolang.string" data="string" line="43" loc="Φ.org.eolang.assert-that-should-works.φ.α2" pos="4">assert that should works with tests</o>
//   </o>
// </o>
@XmirObject(name = "assert-that-should-worksTest", oname = "assert-that-should-works", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/unit-tests.eo")
public final class EOassert_that_should_worksTest extends PhDefault {
  public EOassert_that_should_worksTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 39, 2, "Φ.org.eolang.assert-that-should-works.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 40, 4, "Φ.org.eolang.assert-that-should-works.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>("anything"));
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 41, 4, "Φ.org.eolang.assert-that-should-works.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "is");
          ret_2 = new PhLocated(ret_2, 41, 5, "Φ.org.eolang.assert-that-should-works.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = rho;
            ret_2_1_base = new PhLocated(ret_2_1_base, 42, 6, "Φ.org.eolang.assert-that-should-works.φ.α1.α0.ρ");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "anything");
            ret_2_1 = new PhLocated(ret_2_1, 42, 7, "Φ.org.eolang.assert-that-should-works.φ.α1.α0");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        Phi ret_3 = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_3 = new PhLocated(ret_3, 43, 4, "Φ.org.eolang.assert-that-should-works.φ.α2");
          ret_3 = new PhWith(ret_3, "Δ", new Data.Value<>("assert that should works with tests"));
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
        ret = new PhWith(ret, 2, ret_3);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOassert_that_should_worksTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
