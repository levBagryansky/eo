
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="533" loc="Φ.org.eolang.negative-infinity-as-bytes-is-valid" name="negative-infinity-as-bytes-is-valid" original-name="negative-infinity-as-bytes-is-valid" pos="0"> 
//   <o base=".eq" line="534" loc="Φ.org.eolang.negative-infinity-as-bytes-is-valid.φ" name="@" pos="2"> 
//     <o base=".as-bytes" line="535" loc="Φ.org.eolang.negative-infinity-as-bytes-is-valid.φ.ρ" pos="21"> 
//       <o base="org.eolang.negative-infinity" line="535" loc="Φ.org.eolang.negative-infinity-as-bytes-is-valid.φ.ρ.ρ" pos="4"/>
//     </o>
//     <o base=".as-bytes" line="536" loc="Φ.org.eolang.negative-infinity-as-bytes-is-valid.φ.α0" pos="18"> 
//       <o base="negative-infinity-as-bytes-is-valid$t0$t1$generated-scope-3eec89b2-e940-4936-822c-f144253f9a53" cut="151" line="536" loc="Φ.org.eolang.negative-infinity-as-bytes-is-valid.φ.α0.generated-scope-3eec89b2-e940-4936-822c-f144253f9a53" name="generated-scope-3eec89b2-e940-4936-822c-f144253f9a53" pos="9" ref="536"/>
//     </o>
//   </o>
// </o>
@XmirObject(name = "negative-infinity-as-bytes-is-validTest", oname = "negative-infinity-as-bytes-is-valid", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/negative-infinity-tests.eo")
public final class EOnegative_infinity_as_bytes_is_validTest extends PhDefault {
    
  public EOnegative_infinity_as_bytes_is_validTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("negative-infinity").get();
        ret_base_base = new PhLocated(ret_base_base, 535, 4, "Φ.org.eolang.negative-infinity-as-bytes-is-valid.φ.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "as-bytes");
        ret_base = new PhLocated(ret_base, 535, 21, "Φ.org.eolang.negative-infinity-as-bytes-is-valid.φ.ρ");
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 534, 2, "Φ.org.eolang.negative-infinity-as-bytes-is-valid.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new EOω1t0$EOt1$EOgenerated_scope_3eec89b2_e940_4936_822c_f144253f9a53(rho);
          ret_1_base = new PhLocated(ret_1_base, 536, 9, "Φ.org.eolang.negative-infinity-as-bytes-is-valid.φ.α0.generated-scope-3eec89b2-e940-4936-822c-f144253f9a53");
        Phi ret_1 = new PhMethod(ret_1_base, "as-bytes");
          ret_1 = new PhLocated(ret_1, 536, 18, "Φ.org.eolang.negative-infinity-as-bytes-is-valid.φ.α0");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOnegative_infinity_as_bytes_is_validTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="536" loc="Φ.org.eolang.negative-infinity-as-bytes-is-valid$t0$t1$generated-scope-3eec89b2-e940-4936-822c-f144253f9a53" name="negative-infinity-as-bytes-is-valid$t0$t1$generated-scope-3eec89b2-e940-4936-822c-f144253f9a53" original-name="generated-scope-3eec89b2-e940-4936-822c-f144253f9a53" parent="negative-infinity-as-bytes-is-valid" pos="9"> 
//   <o base=".div" line="536" loc="Φ.org.eolang.negative-infinity-as-bytes-is-valid$t0$t1$generated-scope-3eec89b2-e940-4936-822c-f144253f9a53.org.eolang.scope-3eec89b2-e940-4936-822c-f144253f9a53" name="org.eolang.scope-3eec89b2-e940-4936-822c-f144253f9a53" pos="9" scope="scope-3eec89b2-e940-4936-822c-f144253f9a53"> 
//     <o base="org.eolang.float" data="float" line="536" loc="Φ.org.eolang.negative-infinity-as-bytes-is-valid$t0$t1$generated-scope-3eec89b2-e940-4936-822c-f144253f9a53.org.eolang.scope-3eec89b2-e940-4936-822c-f144253f9a53.ρ" pos="5" scope="scope-3eec89b2-e940-4936-822c-f144253f9a53">-1.0</o>
//     <o base="org.eolang.float" data="float" line="536" loc="Φ.org.eolang.negative-infinity-as-bytes-is-valid$t0$t1$generated-scope-3eec89b2-e940-4936-822c-f144253f9a53.org.eolang.scope-3eec89b2-e940-4936-822c-f144253f9a53.α0" pos="14" scope="scope-3eec89b2-e940-4936-822c-f144253f9a53">0.0</o>
//   </o>
//   <o base="org.eolang.scope-3eec89b2-e940-4936-822c-f144253f9a53" line="536" loc="Φ.org.eolang.negative-infinity-as-bytes-is-valid$t0$t1$generated-scope-3eec89b2-e940-4936-822c-f144253f9a53.φ" name="@" pos="9" ref="536"/>
// </o>
@XmirObject(name = "ω1t0$t1$generated-scope-3eec89b2-e940-4936-822c-f144253f9a53", oname = "generated-scope-3eec89b2-e940-4936-822c-f144253f9a53", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/negative-infinity-tests.eo")
public final class EOω1t0$EOt1$EOgenerated_scope_3eec89b2_e940_4936_822c_f144253f9a53 extends PhDefault {
    
  public EOω1t0$EOt1$EOgenerated_scope_3eec89b2_e940_4936_822c_f144253f9a53(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-3eec89b2-e940-4936-822c-f144253f9a53", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new EOorg.EOeolang.EOfloat(Phi.Φ);
        ret_base = new PhLocated(ret_base, 536, 5, "Φ.org.eolang.negative-infinity-as-bytes-is-valid$t0$t1$generated-scope-3eec89b2-e940-4936-822c-f144253f9a53.org.eolang.scope-3eec89b2-e940-4936-822c-f144253f9a53.ρ");
        ret_base = new PhWith(ret_base, "Δ", new Data.Value<>(-1.0d));
      Phi ret = new PhMethod(ret_base, "div");
        ret = new PhLocated(ret, 536, 9, "Φ.org.eolang.negative-infinity-as-bytes-is-valid$t0$t1$generated-scope-3eec89b2-e940-4936-822c-f144253f9a53.org.eolang.scope-3eec89b2-e940-4936-822c-f144253f9a53");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOfloat(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 536, 14, "Φ.org.eolang.negative-infinity-as-bytes-is-valid$t0$t1$generated-scope-3eec89b2-e940-4936-822c-f144253f9a53.org.eolang.scope-3eec89b2-e940-4936-822c-f144253f9a53.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(0.0d));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-3eec89b2-e940-4936-822c-f144253f9a53");
        ret = new PhLocated(ret, 536, 9, "Φ.org.eolang.negative-infinity-as-bytes-is-valid$t0$t1$generated-scope-3eec89b2-e940-4936-822c-f144253f9a53.φ");
      return ret;
    })));
  }
}
}
