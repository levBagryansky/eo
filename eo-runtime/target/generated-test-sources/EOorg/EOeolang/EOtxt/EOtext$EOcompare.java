
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOtxt;

import org.eolang.*;

// <o abstract="" ancestors="1" line="315" loc="Φ.org.eolang.txt.text$compare" name="text$compare" original-name="compare" parent="text" pos="2"> 
//   <o line="319" loc="Φ.org.eolang.txt.text$compare.other" name="other" pos="3"/>
//   <o base="org.eolang.collections.bytes-as-array" const="" line="320" loc="Φ.org.eolang.txt.text$compare.b1" name="b1" pos="4"> 
//     <o base=".as-bytes" line="321" loc="Φ.org.eolang.txt.text$compare.b1.α0" pos="6"> 
//       <o base="s" line="322" loc="Φ.org.eolang.txt.text$compare.b1.α0.ρ" pos="8" ref="315.32.499"/>
//     </o>
//   </o>
//   <o base="org.eolang.collections.bytes-as-array" const="" line="323" loc="Φ.org.eolang.txt.text$compare.b2" name="b2" pos="4"> 
//     <o base=".as-bytes" line="324" loc="Φ.org.eolang.txt.text$compare.b2.α0" pos="6"> 
//       <o base="other" line="325" loc="Φ.org.eolang.txt.text$compare.b2.α0.ρ" pos="8" ref="319"/>
//     </o>
//   </o>
//   <o base=".if" line="326" loc="Φ.org.eolang.txt.text$compare.φ" name="@" pos="4"> 
//     <o base=".eq" line="327" loc="Φ.org.eolang.txt.text$compare.φ.ρ" pos="6"> 
//       <o base=".length" line="328" loc="Φ.org.eolang.txt.text$compare.φ.ρ.ρ" pos="8"> 
//         <o base="s" line="329" loc="Φ.org.eolang.txt.text$compare.φ.ρ.ρ.ρ" pos="10" ref="315.32.499"/>
//       </o>
//       <o base=".length" line="330" loc="Φ.org.eolang.txt.text$compare.φ.ρ.α0" pos="8"> 
//         <o base="other" line="331" loc="Φ.org.eolang.txt.text$compare.φ.ρ.α0.ρ" pos="10" ref="319"/>
//       </o>
//     </o>
//     <o base=".reducedi" line="332" loc="Φ.org.eolang.txt.text$compare.φ.α0" pos="6"> 
//       <o base="org.eolang.collections.list" line="333" loc="Φ.org.eolang.txt.text$compare.φ.α0.ρ" pos="8"> 
//         <o base="b1" line="334" loc="Φ.org.eolang.txt.text$compare.φ.α0.ρ.α0" pos="10" ref="320"/>
//       </o>
//       <o base="org.eolang.int" data="int" line="335" loc="Φ.org.eolang.txt.text$compare.φ.α0.α0" pos="8">0</o>
//       <o base="text$compare$t3$t1$a2" cut="361" line="336" loc="Φ.org.eolang.txt.text$compare.φ.α0.α1" pos="8" ref="336"> 
//         <o as="b1" base="b1" level="1" loc="Φ.org.eolang.txt.text$compare.φ.α0.α1.α0" ref="320"/>
//         <o as="b2" base="b2" level="1" loc="Φ.org.eolang.txt.text$compare.φ.α0.α1.α1" ref="323"/>
//         <o as="s" base="s" level="2" loc="Φ.org.eolang.txt.text$compare.φ.α0.α1.α2" ref="315.32.499"/>
//         <o as="is-alphabetic" base="is-alphabetic" level="2" loc="Φ.org.eolang.txt.text$compare.φ.α0.α1.α3" ref="315.375.499"/>
//       </o>
//     </o>
//     <o base=".minus" line="366" loc="Φ.org.eolang.txt.text$compare.φ.α1" pos="6"> 
//       <o base=".length" line="367" loc="Φ.org.eolang.txt.text$compare.φ.α1.ρ" pos="8"> 
//         <o base="s" line="368" loc="Φ.org.eolang.txt.text$compare.φ.α1.ρ.ρ" pos="10" ref="315.32.499"/>
//       </o>
//       <o base=".length" line="369" loc="Φ.org.eolang.txt.text$compare.φ.α1.α0" pos="8"> 
//         <o base="other" line="370" loc="Φ.org.eolang.txt.text$compare.φ.α1.α0.ρ" pos="10" ref="319"/>
//       </o>
//     </o>
//   </o>
//   <o level="1" line="315.32.499" loc="Φ.org.eolang.txt.text$compare.s" name="s"/>
//   <o level="1" line="315.375.499" loc="Φ.org.eolang.txt.text$compare.is-alphabetic" name="is-alphabetic"/>
// </o>
@XmirObject(name = "text$compare", oname = "compare", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/txt/text.eo")
public final class EOtext$EOcompare extends PhDefault {
  public EOtext$EOcompare(final Phi sigma) {
    super(sigma);
    this.add("other", new AtFree(/* default */));
    this.add("b1", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("collections").get().attr("bytes-as-array").get();
        ret = new PhLocated(ret, 320, 4, "Φ.org.eolang.txt.text$compare.b1");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(new PhMethod(rho, "σ"), "s");
          ret_1_base = new PhLocated(ret_1_base, 322, 8, "Φ.org.eolang.txt.text$compare.b1.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "as-bytes");
          ret_1 = new PhLocated(ret_1, 321, 6, "Φ.org.eolang.txt.text$compare.b1.α0");
        ret = new PhWith(ret, 0, ret_1);
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("b2", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("collections").get().attr("bytes-as-array").get();
        ret = new PhLocated(ret, 323, 4, "Φ.org.eolang.txt.text$compare.b2");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(rho, "other");
          ret_1_base = new PhLocated(ret_1_base, 325, 8, "Φ.org.eolang.txt.text$compare.b2.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "as-bytes");
          ret_1 = new PhLocated(ret_1, 324, 6, "Φ.org.eolang.txt.text$compare.b2.α0");
        ret = new PhWith(ret, 0, ret_1);
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base_base = new PhMethod(new PhMethod(rho, "σ"), "s");
        ret_base_base_base = new PhLocated(ret_base_base_base, 329, 10, "Φ.org.eolang.txt.text$compare.φ.ρ.ρ.ρ");
      Phi ret_base_base = new PhMethod(ret_base_base_base, "length");
        ret_base_base = new PhLocated(ret_base_base, 328, 8, "Φ.org.eolang.txt.text$compare.φ.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "eq");
        ret_base = new PhLocated(ret_base, 327, 6, "Φ.org.eolang.txt.text$compare.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1_base = new PhMethod(rho, "other");
          ret_base_1_base = new PhLocated(ret_base_1_base, 331, 10, "Φ.org.eolang.txt.text$compare.φ.ρ.α0.ρ");
        Phi ret_base_1 = new PhMethod(ret_base_1_base, "length");
          ret_base_1 = new PhLocated(ret_base_1, 330, 8, "Φ.org.eolang.txt.text$compare.φ.ρ.α0");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "if");
        ret = new PhLocated(ret, 326, 4, "Φ.org.eolang.txt.text$compare.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("collections").get().attr("list").get();
          ret_1_base = new PhLocated(ret_1_base, 333, 8, "Φ.org.eolang.txt.text$compare.φ.α0.ρ");
        ret_1_base = new PhCopy(ret_1_base);
          Phi ret_1_base_1 = new PhMethod(rho, "b1");
            ret_1_base_1 = new PhLocated(ret_1_base_1, 334, 10, "Φ.org.eolang.txt.text$compare.φ.α0.ρ.α0");
          ret_1_base = new PhWith(ret_1_base, 0, ret_1_base_1);
        Phi ret_1 = new PhMethod(ret_1_base, "reducedi");
          ret_1 = new PhLocated(ret_1, 332, 6, "Φ.org.eolang.txt.text$compare.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_1 = new PhLocated(ret_1_1, 335, 8, "Φ.org.eolang.txt.text$compare.φ.α0.α0");
            ret_1_1 = new PhWith(ret_1_1, "Δ", new Data.Value<>(0L));
          Phi ret_1_2 = new EOtext$EOcompare$EOt3$EOt1$EOa2(rho);
            ret_1_2 = new PhLocated(ret_1_2, 336, 8, "Φ.org.eolang.txt.text$compare.φ.α0.α1");
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
          ret_1 = new PhWith(ret_1, 1, ret_1_2);
        Phi ret_2_base_base = new PhMethod(new PhMethod(rho, "σ"), "s");
          ret_2_base_base = new PhLocated(ret_2_base_base, 368, 10, "Φ.org.eolang.txt.text$compare.φ.α1.ρ.ρ");
        Phi ret_2_base = new PhMethod(ret_2_base_base, "length");
          ret_2_base = new PhLocated(ret_2_base, 367, 8, "Φ.org.eolang.txt.text$compare.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "minus");
          ret_2 = new PhLocated(ret_2, 366, 6, "Φ.org.eolang.txt.text$compare.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = new PhMethod(rho, "other");
            ret_2_1_base = new PhLocated(ret_2_1_base, 370, 10, "Φ.org.eolang.txt.text$compare.φ.α1.α0.ρ");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "length");
            ret_2_1 = new PhLocated(ret_2_1, 369, 8, "Φ.org.eolang.txt.text$compare.φ.α1.α0");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }
}
