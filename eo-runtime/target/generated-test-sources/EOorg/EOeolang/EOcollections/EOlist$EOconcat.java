
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOcollections;

import org.eolang.*;

// <o abstract="" ancestors="1" line="172" loc="Φ.org.eolang.collections.list$concat" name="list$concat" original-name="concat" parent="list" pos="2"> 
//   <o line="172" loc="Φ.org.eolang.collections.list$concat.passed" name="passed" pos="3"/>
//   <o base=".reduced" const="" line="173" loc="Φ.org.eolang.collections.list$concat.φ" name="@" pos="4"> 
//     <o base="list" line="174" loc="Φ.org.eolang.collections.list$concat.φ.ρ" pos="6" ref="28"> 
//       <o base="passed" line="175" loc="Φ.org.eolang.collections.list$concat.φ.ρ.α0" pos="8" ref="172"/>
//     </o>
//     <o base="^" line="176" loc="Φ.org.eolang.collections.list$concat.φ.α0" pos="6"/>
//     <o base="list$concat$t1$a2" cut="188" line="177" loc="Φ.org.eolang.collections.list$concat.φ.α1" pos="6" ref="177"/>
//   </o>
// </o>
@XmirObject(name = "list$concat", oname = "concat", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/collections/list.eo")
public final class EOlist$EOconcat extends PhDefault {
  public EOlist$EOconcat(final Phi sigma) {
    super(sigma);
    this.add("passed", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("collections").get().attr("list").get();
        ret_base = new PhLocated(ret_base, 174, 6, "Φ.org.eolang.collections.list$concat.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new PhMethod(rho, "passed");
          ret_base_1 = new PhLocated(ret_base_1, 175, 8, "Φ.org.eolang.collections.list$concat.φ.ρ.α0");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "reduced");
        ret = new PhLocated(ret, 173, 4, "Φ.org.eolang.collections.list$concat.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new PhMethod(rho, "ρ");
          ret_1 = new PhLocated(ret_1, 176, 6, "Φ.org.eolang.collections.list$concat.φ.α0");
        Phi ret_2 = new EOlist$EOconcat$EOt1$EOa2(rho);
          ret_2 = new PhLocated(ret_2, 177, 6, "Φ.org.eolang.collections.list$concat.φ.α1");
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      ret = new PhConst(ret);
      return ret;
    })));
  }
}