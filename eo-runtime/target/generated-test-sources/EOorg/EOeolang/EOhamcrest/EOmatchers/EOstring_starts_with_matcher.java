
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOhamcrest.EOmatchers;

import org.eolang.*;

// <o abstract="" line="31" loc="Φ.org.eolang.hamcrest.matchers.string-starts-with-matcher" name="string-starts-with-matcher" original-name="string-starts-with-matcher" pos="0"> 
//   <o line="31" loc="Φ.org.eolang.hamcrest.matchers.string-starts-with-matcher.str" name="str" pos="1"/>
//   <o base="string-starts-with-matcher$match" cut="1" line="32" loc="Φ.org.eolang.hamcrest.matchers.string-starts-with-matcher.match" name="match" pos="2" ref="32"> 
//     <o as="str" base="str" level="1" loc="Φ.org.eolang.hamcrest.matchers.string-starts-with-matcher.match.α0" ref="31"/>
//   </o>
//   <o base="string-starts-with-matcher$describe-mismatch" cut="7" line="37" loc="Φ.org.eolang.hamcrest.matchers.string-starts-with-matcher.describe-mismatch" name="describe-mismatch" pos="2" ref="37"/>
//   <o base="string-starts-with-matcher$description-of" cut="12" line="42" loc="Φ.org.eolang.hamcrest.matchers.string-starts-with-matcher.description-of" name="description-of" pos="2" ref="42"> 
//     <o as="str" base="str" level="1" loc="Φ.org.eolang.hamcrest.matchers.string-starts-with-matcher.description-of.α0" ref="31"/>
//   </o>
// </o>
@XmirObject(name = "string-starts-with-matcher", oname = "string-starts-with-matcher", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/hamcrest/matchers/string-starts-with-matcher.eo")
public final class EOstring_starts_with_matcher extends PhDefault {
  public EOstring_starts_with_matcher(final Phi sigma) {
    super(sigma);
    this.add("str", new AtFree(/* default */));
    this.add("match", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOstring_starts_with_matcher$EOmatch(rho);
        ret = new PhLocated(ret, 32, 2, "Φ.org.eolang.hamcrest.matchers.string-starts-with-matcher.match");
      return ret;
    })));
    this.add("describe-mismatch", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOstring_starts_with_matcher$EOdescribe_mismatch(rho);
        ret = new PhLocated(ret, 37, 2, "Φ.org.eolang.hamcrest.matchers.string-starts-with-matcher.describe-mismatch");
      return ret;
    })));
    this.add("description-of", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOstring_starts_with_matcher$EOdescription_of(rho);
        ret = new PhLocated(ret, 42, 2, "Φ.org.eolang.hamcrest.matchers.string-starts-with-matcher.description-of");
      return ret;
    })));
  }
}