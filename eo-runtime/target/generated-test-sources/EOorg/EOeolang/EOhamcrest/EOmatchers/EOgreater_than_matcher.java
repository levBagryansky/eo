
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOhamcrest.EOmatchers;

import org.eolang.*;

// <o abstract="" line="31" loc="Φ.org.eolang.hamcrest.matchers.greater-than-matcher" name="greater-than-matcher" original-name="greater-than-matcher" pos="0"> 
//   <o line="31" loc="Φ.org.eolang.hamcrest.matchers.greater-than-matcher.x" name="x" pos="1"/>
//   <o base="greater-than-matcher$match" cut="1" line="32" loc="Φ.org.eolang.hamcrest.matchers.greater-than-matcher.match" name="match" pos="2" ref="32"> 
//     <o as="x" base="x" level="1" loc="Φ.org.eolang.hamcrest.matchers.greater-than-matcher.match.α0" ref="31"/>
//   </o>
//   <o base="greater-than-matcher$describe-mismatch" cut="6" line="37" loc="Φ.org.eolang.hamcrest.matchers.greater-than-matcher.describe-mismatch" name="describe-mismatch" pos="2" ref="37"/>
//   <o base="greater-than-matcher$description-of" cut="11" line="42" loc="Φ.org.eolang.hamcrest.matchers.greater-than-matcher.description-of" name="description-of" pos="2" ref="42"> 
//     <o as="x" base="x" level="1" loc="Φ.org.eolang.hamcrest.matchers.greater-than-matcher.description-of.α0" ref="31"/>
//   </o>
// </o>
@XmirObject(name = "greater-than-matcher", oname = "greater-than-matcher", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/hamcrest/matchers/greater-than-matcher.eo")
public final class EOgreater_than_matcher extends PhDefault {
  public EOgreater_than_matcher(final Phi sigma) {
    super(sigma);
    this.add("x", new AtFree(/* default */));
    this.add("match", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOgreater_than_matcher$EOmatch(rho);
        ret = new PhLocated(ret, 32, 2, "Φ.org.eolang.hamcrest.matchers.greater-than-matcher.match");
      return ret;
    })));
    this.add("describe-mismatch", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOgreater_than_matcher$EOdescribe_mismatch(rho);
        ret = new PhLocated(ret, 37, 2, "Φ.org.eolang.hamcrest.matchers.greater-than-matcher.describe-mismatch");
      return ret;
    })));
    this.add("description-of", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOgreater_than_matcher$EOdescription_of(rho);
        ret = new PhLocated(ret, 42, 2, "Φ.org.eolang.hamcrest.matchers.greater-than-matcher.description-of");
      return ret;
    })));
  }
}
