
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOhamcrest.EOmatchers;

import org.eolang.*;

// <o abstract="" ancestors="2" line="40" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2" name="has-items-matcher$all-match$t2$a2" parent="has-items-matcher$all-match" pos="6"> 
//   <o line="40" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.acc" name="acc" pos="7"/>
//   <o line="40" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.x" name="x" pos="11"/>
//   <o base=".if" line="41" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ" name="@" pos="8"> 
//     <o base=".match" line="42" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.ρ" pos="11"> 
//       <o base="x" line="42" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.ρ.ρ" pos="10" ref="40"/>
//       <o base="act" line="42" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.ρ.α0" pos="18" ref="40.36.460"/>
//     </o>
//     <o base="org.eolang.bool" data="bool" line="43" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.α0" pos="10">TRUE</o>
//     <o base="org.eolang.seq" line="44" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.α1" pos="10"> 
//       <o base=".write" line="45" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.α1.α0" pos="22"> 
//         <o base="mismatches" line="45" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.α1.α0.ρ" pos="12" ref="40.33.460"/>
//         <o base=".with" line="46" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.α1.α0.α0" pos="24"> 
//           <o base="mismatches" line="46" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.α1.α0.α0.ρ" pos="14" ref="40.33.460"/>
//           <o base=".describe-mismatch" line="47" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.α1.α0.α0.α0" pos="16"> 
//             <o base="x" line="48" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.α1.α0.α0.α0.ρ" pos="18" ref="40"/>
//             <o base="act" line="49" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.α1.α0.α0.α0.α0" pos="18" ref="40.36.460"/>
//           </o>
//         </o>
//       </o>
//       <o base="acc" line="50" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.α1.α1" pos="12" ref="40"/>
//     </o>
//   </o>
//   <o level="1" line="40.36.460" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.act" name="act"/>
//   <o level="2" line="40.32.460" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.matchers" name="matchers"/>
//   <o level="2" line="40.33.460" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.mismatches" name="mismatches"/>
// </o>
@XmirObject(name = "has-items-matcher$all-match$t2$a2", oname = "has-items-matcher$all-match$t2$a2", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/hamcrest/matchers/has-items-matcher.eo")
public final class EOhas_items_matcher$EOall_match$EOt2$EOa2 extends PhDefault {
  public EOhas_items_matcher$EOall_match$EOt2$EOa2(final Phi sigma) {
    super(sigma);
    this.add("acc", new AtFree(/* default */));
    this.add("x", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new PhMethod(rho, "x");
        ret_base_base = new PhLocated(ret_base_base, 42, 10, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "match");
        ret_base = new PhLocated(ret_base, 42, 11, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new PhMethod(new PhMethod(rho, "σ"), "act");
          ret_base_1 = new PhLocated(ret_base_1, 42, 18, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.ρ.α0");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "if");
        ret = new PhLocated(ret, 41, 8, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EObool(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 43, 10, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(Boolean.TRUE));
        Phi ret_2 = Phi.Φ.attr("org").get().attr("eolang").get().attr("seq").get();
          ret_2 = new PhLocated(ret_2, 44, 10, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = new PhMethod(new PhMethod(new PhMethod(rho, "σ"), "σ"), "mismatches");
            ret_2_1_base = new PhLocated(ret_2_1_base, 45, 12, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.α1.α0.ρ");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "write");
            ret_2_1 = new PhLocated(ret_2_1, 45, 22, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.α1.α0");
          ret_2_1 = new PhCopy(ret_2_1);
            Phi ret_2_1_1_base = new PhMethod(new PhMethod(new PhMethod(rho, "σ"), "σ"), "mismatches");
              ret_2_1_1_base = new PhLocated(ret_2_1_1_base, 46, 14, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.α1.α0.α0.ρ");
            Phi ret_2_1_1 = new PhMethod(ret_2_1_1_base, "with");
              ret_2_1_1 = new PhLocated(ret_2_1_1, 46, 24, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.α1.α0.α0");
            ret_2_1_1 = new PhCopy(ret_2_1_1);
              Phi ret_2_1_1_1_base = new PhMethod(rho, "x");
                ret_2_1_1_1_base = new PhLocated(ret_2_1_1_1_base, 48, 18, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.α1.α0.α0.α0.ρ");
              Phi ret_2_1_1_1 = new PhMethod(ret_2_1_1_1_base, "describe-mismatch");
                ret_2_1_1_1 = new PhLocated(ret_2_1_1_1, 47, 16, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.α1.α0.α0.α0");
              ret_2_1_1_1 = new PhCopy(ret_2_1_1_1);
                Phi ret_2_1_1_1_1 = new PhMethod(new PhMethod(rho, "σ"), "act");
                  ret_2_1_1_1_1 = new PhLocated(ret_2_1_1_1_1, 49, 18, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.α1.α0.α0.α0.α0");
                ret_2_1_1_1 = new PhWith(ret_2_1_1_1, 0, ret_2_1_1_1_1);
              ret_2_1_1 = new PhWith(ret_2_1_1, 0, ret_2_1_1_1);
            ret_2_1 = new PhWith(ret_2_1, 0, ret_2_1_1);
          Phi ret_2_2 = new PhMethod(rho, "acc");
            ret_2_2 = new PhLocated(ret_2_2, 50, 12, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$all-match$t2$a2.φ.α1.α1");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
          ret_2 = new PhWith(ret_2, 1, ret_2_2);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }
}