
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOhamcrest;

import org.eolang.*;

// <o abstract="" ancestors="1" line="134" loc="Φ.org.eolang.hamcrest.assert-twice-that$has-item" name="assert-twice-that$has-item" original-name="has-item" parent="assert-twice-that" pos="2"> 
//   <o line="135" loc="Φ.org.eolang.hamcrest.assert-twice-that$has-item.matcher" name="matcher" pos="3"/>
//   <o base="org.eolang.hamcrest.matchers.has-item-matcher" line="136" loc="Φ.org.eolang.hamcrest.assert-twice-that$has-item.φ" name="@" pos="4"> 
//     <o base="matcher" line="136" loc="Φ.org.eolang.hamcrest.assert-twice-that$has-item.φ.α0" pos="21" ref="135"/>
//   </o>
// </o>
@XmirObject(name = "assert-twice-that$has-item", oname = "has-item", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/hamcrest/assert-twice-that.eo")
public final class EOassert_twice_that$EOhas_item extends PhDefault {
  public EOassert_twice_that$EOhas_item(final Phi sigma) {
    super(sigma);
    this.add("matcher", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("matchers").get().attr("has-item-matcher").get();
        ret = new PhLocated(ret, 136, 4, "Φ.org.eolang.hamcrest.assert-twice-that$has-item.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new PhMethod(rho, "matcher");
          ret_1 = new PhLocated(ret_1, 136, 21, "Φ.org.eolang.hamcrest.assert-twice-that$has-item.φ.α0");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }
}