
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="186" loc="Φ.org.eolang.gets-lengths-of-empty-tuple-asterisk" name="gets-lengths-of-empty-tuple-asterisk" original-name="gets-lengths-of-empty-tuple-asterisk" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="187" loc="Φ.org.eolang.gets-lengths-of-empty-tuple-asterisk.φ" name="@" pos="2"> 
//     <o base=".length" line="188" loc="Φ.org.eolang.gets-lengths-of-empty-tuple-asterisk.φ.α0" pos="5"> 
//       <o base="org.eolang.tuple" data="tuple" line="188" loc="Φ.org.eolang.gets-lengths-of-empty-tuple-asterisk.φ.α0.ρ" pos="4"/>
//     </o>
//     <o base=".equal-to" line="189" loc="Φ.org.eolang.gets-lengths-of-empty-tuple-asterisk.φ.α1" pos="5"> 
//       <o base="$" line="189" loc="Φ.org.eolang.gets-lengths-of-empty-tuple-asterisk.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.int" data="int" line="189" loc="Φ.org.eolang.gets-lengths-of-empty-tuple-asterisk.φ.α1.α0" pos="15">0</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "gets-lengths-of-empty-tuple-asteriskTest", oname = "gets-lengths-of-empty-tuple-asterisk", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/tuple-tests.eo")
public final class EOgets_lengths_of_empty_tuple_asteriskTest extends PhDefault {
  public EOgets_lengths_of_empty_tuple_asteriskTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 187, 2, "Φ.org.eolang.gets-lengths-of-empty-tuple-asterisk.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("tuple").get();
          ret_1_base = new PhLocated(ret_1_base, 188, 4, "Φ.org.eolang.gets-lengths-of-empty-tuple-asterisk.φ.α0.ρ");
          Phi[] ret_1_base_a = new Phi[0];
          ret_1_base = new PhWith(new PhCopy(ret_1_base), "Δ", new Data.Value<Phi[]>(ret_1_base_a));
        Phi ret_1 = new PhMethod(ret_1_base, "length");
          ret_1 = new PhLocated(ret_1, 188, 5, "Φ.org.eolang.gets-lengths-of-empty-tuple-asterisk.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 189, 4, "Φ.org.eolang.gets-lengths-of-empty-tuple-asterisk.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 189, 5, "Φ.org.eolang.gets-lengths-of-empty-tuple-asterisk.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 189, 15, "Φ.org.eolang.gets-lengths-of-empty-tuple-asterisk.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(0L));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOgets_lengths_of_empty_tuple_asteriskTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
