
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOhamcrest.EOmatchers;

import org.eolang.*;

// <o abstract="" ancestors="1" line="31" loc="Φ.org.eolang.hamcrest.matchers.not-matcher$match" name="not-matcher$match" original-name="match" parent="not-matcher" pos="2"> 
//   <o line="31" loc="Φ.org.eolang.hamcrest.matchers.not-matcher$match.a" name="a" pos="3"/>
//   <o base=".not" line="32" loc="Φ.org.eolang.hamcrest.matchers.not-matcher$match.φ" name="@" pos="4"> 
//     <o base=".match" line="33" loc="Φ.org.eolang.hamcrest.matchers.not-matcher$match.φ.ρ" pos="13"> 
//       <o base="matcher" line="33" loc="Φ.org.eolang.hamcrest.matchers.not-matcher$match.φ.ρ.ρ" pos="6" ref="31.30.461"/>
//       <o base="a" line="33" loc="Φ.org.eolang.hamcrest.matchers.not-matcher$match.φ.ρ.α0" pos="20" ref="31"/>
//     </o>
//   </o>
//   <o level="1" line="31.30.461" loc="Φ.org.eolang.hamcrest.matchers.not-matcher$match.matcher" name="matcher"/>
// </o>
@XmirObject(name = "not-matcher$match", oname = "match", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/hamcrest/matchers/not-matcher.eo")
public final class EOnot_matcher$EOmatch extends PhDefault {
  public EOnot_matcher$EOmatch(final Phi sigma) {
    super(sigma);
    this.add("a", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new PhMethod(new PhMethod(rho, "σ"), "matcher");
        ret_base_base = new PhLocated(ret_base_base, 33, 6, "Φ.org.eolang.hamcrest.matchers.not-matcher$match.φ.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "match");
        ret_base = new PhLocated(ret_base, 33, 13, "Φ.org.eolang.hamcrest.matchers.not-matcher$match.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new PhMethod(rho, "a");
          ret_base_1 = new PhLocated(ret_base_1, 33, 20, "Φ.org.eolang.hamcrest.matchers.not-matcher$match.φ.ρ.α0");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "not");
        ret = new PhLocated(ret, 32, 4, "Φ.org.eolang.hamcrest.matchers.not-matcher$match.φ");
      return ret;
    })));
  }
}