
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOhamcrest.EOmatchers;

import org.eolang.*;

// <o abstract="" ancestors="1" line="63" loc="Φ.org.eolang.hamcrest.matchers.array-each-matcher$describe-mismatch" name="array-each-matcher$describe-mismatch" original-name="describe-mismatch" parent="array-each-matcher" pos="2"> 
//   <o line="63" loc="Φ.org.eolang.hamcrest.matchers.array-each-matcher$describe-mismatch.act" name="act" pos="3"/>
//   <o base="org.eolang.txt.sprintf" line="64" loc="Φ.org.eolang.hamcrest.matchers.array-each-matcher$describe-mismatch.φ" name="@" pos="4"> 
//     <o base="org.eolang.string" data="string" line="65" loc="Φ.org.eolang.hamcrest.matchers.array-each-matcher$describe-mismatch.φ.α0" pos="6">mismatches: [%s]</o>
//     <o base=".joined" line="66" loc="Φ.org.eolang.hamcrest.matchers.array-each-matcher$describe-mismatch.φ.α1" pos="17"> 
//       <o base="org.eolang.txt.text" line="66" loc="Φ.org.eolang.hamcrest.matchers.array-each-matcher$describe-mismatch.φ.α1.ρ" pos="7" scope="scope-1fa6e892-a6a1-4df9-b3cc-624837bc70e7"> 
//         <o base="org.eolang.string" data="string" line="66" loc="Φ.org.eolang.hamcrest.matchers.array-each-matcher$describe-mismatch.φ.α1.ρ.α0" pos="12" scope="scope-1fa6e892-a6a1-4df9-b3cc-624837bc70e7">,</o>
//       </o>
//       <o base="mismatches" line="66" loc="Φ.org.eolang.hamcrest.matchers.array-each-matcher$describe-mismatch.φ.α1.α0" pos="25" ref="63.34.462"/>
//     </o>
//   </o>
//   <o level="1" line="63.34.462" loc="Φ.org.eolang.hamcrest.matchers.array-each-matcher$describe-mismatch.mismatches" name="mismatches"/>
// </o>
@XmirObject(name = "array-each-matcher$describe-mismatch", oname = "describe-mismatch", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/hamcrest/matchers/array-each-matcher.eo")
public final class EOarray_each_matcher$EOdescribe_mismatch extends PhDefault {
  public EOarray_each_matcher$EOdescribe_mismatch(final Phi sigma) {
    super(sigma);
    this.add("act", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("txt").get().attr("sprintf").get();
        ret = new PhLocated(ret, 64, 4, "Φ.org.eolang.hamcrest.matchers.array-each-matcher$describe-mismatch.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 65, 6, "Φ.org.eolang.hamcrest.matchers.array-each-matcher$describe-mismatch.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>("mismatches: [%s]"));
        Phi ret_2_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("txt").get().attr("text").get();
          ret_2_base = new PhLocated(ret_2_base, 66, 7, "Φ.org.eolang.hamcrest.matchers.array-each-matcher$describe-mismatch.φ.α1.ρ");
        ret_2_base = new PhCopy(ret_2_base);
          Phi ret_2_base_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
            ret_2_base_1 = new PhLocated(ret_2_base_1, 66, 12, "Φ.org.eolang.hamcrest.matchers.array-each-matcher$describe-mismatch.φ.α1.ρ.α0");
            ret_2_base_1 = new PhWith(ret_2_base_1, "Δ", new Data.Value<>(", "));
          ret_2_base = new PhWith(ret_2_base, 0, ret_2_base_1);
        Phi ret_2 = new PhMethod(ret_2_base, "joined");
          ret_2 = new PhLocated(ret_2, 66, 17, "Φ.org.eolang.hamcrest.matchers.array-each-matcher$describe-mismatch.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new PhMethod(new PhMethod(rho, "σ"), "mismatches");
            ret_2_1 = new PhLocated(ret_2_1, 66, 25, "Φ.org.eolang.hamcrest.matchers.array-each-matcher$describe-mismatch.φ.α1.α0");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }
}
