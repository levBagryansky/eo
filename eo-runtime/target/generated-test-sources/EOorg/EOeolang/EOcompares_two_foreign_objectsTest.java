
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="312" loc="Φ.org.eolang.compares-two-foreign-objects" name="compares-two-foreign-objects" original-name="compares-two-foreign-objects" pos="0"> 
//   <o base="org.eolang.nop" line="313" loc="Φ.org.eolang.compares-two-foreign-objects.φ" name="@" pos="2"> 
//     <o base="org.eolang.hamcrest.assert-that" line="314" loc="Φ.org.eolang.compares-two-foreign-objects.φ.α0" pos="4"> 
//       <o base=".<" line="315" loc="Φ.org.eolang.compares-two-foreign-objects.φ.α0.α0" pos="13"> 
//         <o base="org.eolang.txt.sprintf" line="315" loc="Φ.org.eolang.compares-two-foreign-objects.φ.α0.α0.ρ" pos="6"/>
//       </o>
//       <o base=".all-of" line="316" loc="Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1" pos="7"> 
//         <o base="$" line="316" loc="Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.ρ" pos="6"/>
//         <o base=".equal-to" line="317" loc="Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α0" pos="9"> 
//           <o base="$" line="317" loc="Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α0.ρ" pos="8"/>
//           <o base=".<" line="318" loc="Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α0.α0" pos="24"> 
//             <o base=".sprintf" line="318" loc="Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α0.α0.ρ" pos="16"> 
//               <o base=".txt" line="318" loc="Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α0.α0.ρ.ρ" pos="12"> 
//                 <o base=".eolang" line="318" loc="Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α0.α0.ρ.ρ.ρ" pos="10"> 
//                   <o base=".org" line="318" loc="Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α0.α0.ρ.ρ.ρ.ρ" pos="10"> 
//                     <o base="Q" line="318" loc="Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α0.α0.ρ.ρ.ρ.ρ.ρ" pos="10"/>
//                   </o>
//                 </o>
//               </o>
//             </o>
//           </o>
//         </o>
//         <o base=".equal-to" line="319" loc="Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α1" pos="9"> 
//           <o base="$" line="319" loc="Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α1.ρ" pos="8"/>
//           <o base=".<" line="320" loc="Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α1.α0" pos="34"> 
//             <o base=".sprintf" line="320" loc="Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α1.α0.ρ" pos="26"> 
//               <o base=".txt" line="320" loc="Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α1.α0.ρ.ρ" pos="22"> 
//                 <o base=".eolang" line="320" loc="Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α1.α0.ρ.ρ.ρ" pos="15"> 
//                   <o base=".org" line="320" loc="Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α1.α0.ρ.ρ.ρ.ρ" pos="11"> 
//                     <o base="Q" line="320" loc="Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α1.α0.ρ.ρ.ρ.ρ.ρ" pos="10"/>
//                   </o>
//                 </o>
//               </o>
//             </o>
//           </o>
//         </o>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "compares-two-foreign-objectsTest", oname = "compares-two-foreign-objects", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOcompares_two_foreign_objectsTest extends PhDefault {
  public EOcompares_two_foreign_objectsTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("nop").get();
        ret = new PhLocated(ret, 313, 2, "Φ.org.eolang.compares-two-foreign-objects.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
          ret_1 = new PhLocated(ret_1, 314, 4, "Φ.org.eolang.compares-two-foreign-objects.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("txt").get().attr("sprintf").get();
            ret_1_1_base = new PhLocated(ret_1_1_base, 315, 6, "Φ.org.eolang.compares-two-foreign-objects.φ.α0.α0.ρ");
          Phi ret_1_1 = new PhMethod(ret_1_1_base, "ν");
            ret_1_1 = new PhLocated(ret_1_1, 315, 13, "Φ.org.eolang.compares-two-foreign-objects.φ.α0.α0");
          Phi ret_1_2_base = rho;
            ret_1_2_base = new PhLocated(ret_1_2_base, 316, 6, "Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.ρ");
          Phi ret_1_2 = new PhMethod(ret_1_2_base, "all-of");
            ret_1_2 = new PhLocated(ret_1_2, 316, 7, "Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1");
          ret_1_2 = new PhCopy(ret_1_2);
            Phi ret_1_2_1_base = rho;
              ret_1_2_1_base = new PhLocated(ret_1_2_1_base, 317, 8, "Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α0.ρ");
            Phi ret_1_2_1 = new PhMethod(ret_1_2_1_base, "equal-to");
              ret_1_2_1 = new PhLocated(ret_1_2_1, 317, 9, "Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α0");
            ret_1_2_1 = new PhCopy(ret_1_2_1);
              Phi ret_1_2_1_1_base_base_base_base_base = Phi.Φ;
                ret_1_2_1_1_base_base_base_base_base = new PhLocated(ret_1_2_1_1_base_base_base_base_base, 318, 10, "Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α0.α0.ρ.ρ.ρ.ρ.ρ");
              Phi ret_1_2_1_1_base_base_base_base = new PhMethod(ret_1_2_1_1_base_base_base_base_base, "org");
                ret_1_2_1_1_base_base_base_base = new PhLocated(ret_1_2_1_1_base_base_base_base, 318, 10, "Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α0.α0.ρ.ρ.ρ.ρ");
              Phi ret_1_2_1_1_base_base_base = new PhMethod(ret_1_2_1_1_base_base_base_base, "eolang");
                ret_1_2_1_1_base_base_base = new PhLocated(ret_1_2_1_1_base_base_base, 318, 10, "Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α0.α0.ρ.ρ.ρ");
              Phi ret_1_2_1_1_base_base = new PhMethod(ret_1_2_1_1_base_base_base, "txt");
                ret_1_2_1_1_base_base = new PhLocated(ret_1_2_1_1_base_base, 318, 12, "Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α0.α0.ρ.ρ");
              Phi ret_1_2_1_1_base = new PhMethod(ret_1_2_1_1_base_base, "sprintf");
                ret_1_2_1_1_base = new PhLocated(ret_1_2_1_1_base, 318, 16, "Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α0.α0.ρ");
              Phi ret_1_2_1_1 = new PhMethod(ret_1_2_1_1_base, "ν");
                ret_1_2_1_1 = new PhLocated(ret_1_2_1_1, 318, 24, "Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α0.α0");
              ret_1_2_1 = new PhWith(ret_1_2_1, 0, ret_1_2_1_1);
            Phi ret_1_2_2_base = rho;
              ret_1_2_2_base = new PhLocated(ret_1_2_2_base, 319, 8, "Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α1.ρ");
            Phi ret_1_2_2 = new PhMethod(ret_1_2_2_base, "equal-to");
              ret_1_2_2 = new PhLocated(ret_1_2_2, 319, 9, "Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α1");
            ret_1_2_2 = new PhCopy(ret_1_2_2);
              Phi ret_1_2_2_1_base_base_base_base_base = Phi.Φ;
                ret_1_2_2_1_base_base_base_base_base = new PhLocated(ret_1_2_2_1_base_base_base_base_base, 320, 10, "Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α1.α0.ρ.ρ.ρ.ρ.ρ");
              Phi ret_1_2_2_1_base_base_base_base = new PhMethod(ret_1_2_2_1_base_base_base_base_base, "org");
                ret_1_2_2_1_base_base_base_base = new PhLocated(ret_1_2_2_1_base_base_base_base, 320, 11, "Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α1.α0.ρ.ρ.ρ.ρ");
              Phi ret_1_2_2_1_base_base_base = new PhMethod(ret_1_2_2_1_base_base_base_base, "eolang");
                ret_1_2_2_1_base_base_base = new PhLocated(ret_1_2_2_1_base_base_base, 320, 15, "Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α1.α0.ρ.ρ.ρ");
              Phi ret_1_2_2_1_base_base = new PhMethod(ret_1_2_2_1_base_base_base, "txt");
                ret_1_2_2_1_base_base = new PhLocated(ret_1_2_2_1_base_base, 320, 22, "Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α1.α0.ρ.ρ");
              Phi ret_1_2_2_1_base = new PhMethod(ret_1_2_2_1_base_base, "sprintf");
                ret_1_2_2_1_base = new PhLocated(ret_1_2_2_1_base, 320, 26, "Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α1.α0.ρ");
              Phi ret_1_2_2_1 = new PhMethod(ret_1_2_2_1_base, "ν");
                ret_1_2_2_1 = new PhLocated(ret_1_2_2_1, 320, 34, "Φ.org.eolang.compares-two-foreign-objects.φ.α0.α1.α1.α0");
              ret_1_2_2 = new PhWith(ret_1_2_2, 0, ret_1_2_2_1);
            ret_1_2 = new PhWith(ret_1_2, 0, ret_1_2_1);
            ret_1_2 = new PhWith(ret_1_2, 1, ret_1_2_2);
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
          ret_1 = new PhWith(ret_1, 1, ret_1_2);
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOcompares_two_foreign_objectsTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
