
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOtxt;

import org.eolang.*;

// <o abstract="" ancestors="1" line="35" loc="Φ.org.eolang.txt.text$slice" name="text$slice" original-name="slice" parent="text" pos="2"> 
//   <o line="35" loc="Φ.org.eolang.txt.text$slice.start" name="start" pos="3"/>
//   <o line="35" loc="Φ.org.eolang.txt.text$slice.len" name="len" pos="9"/>
//   <o base="text" line="36" loc="Φ.org.eolang.txt.text$slice.φ" name="@" pos="4" ref="32"> 
//     <o base=".slice" line="37" loc="Φ.org.eolang.txt.text$slice.φ.α0" pos="9"> 
//       <o base=".s" line="37" loc="Φ.org.eolang.txt.text$slice.φ.α0.ρ" pos="7"> 
//         <o base="^" line="37" loc="Φ.org.eolang.txt.text$slice.φ.α0.ρ.ρ" pos="6"/>
//       </o>
//       <o base="start" line="37" loc="Φ.org.eolang.txt.text$slice.φ.α0.α0" pos="16" ref="35"/>
//       <o base="len" line="37" loc="Φ.org.eolang.txt.text$slice.φ.α0.α1" pos="22" ref="35"/>
//     </o>
//   </o>
// </o>
@XmirObject(name = "text$slice", oname = "slice", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/txt/text.eo")
public final class EOtext$EOslice extends PhDefault {
  public EOtext$EOslice(final Phi sigma) {
    super(sigma);
    this.add("start", new AtFree(/* default */));
    this.add("len", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("txt").get().attr("text").get();
        ret = new PhLocated(ret, 36, 4, "Φ.org.eolang.txt.text$slice.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base_base = new PhMethod(rho, "ρ");
          ret_1_base_base = new PhLocated(ret_1_base_base, 37, 6, "Φ.org.eolang.txt.text$slice.φ.α0.ρ.ρ");
        Phi ret_1_base = new PhMethod(ret_1_base_base, "s");
          ret_1_base = new PhLocated(ret_1_base, 37, 7, "Φ.org.eolang.txt.text$slice.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "slice");
          ret_1 = new PhLocated(ret_1, 37, 9, "Φ.org.eolang.txt.text$slice.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new PhMethod(rho, "start");
            ret_1_1 = new PhLocated(ret_1_1, 37, 16, "Φ.org.eolang.txt.text$slice.φ.α0.α0");
          Phi ret_1_2 = new PhMethod(rho, "len");
            ret_1_2 = new PhLocated(ret_1_2, 37, 22, "Φ.org.eolang.txt.text$slice.φ.α0.α1");
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
          ret_1 = new PhWith(ret_1, 1, ret_1_2);
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }
}