
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="81" loc="Φ.org.eolang.makes-deep-object-recursively" name="makes-deep-object-recursively" original-name="makes-deep-object-recursively" pos="0"> 
//   <o base=".eq" line="82" loc="Φ.org.eolang.makes-deep-object-recursively.φ" name="@" pos="2"> 
//     <o base="x" line="83" loc="Φ.org.eolang.makes-deep-object-recursively.φ.ρ" pos="4" ref="85"> 
//       <o base="org.eolang.int" data="int" line="83" loc="Φ.org.eolang.makes-deep-object-recursively.φ.ρ.α0" pos="6">5</o>
//     </o>
//     <o base="org.eolang.int" data="int" line="84" loc="Φ.org.eolang.makes-deep-object-recursively.φ.α0" pos="4">0</o>
//   </o>
//   <o base="makes-deep-object-recursively$x" cut="61" line="85" loc="Φ.org.eolang.makes-deep-object-recursively.x" name="x" pos="2" ref="85"/>
// </o>
@XmirObject(name = "makes-deep-object-recursivelyTest", oname = "makes-deep-object-recursively", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOmakes_deep_object_recursivelyTest extends PhDefault {
    
  public EOmakes_deep_object_recursivelyTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "x");
        ret_base = new PhLocated(ret_base, 83, 4, "Φ.org.eolang.makes-deep-object-recursively.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_base_1 = new PhLocated(ret_base_1, 83, 6, "Φ.org.eolang.makes-deep-object-recursively.φ.ρ.α0");
          ret_base_1 = new PhWith(ret_base_1, "Δ", new Data.Value<>(5L));
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 82, 2, "Φ.org.eolang.makes-deep-object-recursively.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 84, 4, "Φ.org.eolang.makes-deep-object-recursively.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(0L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("x", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω1x(rho);
        ret = new PhLocated(ret, 85, 2, "Φ.org.eolang.makes-deep-object-recursively.x");
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOmakes_deep_object_recursivelyTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="85" loc="Φ.org.eolang.makes-deep-object-recursively$x" name="makes-deep-object-recursively$x" original-name="x" parent="makes-deep-object-recursively" pos="2"> 
//   <o line="85" loc="Φ.org.eolang.makes-deep-object-recursively$x.i" name="i" pos="3"/>
//   <o base=".if" line="86" loc="Φ.org.eolang.makes-deep-object-recursively$x.φ" name="@" pos="4"> 
//     <o base=".lt" line="87" loc="Φ.org.eolang.makes-deep-object-recursively$x.φ.ρ" pos="7"> 
//       <o base="i" line="87" loc="Φ.org.eolang.makes-deep-object-recursively$x.φ.ρ.ρ" pos="6" ref="85"/>
//       <o base="org.eolang.int" data="int" line="87" loc="Φ.org.eolang.makes-deep-object-recursively$x.φ.ρ.α0" pos="11">0</o>
//     </o>
//     <o base="org.eolang.int" data="int" line="88" loc="Φ.org.eolang.makes-deep-object-recursively$x.φ.α0" pos="6">0</o>
//     <o base="makes-deep-object-recursively$x" line="89" loc="Φ.org.eolang.makes-deep-object-recursively$x.φ.α1" pos="6" ref="85"> 
//       <o base=".minus" line="90" loc="Φ.org.eolang.makes-deep-object-recursively$x.φ.α1.α0" pos="9"> 
//         <o base="i" line="90" loc="Φ.org.eolang.makes-deep-object-recursively$x.φ.α1.α0.ρ" pos="8" ref="85"/>
//         <o base="org.eolang.int" data="int" line="90" loc="Φ.org.eolang.makes-deep-object-recursively$x.φ.α1.α0.α0" pos="16">1</o>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "ω1x", oname = "x", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω1x extends PhDefault {
    
  public EOω1x(final Phi sigma) {
    super(sigma);
    this.add("i", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new PhMethod(rho, "i");
        ret_base_base = new PhLocated(ret_base_base, 87, 6, "Φ.org.eolang.makes-deep-object-recursively$x.φ.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "lt");
        ret_base = new PhLocated(ret_base, 87, 7, "Φ.org.eolang.makes-deep-object-recursively$x.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_base_1 = new PhLocated(ret_base_1, 87, 11, "Φ.org.eolang.makes-deep-object-recursively$x.φ.ρ.α0");
          ret_base_1 = new PhWith(ret_base_1, "Δ", new Data.Value<>(0L));
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "if");
        ret = new PhLocated(ret, 86, 4, "Φ.org.eolang.makes-deep-object-recursively$x.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 88, 6, "Φ.org.eolang.makes-deep-object-recursively$x.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(0L));
        Phi ret_2 = new EOω1x(rho);
          ret_2 = new PhLocated(ret_2, 89, 6, "Φ.org.eolang.makes-deep-object-recursively$x.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = new PhMethod(rho, "i");
            ret_2_1_base = new PhLocated(ret_2_1_base, 90, 8, "Φ.org.eolang.makes-deep-object-recursively$x.φ.α1.α0.ρ");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "minus");
            ret_2_1 = new PhLocated(ret_2_1, 90, 9, "Φ.org.eolang.makes-deep-object-recursively$x.φ.α1.α0");
          ret_2_1 = new PhCopy(ret_2_1);
            Phi ret_2_1_1 = new EOorg.EOeolang.EOint(Phi.Φ);
              ret_2_1_1 = new PhLocated(ret_2_1_1, 90, 16, "Φ.org.eolang.makes-deep-object-recursively$x.φ.α1.α0.α0");
              ret_2_1_1 = new PhWith(ret_2_1_1, "Δ", new Data.Value<>(1L));
            ret_2_1 = new PhWith(ret_2_1, 0, ret_2_1_1);
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }
}
}
