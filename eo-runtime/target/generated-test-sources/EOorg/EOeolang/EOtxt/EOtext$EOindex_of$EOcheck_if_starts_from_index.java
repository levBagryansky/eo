
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOtxt;

import org.eolang.*;

// <o abstract="" ancestors="2" line="175" loc="Φ.org.eolang.txt.text$index-of$check-if-starts-from-index" name="text$index-of$check-if-starts-from-index" original-name="check-if-starts-from-index" parent="text$index-of" pos="4"> 
//   <o line="177" loc="Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.str" name="str" pos="5"/>
//   <o line="177" loc="Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.substr" name="substr" pos="9"/>
//   <o line="177" loc="Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.index" name="index" pos="16"/>
//   <o base=".length" const="" line="178" loc="Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.lstr" name="lstr" pos="9"> 
//     <o base="str" line="178" loc="Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.lstr.ρ" pos="6" ref="177"/>
//   </o>
//   <o base=".length" const="" line="179" loc="Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.lsub" name="lsub" pos="12"> 
//     <o base="substr" line="179" loc="Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.lsub.ρ" pos="6" ref="177"/>
//   </o>
//   <o base=".if" line="180" loc="Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ" name="@" pos="6"> 
//     <o base=".gt" line="181" loc="Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ.ρ" pos="8"> 
//       <o base=".plus" line="182" loc="Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ.ρ.ρ" pos="10"> 
//         <o base="index" line="183" loc="Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ.ρ.ρ.ρ" pos="12" ref="177"/>
//         <o base="lsub" line="184" loc="Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ.ρ.ρ.α0" pos="12" ref="179"/>
//       </o>
//       <o base="lstr" line="185" loc="Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ.ρ.α0" pos="10" ref="178"/>
//     </o>
//     <o base="org.eolang.bool" data="bool" line="186" loc="Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ.α0" pos="8">FALSE</o>
//     <o base=".eq" line="187" loc="Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ.α1" pos="8"> 
//       <o base="substr" line="188" loc="Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ.α1.ρ" pos="10" ref="177"/>
//       <o base=".slice" line="189" loc="Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ.α1.α0" pos="10"> 
//         <o base="str" line="190" loc="Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ.α1.α0.ρ" pos="12" ref="177"/>
//         <o base="index" line="191" loc="Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ.α1.α0.α0" pos="12" ref="177"/>
//         <o base="lsub" line="192" loc="Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ.α1.α0.α1" pos="12" ref="179"/>
//       </o>
//     </o>
//   </o>
//   <o level="2" line="175.32.498" loc="Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.s" name="s"/>
// </o>
@XmirObject(name = "text$index-of$check-if-starts-from-index", oname = "check-if-starts-from-index", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/txt/text.eo")
public final class EOtext$EOindex_of$EOcheck_if_starts_from_index extends PhDefault {
  public EOtext$EOindex_of$EOcheck_if_starts_from_index(final Phi sigma) {
    super(sigma);
    this.add("str", new AtFree(/* default */));
    this.add("substr", new AtFree(/* default */));
    this.add("index", new AtFree(/* default */));
    this.add("lstr", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "str");
        ret_base = new PhLocated(ret_base, 178, 6, "Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.lstr.ρ");
      Phi ret = new PhMethod(ret_base, "length");
        ret = new PhLocated(ret, 178, 9, "Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.lstr");
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("lsub", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "substr");
        ret_base = new PhLocated(ret_base, 179, 6, "Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.lsub.ρ");
      Phi ret = new PhMethod(ret_base, "length");
        ret = new PhLocated(ret, 179, 12, "Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.lsub");
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base_base = new PhMethod(rho, "index");
        ret_base_base_base = new PhLocated(ret_base_base_base, 183, 12, "Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ.ρ.ρ.ρ");
      Phi ret_base_base = new PhMethod(ret_base_base_base, "plus");
        ret_base_base = new PhLocated(ret_base_base, 182, 10, "Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ.ρ.ρ");
      ret_base_base = new PhCopy(ret_base_base);
        Phi ret_base_base_1 = new PhMethod(rho, "lsub");
          ret_base_base_1 = new PhLocated(ret_base_base_1, 184, 12, "Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ.ρ.ρ.α0");
        ret_base_base = new PhWith(ret_base_base, 0, ret_base_base_1);
      Phi ret_base = new PhMethod(ret_base_base, "gt");
        ret_base = new PhLocated(ret_base, 181, 8, "Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new PhMethod(rho, "lstr");
          ret_base_1 = new PhLocated(ret_base_1, 185, 10, "Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ.ρ.α0");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "if");
        ret = new PhLocated(ret, 180, 6, "Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EObool(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 186, 8, "Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(Boolean.FALSE));
        Phi ret_2_base = new PhMethod(rho, "substr");
          ret_2_base = new PhLocated(ret_2_base, 188, 10, "Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "eq");
          ret_2 = new PhLocated(ret_2, 187, 8, "Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = new PhMethod(rho, "str");
            ret_2_1_base = new PhLocated(ret_2_1_base, 190, 12, "Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ.α1.α0.ρ");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "slice");
            ret_2_1 = new PhLocated(ret_2_1, 189, 10, "Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ.α1.α0");
          ret_2_1 = new PhCopy(ret_2_1);
            Phi ret_2_1_1 = new PhMethod(rho, "index");
              ret_2_1_1 = new PhLocated(ret_2_1_1, 191, 12, "Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ.α1.α0.α0");
            Phi ret_2_1_2 = new PhMethod(rho, "lsub");
              ret_2_1_2 = new PhLocated(ret_2_1_2, 192, 12, "Φ.org.eolang.txt.text$index-of$check-if-starts-from-index.φ.α1.α0.α1");
            ret_2_1 = new PhWith(ret_2_1, 0, ret_2_1_1);
            ret_2_1 = new PhWith(ret_2_1, 1, ret_2_1_2);
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }
}