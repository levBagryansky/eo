
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOmath;

import org.eolang.*;

// <o abstract="" ancestors="3" line="372" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1" name="number$sqrt$babylonian-method$t4$t0$a1" parent="number$sqrt$babylonian-method" pos="10"> 
//   <o line="372" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.i" name="i" pos="11"/>
//   <o base="org.eolang.seq" line="373" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ" name="@" pos="12"> 
//     <o base=".write" line="374" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α0" pos="19"> 
//       <o base="x-old" line="374" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α0.ρ" pos="14" ref="372.365.467"/>
//       <o base="x-new" line="375" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α0.α0" pos="16" ref="372.364.467"/>
//     </o>
//     <o base=".write" line="376" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α1" pos="19"> 
//       <o base="x-new" line="376" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α1.ρ" pos="14" ref="372.364.467"/>
//       <o base=".times" line="377" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α1.α0" pos="16"> 
//         <o base="org.eolang.float" data="float" line="378" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α1.α0.ρ" pos="18">0.5</o>
//         <o base=".plus" line="379" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α1.α0.α0" pos="18"> 
//           <o base=".div" line="380" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α1.α0.α0.ρ" pos="20"> 
//             <o base="a" line="381" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α1.α0.α0.ρ.ρ" pos="22" ref="372.363.467"/>
//             <o base="x-old" line="382" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α1.α0.α0.ρ.α0" pos="22" ref="372.365.467"/>
//           </o>
//           <o base="x-old" line="383" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α1.α0.α0.α0" pos="20" ref="372.365.467"/>
//         </o>
//       </o>
//     </o>
//     <o base=".write" line="384" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α2" pos="18"> 
//       <o base="diff" line="384" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α2.ρ" pos="14" ref="372.366.467"/>
//       <o base=".abs" line="385" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α2.α0" pos="16"> 
//         <o base="number" line="386" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α2.α0.ρ" pos="18" ref="34"> 
//           <o base=".minus" line="387" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α2.α0.ρ.α0" pos="25"> 
//             <o base="x-new" line="387" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α2.α0.ρ.α0.ρ" pos="20" ref="372.364.467"/>
//             <o base="x-old" line="387" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α2.α0.ρ.α0.α0" pos="32" ref="372.365.467"/>
//           </o>
//         </o>
//       </o>
//     </o>
//   </o>
//   <o level="1" line="372.363.467" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.a" name="a"/>
//   <o level="1" line="372.364.467" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.x-new" name="x-new"/>
//   <o level="1" line="372.365.467" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.x-old" name="x-old"/>
//   <o level="1" line="372.366.467" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.diff" name="diff"/>
//   <o level="3" line="372.34.467" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.n" name="n"/>
//   <o level="3" line="372.69.467" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.is-nan" name="is-nan"/>
//   <o level="3" line="372.390.467" loc="Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.as-float" name="as-float"/>
// </o>
@XmirObject(name = "number$sqrt$babylonian-method$t4$t0$a1", oname = "number$sqrt$babylonian-method$t4$t0$a1", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/math/number.eo")
public final class EOnumber$EOsqrt$EObabylonian_method$EOt4$EOt0$EOa1 extends PhDefault {
  public EOnumber$EOsqrt$EObabylonian_method$EOt4$EOt0$EOa1(final Phi sigma) {
    super(sigma);
    this.add("i", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("seq").get();
        ret = new PhLocated(ret, 373, 12, "Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(new PhMethod(rho, "σ"), "x-old");
          ret_1_base = new PhLocated(ret_1_base, 374, 14, "Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "write");
          ret_1 = new PhLocated(ret_1, 374, 19, "Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new PhMethod(new PhMethod(rho, "σ"), "x-new");
            ret_1_1 = new PhLocated(ret_1_1, 375, 16, "Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α0.α0");
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base = new PhMethod(new PhMethod(rho, "σ"), "x-new");
          ret_2_base = new PhLocated(ret_2_base, 376, 14, "Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "write");
          ret_2 = new PhLocated(ret_2, 376, 19, "Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = new EOorg.EOeolang.EOfloat(Phi.Φ);
            ret_2_1_base = new PhLocated(ret_2_1_base, 378, 18, "Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α1.α0.ρ");
            ret_2_1_base = new PhWith(ret_2_1_base, "Δ", new Data.Value<>(0.5d));
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "times");
            ret_2_1 = new PhLocated(ret_2_1, 377, 16, "Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α1.α0");
          ret_2_1 = new PhCopy(ret_2_1);
            Phi ret_2_1_1_base_base = new PhMethod(new PhMethod(rho, "σ"), "a");
              ret_2_1_1_base_base = new PhLocated(ret_2_1_1_base_base, 381, 22, "Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α1.α0.α0.ρ.ρ");
            Phi ret_2_1_1_base = new PhMethod(ret_2_1_1_base_base, "div");
              ret_2_1_1_base = new PhLocated(ret_2_1_1_base, 380, 20, "Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α1.α0.α0.ρ");
            ret_2_1_1_base = new PhCopy(ret_2_1_1_base);
              Phi ret_2_1_1_base_1 = new PhMethod(new PhMethod(rho, "σ"), "x-old");
                ret_2_1_1_base_1 = new PhLocated(ret_2_1_1_base_1, 382, 22, "Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α1.α0.α0.ρ.α0");
              ret_2_1_1_base = new PhWith(ret_2_1_1_base, 0, ret_2_1_1_base_1);
            Phi ret_2_1_1 = new PhMethod(ret_2_1_1_base, "plus");
              ret_2_1_1 = new PhLocated(ret_2_1_1, 379, 18, "Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α1.α0.α0");
            ret_2_1_1 = new PhCopy(ret_2_1_1);
              Phi ret_2_1_1_1 = new PhMethod(new PhMethod(rho, "σ"), "x-old");
                ret_2_1_1_1 = new PhLocated(ret_2_1_1_1, 383, 20, "Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α1.α0.α0.α0");
              ret_2_1_1 = new PhWith(ret_2_1_1, 0, ret_2_1_1_1);
            ret_2_1 = new PhWith(ret_2_1, 0, ret_2_1_1);
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        Phi ret_3_base = new PhMethod(new PhMethod(rho, "σ"), "diff");
          ret_3_base = new PhLocated(ret_3_base, 384, 14, "Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α2.ρ");
        Phi ret_3 = new PhMethod(ret_3_base, "write");
          ret_3 = new PhLocated(ret_3, 384, 18, "Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α2");
        ret_3 = new PhCopy(ret_3);
          Phi ret_3_1_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("math").get().attr("number").get();
            ret_3_1_base = new PhLocated(ret_3_1_base, 386, 18, "Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α2.α0.ρ");
          ret_3_1_base = new PhCopy(ret_3_1_base);
            Phi ret_3_1_base_1_base = new PhMethod(new PhMethod(rho, "σ"), "x-new");
              ret_3_1_base_1_base = new PhLocated(ret_3_1_base_1_base, 387, 20, "Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α2.α0.ρ.α0.ρ");
            Phi ret_3_1_base_1 = new PhMethod(ret_3_1_base_1_base, "minus");
              ret_3_1_base_1 = new PhLocated(ret_3_1_base_1, 387, 25, "Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α2.α0.ρ.α0");
            ret_3_1_base_1 = new PhCopy(ret_3_1_base_1);
              Phi ret_3_1_base_1_1 = new PhMethod(new PhMethod(rho, "σ"), "x-old");
                ret_3_1_base_1_1 = new PhLocated(ret_3_1_base_1_1, 387, 32, "Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α2.α0.ρ.α0.α0");
              ret_3_1_base_1 = new PhWith(ret_3_1_base_1, 0, ret_3_1_base_1_1);
            ret_3_1_base = new PhWith(ret_3_1_base, 0, ret_3_1_base_1);
          Phi ret_3_1 = new PhMethod(ret_3_1_base, "abs");
            ret_3_1 = new PhLocated(ret_3_1, 385, 16, "Φ.org.eolang.math.number$sqrt$babylonian-method$t4$t0$a1.φ.α2.α0");
          ret_3 = new PhWith(ret_3, 0, ret_3_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
        ret = new PhWith(ret, 2, ret_3);
      return ret;
    })));
  }
}
