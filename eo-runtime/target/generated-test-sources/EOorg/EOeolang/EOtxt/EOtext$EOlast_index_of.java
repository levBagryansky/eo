
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOtxt;

import org.eolang.*;

// <o abstract="" ancestors="1" line="227" loc="Φ.org.eolang.txt.text$last-index-of" name="text$last-index-of" original-name="last-index-of" parent="text" pos="2"> 
//   <o line="229" loc="Φ.org.eolang.txt.text$last-index-of.substr" name="substr" pos="3"/>
//   <o base="org.eolang.collections.bytes-as-array" const="" line="230" loc="Φ.org.eolang.txt.text$last-index-of.bytes-view" name="bytes-view" pos="4"> 
//     <o base=".as-bytes" line="231" loc="Φ.org.eolang.txt.text$last-index-of.bytes-view.α0" pos="6"> 
//       <o base="s" line="232" loc="Φ.org.eolang.txt.text$last-index-of.bytes-view.α0.ρ" pos="8" ref="227.32.501"/>
//     </o>
//   </o>
//   <o base=".reducedi" line="233" loc="Φ.org.eolang.txt.text$last-index-of.φ" name="@" pos="4"> 
//     <o base="org.eolang.collections.list" line="234" loc="Φ.org.eolang.txt.text$last-index-of.φ.ρ" pos="6"> 
//       <o base="bytes-view" line="235" loc="Φ.org.eolang.txt.text$last-index-of.φ.ρ.α0" pos="8" ref="230"/>
//     </o>
//     <o base="org.eolang.int" data="int" line="236" loc="Φ.org.eolang.txt.text$last-index-of.φ.α0" pos="6">-1</o>
//     <o base="text$last-index-of$t2$a2" cut="261" line="237" loc="Φ.org.eolang.txt.text$last-index-of.φ.α1" pos="6" ref="237"> 
//       <o as="substr" base="substr" level="1" loc="Φ.org.eolang.txt.text$last-index-of.φ.α1.α0" ref="229"/>
//       <o as="s" base="s" level="2" loc="Φ.org.eolang.txt.text$last-index-of.φ.α1.α1" ref="227.32.501"/>
//       <o as="index-of" base="index-of" level="2" loc="Φ.org.eolang.txt.text$last-index-of.φ.α1.α2" ref="227.150.501"/>
//     </o>
//   </o>
//   <o level="1" line="227.32.501" loc="Φ.org.eolang.txt.text$last-index-of.s" name="s"/>
//   <o level="1" line="227.150.501" loc="Φ.org.eolang.txt.text$last-index-of.index-of" name="index-of"/>
// </o>
@XmirObject(name = "text$last-index-of", oname = "last-index-of", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/txt/text.eo")
public final class EOtext$EOlast_index_of extends PhDefault {
  public EOtext$EOlast_index_of(final Phi sigma) {
    super(sigma);
    this.add("substr", new AtFree(/* default */));
    this.add("bytes-view", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("collections").get().attr("bytes-as-array").get();
        ret = new PhLocated(ret, 230, 4, "Φ.org.eolang.txt.text$last-index-of.bytes-view");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(new PhMethod(rho, "σ"), "s");
          ret_1_base = new PhLocated(ret_1_base, 232, 8, "Φ.org.eolang.txt.text$last-index-of.bytes-view.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "as-bytes");
          ret_1 = new PhLocated(ret_1, 231, 6, "Φ.org.eolang.txt.text$last-index-of.bytes-view.α0");
        ret = new PhWith(ret, 0, ret_1);
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("collections").get().attr("list").get();
        ret_base = new PhLocated(ret_base, 234, 6, "Φ.org.eolang.txt.text$last-index-of.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new PhMethod(rho, "bytes-view");
          ret_base_1 = new PhLocated(ret_base_1, 235, 8, "Φ.org.eolang.txt.text$last-index-of.φ.ρ.α0");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "reducedi");
        ret = new PhLocated(ret, 233, 4, "Φ.org.eolang.txt.text$last-index-of.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 236, 6, "Φ.org.eolang.txt.text$last-index-of.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(-1L));
        Phi ret_2 = new EOtext$EOlast_index_of$EOt2$EOa2(rho);
          ret_2 = new PhLocated(ret_2, 237, 6, "Φ.org.eolang.txt.text$last-index-of.φ.α1");
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }
}