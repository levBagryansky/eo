
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="360" loc="Φ.org.eolang.parent-in-horizontal-notation" name="parent-in-horizontal-notation" original-name="parent-in-horizontal-notation" pos="0"> 
//   <o base="org.eolang.memory" line="361" loc="Φ.org.eolang.parent-in-horizontal-notation.m" name="m" pos="2"> 
//     <o base="org.eolang.int" data="int" line="361" loc="Φ.org.eolang.parent-in-horizontal-notation.m.α0" pos="9">5</o>
//   </o>
//   <o base="parent-in-horizontal-notation$value" cut="547" line="362" loc="Φ.org.eolang.parent-in-horizontal-notation.value" name="value" pos="2" ref="362"/>
//   <o base=".eq" line="365" loc="Φ.org.eolang.parent-in-horizontal-notation.φ" name="@" pos="2"> 
//     <o base="value" line="366" loc="Φ.org.eolang.parent-in-horizontal-notation.φ.ρ" pos="4" ref="362"/>
//     <o base="org.eolang.int" data="int" line="367" loc="Φ.org.eolang.parent-in-horizontal-notation.φ.α0" pos="4">5</o>
//   </o>
// </o>
@XmirObject(name = "parent-in-horizontal-notationTest", oname = "parent-in-horizontal-notation", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOparent_in_horizontal_notationTest extends PhDefault {
    
  public EOparent_in_horizontal_notationTest() {
    this.add("m", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("memory").get();
        ret = new PhLocated(ret, 361, 2, "Φ.org.eolang.parent-in-horizontal-notation.m");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 361, 9, "Φ.org.eolang.parent-in-horizontal-notation.m.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(5L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("value", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω1value(rho);
        ret = new PhLocated(ret, 362, 2, "Φ.org.eolang.parent-in-horizontal-notation.value");
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "value");
        ret_base = new PhLocated(ret_base, 366, 4, "Φ.org.eolang.parent-in-horizontal-notation.φ.ρ");
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 365, 2, "Φ.org.eolang.parent-in-horizontal-notation.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 367, 4, "Φ.org.eolang.parent-in-horizontal-notation.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(5L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOparent_in_horizontal_notationTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="362" loc="Φ.org.eolang.parent-in-horizontal-notation$value" name="parent-in-horizontal-notation$value" original-name="value" parent="parent-in-horizontal-notation" pos="2"> 
//   <o base="parent-in-horizontal-notation$value$@" cut="547" line="363" loc="Φ.org.eolang.parent-in-horizontal-notation$value.φ" name="@" pos="4" ref="363"/>
// </o>
@XmirObject(name = "ω1value", oname = "value", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω1value extends PhDefault {
    
  public EOω1value(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω2φ(rho);
        ret = new PhLocated(ret, 363, 4, "Φ.org.eolang.parent-in-horizontal-notation$value.φ");
      return ret;
    })));
  }

// <o abstract="" ancestors="2" line="363" loc="Φ.org.eolang.parent-in-horizontal-notation$value$@" name="parent-in-horizontal-notation$value$@" original-name="@" parent="parent-in-horizontal-notation$value" pos="4"> 
//   <o base=".m" line="364" loc="Φ.org.eolang.parent-in-horizontal-notation$value$@.φ" name="@" pos="9"> 
//     <o base=".^" line="364" loc="Φ.org.eolang.parent-in-horizontal-notation$value$@.φ.ρ" pos="7"> 
//       <o base="^" line="364" loc="Φ.org.eolang.parent-in-horizontal-notation$value$@.φ.ρ.ρ" pos="6"/>
//     </o>
//   </o>
// </o>
@XmirObject(name = "ω2@", oname = "@", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω2φ extends PhDefault {
    
  public EOω2φ(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new PhMethod(rho, "ρ");
        ret_base_base = new PhLocated(ret_base_base, 364, 6, "Φ.org.eolang.parent-in-horizontal-notation$value$@.φ.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "ρ");
        ret_base = new PhLocated(ret_base, 364, 7, "Φ.org.eolang.parent-in-horizontal-notation$value$@.φ.ρ");
      Phi ret = new PhMethod(ret_base, "m");
        ret = new PhLocated(ret, 364, 9, "Φ.org.eolang.parent-in-horizontal-notation$value$@.φ");
      return ret;
    })));
  }
}
}
}
