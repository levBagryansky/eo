
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOcollections;

import org.eolang.*;

// <o abstract="" ancestors="1" line="180" loc="Φ.org.eolang.collections.list$index-of" name="list$index-of" original-name="index-of" parent="list" pos="2"> 
//   <o line="182" loc="Φ.org.eolang.collections.list$index-of.wanted" name="wanted" pos="3"/>
//   <o base=".reducedi" line="183" loc="Φ.org.eolang.collections.list$index-of.φ" name="@" pos="5"> 
//     <o base="^" line="183" loc="Φ.org.eolang.collections.list$index-of.φ.ρ" pos="4"/>
//     <o base="org.eolang.int" data="int" line="184" loc="Φ.org.eolang.collections.list$index-of.φ.α0" pos="6">-1</o>
//     <o base="list$index-of$t1$a2" cut="199" line="185" loc="Φ.org.eolang.collections.list$index-of.φ.α1" pos="6" ref="185"> 
//       <o as="wanted" base="wanted" level="1" loc="Φ.org.eolang.collections.list$index-of.φ.α1.α0" ref="182"/>
//     </o>
//   </o>
// </o>
@XmirObject(name = "list$index-of", oname = "index-of", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/collections/list.eo")
public final class EOlist$EOindex_of extends PhDefault {
  public EOlist$EOindex_of(final Phi sigma) {
    super(sigma);
    this.add("wanted", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "ρ");
        ret_base = new PhLocated(ret_base, 183, 4, "Φ.org.eolang.collections.list$index-of.φ.ρ");
      Phi ret = new PhMethod(ret_base, "reducedi");
        ret = new PhLocated(ret, 183, 5, "Φ.org.eolang.collections.list$index-of.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 184, 6, "Φ.org.eolang.collections.list$index-of.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(-1L));
        Phi ret_2 = new EOlist$EOindex_of$EOt1$EOa2(rho);
          ret_2 = new PhLocated(ret_2, 185, 6, "Φ.org.eolang.collections.list$index-of.φ.α1");
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }
}