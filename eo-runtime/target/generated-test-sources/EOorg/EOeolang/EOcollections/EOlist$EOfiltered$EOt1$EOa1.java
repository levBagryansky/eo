
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOcollections;

import org.eolang.*;

// <o abstract="" ancestors="2" line="306" loc="Φ.org.eolang.collections.list$filtered$t1$a1" name="list$filtered$t1$a1" parent="list$filtered" pos="6"> 
//   <o line="306" loc="Φ.org.eolang.collections.list$filtered$t1$a1.item" name="item" pos="7"/>
//   <o line="306" loc="Φ.org.eolang.collections.list$filtered$t1$a1.index" name="index" pos="12"/>
//   <o base=".f" line="307" loc="Φ.org.eolang.collections.list$filtered$t1$a1.φ" name="@" pos="9"> 
//     <o base="&" line="307" loc="Φ.org.eolang.collections.list$filtered$t1$a1.φ.ρ" pos="8"/>
//     <o base="item" line="308" loc="Φ.org.eolang.collections.list$filtered$t1$a1.φ.α0" pos="10" ref="306"/>
//   </o>
// </o>
@XmirObject(name = "list$filtered$t1$a1", oname = "list$filtered$t1$a1", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/collections/list.eo")
public final class EOlist$EOfiltered$EOt1$EOa1 extends PhDefault {
  public EOlist$EOfiltered$EOt1$EOa1(final Phi sigma) {
    super(sigma);
    this.add("item", new AtFree(/* default */));
    this.add("index", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "σ");
        ret_base = new PhLocated(ret_base, 307, 8, "Φ.org.eolang.collections.list$filtered$t1$a1.φ.ρ");
      Phi ret = new PhMethod(ret_base, "f");
        ret = new PhLocated(ret, 307, 9, "Φ.org.eolang.collections.list$filtered$t1$a1.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new PhMethod(rho, "item");
          ret_1 = new PhLocated(ret_1, 308, 10, "Φ.org.eolang.collections.list$filtered$t1$a1.φ.α0");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }
}
