
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOtxt;

import org.eolang.*;

// <o abstract="" ancestors="1" line="134" loc="Φ.org.eolang.txt.text$ends-with" name="text$ends-with" original-name="ends-with" parent="text" pos="2"> 
//   <o line="135" loc="Φ.org.eolang.txt.text$ends-with.substr" name="substr" pos="3"/>
//   <o base=".check-if-starts-from-index" line="136" loc="Φ.org.eolang.txt.text$ends-with.φ" name="@" pos="12"> 
//     <o base="index-of" line="136" loc="Φ.org.eolang.txt.text$ends-with.φ.ρ" pos="4" ref="134.150.503"/>
//     <o base="s" line="137" loc="Φ.org.eolang.txt.text$ends-with.φ.α0" pos="6" ref="134.32.503"/>
//     <o base="substr" line="138" loc="Φ.org.eolang.txt.text$ends-with.φ.α1" pos="6" ref="135"/>
//     <o base=".minus" line="139" loc="Φ.org.eolang.txt.text$ends-with.φ.α2" pos="6"> 
//       <o base=".length" line="140" loc="Φ.org.eolang.txt.text$ends-with.φ.α2.ρ" pos="9"> 
//         <o base="s" line="140" loc="Φ.org.eolang.txt.text$ends-with.φ.α2.ρ.ρ" pos="8" ref="134.32.503"/>
//       </o>
//       <o base=".length" line="141" loc="Φ.org.eolang.txt.text$ends-with.φ.α2.α0" pos="14"> 
//         <o base="substr" line="141" loc="Φ.org.eolang.txt.text$ends-with.φ.α2.α0.ρ" pos="8" ref="135"/>
//       </o>
//     </o>
//   </o>
//   <o level="1" line="134.32.503" loc="Φ.org.eolang.txt.text$ends-with.s" name="s"/>
//   <o level="1" line="134.150.503" loc="Φ.org.eolang.txt.text$ends-with.index-of" name="index-of"/>
// </o>
@XmirObject(name = "text$ends-with", oname = "ends-with", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/txt/text.eo")
public final class EOtext$EOends_with extends PhDefault {
  public EOtext$EOends_with(final Phi sigma) {
    super(sigma);
    this.add("substr", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(new PhMethod(rho, "σ"), "index-of");
        ret_base = new PhLocated(ret_base, 136, 4, "Φ.org.eolang.txt.text$ends-with.φ.ρ");
      Phi ret = new PhMethod(ret_base, "check-if-starts-from-index");
        ret = new PhLocated(ret, 136, 12, "Φ.org.eolang.txt.text$ends-with.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new PhMethod(new PhMethod(rho, "σ"), "s");
          ret_1 = new PhLocated(ret_1, 137, 6, "Φ.org.eolang.txt.text$ends-with.φ.α0");
        Phi ret_2 = new PhMethod(rho, "substr");
          ret_2 = new PhLocated(ret_2, 138, 6, "Φ.org.eolang.txt.text$ends-with.φ.α1");
        Phi ret_3_base_base = new PhMethod(new PhMethod(rho, "σ"), "s");
          ret_3_base_base = new PhLocated(ret_3_base_base, 140, 8, "Φ.org.eolang.txt.text$ends-with.φ.α2.ρ.ρ");
        Phi ret_3_base = new PhMethod(ret_3_base_base, "length");
          ret_3_base = new PhLocated(ret_3_base, 140, 9, "Φ.org.eolang.txt.text$ends-with.φ.α2.ρ");
        Phi ret_3 = new PhMethod(ret_3_base, "minus");
          ret_3 = new PhLocated(ret_3, 139, 6, "Φ.org.eolang.txt.text$ends-with.φ.α2");
        ret_3 = new PhCopy(ret_3);
          Phi ret_3_1_base = new PhMethod(rho, "substr");
            ret_3_1_base = new PhLocated(ret_3_1_base, 141, 8, "Φ.org.eolang.txt.text$ends-with.φ.α2.α0.ρ");
          Phi ret_3_1 = new PhMethod(ret_3_1_base, "length");
            ret_3_1 = new PhLocated(ret_3_1, 141, 14, "Φ.org.eolang.txt.text$ends-with.φ.α2.α0");
          ret_3 = new PhWith(ret_3, 0, ret_3_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
        ret = new PhWith(ret, 2, ret_3);
      return ret;
    })));
  }
}