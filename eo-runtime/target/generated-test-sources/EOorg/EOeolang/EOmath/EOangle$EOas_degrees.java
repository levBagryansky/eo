
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOmath;

import org.eolang.*;

// <o abstract="" ancestors="1" line="60" loc="Φ.org.eolang.math.angle$as-degrees" name="angle$as-degrees" original-name="as-degrees" parent="angle" pos="2"> 
//   <o base=".div" line="62" loc="Φ.org.eolang.math.angle$as-degrees.φ" name="@" pos="4"> 
//     <o base=".times" line="63" loc="Φ.org.eolang.math.angle$as-degrees.φ.ρ" pos="7"> 
//       <o base="^" line="63" loc="Φ.org.eolang.math.angle$as-degrees.φ.ρ.ρ" pos="6"/>
//       <o base="org.eolang.float" data="float" line="63" loc="Φ.org.eolang.math.angle$as-degrees.φ.ρ.α0" pos="14">180.0</o>
//     </o>
//     <o base="org.eolang.math.pi" line="64" loc="Φ.org.eolang.math.angle$as-degrees.φ.α0" pos="6"/>
//   </o>
// </o>
@XmirObject(name = "angle$as-degrees", oname = "as-degrees", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/math/angle.eo")
public final class EOangle$EOas_degrees extends PhDefault {
  public EOangle$EOas_degrees(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new PhMethod(rho, "ρ");
        ret_base_base = new PhLocated(ret_base_base, 63, 6, "Φ.org.eolang.math.angle$as-degrees.φ.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "times");
        ret_base = new PhLocated(ret_base, 63, 7, "Φ.org.eolang.math.angle$as-degrees.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new EOorg.EOeolang.EOfloat(Phi.Φ);
          ret_base_1 = new PhLocated(ret_base_1, 63, 14, "Φ.org.eolang.math.angle$as-degrees.φ.ρ.α0");
          ret_base_1 = new PhWith(ret_base_1, "Δ", new Data.Value<>(180.0d));
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "div");
        ret = new PhLocated(ret, 62, 4, "Φ.org.eolang.math.angle$as-degrees.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("math").get().attr("pi").get();
          ret_1 = new PhLocated(ret_1, 64, 6, "Φ.org.eolang.math.angle$as-degrees.φ.α0");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }
}