
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOtxt;

import org.eolang.*;

// <o abstract="" ancestors="2" line="396" loc="Φ.org.eolang.txt.text$is-alphabetic$int-is-alpha" name="text$is-alphabetic$int-is-alpha" original-name="int-is-alpha" parent="text$is-alphabetic" pos="4"> 
//   <o line="396" loc="Φ.org.eolang.txt.text$is-alphabetic$int-is-alpha.b" name="b" pos="5"/>
//   <o base=".and" line="397" loc="Φ.org.eolang.txt.text$is-alphabetic$int-is-alpha.φ" name="@" pos="6"> 
//     <o base=".gte" line="398" loc="Φ.org.eolang.txt.text$is-alphabetic$int-is-alpha.φ.ρ" pos="8"> 
//       <o base="b" line="399" loc="Φ.org.eolang.txt.text$is-alphabetic$int-is-alpha.φ.ρ.ρ" pos="10" ref="396"/>
//       <o base="org.eolang.int" data="int" line="400" loc="Φ.org.eolang.txt.text$is-alphabetic$int-is-alpha.φ.ρ.α0" pos="10">97</o>
//     </o>
//     <o base=".lte" line="401" loc="Φ.org.eolang.txt.text$is-alphabetic$int-is-alpha.φ.α0" pos="8"> 
//       <o base="b" line="402" loc="Φ.org.eolang.txt.text$is-alphabetic$int-is-alpha.φ.α0.ρ" pos="10" ref="396"/>
//       <o base="org.eolang.int" data="int" line="403" loc="Φ.org.eolang.txt.text$is-alphabetic$int-is-alpha.φ.α0.α0" pos="10">122</o>
//     </o>
//   </o>
//   <o level="2" line="396.32.503" loc="Φ.org.eolang.txt.text$is-alphabetic$int-is-alpha.s" name="s"/>
// </o>
@XmirObject(name = "text$is-alphabetic$int-is-alpha", oname = "int-is-alpha", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/txt/text.eo")
public final class EOtext$EOis_alphabetic$EOint_is_alpha extends PhDefault {
  public EOtext$EOis_alphabetic$EOint_is_alpha(final Phi sigma) {
    super(sigma);
    this.add("b", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new PhMethod(rho, "b");
        ret_base_base = new PhLocated(ret_base_base, 399, 10, "Φ.org.eolang.txt.text$is-alphabetic$int-is-alpha.φ.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "gte");
        ret_base = new PhLocated(ret_base, 398, 8, "Φ.org.eolang.txt.text$is-alphabetic$int-is-alpha.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_base_1 = new PhLocated(ret_base_1, 400, 10, "Φ.org.eolang.txt.text$is-alphabetic$int-is-alpha.φ.ρ.α0");
          ret_base_1 = new PhWith(ret_base_1, "Δ", new Data.Value<>(97L));
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "and");
        ret = new PhLocated(ret, 397, 6, "Φ.org.eolang.txt.text$is-alphabetic$int-is-alpha.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(rho, "b");
          ret_1_base = new PhLocated(ret_1_base, 402, 10, "Φ.org.eolang.txt.text$is-alphabetic$int-is-alpha.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "lte");
          ret_1 = new PhLocated(ret_1, 401, 8, "Φ.org.eolang.txt.text$is-alphabetic$int-is-alpha.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_1 = new PhLocated(ret_1_1, 403, 10, "Φ.org.eolang.txt.text$is-alphabetic$int-is-alpha.φ.α0.α0");
            ret_1_1 = new PhWith(ret_1_1, "Δ", new Data.Value<>(122L));
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }
}
