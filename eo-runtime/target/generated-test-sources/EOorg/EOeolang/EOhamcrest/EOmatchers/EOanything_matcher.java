
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOhamcrest.EOmatchers;

import org.eolang.*;

// <o abstract="" line="29" loc="Φ.org.eolang.hamcrest.matchers.anything-matcher" name="anything-matcher" original-name="anything-matcher" pos="0"> 
//   <o base="anything-matcher$match" cut="0" line="30" loc="Φ.org.eolang.hamcrest.matchers.anything-matcher.match" name="match" pos="2" ref="30"/>
//   <o base="anything-matcher$describe-mismatch" cut="3" line="33" loc="Φ.org.eolang.hamcrest.matchers.anything-matcher.describe-mismatch" name="describe-mismatch" pos="2" ref="33"/>
//   <o base="anything-matcher$description-of" cut="6" line="36" loc="Φ.org.eolang.hamcrest.matchers.anything-matcher.description-of" name="description-of" pos="2" ref="36"/>
// </o>
@XmirObject(name = "anything-matcher", oname = "anything-matcher", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/hamcrest/matchers/anything-matcher.eo")
public final class EOanything_matcher extends PhDefault {
  public EOanything_matcher(final Phi sigma) {
    super(sigma);
    this.add("match", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOanything_matcher$EOmatch(rho);
        ret = new PhLocated(ret, 30, 2, "Φ.org.eolang.hamcrest.matchers.anything-matcher.match");
      return ret;
    })));
    this.add("describe-mismatch", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOanything_matcher$EOdescribe_mismatch(rho);
        ret = new PhLocated(ret, 33, 2, "Φ.org.eolang.hamcrest.matchers.anything-matcher.describe-mismatch");
      return ret;
    })));
    this.add("description-of", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOanything_matcher$EOdescription_of(rho);
        ret = new PhLocated(ret, 36, 2, "Φ.org.eolang.hamcrest.matchers.anything-matcher.description-of");
      return ret;
    })));
  }
}
