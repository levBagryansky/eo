
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOhamcrest;

import org.eolang.*;

// <o abstract="" ancestors="1" line="117" loc="Φ.org.eolang.hamcrest.assert-that$described-as" name="assert-that$described-as" original-name="described-as" parent="assert-that" pos="2"> 
//   <o line="120" loc="Φ.org.eolang.hamcrest.assert-that$described-as.matcher" name="matcher" pos="3"/>
//   <o line="120" loc="Φ.org.eolang.hamcrest.assert-that$described-as.format" name="format" pos="11"/>
//   <o line="120" loc="Φ.org.eolang.hamcrest.assert-that$described-as.args" name="args" pos="18" vararg=""/>
//   <o base="org.eolang.hamcrest.matchers.described-as-matcher" line="121" loc="Φ.org.eolang.hamcrest.assert-that$described-as.φ" name="@" pos="4"> 
//     <o base="matcher" line="122" loc="Φ.org.eolang.hamcrest.assert-that$described-as.φ.α0" pos="6" ref="120"/>
//     <o base="format" line="123" loc="Φ.org.eolang.hamcrest.assert-that$described-as.φ.α1" pos="6" ref="120"/>
//     <o base="args" line="124" loc="Φ.org.eolang.hamcrest.assert-that$described-as.φ.α2" pos="6" ref="120" unvar=""/>
//   </o>
// </o>
@XmirObject(name = "assert-that$described-as", oname = "described-as", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/hamcrest/assert-that.eo")
public final class EOassert_that$EOdescribed_as extends PhDefault {
  public EOassert_that$EOdescribed_as(final Phi sigma) {
    super(sigma);
    this.add("matcher", new AtFree(/* default */));
    this.add("format", new AtFree(/* default */));
    this.add("args", new AtVararg(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("matchers").get().attr("described-as-matcher").get();
        ret = new PhLocated(ret, 121, 4, "Φ.org.eolang.hamcrest.assert-that$described-as.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new PhMethod(rho, "matcher");
          ret_1 = new PhLocated(ret_1, 122, 6, "Φ.org.eolang.hamcrest.assert-that$described-as.φ.α0");
        Phi ret_2 = new PhMethod(rho, "format");
          ret_2 = new PhLocated(ret_2, 123, 6, "Φ.org.eolang.hamcrest.assert-that$described-as.φ.α1");
        Phi ret_3 = new PhMethod(rho, "args");
          ret_3 = new PhLocated(ret_3, 124, 6, "Φ.org.eolang.hamcrest.assert-that$described-as.φ.α2");
        ret_3 = new PhUnvar(ret_3);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
        ret = new PhWith(ret, 2, ret_3);
      return ret;
    })));
  }
}
