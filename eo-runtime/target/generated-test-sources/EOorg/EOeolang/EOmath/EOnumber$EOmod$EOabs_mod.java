
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOmath;

import org.eolang.*;

// <o abstract="" ancestors="2" line="151" loc="Φ.org.eolang.math.number$mod$abs-mod" name="number$mod$abs-mod" original-name="abs-mod" parent="number$mod" pos="4"> 
//   <o base=".abs" const="" line="152" loc="Φ.org.eolang.math.number$mod$abs-mod.int-abs" name="int-abs" pos="23"> 
//     <o base="number" line="152" loc="Φ.org.eolang.math.number$mod$abs-mod.int-abs.ρ" pos="7" ref="34" scope="scope-f938539c-a13b-4f14-b9d7-98c5486a4aa0"> 
//       <o base="dividend" line="152" loc="Φ.org.eolang.math.number$mod$abs-mod.int-abs.ρ.α0" pos="14" ref="151.139.464" scope="scope-f938539c-a13b-4f14-b9d7-98c5486a4aa0"/>
//     </o>
//   </o>
//   <o base=".abs" const="" line="153" loc="Φ.org.eolang.math.number$mod$abs-mod.x-abs" name="x-abs" pos="22"> 
//     <o base="number" line="153" loc="Φ.org.eolang.math.number$mod$abs-mod.x-abs.ρ" pos="7" ref="34" scope="scope-c8d7afe4-7494-4069-bab9-ea4d87cc00d9"> 
//       <o base="divisor" line="153" loc="Φ.org.eolang.math.number$mod$abs-mod.x-abs.ρ.α0" pos="14" ref="151.140.464" scope="scope-c8d7afe4-7494-4069-bab9-ea4d87cc00d9"/>
//     </o>
//   </o>
//   <o base=".minus" line="154" loc="Φ.org.eolang.math.number$mod$abs-mod.φ" name="@" pos="6"> 
//     <o base="int-abs" line="155" loc="Φ.org.eolang.math.number$mod$abs-mod.φ.ρ" pos="8" ref="152"/>
//     <o base=".times" line="156" loc="Φ.org.eolang.math.number$mod$abs-mod.φ.α0" pos="13"> 
//       <o base="x-abs" line="156" loc="Φ.org.eolang.math.number$mod$abs-mod.φ.α0.ρ" pos="8" ref="153"/>
//       <o base=".div" line="157" loc="Φ.org.eolang.math.number$mod$abs-mod.φ.α0.α0" pos="17"> 
//         <o base="int-abs" line="157" loc="Φ.org.eolang.math.number$mod$abs-mod.φ.α0.α0.ρ" pos="10" ref="152"/>
//         <o base="x-abs" line="157" loc="Φ.org.eolang.math.number$mod$abs-mod.φ.α0.α0.α0" pos="22" ref="153"/>
//       </o>
//     </o>
//   </o>
//   <o level="1" line="151.139.464" loc="Φ.org.eolang.math.number$mod$abs-mod.dividend" name="dividend"/>
//   <o level="1" line="151.140.464" loc="Φ.org.eolang.math.number$mod$abs-mod.divisor" name="divisor"/>
// </o>
@XmirObject(name = "number$mod$abs-mod", oname = "abs-mod", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/math/number.eo")
public final class EOnumber$EOmod$EOabs_mod extends PhDefault {
  public EOnumber$EOmod$EOabs_mod(final Phi sigma) {
    super(sigma);
    this.add("int-abs", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("math").get().attr("number").get();
        ret_base = new PhLocated(ret_base, 152, 7, "Φ.org.eolang.math.number$mod$abs-mod.int-abs.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new PhMethod(new PhMethod(rho, "σ"), "dividend");
          ret_base_1 = new PhLocated(ret_base_1, 152, 14, "Φ.org.eolang.math.number$mod$abs-mod.int-abs.ρ.α0");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "abs");
        ret = new PhLocated(ret, 152, 23, "Φ.org.eolang.math.number$mod$abs-mod.int-abs");
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("x-abs", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("math").get().attr("number").get();
        ret_base = new PhLocated(ret_base, 153, 7, "Φ.org.eolang.math.number$mod$abs-mod.x-abs.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new PhMethod(new PhMethod(rho, "σ"), "divisor");
          ret_base_1 = new PhLocated(ret_base_1, 153, 14, "Φ.org.eolang.math.number$mod$abs-mod.x-abs.ρ.α0");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "abs");
        ret = new PhLocated(ret, 153, 22, "Φ.org.eolang.math.number$mod$abs-mod.x-abs");
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "int-abs");
        ret_base = new PhLocated(ret_base, 155, 8, "Φ.org.eolang.math.number$mod$abs-mod.φ.ρ");
      Phi ret = new PhMethod(ret_base, "minus");
        ret = new PhLocated(ret, 154, 6, "Φ.org.eolang.math.number$mod$abs-mod.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(rho, "x-abs");
          ret_1_base = new PhLocated(ret_1_base, 156, 8, "Φ.org.eolang.math.number$mod$abs-mod.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "times");
          ret_1 = new PhLocated(ret_1, 156, 13, "Φ.org.eolang.math.number$mod$abs-mod.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1_base = new PhMethod(rho, "int-abs");
            ret_1_1_base = new PhLocated(ret_1_1_base, 157, 10, "Φ.org.eolang.math.number$mod$abs-mod.φ.α0.α0.ρ");
          Phi ret_1_1 = new PhMethod(ret_1_1_base, "div");
            ret_1_1 = new PhLocated(ret_1_1, 157, 17, "Φ.org.eolang.math.number$mod$abs-mod.φ.α0.α0");
          ret_1_1 = new PhCopy(ret_1_1);
            Phi ret_1_1_1 = new PhMethod(rho, "x-abs");
              ret_1_1_1 = new PhLocated(ret_1_1_1, 157, 22, "Φ.org.eolang.math.number$mod$abs-mod.φ.α0.α0.α0");
            ret_1_1 = new PhWith(ret_1_1, 0, ret_1_1_1);
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }
}