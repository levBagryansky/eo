
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOhamcrest.EOmatchers;

import org.eolang.*;

// <o abstract="" line="34" loc="Φ.org.eolang.hamcrest.matchers.any-of-matcher" name="any-of-matcher" original-name="any-of-matcher" pos="0"> 
//   <o line="34" loc="Φ.org.eolang.hamcrest.matchers.any-of-matcher.matchers" name="matchers" pos="1" vararg=""/>
//   <o base="any-of-matcher$match" cut="1" line="35" loc="Φ.org.eolang.hamcrest.matchers.any-of-matcher.match" name="match" pos="2" ref="35"> 
//     <o as="matchers" base="matchers" level="1" loc="Φ.org.eolang.hamcrest.matchers.any-of-matcher.match.α0" ref="34"/>
//   </o>
//   <o base="any-of-matcher$describe-mismatch" cut="15" line="44" loc="Φ.org.eolang.hamcrest.matchers.any-of-matcher.describe-mismatch" name="describe-mismatch" pos="2" ref="44"/>
//   <o base="any-of-matcher$description-of" cut="20" line="49" loc="Φ.org.eolang.hamcrest.matchers.any-of-matcher.description-of" name="description-of" pos="2" ref="49"> 
//     <o as="matchers" base="matchers" level="1" loc="Φ.org.eolang.hamcrest.matchers.any-of-matcher.description-of.α0" ref="34"/>
//   </o>
// </o>
@XmirObject(name = "any-of-matcher", oname = "any-of-matcher", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/hamcrest/matchers/any-of-matcher.eo")
public final class EOany_of_matcher extends PhDefault {
  public EOany_of_matcher(final Phi sigma) {
    super(sigma);
    this.add("matchers", new AtVararg(/* default */));
    this.add("match", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOany_of_matcher$EOmatch(rho);
        ret = new PhLocated(ret, 35, 2, "Φ.org.eolang.hamcrest.matchers.any-of-matcher.match");
      return ret;
    })));
    this.add("describe-mismatch", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOany_of_matcher$EOdescribe_mismatch(rho);
        ret = new PhLocated(ret, 44, 2, "Φ.org.eolang.hamcrest.matchers.any-of-matcher.describe-mismatch");
      return ret;
    })));
    this.add("description-of", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOany_of_matcher$EOdescription_of(rho);
        ret = new PhLocated(ret, 49, 2, "Φ.org.eolang.hamcrest.matchers.any-of-matcher.description-of");
      return ret;
    })));
  }
}