
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="421" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan" name="positive-infinity-minus-multiple-numbers-with-nan" original-name="positive-infinity-minus-multiple-numbers-with-nan" pos="0"> 
//   <o base="org.eolang.nan" line="422" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan.not-a-number" name="not-a-number" pos="2"/>
//   <o base="org.eolang.hamcrest.assert-that" line="423" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan.φ" name="@" pos="2"> 
//     <o base=".as-bytes" line="424" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan.φ.α0" pos="48"> 
//       <o base="positive-infinity-minus-multiple-numbers-with-nan$t1$t0$generated-scope-79f26ed1-1a04-447b-8214-fd9f28d7962a" cut="687" line="424" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan.φ.α0.generated-scope-79f26ed1-1a04-447b-8214-fd9f28d7962a" name="generated-scope-79f26ed1-1a04-447b-8214-fd9f28d7962a" pos="22" ref="424"> 
//         <o as="not-a-number" base="not-a-number" level="1" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan.φ.α0.generated-scope-79f26ed1-1a04-447b-8214-fd9f28d7962a.α0" ref="422"/>
//       </o>
//     </o>
//     <o base=".equal-to" line="425" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan.φ.α1" pos="5"> 
//       <o base="$" line="425" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan.φ.α1.ρ" pos="4"/>
//       <o base=".as-bytes" line="425" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan.φ.α1.α0" pos="27"> 
//         <o base="not-a-number" line="425" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan.φ.α1.α0.ρ" pos="15" ref="422"/>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "positive-infinity-minus-multiple-numbers-with-nanTest", oname = "positive-infinity-minus-multiple-numbers-with-nan", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/positive-infinity-tests.eo")
public final class EOpositive_infinity_minus_multiple_numbers_with_nanTest extends PhDefault {
  public EOpositive_infinity_minus_multiple_numbers_with_nanTest() {
    this.add("not-a-number", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("nan").get();
        ret = new PhLocated(ret, 422, 2, "Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan.not-a-number");
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 423, 2, "Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new EOω1t1$EOt0$EOgenerated_scope_79f26ed1_1a04_447b_8214_fd9f28d7962a(rho);
          ret_1_base = new PhLocated(ret_1_base, 424, 22, "Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan.φ.α0.generated-scope-79f26ed1-1a04-447b-8214-fd9f28d7962a");
        Phi ret_1 = new PhMethod(ret_1_base, "as-bytes");
          ret_1 = new PhLocated(ret_1, 424, 48, "Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 425, 4, "Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 425, 5, "Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = new PhMethod(rho, "not-a-number");
            ret_2_1_base = new PhLocated(ret_2_1_base, 425, 15, "Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan.φ.α1.α0.ρ");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "as-bytes");
            ret_2_1 = new PhLocated(ret_2_1, 425, 27, "Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan.φ.α1.α0");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOpositive_infinity_minus_multiple_numbers_with_nanTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="424" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan$t1$t0$generated-scope-79f26ed1-1a04-447b-8214-fd9f28d7962a" name="positive-infinity-minus-multiple-numbers-with-nan$t1$t0$generated-scope-79f26ed1-1a04-447b-8214-fd9f28d7962a" original-name="generated-scope-79f26ed1-1a04-447b-8214-fd9f28d7962a" parent="positive-infinity-minus-multiple-numbers-with-nan" pos="22"> 
//   <o base=".minus" line="424" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan$t1$t0$generated-scope-79f26ed1-1a04-447b-8214-fd9f28d7962a.org.eolang.scope-79f26ed1-1a04-447b-8214-fd9f28d7962a" name="org.eolang.scope-79f26ed1-1a04-447b-8214-fd9f28d7962a" pos="22" scope="scope-79f26ed1-1a04-447b-8214-fd9f28d7962a"> 
//     <o base="org.eolang.positive-infinity" line="424" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan$t1$t0$generated-scope-79f26ed1-1a04-447b-8214-fd9f28d7962a.org.eolang.scope-79f26ed1-1a04-447b-8214-fd9f28d7962a.ρ" pos="5" scope="scope-79f26ed1-1a04-447b-8214-fd9f28d7962a"/>
//     <o base="org.eolang.int" data="int" line="424" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan$t1$t0$generated-scope-79f26ed1-1a04-447b-8214-fd9f28d7962a.org.eolang.scope-79f26ed1-1a04-447b-8214-fd9f28d7962a.α0" pos="29" scope="scope-79f26ed1-1a04-447b-8214-fd9f28d7962a">42</o>
//     <o base="not-a-number" line="424" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan$t1$t0$generated-scope-79f26ed1-1a04-447b-8214-fd9f28d7962a.org.eolang.scope-79f26ed1-1a04-447b-8214-fd9f28d7962a.α1" pos="32" ref="424.422.459" scope="scope-79f26ed1-1a04-447b-8214-fd9f28d7962a"/>
//     <o base="org.eolang.int" data="int" line="424" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan$t1$t0$generated-scope-79f26ed1-1a04-447b-8214-fd9f28d7962a.org.eolang.scope-79f26ed1-1a04-447b-8214-fd9f28d7962a.α2" pos="45" scope="scope-79f26ed1-1a04-447b-8214-fd9f28d7962a">30</o>
//   </o>
//   <o base="org.eolang.scope-79f26ed1-1a04-447b-8214-fd9f28d7962a" line="424" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan$t1$t0$generated-scope-79f26ed1-1a04-447b-8214-fd9f28d7962a.φ" name="@" pos="22" ref="424"/>
//   <o level="1" line="424.422.459" loc="Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan$t1$t0$generated-scope-79f26ed1-1a04-447b-8214-fd9f28d7962a.not-a-number" name="not-a-number"/>
// </o>
@XmirObject(name = "ω1t1$t0$generated-scope-79f26ed1-1a04-447b-8214-fd9f28d7962a", oname = "generated-scope-79f26ed1-1a04-447b-8214-fd9f28d7962a", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/positive-infinity-tests.eo")
public final class EOω1t1$EOt0$EOgenerated_scope_79f26ed1_1a04_447b_8214_fd9f28d7962a extends PhDefault {
  public EOω1t1$EOt0$EOgenerated_scope_79f26ed1_1a04_447b_8214_fd9f28d7962a(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-79f26ed1-1a04-447b-8214-fd9f28d7962a", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("positive-infinity").get();
        ret_base = new PhLocated(ret_base, 424, 5, "Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan$t1$t0$generated-scope-79f26ed1-1a04-447b-8214-fd9f28d7962a.org.eolang.scope-79f26ed1-1a04-447b-8214-fd9f28d7962a.ρ");
      Phi ret = new PhMethod(ret_base, "minus");
        ret = new PhLocated(ret, 424, 22, "Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan$t1$t0$generated-scope-79f26ed1-1a04-447b-8214-fd9f28d7962a.org.eolang.scope-79f26ed1-1a04-447b-8214-fd9f28d7962a");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 424, 29, "Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan$t1$t0$generated-scope-79f26ed1-1a04-447b-8214-fd9f28d7962a.org.eolang.scope-79f26ed1-1a04-447b-8214-fd9f28d7962a.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(42L));
        Phi ret_2 = new PhMethod(new PhMethod(rho, "σ"), "not-a-number");
          ret_2 = new PhLocated(ret_2, 424, 32, "Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan$t1$t0$generated-scope-79f26ed1-1a04-447b-8214-fd9f28d7962a.org.eolang.scope-79f26ed1-1a04-447b-8214-fd9f28d7962a.α1");
        Phi ret_3 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_3 = new PhLocated(ret_3, 424, 45, "Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan$t1$t0$generated-scope-79f26ed1-1a04-447b-8214-fd9f28d7962a.org.eolang.scope-79f26ed1-1a04-447b-8214-fd9f28d7962a.α2");
          ret_3 = new PhWith(ret_3, "Δ", new Data.Value<>(30L));
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
        ret = new PhWith(ret, 2, ret_3);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-79f26ed1-1a04-447b-8214-fd9f28d7962a");
        ret = new PhLocated(ret, 424, 22, "Φ.org.eolang.positive-infinity-minus-multiple-numbers-with-nan$t1$t0$generated-scope-79f26ed1-1a04-447b-8214-fd9f28d7962a.φ");
      return ret;
    })));
  }
}
}
