
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOmath;

import org.eolang.*;

// <o abstract="" ancestors="1" line="68" loc="Φ.org.eolang.math.integral$t9$t0$a1" name="integral$t9$t0$a1" parent="integral" pos="6"> 
//   <o line="68" loc="Φ.org.eolang.math.integral$t9$t0$a1.i" name="i" pos="7"/>
//   <o base="org.eolang.seq" line="69" loc="Φ.org.eolang.math.integral$t9$t0$a1.φ" name="@" pos="8"> 
//     <o base=".write" line="70" loc="Φ.org.eolang.math.integral$t9$t0$a1.φ.α0" pos="13"> 
//       <o base="sum" line="70" loc="Φ.org.eolang.math.integral$t9$t0$a1.φ.α0.ρ" pos="10" ref="68.50.477"/>
//       <o base=".plus" line="71" loc="Φ.org.eolang.math.integral$t9$t0$a1.φ.α0.α0" pos="12"> 
//         <o base="sum" line="72" loc="Φ.org.eolang.math.integral$t9$t0$a1.φ.α0.α0.ρ" pos="14" ref="68.50.477"/>
//         <o base="subsection" line="73" loc="Φ.org.eolang.math.integral$t9$t0$a1.φ.α0.α0.α0" pos="14" ref="68.31.477"> 
//           <o base="fun" line="74" loc="Φ.org.eolang.math.integral$t9$t0$a1.φ.α0.α0.α0.α0" pos="16" ref="68.30.477"/>
//           <o base="x" line="75" loc="Φ.org.eolang.math.integral$t9$t0$a1.φ.α0.α0.α0.α1" pos="16" ref="68.52.477"/>
//           <o base=".plus" line="76" loc="Φ.org.eolang.math.integral$t9$t0$a1.φ.α0.α0.α0.α2" pos="16"> 
//             <o base="x" line="77" loc="Φ.org.eolang.math.integral$t9$t0$a1.φ.α0.α0.α0.α2.ρ" pos="18" ref="68.52.477"/>
//             <o base="h" line="78" loc="Φ.org.eolang.math.integral$t9$t0$a1.φ.α0.α0.α0.α2.α0" pos="18" ref="68.56.477"/>
//           </o>
//         </o>
//       </o>
//     </o>
//     <o base=".write" line="79" loc="Φ.org.eolang.math.integral$t9$t0$a1.φ.α1" pos="11"> 
//       <o base="x" line="79" loc="Φ.org.eolang.math.integral$t9$t0$a1.φ.α1.ρ" pos="10" ref="68.52.477"/>
//       <o base=".plus" line="80" loc="Φ.org.eolang.math.integral$t9$t0$a1.φ.α1.α0" pos="12"> 
//         <o base="x" line="81" loc="Φ.org.eolang.math.integral$t9$t0$a1.φ.α1.α0.ρ" pos="14" ref="68.52.477"/>
//         <o base="h" line="82" loc="Φ.org.eolang.math.integral$t9$t0$a1.φ.α1.α0.α0" pos="14" ref="68.56.477"/>
//       </o>
//     </o>
//   </o>
//   <o level="1" line="68.30.477" loc="Φ.org.eolang.math.integral$t9$t0$a1.fun" name="fun"/>
//   <o level="1" line="68.31.477" loc="Φ.org.eolang.math.integral$t9$t0$a1.subsection" name="subsection"/>
//   <o level="1" line="68.50.477" loc="Φ.org.eolang.math.integral$t9$t0$a1.sum" name="sum"/>
//   <o level="1" line="68.52.477" loc="Φ.org.eolang.math.integral$t9$t0$a1.x" name="x"/>
//   <o level="1" line="68.56.477" loc="Φ.org.eolang.math.integral$t9$t0$a1.h" name="h"/>
// </o>
@XmirObject(name = "integral$t9$t0$a1", oname = "integral$t9$t0$a1", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/math/integral.eo")
public final class EOintegral$EOt9$EOt0$EOa1 extends PhDefault {
  public EOintegral$EOt9$EOt0$EOa1(final Phi sigma) {
    super(sigma);
    this.add("i", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("seq").get();
        ret = new PhLocated(ret, 69, 8, "Φ.org.eolang.math.integral$t9$t0$a1.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(new PhMethod(rho, "σ"), "sum");
          ret_1_base = new PhLocated(ret_1_base, 70, 10, "Φ.org.eolang.math.integral$t9$t0$a1.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "write");
          ret_1 = new PhLocated(ret_1, 70, 13, "Φ.org.eolang.math.integral$t9$t0$a1.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1_base = new PhMethod(new PhMethod(rho, "σ"), "sum");
            ret_1_1_base = new PhLocated(ret_1_1_base, 72, 14, "Φ.org.eolang.math.integral$t9$t0$a1.φ.α0.α0.ρ");
          Phi ret_1_1 = new PhMethod(ret_1_1_base, "plus");
            ret_1_1 = new PhLocated(ret_1_1, 71, 12, "Φ.org.eolang.math.integral$t9$t0$a1.φ.α0.α0");
          ret_1_1 = new PhCopy(ret_1_1);
            Phi ret_1_1_1 = new PhMethod(new PhMethod(rho, "σ"), "subsection");
              ret_1_1_1 = new PhLocated(ret_1_1_1, 73, 14, "Φ.org.eolang.math.integral$t9$t0$a1.φ.α0.α0.α0");
            ret_1_1_1 = new PhCopy(ret_1_1_1);
              Phi ret_1_1_1_1 = new PhMethod(new PhMethod(rho, "σ"), "fun");
                ret_1_1_1_1 = new PhLocated(ret_1_1_1_1, 74, 16, "Φ.org.eolang.math.integral$t9$t0$a1.φ.α0.α0.α0.α0");
              Phi ret_1_1_1_2 = new PhMethod(new PhMethod(rho, "σ"), "x");
                ret_1_1_1_2 = new PhLocated(ret_1_1_1_2, 75, 16, "Φ.org.eolang.math.integral$t9$t0$a1.φ.α0.α0.α0.α1");
              Phi ret_1_1_1_3_base = new PhMethod(new PhMethod(rho, "σ"), "x");
                ret_1_1_1_3_base = new PhLocated(ret_1_1_1_3_base, 77, 18, "Φ.org.eolang.math.integral$t9$t0$a1.φ.α0.α0.α0.α2.ρ");
              Phi ret_1_1_1_3 = new PhMethod(ret_1_1_1_3_base, "plus");
                ret_1_1_1_3 = new PhLocated(ret_1_1_1_3, 76, 16, "Φ.org.eolang.math.integral$t9$t0$a1.φ.α0.α0.α0.α2");
              ret_1_1_1_3 = new PhCopy(ret_1_1_1_3);
                Phi ret_1_1_1_3_1 = new PhMethod(new PhMethod(rho, "σ"), "h");
                  ret_1_1_1_3_1 = new PhLocated(ret_1_1_1_3_1, 78, 18, "Φ.org.eolang.math.integral$t9$t0$a1.φ.α0.α0.α0.α2.α0");
                ret_1_1_1_3 = new PhWith(ret_1_1_1_3, 0, ret_1_1_1_3_1);
              ret_1_1_1 = new PhWith(ret_1_1_1, 0, ret_1_1_1_1);
              ret_1_1_1 = new PhWith(ret_1_1_1, 1, ret_1_1_1_2);
              ret_1_1_1 = new PhWith(ret_1_1_1, 2, ret_1_1_1_3);
            ret_1_1 = new PhWith(ret_1_1, 0, ret_1_1_1);
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base = new PhMethod(new PhMethod(rho, "σ"), "x");
          ret_2_base = new PhLocated(ret_2_base, 79, 10, "Φ.org.eolang.math.integral$t9$t0$a1.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "write");
          ret_2 = new PhLocated(ret_2, 79, 11, "Φ.org.eolang.math.integral$t9$t0$a1.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = new PhMethod(new PhMethod(rho, "σ"), "x");
            ret_2_1_base = new PhLocated(ret_2_1_base, 81, 14, "Φ.org.eolang.math.integral$t9$t0$a1.φ.α1.α0.ρ");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "plus");
            ret_2_1 = new PhLocated(ret_2_1, 80, 12, "Φ.org.eolang.math.integral$t9$t0$a1.φ.α1.α0");
          ret_2_1 = new PhCopy(ret_2_1);
            Phi ret_2_1_1 = new PhMethod(new PhMethod(rho, "σ"), "h");
              ret_2_1_1 = new PhLocated(ret_2_1_1, 82, 14, "Φ.org.eolang.math.integral$t9$t0$a1.φ.α1.α0.α0");
            ret_2_1 = new PhWith(ret_2_1, 0, ret_2_1_1);
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }
}