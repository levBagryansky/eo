
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOtxt;

import org.eolang.*;

// <o abstract="" ancestors="1" line="307" loc="Φ.org.eolang.txt.text$as-float" name="text$as-float" original-name="as-float" parent="text" pos="2"> 
//   <o base=".at" line="309" loc="Φ.org.eolang.txt.text$as-float.φ" name="@" pos="4"> 
//     <o base="org.eolang.txt.sscanf" line="310" loc="Φ.org.eolang.txt.text$as-float.φ.ρ" pos="6"> 
//       <o base="org.eolang.string" data="string" line="311" loc="Φ.org.eolang.txt.text$as-float.φ.ρ.α0" pos="8">%f</o>
//       <o base="s" line="312" loc="Φ.org.eolang.txt.text$as-float.φ.ρ.α1" pos="8" ref="307.32.498"/>
//     </o>
//     <o base="org.eolang.int" data="int" line="313" loc="Φ.org.eolang.txt.text$as-float.φ.α0" pos="6">0</o>
//   </o>
//   <o level="1" line="307.32.498" loc="Φ.org.eolang.txt.text$as-float.s" name="s"/>
// </o>
@XmirObject(name = "text$as-float", oname = "as-float", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/txt/text.eo")
public final class EOtext$EOas_float extends PhDefault {
  public EOtext$EOas_float(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("txt").get().attr("sscanf").get();
        ret_base = new PhLocated(ret_base, 310, 6, "Φ.org.eolang.txt.text$as-float.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_base_1 = new PhLocated(ret_base_1, 311, 8, "Φ.org.eolang.txt.text$as-float.φ.ρ.α0");
          ret_base_1 = new PhWith(ret_base_1, "Δ", new Data.Value<>("%f"));
        Phi ret_base_2 = new PhMethod(new PhMethod(rho, "σ"), "s");
          ret_base_2 = new PhLocated(ret_base_2, 312, 8, "Φ.org.eolang.txt.text$as-float.φ.ρ.α1");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
        ret_base = new PhWith(ret_base, 1, ret_base_2);
      Phi ret = new PhMethod(ret_base, "at");
        ret = new PhLocated(ret, 309, 4, "Φ.org.eolang.txt.text$as-float.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 313, 6, "Φ.org.eolang.txt.text$as-float.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(0L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }
}
