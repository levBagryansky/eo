
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOcollections;

import org.eolang.*;

// <o abstract="" ancestors="3" line="232" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t1$generated-scope-20211ae3-c835-49c5-bf31-ca77d6d50114" name="list$sorted$t3$a1$t1$t1$generated-scope-20211ae3-c835-49c5-bf31-ca77d6d50114" original-name="generated-scope-20211ae3-c835-49c5-bf31-ca77d6d50114" parent="list$sorted$t3$a1" pos="20"> 
//   <o base=".plus" line="232" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t1$generated-scope-20211ae3-c835-49c5-bf31-ca77d6d50114.org.eolang.scope-20211ae3-c835-49c5-bf31-ca77d6d50114" name="org.eolang.scope-20211ae3-c835-49c5-bf31-ca77d6d50114" pos="20" scope="scope-20211ae3-c835-49c5-bf31-ca77d6d50114"> 
//     <o base="i" line="232" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t1$generated-scope-20211ae3-c835-49c5-bf31-ca77d6d50114.org.eolang.scope-20211ae3-c835-49c5-bf31-ca77d6d50114.ρ" pos="19" ref="232.225.463" scope="scope-20211ae3-c835-49c5-bf31-ca77d6d50114"/>
//     <o base="org.eolang.int" data="int" line="232" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t1$generated-scope-20211ae3-c835-49c5-bf31-ca77d6d50114.org.eolang.scope-20211ae3-c835-49c5-bf31-ca77d6d50114.α0" pos="26" scope="scope-20211ae3-c835-49c5-bf31-ca77d6d50114">1</o>
//   </o>
//   <o base="org.eolang.scope-20211ae3-c835-49c5-bf31-ca77d6d50114" line="232" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t1$generated-scope-20211ae3-c835-49c5-bf31-ca77d6d50114.φ" name="@" pos="20" ref="232"/>
//   <o level="2" line="232.220.463" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t1$generated-scope-20211ae3-c835-49c5-bf31-ca77d6d50114.res" name="res"/>
//   <o level="2" line="232.225.463" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t1$generated-scope-20211ae3-c835-49c5-bf31-ca77d6d50114.i" name="i"/>
//   <o level="2" line="232.226.463" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t1$generated-scope-20211ae3-c835-49c5-bf31-ca77d6d50114.j" name="j"/>
//   <o level="2" line="232.253.463" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t1$generated-scope-20211ae3-c835-49c5-bf31-ca77d6d50114.swap" name="swap"/>
//   <o level="3" line="232.28.463" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t1$generated-scope-20211ae3-c835-49c5-bf31-ca77d6d50114.arr" name="arr"/>
// </o>
@XmirObject(name = "list$sorted$t3$a1$t1$t1$generated-scope-20211ae3-c835-49c5-bf31-ca77d6d50114", oname = "generated-scope-20211ae3-c835-49c5-bf31-ca77d6d50114", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/collections/list.eo")
public final class EOlist$EOsorted$EOt3$EOa1$EOt1$EOt1$EOgenerated_scope_20211ae3_c835_49c5_bf31_ca77d6d50114 extends PhDefault {
  public EOlist$EOsorted$EOt3$EOa1$EOt1$EOt1$EOgenerated_scope_20211ae3_c835_49c5_bf31_ca77d6d50114(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-20211ae3-c835-49c5-bf31-ca77d6d50114", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(new PhMethod(new PhMethod(rho, "σ"), "σ"), "i");
        ret_base = new PhLocated(ret_base, 232, 19, "Φ.org.eolang.collections.list$sorted$t3$a1$t1$t1$generated-scope-20211ae3-c835-49c5-bf31-ca77d6d50114.org.eolang.scope-20211ae3-c835-49c5-bf31-ca77d6d50114.ρ");
      Phi ret = new PhMethod(ret_base, "plus");
        ret = new PhLocated(ret, 232, 20, "Φ.org.eolang.collections.list$sorted$t3$a1$t1$t1$generated-scope-20211ae3-c835-49c5-bf31-ca77d6d50114.org.eolang.scope-20211ae3-c835-49c5-bf31-ca77d6d50114");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 232, 26, "Φ.org.eolang.collections.list$sorted$t3$a1$t1$t1$generated-scope-20211ae3-c835-49c5-bf31-ca77d6d50114.org.eolang.scope-20211ae3-c835-49c5-bf31-ca77d6d50114.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(1L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-20211ae3-c835-49c5-bf31-ca77d6d50114");
        ret = new PhLocated(ret, 232, 20, "Φ.org.eolang.collections.list$sorted$t3$a1$t1$t1$generated-scope-20211ae3-c835-49c5-bf31-ca77d6d50114.φ");
      return ret;
    })));
  }
}
