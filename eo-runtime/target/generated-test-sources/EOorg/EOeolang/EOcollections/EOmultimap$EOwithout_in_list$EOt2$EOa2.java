
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOcollections;

import org.eolang.*;

// <o abstract="" ancestors="2" line="105" loc="Φ.org.eolang.collections.multimap$without-in-list$t2$a2" name="multimap$without-in-list$t2$a2" parent="multimap$without-in-list" pos="6"> 
//   <o line="105" loc="Φ.org.eolang.collections.multimap$without-in-list$t2$a2.a" name="a" pos="7"/>
//   <o line="105" loc="Φ.org.eolang.collections.multimap$without-in-list$t2$a2.x" name="x" pos="9"/>
//   <o base=".if" line="106" loc="Φ.org.eolang.collections.multimap$without-in-list$t2$a2.φ" name="@" pos="8"> 
//     <o base=".eq" line="107" loc="Φ.org.eolang.collections.multimap$without-in-list$t2$a2.φ.ρ" pos="10"> 
//       <o base="key" line="108" loc="Φ.org.eolang.collections.multimap$without-in-list$t2$a2.φ.ρ.ρ" pos="12" ref="105.100.503"/>
//       <o base=".at" line="109" loc="Φ.org.eolang.collections.multimap$without-in-list$t2$a2.φ.ρ.α0" pos="13"> 
//         <o base="x" line="109" loc="Φ.org.eolang.collections.multimap$without-in-list$t2$a2.φ.ρ.α0.ρ" pos="12" ref="105"/>
//         <o base="org.eolang.int" data="int" line="109" loc="Φ.org.eolang.collections.multimap$without-in-list$t2$a2.φ.ρ.α0.α0" pos="17">0</o>
//       </o>
//     </o>
//     <o base="a" line="110" loc="Φ.org.eolang.collections.multimap$without-in-list$t2$a2.φ.α0" pos="10" ref="105"/>
//     <o base=".with" line="111" loc="Φ.org.eolang.collections.multimap$without-in-list$t2$a2.φ.α1" pos="11"> 
//       <o base="a" line="111" loc="Φ.org.eolang.collections.multimap$without-in-list$t2$a2.φ.α1.ρ" pos="10" ref="105"/>
//       <o base="x" line="111" loc="Φ.org.eolang.collections.multimap$without-in-list$t2$a2.φ.α1.α0" pos="17" ref="105"/>
//     </o>
//   </o>
//   <o level="1" line="105.100.503" loc="Φ.org.eolang.collections.multimap$without-in-list$t2$a2.key" name="key"/>
// </o>
@XmirObject(name = "multimap$without-in-list$t2$a2", oname = "multimap$without-in-list$t2$a2", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/collections/multimap.eo")
public final class EOmultimap$EOwithout_in_list$EOt2$EOa2 extends PhDefault {
  public EOmultimap$EOwithout_in_list$EOt2$EOa2(final Phi sigma) {
    super(sigma);
    this.add("a", new AtFree(/* default */));
    this.add("x", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new PhMethod(new PhMethod(rho, "σ"), "key");
        ret_base_base = new PhLocated(ret_base_base, 108, 12, "Φ.org.eolang.collections.multimap$without-in-list$t2$a2.φ.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "eq");
        ret_base = new PhLocated(ret_base, 107, 10, "Φ.org.eolang.collections.multimap$without-in-list$t2$a2.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1_base = new PhMethod(rho, "x");
          ret_base_1_base = new PhLocated(ret_base_1_base, 109, 12, "Φ.org.eolang.collections.multimap$without-in-list$t2$a2.φ.ρ.α0.ρ");
        Phi ret_base_1 = new PhMethod(ret_base_1_base, "at");
          ret_base_1 = new PhLocated(ret_base_1, 109, 13, "Φ.org.eolang.collections.multimap$without-in-list$t2$a2.φ.ρ.α0");
        ret_base_1 = new PhCopy(ret_base_1);
          Phi ret_base_1_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_base_1_1 = new PhLocated(ret_base_1_1, 109, 17, "Φ.org.eolang.collections.multimap$without-in-list$t2$a2.φ.ρ.α0.α0");
            ret_base_1_1 = new PhWith(ret_base_1_1, "Δ", new Data.Value<>(0L));
          ret_base_1 = new PhWith(ret_base_1, 0, ret_base_1_1);
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "if");
        ret = new PhLocated(ret, 106, 8, "Φ.org.eolang.collections.multimap$without-in-list$t2$a2.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new PhMethod(rho, "a");
          ret_1 = new PhLocated(ret_1, 110, 10, "Φ.org.eolang.collections.multimap$without-in-list$t2$a2.φ.α0");
        Phi ret_2_base = new PhMethod(rho, "a");
          ret_2_base = new PhLocated(ret_2_base, 111, 10, "Φ.org.eolang.collections.multimap$without-in-list$t2$a2.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "with");
          ret_2 = new PhLocated(ret_2, 111, 11, "Φ.org.eolang.collections.multimap$without-in-list$t2$a2.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new PhMethod(rho, "x");
            ret_2_1 = new PhLocated(ret_2_1, 111, 17, "Φ.org.eolang.collections.multimap$without-in-list$t2$a2.φ.α1.α0");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }
}
