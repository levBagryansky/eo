
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOcollections;

import org.eolang.*;

// <o abstract="" ancestors="3" line="153" loc="Φ.org.eolang.collections.multimap$rebuilded$comparable-pair$lt" name="multimap$rebuilded$comparable-pair$lt" original-name="lt" parent="multimap$rebuilded$comparable-pair" pos="6"> 
//   <o line="153" loc="Φ.org.eolang.collections.multimap$rebuilded$comparable-pair$lt.x" name="x" pos="7"/>
//   <o base=".lt" line="154" loc="Φ.org.eolang.collections.multimap$rebuilded$comparable-pair$lt.φ" name="@" pos="8"> 
//     <o base=".at" line="155" loc="Φ.org.eolang.collections.multimap$rebuilded$comparable-pair$lt.φ.ρ" pos="11"> 
//       <o base="^" line="155" loc="Φ.org.eolang.collections.multimap$rebuilded$comparable-pair$lt.φ.ρ.ρ" pos="10"/>
//       <o base="org.eolang.int" data="int" line="155" loc="Φ.org.eolang.collections.multimap$rebuilded$comparable-pair$lt.φ.ρ.α0" pos="15">0</o>
//     </o>
//     <o base=".at" line="156" loc="Φ.org.eolang.collections.multimap$rebuilded$comparable-pair$lt.φ.α0" pos="11"> 
//       <o base="x" line="156" loc="Φ.org.eolang.collections.multimap$rebuilded$comparable-pair$lt.φ.α0.ρ" pos="10" ref="153"/>
//       <o base="org.eolang.int" data="int" line="156" loc="Φ.org.eolang.collections.multimap$rebuilded$comparable-pair$lt.φ.α0.α0" pos="15">0</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "multimap$rebuilded$comparable-pair$lt", oname = "lt", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/collections/multimap.eo")
public final class EOmultimap$EOrebuilded$EOcomparable_pair$EOlt extends PhDefault {
  public EOmultimap$EOrebuilded$EOcomparable_pair$EOlt(final Phi sigma) {
    super(sigma);
    this.add("x", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new PhMethod(rho, "ρ");
        ret_base_base = new PhLocated(ret_base_base, 155, 10, "Φ.org.eolang.collections.multimap$rebuilded$comparable-pair$lt.φ.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "at");
        ret_base = new PhLocated(ret_base, 155, 11, "Φ.org.eolang.collections.multimap$rebuilded$comparable-pair$lt.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_base_1 = new PhLocated(ret_base_1, 155, 15, "Φ.org.eolang.collections.multimap$rebuilded$comparable-pair$lt.φ.ρ.α0");
          ret_base_1 = new PhWith(ret_base_1, "Δ", new Data.Value<>(0L));
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "lt");
        ret = new PhLocated(ret, 154, 8, "Φ.org.eolang.collections.multimap$rebuilded$comparable-pair$lt.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(rho, "x");
          ret_1_base = new PhLocated(ret_1_base, 156, 10, "Φ.org.eolang.collections.multimap$rebuilded$comparable-pair$lt.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "at");
          ret_1 = new PhLocated(ret_1, 156, 11, "Φ.org.eolang.collections.multimap$rebuilded$comparable-pair$lt.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_1 = new PhLocated(ret_1_1, 156, 15, "Φ.org.eolang.collections.multimap$rebuilded$comparable-pair$lt.φ.α0.α0");
            ret_1_1 = new PhWith(ret_1_1, "Δ", new Data.Value<>(0L));
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }
}