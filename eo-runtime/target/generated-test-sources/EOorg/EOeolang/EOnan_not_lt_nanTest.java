
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="49" loc="Φ.org.eolang.nan-not-lt-nan" name="nan-not-lt-nan" original-name="nan-not-lt-nan" pos="0"> 
//   <o base="org.eolang.nan" const="" line="50" loc="Φ.org.eolang.nan-not-lt-nan.not-a-number" name="not-a-number" pos="2"/>
//   <o base="org.eolang.hamcrest.assert-that" line="51" loc="Φ.org.eolang.nan-not-lt-nan.φ" name="@" pos="2"> 
//     <o base="not-a-number" line="52" loc="Φ.org.eolang.nan-not-lt-nan.φ.α0" pos="4" ref="50"/>
//     <o base=".not" line="53" loc="Φ.org.eolang.nan-not-lt-nan.φ.α1" pos="5"> 
//       <o base="$" line="53" loc="Φ.org.eolang.nan-not-lt-nan.φ.α1.ρ" pos="4"/>
//       <o base=".less-than" line="54" loc="Φ.org.eolang.nan-not-lt-nan.φ.α1.α0" pos="7"> 
//         <o base="$" line="54" loc="Φ.org.eolang.nan-not-lt-nan.φ.α1.α0.ρ" pos="6"/>
//         <o base="not-a-number" line="54" loc="Φ.org.eolang.nan-not-lt-nan.φ.α1.α0.α0" pos="18" ref="50"/>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "nan-not-lt-nanTest", oname = "nan-not-lt-nan", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/nan-tests.eo")
public final class EOnan_not_lt_nanTest extends PhDefault {
  public EOnan_not_lt_nanTest() {
    this.add("not-a-number", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("nan").get();
        ret = new PhLocated(ret, 50, 2, "Φ.org.eolang.nan-not-lt-nan.not-a-number");
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 51, 2, "Φ.org.eolang.nan-not-lt-nan.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new PhMethod(rho, "not-a-number");
          ret_1 = new PhLocated(ret_1, 52, 4, "Φ.org.eolang.nan-not-lt-nan.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 53, 4, "Φ.org.eolang.nan-not-lt-nan.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "not");
          ret_2 = new PhLocated(ret_2, 53, 5, "Φ.org.eolang.nan-not-lt-nan.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = rho;
            ret_2_1_base = new PhLocated(ret_2_1_base, 54, 6, "Φ.org.eolang.nan-not-lt-nan.φ.α1.α0.ρ");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "less-than");
            ret_2_1 = new PhLocated(ret_2_1, 54, 7, "Φ.org.eolang.nan-not-lt-nan.φ.α1.α0");
          ret_2_1 = new PhCopy(ret_2_1);
            Phi ret_2_1_1 = new PhMethod(rho, "not-a-number");
              ret_2_1_1 = new PhLocated(ret_2_1_1, 54, 18, "Φ.org.eolang.nan-not-lt-nan.φ.α1.α0.α0");
            ret_2_1 = new PhWith(ret_2_1, 0, ret_2_1_1);
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOnan_not_lt_nanTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
