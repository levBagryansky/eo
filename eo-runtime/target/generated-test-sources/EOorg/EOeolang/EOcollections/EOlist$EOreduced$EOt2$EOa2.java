
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOcollections;

import org.eolang.*;

// <o abstract="" ancestors="2" line="98" loc="Φ.org.eolang.collections.list$reduced$t2$a2" name="list$reduced$t2$a2" parent="list$reduced" pos="6"> 
//   <o line="98" loc="Φ.org.eolang.collections.list$reduced$t2$a2.a" name="a" pos="7"/>
//   <o line="98" loc="Φ.org.eolang.collections.list$reduced$t2$a2.idx" name="idx" pos="9"/>
//   <o line="98" loc="Φ.org.eolang.collections.list$reduced$t2$a2.item" name="item" pos="13"/>
//   <o base=".f" line="99" loc="Φ.org.eolang.collections.list$reduced$t2$a2.φ" name="@" pos="9"> 
//     <o base="&" line="99" loc="Φ.org.eolang.collections.list$reduced$t2$a2.φ.ρ" pos="8"/>
//     <o base="a" line="100" loc="Φ.org.eolang.collections.list$reduced$t2$a2.φ.α0" pos="10" ref="98"/>
//     <o base="item" line="101" loc="Φ.org.eolang.collections.list$reduced$t2$a2.φ.α1" pos="10" ref="98"/>
//   </o>
// </o>
@XmirObject(name = "list$reduced$t2$a2", oname = "list$reduced$t2$a2", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/collections/list.eo")
public final class EOlist$EOreduced$EOt2$EOa2 extends PhDefault {
  public EOlist$EOreduced$EOt2$EOa2(final Phi sigma) {
    super(sigma);
    this.add("a", new AtFree(/* default */));
    this.add("idx", new AtFree(/* default */));
    this.add("item", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "σ");
        ret_base = new PhLocated(ret_base, 99, 8, "Φ.org.eolang.collections.list$reduced$t2$a2.φ.ρ");
      Phi ret = new PhMethod(ret_base, "f");
        ret = new PhLocated(ret, 99, 9, "Φ.org.eolang.collections.list$reduced$t2$a2.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new PhMethod(rho, "a");
          ret_1 = new PhLocated(ret_1, 100, 10, "Φ.org.eolang.collections.list$reduced$t2$a2.φ.α0");
        Phi ret_2 = new PhMethod(rho, "item");
          ret_2 = new PhLocated(ret_2, 101, 10, "Φ.org.eolang.collections.list$reduced$t2$a2.φ.α1");
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }
}
