
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOmath;

import org.eolang.*;

// <o abstract="" ancestors="1" line="123" loc="Φ.org.eolang.math.number$right" name="number$right" original-name="right" parent="number" pos="2"> 
//   <o line="124" loc="Φ.org.eolang.math.number$right.x" name="x" pos="3"/>
//   <o base=".if" line="125" loc="Φ.org.eolang.math.number$right.φ" name="@" pos="4"> 
//     <o base="is-int" line="126" loc="Φ.org.eolang.math.number$right.φ.ρ" pos="6" ref="123.37.462"/>
//     <o base=".as-int" line="127" loc="Φ.org.eolang.math.number$right.φ.α0" pos="6"> 
//       <o base=".right" line="128" loc="Φ.org.eolang.math.number$right.φ.α0.ρ" pos="8"> 
//         <o base=".as-bytes" line="129" loc="Φ.org.eolang.math.number$right.φ.α0.ρ.ρ" pos="13"> 
//           <o base=".n" line="129" loc="Φ.org.eolang.math.number$right.φ.α0.ρ.ρ.ρ" pos="11"> 
//             <o base="^" line="129" loc="Φ.org.eolang.math.number$right.φ.α0.ρ.ρ.ρ.ρ" pos="10"/>
//           </o>
//         </o>
//         <o base="x" line="130" loc="Φ.org.eolang.math.number$right.φ.α0.ρ.α0" pos="10" ref="124"/>
//       </o>
//     </o>
//     <o base="org.eolang.error" line="131" loc="Φ.org.eolang.math.number$right.φ.α1" pos="6"> 
//       <o base="org.eolang.string" data="string" line="131" loc="Φ.org.eolang.math.number$right.φ.α1.α0" pos="12">right cannot be applied to float</o>
//     </o>
//   </o>
//   <o level="1" line="123.37.462" loc="Φ.org.eolang.math.number$right.is-int" name="is-int"/>
// </o>
@XmirObject(name = "number$right", oname = "right", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/math/number.eo")
public final class EOnumber$EOright extends PhDefault {
  public EOnumber$EOright(final Phi sigma) {
    super(sigma);
    this.add("x", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(new PhMethod(rho, "σ"), "is-int");
        ret_base = new PhLocated(ret_base, 126, 6, "Φ.org.eolang.math.number$right.φ.ρ");
      Phi ret = new PhMethod(ret_base, "if");
        ret = new PhLocated(ret, 125, 4, "Φ.org.eolang.math.number$right.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base_base_base_base = new PhMethod(rho, "ρ");
          ret_1_base_base_base_base = new PhLocated(ret_1_base_base_base_base, 129, 10, "Φ.org.eolang.math.number$right.φ.α0.ρ.ρ.ρ.ρ");
        Phi ret_1_base_base_base = new PhMethod(ret_1_base_base_base_base, "n");
          ret_1_base_base_base = new PhLocated(ret_1_base_base_base, 129, 11, "Φ.org.eolang.math.number$right.φ.α0.ρ.ρ.ρ");
        Phi ret_1_base_base = new PhMethod(ret_1_base_base_base, "as-bytes");
          ret_1_base_base = new PhLocated(ret_1_base_base, 129, 13, "Φ.org.eolang.math.number$right.φ.α0.ρ.ρ");
        Phi ret_1_base = new PhMethod(ret_1_base_base, "right");
          ret_1_base = new PhLocated(ret_1_base, 128, 8, "Φ.org.eolang.math.number$right.φ.α0.ρ");
        ret_1_base = new PhCopy(ret_1_base);
          Phi ret_1_base_1 = new PhMethod(rho, "x");
            ret_1_base_1 = new PhLocated(ret_1_base_1, 130, 10, "Φ.org.eolang.math.number$right.φ.α0.ρ.α0");
          ret_1_base = new PhWith(ret_1_base, 0, ret_1_base_1);
        Phi ret_1 = new PhMethod(ret_1_base, "as-int");
          ret_1 = new PhLocated(ret_1, 127, 6, "Φ.org.eolang.math.number$right.φ.α0");
        Phi ret_2 = Phi.Φ.attr("org").get().attr("eolang").get().attr("error").get();
          ret_2 = new PhLocated(ret_2, 131, 6, "Φ.org.eolang.math.number$right.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 131, 12, "Φ.org.eolang.math.number$right.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>("right cannot be applied to float"));
          ret_2 = new PhWith(ret_2, "α", ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }
}