
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOhamcrest.EOmatchers;

import org.eolang.*;

// <o abstract="" ancestors="1" line="52" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match" name="has-items-matcher$match" original-name="match" parent="has-items-matcher" pos="2"> 
//   <o line="52" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match.a" name="a" pos="3"/>
//   <o base="a" const="" line="53" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match.act" name="act" pos="4" ref="52"/>
//   <o base="org.eolang.seq" line="54" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match.φ" name="@" pos="4"> 
//     <o base=".write" line="55" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match.φ.α0" pos="16"> 
//       <o base="mismatches" line="55" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match.φ.α0.ρ" pos="6" ref="52.33.461"/>
//       <o base="org.eolang.tuple" data="tuple" line="55" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match.φ.α0.α0" pos="23"/>
//     </o>
//     <o base=".reducedi" line="56" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match.φ.α1" pos="6"> 
//       <o base="org.eolang.collections.list" line="57" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match.φ.α1.ρ" pos="8"> 
//         <o base="act" line="58" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match.φ.α1.ρ.α0" pos="10" ref="53"/>
//       </o>
//       <o base="org.eolang.bool" data="bool" line="59" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match.φ.α1.α0" pos="8">FALSE</o>
//       <o base="has-items-matcher$match$t2$t1$a2" cut="35" line="60" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match.φ.α1.α1" pos="8" ref="60"> 
//         <o as="mismatches" base="mismatches" level="2" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match.φ.α1.α1.α0" ref="52.33.461"/>
//         <o as="all-match" base="all-match" level="2" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match.φ.α1.α1.α1" ref="52.35.461"/>
//       </o>
//     </o>
//   </o>
//   <o level="1" line="52.33.461" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match.mismatches" name="mismatches"/>
//   <o level="1" line="52.35.461" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match.all-match" name="all-match"/>
// </o>
@XmirObject(name = "has-items-matcher$match", oname = "match", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/hamcrest/matchers/has-items-matcher.eo")
public final class EOhas_items_matcher$EOmatch extends PhDefault {
  public EOhas_items_matcher$EOmatch(final Phi sigma) {
    super(sigma);
    this.add("a", new AtFree(/* default */));
    this.add("act", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "a");
        ret = new PhLocated(ret, 53, 4, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$match.act");
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("seq").get();
        ret = new PhLocated(ret, 54, 4, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$match.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(new PhMethod(rho, "σ"), "mismatches");
          ret_1_base = new PhLocated(ret_1_base, 55, 6, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$match.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "write");
          ret_1 = new PhLocated(ret_1, 55, 16, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$match.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("tuple").get();
            ret_1_1 = new PhLocated(ret_1_1, 55, 23, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$match.φ.α0.α0");
            Phi[] ret_1_1_a = new Phi[0];
            ret_1_1 = new PhWith(new PhCopy(ret_1_1), "Δ", new Data.Value<Phi[]>(ret_1_1_a));
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("collections").get().attr("list").get();
          ret_2_base = new PhLocated(ret_2_base, 57, 8, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$match.φ.α1.ρ");
        ret_2_base = new PhCopy(ret_2_base);
          Phi ret_2_base_1 = new PhMethod(rho, "act");
            ret_2_base_1 = new PhLocated(ret_2_base_1, 58, 10, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$match.φ.α1.ρ.α0");
          ret_2_base = new PhWith(ret_2_base, 0, ret_2_base_1);
        Phi ret_2 = new PhMethod(ret_2_base, "reducedi");
          ret_2 = new PhLocated(ret_2, 56, 6, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$match.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EObool(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 59, 8, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$match.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(Boolean.FALSE));
          Phi ret_2_2 = new EOhas_items_matcher$EOmatch$EOt2$EOt1$EOa2(rho);
            ret_2_2 = new PhLocated(ret_2_2, 60, 8, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$match.φ.α1.α1");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
          ret_2 = new PhWith(ret_2, 1, ret_2_2);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }
}