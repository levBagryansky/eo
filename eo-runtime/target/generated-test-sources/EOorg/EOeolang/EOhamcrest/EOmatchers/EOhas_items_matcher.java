
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOhamcrest.EOmatchers;

import org.eolang.*;

// <o abstract="" line="32" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher" name="has-items-matcher" original-name="has-items-matcher" pos="0"> 
//   <o line="32" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher.matchers" name="matchers" pos="1" vararg=""/>
//   <o base="org.eolang.memory" line="33" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher.mismatches" name="mismatches" pos="2"> 
//     <o base="org.eolang.int" data="int" line="33" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher.mismatches.α0" pos="9">0</o>
//   </o>
//   <o base="has-items-matcher$all-match" cut="3" line="35" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher.all-match" name="all-match" pos="2" ref="35"> 
//     <o as="matchers" base="matchers" level="1" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher.all-match.α0" ref="32"/>
//     <o as="mismatches" base="mismatches" level="1" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher.all-match.α1" ref="33"/>
//   </o>
//   <o base="has-items-matcher$match" cut="27" line="52" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher.match" name="match" pos="2" ref="52"> 
//     <o as="mismatches" base="mismatches" level="1" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher.match.α0" ref="33"/>
//     <o as="all-match" base="all-match" level="1" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher.match.α1" ref="35"/>
//   </o>
//   <o base="has-items-matcher$describe-mismatch" cut="46" line="65" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher.describe-mismatch" name="describe-mismatch" pos="2" ref="65"> 
//     <o as="mismatches" base="mismatches" level="1" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher.describe-mismatch.α0" ref="33"/>
//   </o>
//   <o base="has-items-matcher$description-of" cut="54" line="70" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher.description-of" name="description-of" pos="2" ref="70"> 
//     <o as="matchers" base="matchers" level="1" loc="Φ.org.eolang.hamcrest.matchers.has-items-matcher.description-of.α0" ref="32"/>
//   </o>
// </o>
@XmirObject(name = "has-items-matcher", oname = "has-items-matcher", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/hamcrest/matchers/has-items-matcher.eo")
public final class EOhas_items_matcher extends PhDefault {
  public EOhas_items_matcher(final Phi sigma) {
    super(sigma);
    this.add("matchers", new AtVararg(/* default */));
    this.add("mismatches", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("memory").get();
        ret = new PhLocated(ret, 33, 2, "Φ.org.eolang.hamcrest.matchers.has-items-matcher.mismatches");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 33, 9, "Φ.org.eolang.hamcrest.matchers.has-items-matcher.mismatches.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(0L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("all-match", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOhas_items_matcher$EOall_match(rho);
        ret = new PhLocated(ret, 35, 2, "Φ.org.eolang.hamcrest.matchers.has-items-matcher.all-match");
      return ret;
    })));
    this.add("match", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOhas_items_matcher$EOmatch(rho);
        ret = new PhLocated(ret, 52, 2, "Φ.org.eolang.hamcrest.matchers.has-items-matcher.match");
      return ret;
    })));
    this.add("describe-mismatch", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOhas_items_matcher$EOdescribe_mismatch(rho);
        ret = new PhLocated(ret, 65, 2, "Φ.org.eolang.hamcrest.matchers.has-items-matcher.describe-mismatch");
      return ret;
    })));
    this.add("description-of", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOhas_items_matcher$EOdescription_of(rho);
        ret = new PhLocated(ret, 70, 2, "Φ.org.eolang.hamcrest.matchers.has-items-matcher.description-of");
      return ret;
    })));
  }
}
