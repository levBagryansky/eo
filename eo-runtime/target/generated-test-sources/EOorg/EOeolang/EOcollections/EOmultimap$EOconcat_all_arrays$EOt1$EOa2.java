
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOcollections;

import org.eolang.*;

// <o abstract="" ancestors="2" line="51" loc="Φ.org.eolang.collections.multimap$concat-all-arrays$t1$a2" name="multimap$concat-all-arrays$t1$a2" parent="multimap$concat-all-arrays" pos="6"> 
//   <o line="51" loc="Φ.org.eolang.collections.multimap$concat-all-arrays$t1$a2.a" name="a" pos="7"/>
//   <o line="51" loc="Φ.org.eolang.collections.multimap$concat-all-arrays$t1$a2.x" name="x" pos="9"/>
//   <o base=".concat" line="52" loc="Φ.org.eolang.collections.multimap$concat-all-arrays$t1$a2.φ" name="@" pos="8"> 
//     <o base="org.eolang.collections.list" line="53" loc="Φ.org.eolang.collections.multimap$concat-all-arrays$t1$a2.φ.ρ" pos="10"> 
//       <o base="a" line="53" loc="Φ.org.eolang.collections.multimap$concat-all-arrays$t1$a2.φ.ρ.α0" pos="15" ref="51"/>
//     </o>
//     <o base="x" line="54" loc="Φ.org.eolang.collections.multimap$concat-all-arrays$t1$a2.φ.α0" pos="10" ref="51"/>
//   </o>
// </o>
@XmirObject(name = "multimap$concat-all-arrays$t1$a2", oname = "multimap$concat-all-arrays$t1$a2", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/collections/multimap.eo")
public final class EOmultimap$EOconcat_all_arrays$EOt1$EOa2 extends PhDefault {
  public EOmultimap$EOconcat_all_arrays$EOt1$EOa2(final Phi sigma) {
    super(sigma);
    this.add("a", new AtFree(/* default */));
    this.add("x", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("collections").get().attr("list").get();
        ret_base = new PhLocated(ret_base, 53, 10, "Φ.org.eolang.collections.multimap$concat-all-arrays$t1$a2.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new PhMethod(rho, "a");
          ret_base_1 = new PhLocated(ret_base_1, 53, 15, "Φ.org.eolang.collections.multimap$concat-all-arrays$t1$a2.φ.ρ.α0");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "concat");
        ret = new PhLocated(ret, 52, 8, "Φ.org.eolang.collections.multimap$concat-all-arrays$t1$a2.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new PhMethod(rho, "x");
          ret_1 = new PhLocated(ret_1, 54, 10, "Φ.org.eolang.collections.multimap$concat-all-arrays$t1$a2.φ.α0");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }
}