
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOhamcrest.EOmatchers;

import org.eolang.*;

// <o abstract="" line="32" loc="Φ.org.eolang.hamcrest.matchers.described-as-matcher" name="described-as-matcher" original-name="described-as-matcher" pos="0"> 
//   <o line="32" loc="Φ.org.eolang.hamcrest.matchers.described-as-matcher.matcher" name="matcher" pos="1"/>
//   <o line="32" loc="Φ.org.eolang.hamcrest.matchers.described-as-matcher.format" name="format" pos="9"/>
//   <o line="32" loc="Φ.org.eolang.hamcrest.matchers.described-as-matcher.args" name="args" pos="16" vararg=""/>
//   <o base="matcher" line="33" loc="Φ.org.eolang.hamcrest.matchers.described-as-matcher.φ" name="@" pos="2" ref="32"/>
//   <o base="described-as-matcher$description-of" cut="4" line="35" loc="Φ.org.eolang.hamcrest.matchers.described-as-matcher.description-of" name="description-of" pos="2" ref="35"> 
//     <o as="format" base="format" level="1" loc="Φ.org.eolang.hamcrest.matchers.described-as-matcher.description-of.α0" ref="32"/>
//     <o as="args" base="args" level="1" loc="Φ.org.eolang.hamcrest.matchers.described-as-matcher.description-of.α1" ref="32"/>
//   </o>
// </o>
@XmirObject(name = "described-as-matcher", oname = "described-as-matcher", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/hamcrest/matchers/described-as-matcher.eo")
public final class EOdescribed_as_matcher extends PhDefault {
  public EOdescribed_as_matcher(final Phi sigma) {
    super(sigma);
    this.add("matcher", new AtFree(/* default */));
    this.add("format", new AtFree(/* default */));
    this.add("args", new AtVararg(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "matcher");
        ret = new PhLocated(ret, 33, 2, "Φ.org.eolang.hamcrest.matchers.described-as-matcher.φ");
      return ret;
    })));
    this.add("description-of", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOdescribed_as_matcher$EOdescription_of(rho);
        ret = new PhLocated(ret, 35, 2, "Φ.org.eolang.hamcrest.matchers.described-as-matcher.description-of");
      return ret;
    })));
  }
}
