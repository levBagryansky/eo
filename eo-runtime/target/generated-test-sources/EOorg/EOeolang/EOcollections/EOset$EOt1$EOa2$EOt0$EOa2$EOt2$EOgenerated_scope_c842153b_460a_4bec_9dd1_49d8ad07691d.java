
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOcollections;

import org.eolang.*;

// <o abstract="" ancestors="3" line="57" loc="Φ.org.eolang.collections.set$t1$a2$t0$a2$t2$generated-scope-c842153b-460a-4bec-9dd1-49d8ad07691d" name="set$t1$a2$t0$a2$t2$generated-scope-c842153b-460a-4bec-9dd1-49d8ad07691d" original-name="generated-scope-c842153b-460a-4bec-9dd1-49d8ad07691d" parent="set$t1$a2$t0$a2" pos="23"> 
//   <o base=".at" line="57" loc="Φ.org.eolang.collections.set$t1$a2$t0$a2$t2$generated-scope-c842153b-460a-4bec-9dd1-49d8ad07691d.org.eolang.scope-c842153b-460a-4bec-9dd1-49d8ad07691d" name="org.eolang.scope-c842153b-460a-4bec-9dd1-49d8ad07691d" pos="23" scope="scope-c842153b-460a-4bec-9dd1-49d8ad07691d"> 
//     <o base="lst" line="57" loc="Φ.org.eolang.collections.set$t1$a2$t0$a2$t2$generated-scope-c842153b-460a-4bec-9dd1-49d8ad07691d.org.eolang.scope-c842153b-460a-4bec-9dd1-49d8ad07691d.ρ" pos="20" ref="57.30.466" scope="scope-c842153b-460a-4bec-9dd1-49d8ad07691d"/>
//     <o base="index" line="57" loc="Φ.org.eolang.collections.set$t1$a2$t0$a2$t2$generated-scope-c842153b-460a-4bec-9dd1-49d8ad07691d.org.eolang.scope-c842153b-460a-4bec-9dd1-49d8ad07691d.α0" pos="27" ref="57.56.466" scope="scope-c842153b-460a-4bec-9dd1-49d8ad07691d"/>
//   </o>
//   <o base="org.eolang.scope-c842153b-460a-4bec-9dd1-49d8ad07691d" line="57" loc="Φ.org.eolang.collections.set$t1$a2$t0$a2$t2$generated-scope-c842153b-460a-4bec-9dd1-49d8ad07691d.φ" name="@" pos="23" ref="57"/>
//   <o level="1" line="57.56.466" loc="Φ.org.eolang.collections.set$t1$a2$t0$a2$t2$generated-scope-c842153b-460a-4bec-9dd1-49d8ad07691d.index" name="index"/>
//   <o level="3" line="57.30.466" loc="Φ.org.eolang.collections.set$t1$a2$t0$a2$t2$generated-scope-c842153b-460a-4bec-9dd1-49d8ad07691d.lst" name="lst"/>
// </o>
@XmirObject(name = "set$t1$a2$t0$a2$t2$generated-scope-c842153b-460a-4bec-9dd1-49d8ad07691d", oname = "generated-scope-c842153b-460a-4bec-9dd1-49d8ad07691d", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/collections/set.eo")
public final class EOset$EOt1$EOa2$EOt0$EOa2$EOt2$EOgenerated_scope_c842153b_460a_4bec_9dd1_49d8ad07691d extends PhDefault {
  public EOset$EOt1$EOa2$EOt0$EOa2$EOt2$EOgenerated_scope_c842153b_460a_4bec_9dd1_49d8ad07691d(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-c842153b-460a-4bec-9dd1-49d8ad07691d", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(new PhMethod(new PhMethod(new PhMethod(rho, "σ"), "σ"), "σ"), "lst");
        ret_base = new PhLocated(ret_base, 57, 20, "Φ.org.eolang.collections.set$t1$a2$t0$a2$t2$generated-scope-c842153b-460a-4bec-9dd1-49d8ad07691d.org.eolang.scope-c842153b-460a-4bec-9dd1-49d8ad07691d.ρ");
      Phi ret = new PhMethod(ret_base, "at");
        ret = new PhLocated(ret, 57, 23, "Φ.org.eolang.collections.set$t1$a2$t0$a2$t2$generated-scope-c842153b-460a-4bec-9dd1-49d8ad07691d.org.eolang.scope-c842153b-460a-4bec-9dd1-49d8ad07691d");
      ret = new PhCopy(ret);
        Phi ret_1 = new PhMethod(new PhMethod(rho, "σ"), "index");
          ret_1 = new PhLocated(ret_1, 57, 27, "Φ.org.eolang.collections.set$t1$a2$t0$a2$t2$generated-scope-c842153b-460a-4bec-9dd1-49d8ad07691d.org.eolang.scope-c842153b-460a-4bec-9dd1-49d8ad07691d.α0");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-c842153b-460a-4bec-9dd1-49d8ad07691d");
        ret = new PhLocated(ret, 57, 23, "Φ.org.eolang.collections.set$t1$a2$t0$a2$t2$generated-scope-c842153b-460a-4bec-9dd1-49d8ad07691d.φ");
      return ret;
    })));
  }
}
