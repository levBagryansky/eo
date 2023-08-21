
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="127" loc="Φ.org.eolang.nan-neg-is-nan" name="nan-neg-is-nan" original-name="nan-neg-is-nan" pos="0"> 
//   <o base="org.eolang.nan" const="" line="128" loc="Φ.org.eolang.nan-neg-is-nan.not-a-number" name="not-a-number" pos="2"/>
//   <o base="org.eolang.hamcrest.assert-that" line="129" loc="Φ.org.eolang.nan-neg-is-nan.φ" name="@" pos="2"> 
//     <o base=".as-bytes" line="130" loc="Φ.org.eolang.nan-neg-is-nan.φ.α0" pos="20"> 
//       <o base=".neg" line="130" loc="Φ.org.eolang.nan-neg-is-nan.φ.α0.ρ" pos="16"> 
//         <o base="not-a-number" line="130" loc="Φ.org.eolang.nan-neg-is-nan.φ.α0.ρ.ρ" pos="4" ref="128"/>
//       </o>
//     </o>
//     <o base=".equal-to" line="131" loc="Φ.org.eolang.nan-neg-is-nan.φ.α1" pos="5"> 
//       <o base="$" line="131" loc="Φ.org.eolang.nan-neg-is-nan.φ.α1.ρ" pos="4"/>
//       <o base=".as-bytes" line="131" loc="Φ.org.eolang.nan-neg-is-nan.φ.α1.α0" pos="27"> 
//         <o base="not-a-number" line="131" loc="Φ.org.eolang.nan-neg-is-nan.φ.α1.α0.ρ" pos="15" ref="128"/>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "nan-neg-is-nanTest", oname = "nan-neg-is-nan", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/nan-tests.eo")
public final class EOnan_neg_is_nanTest extends PhDefault {
  public EOnan_neg_is_nanTest() {
    this.add("not-a-number", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("nan").get();
        ret = new PhLocated(ret, 128, 2, "Φ.org.eolang.nan-neg-is-nan.not-a-number");
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 129, 2, "Φ.org.eolang.nan-neg-is-nan.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base_base = new PhMethod(rho, "not-a-number");
          ret_1_base_base = new PhLocated(ret_1_base_base, 130, 4, "Φ.org.eolang.nan-neg-is-nan.φ.α0.ρ.ρ");
        Phi ret_1_base = new PhMethod(ret_1_base_base, "neg");
          ret_1_base = new PhLocated(ret_1_base, 130, 16, "Φ.org.eolang.nan-neg-is-nan.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "as-bytes");
          ret_1 = new PhLocated(ret_1, 130, 20, "Φ.org.eolang.nan-neg-is-nan.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 131, 4, "Φ.org.eolang.nan-neg-is-nan.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 131, 5, "Φ.org.eolang.nan-neg-is-nan.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = new PhMethod(rho, "not-a-number");
            ret_2_1_base = new PhLocated(ret_2_1_base, 131, 15, "Φ.org.eolang.nan-neg-is-nan.φ.α1.α0.ρ");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "as-bytes");
            ret_2_1 = new PhLocated(ret_2_1, 131, 27, "Φ.org.eolang.nan-neg-is-nan.φ.α1.α0");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOnan_neg_is_nanTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}