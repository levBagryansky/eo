
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOhamcrest.EOmatchers;

import org.eolang.*;

// <o abstract="" ancestors="2" line="60" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match$t2$t1$a2" name="has-items-matcher$match$t2$t1$a2" parent="has-items-matcher$match" pos="8"> 
//   <o line="60" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match$t2$t1$a2.acc" name="acc" pos="9"/>
//   <o line="60" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match$t2$t1$a2.i" name="i" pos="13"/>
//   <o line="60" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match$t2$t1$a2.el" name="el" pos="15"/>
//   <o base=".or" line="61" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match$t2$t1$a2.φ" name="@" pos="10"> 
//     <o base="acc" line="62" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match$t2$t1$a2.φ.ρ" pos="12" ref="60"/>
//     <o base="all-match" line="63" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match$t2$t1$a2.φ.α0" pos="12" ref="60.35.462"> 
//       <o base="el" line="63" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match$t2$t1$a2.φ.α0.α0" pos="22" ref="60"/>
//     </o>
//   </o>
//   <o level="2" line="60.33.462" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match$t2$t1$a2.mismatches" name="mismatches"/>
//   <o level="2" line="60.35.462" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher$match$t2$t1$a2.all-match" name="all-match"/>
// </o>
@XmirObject(name = "has-items-matcher$match$t2$t1$a2", oname = "has-items-matcher$match$t2$t1$a2", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/hamcrest/matchers/has-items-matcher.eo")
public final class EOhas_items_matcher$EOmatch$EOt2$EOt1$EOa2 extends PhDefault {
  public EOhas_items_matcher$EOmatch$EOt2$EOt1$EOa2(final Phi sigma) {
    super(sigma);
    this.add("acc", new AtFree(/* default */));
    this.add("i", new AtFree(/* default */));
    this.add("el", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "acc");
        ret_base = new PhLocated(ret_base, 62, 12, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$match$t2$t1$a2.φ.ρ");
      Phi ret = new PhMethod(ret_base, "or");
        ret = new PhLocated(ret, 61, 10, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$match$t2$t1$a2.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new PhMethod(new PhMethod(new PhMethod(rho, "σ"), "σ"), "all-match");
          ret_1 = new PhLocated(ret_1, 63, 12, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$match$t2$t1$a2.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new PhMethod(rho, "el");
            ret_1_1 = new PhLocated(ret_1_1, 63, 22, "Φ.org.eolang.hamcrest.matchers.has-items-matcher$match$t2$t1$a2.φ.α0.α0");
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }
}