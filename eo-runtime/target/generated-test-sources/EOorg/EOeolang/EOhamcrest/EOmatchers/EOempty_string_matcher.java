
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOhamcrest.EOmatchers;

import org.eolang.*;

// <o abstract="" line="31" loc="Φ.org.eolang.hamcrest.matchers.empty-string-matcher" name="empty-string-matcher" original-name="empty-string-matcher" pos="0"> 
//   <o base="empty-string-matcher$match" cut="0" line="32" loc="Φ.org.eolang.hamcrest.matchers.empty-string-matcher.match" name="match" pos="2" ref="32"/>
//   <o base="empty-string-matcher$describe-mismatch" cut="7" line="38" loc="Φ.org.eolang.hamcrest.matchers.empty-string-matcher.describe-mismatch" name="describe-mismatch" pos="2" ref="38"/>
//   <o base="empty-string-matcher$description-of" cut="12" line="43" loc="Φ.org.eolang.hamcrest.matchers.empty-string-matcher.description-of" name="description-of" pos="2" ref="43"/>
// </o>
@XmirObject(name = "empty-string-matcher", oname = "empty-string-matcher", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/hamcrest/matchers/empty-string-matcher.eo")
public final class EOempty_string_matcher extends PhDefault {
  public EOempty_string_matcher(final Phi sigma) {
    super(sigma);
    this.add("match", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOempty_string_matcher$EOmatch(rho);
        ret = new PhLocated(ret, 32, 2, "Φ.org.eolang.hamcrest.matchers.empty-string-matcher.match");
      return ret;
    })));
    this.add("describe-mismatch", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOempty_string_matcher$EOdescribe_mismatch(rho);
        ret = new PhLocated(ret, 38, 2, "Φ.org.eolang.hamcrest.matchers.empty-string-matcher.describe-mismatch");
      return ret;
    })));
    this.add("description-of", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOempty_string_matcher$EOdescription_of(rho);
        ret = new PhLocated(ret, 43, 2, "Φ.org.eolang.hamcrest.matchers.empty-string-matcher.description-of");
      return ret;
    })));
  }
}