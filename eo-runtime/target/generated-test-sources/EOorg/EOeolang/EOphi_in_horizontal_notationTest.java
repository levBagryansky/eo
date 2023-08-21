
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="395" loc="Φ.org.eolang.phi-in-horizontal-notation" name="phi-in-horizontal-notation" original-name="phi-in-horizontal-notation" pos="0"> 
//   <o base="phi-in-horizontal-notation$value" cut="624" line="396" loc="Φ.org.eolang.phi-in-horizontal-notation.value" name="value" pos="2" ref="396"/>
//   <o base=".eq" line="399" loc="Φ.org.eolang.phi-in-horizontal-notation.φ" name="@" pos="2"> 
//     <o base=".@" line="400" loc="Φ.org.eolang.phi-in-horizontal-notation.φ.ρ" pos="9"> 
//       <o base="value" line="400" loc="Φ.org.eolang.phi-in-horizontal-notation.φ.ρ.ρ" pos="4" ref="396"/>
//     </o>
//     <o base="org.eolang.int" data="int" line="401" loc="Φ.org.eolang.phi-in-horizontal-notation.φ.α0" pos="4">100</o>
//   </o>
// </o>
@XmirObject(name = "phi-in-horizontal-notationTest", oname = "phi-in-horizontal-notation", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOphi_in_horizontal_notationTest extends PhDefault {
  public EOphi_in_horizontal_notationTest() {
    this.add("value", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω1value(rho);
        ret = new PhLocated(ret, 396, 2, "Φ.org.eolang.phi-in-horizontal-notation.value");
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new PhMethod(rho, "value");
        ret_base_base = new PhLocated(ret_base_base, 400, 4, "Φ.org.eolang.phi-in-horizontal-notation.φ.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "φ");
        ret_base = new PhLocated(ret_base, 400, 9, "Φ.org.eolang.phi-in-horizontal-notation.φ.ρ");
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 399, 2, "Φ.org.eolang.phi-in-horizontal-notation.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 401, 4, "Φ.org.eolang.phi-in-horizontal-notation.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(100L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOphi_in_horizontal_notationTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="396" loc="Φ.org.eolang.phi-in-horizontal-notation$value" name="phi-in-horizontal-notation$value" original-name="value" parent="phi-in-horizontal-notation" pos="2"> 
//   <o base="phi-in-horizontal-notation$value$@" cut="624" line="397" loc="Φ.org.eolang.phi-in-horizontal-notation$value.φ" name="@" pos="4" ref="397"/>
// </o>
@XmirObject(name = "ω1value", oname = "value", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω1value extends PhDefault {
  public EOω1value(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω2φ(rho);
        ret = new PhLocated(ret, 397, 4, "Φ.org.eolang.phi-in-horizontal-notation$value.φ");
      return ret;
    })));
  }

// <o abstract="" ancestors="2" line="397" loc="Φ.org.eolang.phi-in-horizontal-notation$value$@" name="phi-in-horizontal-notation$value$@" original-name="@" parent="phi-in-horizontal-notation$value" pos="4"> 
//   <o base="org.eolang.int" data="int" line="398" loc="Φ.org.eolang.phi-in-horizontal-notation$value$@.φ" name="@" pos="6">100</o>
// </o>
@XmirObject(name = "ω2@", oname = "@", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω2φ extends PhDefault {
  public EOω2φ(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOorg.EOeolang.EOint(Phi.Φ);
        ret = new PhLocated(ret, 398, 6, "Φ.org.eolang.phi-in-horizontal-notation$value$@.φ");
        ret = new PhWith(ret, "Δ", new Data.Value<>(100L));
      return ret;
    })));
  }
}
}
}