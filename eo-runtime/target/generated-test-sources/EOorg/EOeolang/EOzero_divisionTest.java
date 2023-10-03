
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="215" loc="Φ.org.eolang.zero-division" name="zero-division" original-name="zero-division" pos="0"> 
//   <o base=".eq" line="216" loc="Φ.org.eolang.zero-division.φ" name="@" pos="2"> 
//     <o base="org.eolang.try" line="217" loc="Φ.org.eolang.zero-division.φ.ρ" pos="4"> 
//       <o base="zero-division$t0$t0$a0" cut="244" line="218" loc="Φ.org.eolang.zero-division.φ.ρ.α0" pos="6" ref="218"/>
//       <o base="zero-division$t0$t0$a1" cut="248" line="220" loc="Φ.org.eolang.zero-division.φ.ρ.α1" pos="6" ref="220"/>
//       <o base="org.eolang.nop" line="222" loc="Φ.org.eolang.zero-division.φ.ρ.α2" pos="6"/>
//     </o>
//     <o base="org.eolang.string" data="string" line="223" loc="Φ.org.eolang.zero-division.φ.α0" pos="4">The 1th argument of 'int.div' is invalid: division by zero is infinity</o>
//   </o>
// </o>
@XmirObject(name = "zero-divisionTest", oname = "zero-division", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/int-tests.eo")
public final class EOzero_divisionTest extends PhDefault {
    
  public EOzero_divisionTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("try").get();
        ret_base = new PhLocated(ret_base, 217, 4, "Φ.org.eolang.zero-division.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new EOω1t0$EOt0$EOa0(rho);
          ret_base_1 = new PhLocated(ret_base_1, 218, 6, "Φ.org.eolang.zero-division.φ.ρ.α0");
        Phi ret_base_2 = new EOω1t0$EOt0$EOa1(rho);
          ret_base_2 = new PhLocated(ret_base_2, 220, 6, "Φ.org.eolang.zero-division.φ.ρ.α1");
        Phi ret_base_3 = Phi.Φ.attr("org").get().attr("eolang").get().attr("nop").get();
          ret_base_3 = new PhLocated(ret_base_3, 222, 6, "Φ.org.eolang.zero-division.φ.ρ.α2");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
        ret_base = new PhWith(ret_base, 1, ret_base_2);
        ret_base = new PhWith(ret_base, 2, ret_base_3);
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 216, 2, "Φ.org.eolang.zero-division.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 223, 4, "Φ.org.eolang.zero-division.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>("The 1th argument of 'int.div' is invalid: division by zero is infinity"));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOzero_divisionTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="218" loc="Φ.org.eolang.zero-division$t0$t0$a0" name="zero-division$t0$t0$a0" parent="zero-division" pos="6"> 
//   <o base=".div" line="219" loc="Φ.org.eolang.zero-division$t0$t0$a0.φ" name="@" pos="9"> 
//     <o base="org.eolang.int" data="int" line="219" loc="Φ.org.eolang.zero-division$t0$t0$a0.φ.ρ" pos="8">2</o>
//     <o base="org.eolang.int" data="int" line="219" loc="Φ.org.eolang.zero-division$t0$t0$a0.φ.α0" pos="14">0</o>
//   </o>
// </o>
@XmirObject(name = "ω1t0$t0$a0", oname = "ω1t0$t0$a0", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/int-tests.eo")
public final class EOω1t0$EOt0$EOa0 extends PhDefault {
    
  public EOω1t0$EOt0$EOa0(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new EOorg.EOeolang.EOint(Phi.Φ);
        ret_base = new PhLocated(ret_base, 219, 8, "Φ.org.eolang.zero-division$t0$t0$a0.φ.ρ");
        ret_base = new PhWith(ret_base, "Δ", new Data.Value<>(2L));
      Phi ret = new PhMethod(ret_base, "div");
        ret = new PhLocated(ret, 219, 9, "Φ.org.eolang.zero-division$t0$t0$a0.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 219, 14, "Φ.org.eolang.zero-division$t0$t0$a0.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(0L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }
}

// <o abstract="" ancestors="1" line="220" loc="Φ.org.eolang.zero-division$t0$t0$a1" name="zero-division$t0$t0$a1" parent="zero-division" pos="6"> 
//   <o line="220" loc="Φ.org.eolang.zero-division$t0$t0$a1.e" name="e" pos="7"/>
//   <o base="e" line="221" loc="Φ.org.eolang.zero-division$t0$t0$a1.φ" name="@" pos="8" ref="220"/>
// </o>
@XmirObject(name = "ω1t0$t0$a1", oname = "ω1t0$t0$a1", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/int-tests.eo")
public final class EOω1t0$EOt0$EOa1 extends PhDefault {
    
  public EOω1t0$EOt0$EOa1(final Phi sigma) {
    super(sigma);
    this.add("e", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "e");
        ret = new PhLocated(ret, 221, 8, "Φ.org.eolang.zero-division$t0$t0$a1.φ");
      return ret;
    })));
  }
}
}
