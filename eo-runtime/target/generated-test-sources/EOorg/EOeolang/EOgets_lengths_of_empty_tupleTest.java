
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="147" loc="Φ.org.eolang.gets-lengths-of-empty-tuple" name="gets-lengths-of-empty-tuple" original-name="gets-lengths-of-empty-tuple" pos="0"> 
//   <o base="org.eolang.tuple" line="148" loc="Φ.org.eolang.gets-lengths-of-empty-tuple.a" name="a" pos="2"/>
//   <o base=".eq" line="149" loc="Φ.org.eolang.gets-lengths-of-empty-tuple.φ" name="@" pos="2"> 
//     <o base=".length" line="150" loc="Φ.org.eolang.gets-lengths-of-empty-tuple.φ.ρ" pos="5"> 
//       <o base="a" line="150" loc="Φ.org.eolang.gets-lengths-of-empty-tuple.φ.ρ.ρ" pos="4" ref="148"/>
//     </o>
//     <o base="org.eolang.int" data="int" line="151" loc="Φ.org.eolang.gets-lengths-of-empty-tuple.φ.α0" pos="4">0</o>
//   </o>
// </o>
@XmirObject(name = "gets-lengths-of-empty-tupleTest", oname = "gets-lengths-of-empty-tuple", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/tuple-tests.eo")
public final class EOgets_lengths_of_empty_tupleTest extends PhDefault {
    
  public EOgets_lengths_of_empty_tupleTest() {
    this.add("a", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("tuple").get();
        ret = new PhLocated(ret, 148, 2, "Φ.org.eolang.gets-lengths-of-empty-tuple.a");
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new PhMethod(rho, "a");
        ret_base_base = new PhLocated(ret_base_base, 150, 4, "Φ.org.eolang.gets-lengths-of-empty-tuple.φ.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "length");
        ret_base = new PhLocated(ret_base, 150, 5, "Φ.org.eolang.gets-lengths-of-empty-tuple.φ.ρ");
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 149, 2, "Φ.org.eolang.gets-lengths-of-empty-tuple.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 151, 4, "Φ.org.eolang.gets-lengths-of-empty-tuple.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(0L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOgets_lengths_of_empty_tupleTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
