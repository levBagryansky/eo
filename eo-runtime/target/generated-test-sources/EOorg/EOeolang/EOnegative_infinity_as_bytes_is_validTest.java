
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="539" loc="Φ.org.eolang.negative-infinity-as-bytes-is-valid" name="negative-infinity-as-bytes-is-valid" original-name="negative-infinity-as-bytes-is-valid" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="540" loc="Φ.org.eolang.negative-infinity-as-bytes-is-valid.φ" name="@" pos="2"> 
//     <o base=".as-bytes" line="541" loc="Φ.org.eolang.negative-infinity-as-bytes-is-valid.φ.α0" pos="21"> 
//       <o base="org.eolang.negative-infinity" line="541" loc="Φ.org.eolang.negative-infinity-as-bytes-is-valid.φ.α0.ρ" pos="4"/>
//     </o>
//     <o base=".equal-to" line="542" loc="Φ.org.eolang.negative-infinity-as-bytes-is-valid.φ.α1" pos="5"> 
//       <o base="$" line="542" loc="Φ.org.eolang.negative-infinity-as-bytes-is-valid.φ.α1.ρ" pos="4"/>
//       <o base=".as-bytes" line="542" loc="Φ.org.eolang.negative-infinity-as-bytes-is-valid.φ.α1.α0" pos="29"> 
//         <o base="negative-infinity-as-bytes-is-valid$t0$t1$t1$generated-scope-18523f5f-1218-4318-a43b-498ea94c78fc" cut="832" line="542" loc="Φ.org.eolang.negative-infinity-as-bytes-is-valid.φ.α1.α0.generated-scope-18523f5f-1218-4318-a43b-498ea94c78fc" name="generated-scope-18523f5f-1218-4318-a43b-498ea94c78fc" pos="20" ref="542"/>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "negative-infinity-as-bytes-is-validTest", oname = "negative-infinity-as-bytes-is-valid", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/negative-infinity-tests.eo")
public final class EOnegative_infinity_as_bytes_is_validTest extends PhDefault {
  public EOnegative_infinity_as_bytes_is_validTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 540, 2, "Φ.org.eolang.negative-infinity-as-bytes-is-valid.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("negative-infinity").get();
          ret_1_base = new PhLocated(ret_1_base, 541, 4, "Φ.org.eolang.negative-infinity-as-bytes-is-valid.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "as-bytes");
          ret_1 = new PhLocated(ret_1, 541, 21, "Φ.org.eolang.negative-infinity-as-bytes-is-valid.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 542, 4, "Φ.org.eolang.negative-infinity-as-bytes-is-valid.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 542, 5, "Φ.org.eolang.negative-infinity-as-bytes-is-valid.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = new EOω1t0$EOt1$EOt1$EOgenerated_scope_18523f5f_1218_4318_a43b_498ea94c78fc(rho);
            ret_2_1_base = new PhLocated(ret_2_1_base, 542, 20, "Φ.org.eolang.negative-infinity-as-bytes-is-valid.φ.α1.α0.generated-scope-18523f5f-1218-4318-a43b-498ea94c78fc");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "as-bytes");
            ret_2_1 = new PhLocated(ret_2_1, 542, 29, "Φ.org.eolang.negative-infinity-as-bytes-is-valid.φ.α1.α0");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
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

// <o abstract="" ancestors="1" line="542" loc="Φ.org.eolang.negative-infinity-as-bytes-is-valid$t0$t1$t1$generated-scope-18523f5f-1218-4318-a43b-498ea94c78fc" name="negative-infinity-as-bytes-is-valid$t0$t1$t1$generated-scope-18523f5f-1218-4318-a43b-498ea94c78fc" original-name="generated-scope-18523f5f-1218-4318-a43b-498ea94c78fc" parent="negative-infinity-as-bytes-is-valid" pos="20"> 
//   <o base=".div" line="542" loc="Φ.org.eolang.negative-infinity-as-bytes-is-valid$t0$t1$t1$generated-scope-18523f5f-1218-4318-a43b-498ea94c78fc.org.eolang.scope-18523f5f-1218-4318-a43b-498ea94c78fc" name="org.eolang.scope-18523f5f-1218-4318-a43b-498ea94c78fc" pos="20" scope="scope-18523f5f-1218-4318-a43b-498ea94c78fc"> 
//     <o base="org.eolang.float" data="float" line="542" loc="Φ.org.eolang.negative-infinity-as-bytes-is-valid$t0$t1$t1$generated-scope-18523f5f-1218-4318-a43b-498ea94c78fc.org.eolang.scope-18523f5f-1218-4318-a43b-498ea94c78fc.ρ" pos="16" scope="scope-18523f5f-1218-4318-a43b-498ea94c78fc">-1.0</o>
//     <o base="org.eolang.float" data="float" line="542" loc="Φ.org.eolang.negative-infinity-as-bytes-is-valid$t0$t1$t1$generated-scope-18523f5f-1218-4318-a43b-498ea94c78fc.org.eolang.scope-18523f5f-1218-4318-a43b-498ea94c78fc.α0" pos="25" scope="scope-18523f5f-1218-4318-a43b-498ea94c78fc">0.0</o>
//   </o>
//   <o base="org.eolang.scope-18523f5f-1218-4318-a43b-498ea94c78fc" line="542" loc="Φ.org.eolang.negative-infinity-as-bytes-is-valid$t0$t1$t1$generated-scope-18523f5f-1218-4318-a43b-498ea94c78fc.φ" name="@" pos="20" ref="542"/>
// </o>
@XmirObject(name = "ω1t0$t1$t1$generated-scope-18523f5f-1218-4318-a43b-498ea94c78fc", oname = "generated-scope-18523f5f-1218-4318-a43b-498ea94c78fc", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/negative-infinity-tests.eo")
public final class EOω1t0$EOt1$EOt1$EOgenerated_scope_18523f5f_1218_4318_a43b_498ea94c78fc extends PhDefault {
  public EOω1t0$EOt1$EOt1$EOgenerated_scope_18523f5f_1218_4318_a43b_498ea94c78fc(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-18523f5f-1218-4318-a43b-498ea94c78fc", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new EOorg.EOeolang.EOfloat(Phi.Φ);
        ret_base = new PhLocated(ret_base, 542, 16, "Φ.org.eolang.negative-infinity-as-bytes-is-valid$t0$t1$t1$generated-scope-18523f5f-1218-4318-a43b-498ea94c78fc.org.eolang.scope-18523f5f-1218-4318-a43b-498ea94c78fc.ρ");
        ret_base = new PhWith(ret_base, "Δ", new Data.Value<>(-1.0d));
      Phi ret = new PhMethod(ret_base, "div");
        ret = new PhLocated(ret, 542, 20, "Φ.org.eolang.negative-infinity-as-bytes-is-valid$t0$t1$t1$generated-scope-18523f5f-1218-4318-a43b-498ea94c78fc.org.eolang.scope-18523f5f-1218-4318-a43b-498ea94c78fc");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOfloat(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 542, 25, "Φ.org.eolang.negative-infinity-as-bytes-is-valid$t0$t1$t1$generated-scope-18523f5f-1218-4318-a43b-498ea94c78fc.org.eolang.scope-18523f5f-1218-4318-a43b-498ea94c78fc.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(0.0d));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-18523f5f-1218-4318-a43b-498ea94c78fc");
        ret = new PhLocated(ret, 542, 20, "Φ.org.eolang.negative-infinity-as-bytes-is-valid$t0$t1$t1$generated-scope-18523f5f-1218-4318-a43b-498ea94c78fc.φ");
      return ret;
    })));
  }
}
}