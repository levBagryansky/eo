
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOcollections;

import org.eolang.*;

// <o abstract="" ancestors="2" line="140" loc="Φ.org.eolang.collections.list$withouti$t1$a2" name="list$withouti$t1$a2" parent="list$withouti" pos="6"> 
//   <o line="140" loc="Φ.org.eolang.collections.list$withouti$t1$a2.a" name="a" pos="7"/>
//   <o line="140" loc="Φ.org.eolang.collections.list$withouti$t1$a2.idx" name="idx" pos="9"/>
//   <o line="140" loc="Φ.org.eolang.collections.list$withouti$t1$a2.item" name="item" pos="13"/>
//   <o base=".if" line="141" loc="Φ.org.eolang.collections.list$withouti$t1$a2.φ" name="@" pos="8"> 
//     <o base=".eq" line="142" loc="Φ.org.eolang.collections.list$withouti$t1$a2.φ.ρ" pos="13"> 
//       <o base="idx" line="142" loc="Φ.org.eolang.collections.list$withouti$t1$a2.φ.ρ.ρ" pos="10" ref="140"/>
//       <o base="i" line="142" loc="Φ.org.eolang.collections.list$withouti$t1$a2.φ.ρ.α0" pos="17" ref="140.137.462"/>
//     </o>
//     <o base="a" line="143" loc="Φ.org.eolang.collections.list$withouti$t1$a2.φ.α0" pos="10" ref="140"/>
//     <o base=".with" line="144" loc="Φ.org.eolang.collections.list$withouti$t1$a2.φ.α1" pos="11"> 
//       <o base="a" line="144" loc="Φ.org.eolang.collections.list$withouti$t1$a2.φ.α1.ρ" pos="10" ref="140"/>
//       <o base="item" line="144" loc="Φ.org.eolang.collections.list$withouti$t1$a2.φ.α1.α0" pos="17" ref="140"/>
//     </o>
//   </o>
//   <o level="1" line="140.137.462" loc="Φ.org.eolang.collections.list$withouti$t1$a2.i" name="i"/>
// </o>
@XmirObject(name = "list$withouti$t1$a2", oname = "list$withouti$t1$a2", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/collections/list.eo")
public final class EOlist$EOwithouti$EOt1$EOa2 extends PhDefault {
  public EOlist$EOwithouti$EOt1$EOa2(final Phi sigma) {
    super(sigma);
    this.add("a", new AtFree(/* default */));
    this.add("idx", new AtFree(/* default */));
    this.add("item", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new PhMethod(rho, "idx");
        ret_base_base = new PhLocated(ret_base_base, 142, 10, "Φ.org.eolang.collections.list$withouti$t1$a2.φ.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "eq");
        ret_base = new PhLocated(ret_base, 142, 13, "Φ.org.eolang.collections.list$withouti$t1$a2.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new PhMethod(new PhMethod(rho, "σ"), "i");
          ret_base_1 = new PhLocated(ret_base_1, 142, 17, "Φ.org.eolang.collections.list$withouti$t1$a2.φ.ρ.α0");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "if");
        ret = new PhLocated(ret, 141, 8, "Φ.org.eolang.collections.list$withouti$t1$a2.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new PhMethod(rho, "a");
          ret_1 = new PhLocated(ret_1, 143, 10, "Φ.org.eolang.collections.list$withouti$t1$a2.φ.α0");
        Phi ret_2_base = new PhMethod(rho, "a");
          ret_2_base = new PhLocated(ret_2_base, 144, 10, "Φ.org.eolang.collections.list$withouti$t1$a2.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "with");
          ret_2 = new PhLocated(ret_2, 144, 11, "Φ.org.eolang.collections.list$withouti$t1$a2.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new PhMethod(rho, "item");
            ret_2_1 = new PhLocated(ret_2_1, 144, 17, "Φ.org.eolang.collections.list$withouti$t1$a2.φ.α1.α0");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }
}