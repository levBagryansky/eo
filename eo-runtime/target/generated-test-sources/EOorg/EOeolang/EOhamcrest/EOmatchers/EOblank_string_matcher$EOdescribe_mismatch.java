
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOhamcrest.EOmatchers;

import org.eolang.*;

// <o abstract="" ancestors="1" line="42" loc="Φ.org.eolang.hamcrest.matchers.blank-string-matcher$describe-mismatch" name="blank-string-matcher$describe-mismatch" original-name="describe-mismatch" parent="blank-string-matcher" pos="2"> 
//   <o line="42" loc="Φ.org.eolang.hamcrest.matchers.blank-string-matcher$describe-mismatch.act" name="act" pos="3"/>
//   <o base="org.eolang.txt.sprintf" line="43" loc="Φ.org.eolang.hamcrest.matchers.blank-string-matcher$describe-mismatch.φ" name="@" pos="4"> 
//     <o base="org.eolang.string" data="string" line="44" loc="Φ.org.eolang.hamcrest.matchers.blank-string-matcher$describe-mismatch.φ.α0" pos="6">was <%s></o>
//     <o base="act" line="45" loc="Φ.org.eolang.hamcrest.matchers.blank-string-matcher$describe-mismatch.φ.α1" pos="6" ref="42"/>
//   </o>
// </o>
@XmirObject(name = "blank-string-matcher$describe-mismatch", oname = "describe-mismatch", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/hamcrest/matchers/blank-string-matcher.eo")
public final class EOblank_string_matcher$EOdescribe_mismatch extends PhDefault {
  public EOblank_string_matcher$EOdescribe_mismatch(final Phi sigma) {
    super(sigma);
    this.add("act", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("txt").get().attr("sprintf").get();
        ret = new PhLocated(ret, 43, 4, "Φ.org.eolang.hamcrest.matchers.blank-string-matcher$describe-mismatch.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 44, 6, "Φ.org.eolang.hamcrest.matchers.blank-string-matcher$describe-mismatch.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>("was <%s>"));
        Phi ret_2 = new PhMethod(rho, "act");
          ret_2 = new PhLocated(ret_2, 45, 6, "Φ.org.eolang.hamcrest.matchers.blank-string-matcher$describe-mismatch.φ.α1");
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }
}
