
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="366" loc="Φ.org.eolang.concat-strings" name="concat-strings" original-name="concat-strings" pos="0"> 
//   <o base=".concat" line="367" loc="Φ.org.eolang.concat-strings.s-bytes" name="s-bytes" pos="2"> 
//     <o base=".as-bytes" line="368" loc="Φ.org.eolang.concat-strings.s-bytes.ρ" pos="12"> 
//       <o base="org.eolang.string" data="string" line="368" loc="Φ.org.eolang.concat-strings.s-bytes.ρ.ρ" pos="4">hello</o>
//     </o>
//     <o base=".as-bytes" line="369" loc="Φ.org.eolang.concat-strings.s-bytes.α0" pos="11"> 
//       <o base="org.eolang.string" data="string" line="369" loc="Φ.org.eolang.concat-strings.s-bytes.α0.ρ" pos="4">world</o>
//     </o>
//   </o>
//   <o base="org.eolang.hamcrest.assert-that" line="370" loc="Φ.org.eolang.concat-strings.φ" name="@" pos="2"> 
//     <o base=".as-string" line="371" loc="Φ.org.eolang.concat-strings.φ.α0" pos="4"> 
//       <o base="s-bytes" line="372" loc="Φ.org.eolang.concat-strings.φ.α0.ρ" pos="6" ref="367"/>
//     </o>
//     <o base=".is" line="373" loc="Φ.org.eolang.concat-strings.φ.α1" pos="5"> 
//       <o base="$" line="373" loc="Φ.org.eolang.concat-strings.φ.α1.ρ" pos="4"/>
//       <o base=".equal-to" line="374" loc="Φ.org.eolang.concat-strings.φ.α1.α0" pos="7"> 
//         <o base="$" line="374" loc="Φ.org.eolang.concat-strings.φ.α1.α0.ρ" pos="6"/>
//         <o base="org.eolang.string" data="string" line="375" loc="Φ.org.eolang.concat-strings.φ.α1.α0.α0" pos="8">hello world</o>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "concat-stringsTest", oname = "concat-strings", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bytes-tests.eo")
public final class EOconcat_stringsTest extends PhDefault {
  public EOconcat_stringsTest() {
    this.add("s-bytes", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new EOorg.EOeolang.EOstring(Phi.Φ);
        ret_base_base = new PhLocated(ret_base_base, 368, 4, "Φ.org.eolang.concat-strings.s-bytes.ρ.ρ");
        ret_base_base = new PhWith(ret_base_base, "Δ", new Data.Value<>("hello "));
      Phi ret_base = new PhMethod(ret_base_base, "as-bytes");
        ret_base = new PhLocated(ret_base, 368, 12, "Φ.org.eolang.concat-strings.s-bytes.ρ");
      Phi ret = new PhMethod(ret_base, "concat");
        ret = new PhLocated(ret, 367, 2, "Φ.org.eolang.concat-strings.s-bytes");
      ret = new PhCopy(ret);
        Phi ret_1_base = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_1_base = new PhLocated(ret_1_base, 369, 4, "Φ.org.eolang.concat-strings.s-bytes.α0.ρ");
          ret_1_base = new PhWith(ret_1_base, "Δ", new Data.Value<>("world"));
        Phi ret_1 = new PhMethod(ret_1_base, "as-bytes");
          ret_1 = new PhLocated(ret_1, 369, 11, "Φ.org.eolang.concat-strings.s-bytes.α0");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 370, 2, "Φ.org.eolang.concat-strings.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(rho, "s-bytes");
          ret_1_base = new PhLocated(ret_1_base, 372, 6, "Φ.org.eolang.concat-strings.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "as-string");
          ret_1 = new PhLocated(ret_1, 371, 4, "Φ.org.eolang.concat-strings.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 373, 4, "Φ.org.eolang.concat-strings.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "is");
          ret_2 = new PhLocated(ret_2, 373, 5, "Φ.org.eolang.concat-strings.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = rho;
            ret_2_1_base = new PhLocated(ret_2_1_base, 374, 6, "Φ.org.eolang.concat-strings.φ.α1.α0.ρ");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "equal-to");
            ret_2_1 = new PhLocated(ret_2_1, 374, 7, "Φ.org.eolang.concat-strings.φ.α1.α0");
          ret_2_1 = new PhCopy(ret_2_1);
            Phi ret_2_1_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
              ret_2_1_1 = new PhLocated(ret_2_1_1, 375, 8, "Φ.org.eolang.concat-strings.φ.α1.α0.α0");
              ret_2_1_1 = new PhWith(ret_2_1_1, "Δ", new Data.Value<>("hello world"));
            ret_2_1 = new PhWith(ret_2_1, 0, ret_2_1_1);
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOconcat_stringsTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
