
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOcollections;

import org.eolang.*;

// <o abstract="" ancestors="2" line="132" loc="Φ.org.eolang.collections.list$each$t1$t0$a2" name="list$each$t1$t0$a2" parent="list$each" pos="8"> 
//   <o line="132" loc="Φ.org.eolang.collections.list$each$t1$t0$a2.a" name="a" pos="9"/>
//   <o line="132" loc="Φ.org.eolang.collections.list$each$t1$t0$a2.x" name="x" pos="11"/>
//   <o base="f" line="133" loc="Φ.org.eolang.collections.list$each$t1$t0$a2.φ" name="@" pos="10" ref="132.128.461"> 
//     <o base="x" line="133" loc="Φ.org.eolang.collections.list$each$t1$t0$a2.φ.α0" pos="12" ref="132"/>
//   </o>
//   <o level="1" line="132.128.461" loc="Φ.org.eolang.collections.list$each$t1$t0$a2.f" name="f"/>
// </o>
@XmirObject(name = "list$each$t1$t0$a2", oname = "list$each$t1$t0$a2", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/collections/list.eo")
public final class EOlist$EOeach$EOt1$EOt0$EOa2 extends PhDefault {
  public EOlist$EOeach$EOt1$EOt0$EOa2(final Phi sigma) {
    super(sigma);
    this.add("a", new AtFree(/* default */));
    this.add("x", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(new PhMethod(rho, "σ"), "f");
        ret = new PhLocated(ret, 133, 10, "Φ.org.eolang.collections.list$each$t1$t0$a2.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new PhMethod(rho, "x");
          ret_1 = new PhLocated(ret_1, 133, 12, "Φ.org.eolang.collections.list$each$t1$t0$a2.φ.α0");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }
}
