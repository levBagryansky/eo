
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="269" loc="Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero" name="negative-infinity-times-multiple-numbers-with-neg-float-zero" original-name="negative-infinity-times-multiple-numbers-with-neg-float-zero" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="270" loc="Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero.φ" name="@" pos="2"> 
//     <o base=".as-bytes" line="271" loc="Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero.φ.α0" pos="41"> 
//       <o base="negative-infinity-times-multiple-numbers-with-neg-float-zero$t0$t0$generated-scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59" cut="360" line="271" loc="Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero.φ.α0.generated-scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59" name="generated-scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59" pos="22" ref="271"/>
//     </o>
//     <o base=".equal-to" line="272" loc="Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero.φ.α1" pos="5"> 
//       <o base="$" line="272" loc="Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero.φ.α1.ρ" pos="4"/>
//       <o base=".as-bytes" line="272" loc="Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero.φ.α1.α0" pos="18"> 
//         <o base="org.eolang.nan" line="272" loc="Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero.φ.α1.α0.ρ" pos="15"/>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "negative-infinity-times-multiple-numbers-with-neg-float-zeroTest", oname = "negative-infinity-times-multiple-numbers-with-neg-float-zero", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/negative-infinity-tests.eo")
public final class EOnegative_infinity_times_multiple_numbers_with_neg_float_zeroTest extends PhDefault {
  public EOnegative_infinity_times_multiple_numbers_with_neg_float_zeroTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 270, 2, "Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new EOω1t0$EOt0$EOgenerated_scope_3e60345f_1f0a_4532_9b3a_39c19d7f3f59(rho);
          ret_1_base = new PhLocated(ret_1_base, 271, 22, "Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero.φ.α0.generated-scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59");
        Phi ret_1 = new PhMethod(ret_1_base, "as-bytes");
          ret_1 = new PhLocated(ret_1, 271, 41, "Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 272, 4, "Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 272, 5, "Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("nan").get();
            ret_2_1_base = new PhLocated(ret_2_1_base, 272, 15, "Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero.φ.α1.α0.ρ");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "as-bytes");
            ret_2_1 = new PhLocated(ret_2_1, 272, 18, "Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero.φ.α1.α0");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOnegative_infinity_times_multiple_numbers_with_neg_float_zeroTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="271" loc="Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero$t0$t0$generated-scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59" name="negative-infinity-times-multiple-numbers-with-neg-float-zero$t0$t0$generated-scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59" original-name="generated-scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59" parent="negative-infinity-times-multiple-numbers-with-neg-float-zero" pos="22"> 
//   <o base=".times" line="271" loc="Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero$t0$t0$generated-scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59.org.eolang.scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59" name="org.eolang.scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59" pos="22" scope="scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59"> 
//     <o base="org.eolang.negative-infinity" line="271" loc="Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero$t0$t0$generated-scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59.org.eolang.scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59.ρ" pos="5" scope="scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59"/>
//     <o base="org.eolang.int" data="int" line="271" loc="Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero$t0$t0$generated-scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59.org.eolang.scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59.α0" pos="29" scope="scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59">-25</o>
//     <o base="org.eolang.float" data="float" line="271" loc="Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero$t0$t0$generated-scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59.org.eolang.scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59.α1" pos="33" scope="scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59">-0.0</o>
//     <o base="org.eolang.int" data="int" line="271" loc="Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero$t0$t0$generated-scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59.org.eolang.scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59.α2" pos="38" scope="scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59">51</o>
//   </o>
//   <o base="org.eolang.scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59" line="271" loc="Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero$t0$t0$generated-scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59.φ" name="@" pos="22" ref="271"/>
// </o>
@XmirObject(name = "ω1t0$t0$generated-scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59", oname = "generated-scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/negative-infinity-tests.eo")
public final class EOω1t0$EOt0$EOgenerated_scope_3e60345f_1f0a_4532_9b3a_39c19d7f3f59 extends PhDefault {
  public EOω1t0$EOt0$EOgenerated_scope_3e60345f_1f0a_4532_9b3a_39c19d7f3f59(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("negative-infinity").get();
        ret_base = new PhLocated(ret_base, 271, 5, "Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero$t0$t0$generated-scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59.org.eolang.scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59.ρ");
      Phi ret = new PhMethod(ret_base, "times");
        ret = new PhLocated(ret, 271, 22, "Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero$t0$t0$generated-scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59.org.eolang.scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 271, 29, "Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero$t0$t0$generated-scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59.org.eolang.scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(-25L));
        Phi ret_2 = new EOorg.EOeolang.EOfloat(Phi.Φ);
          ret_2 = new PhLocated(ret_2, 271, 33, "Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero$t0$t0$generated-scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59.org.eolang.scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59.α1");
          ret_2 = new PhWith(ret_2, "Δ", new Data.Value<>(-0.0d));
        Phi ret_3 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_3 = new PhLocated(ret_3, 271, 38, "Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero$t0$t0$generated-scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59.org.eolang.scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59.α2");
          ret_3 = new PhWith(ret_3, "Δ", new Data.Value<>(51L));
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
        ret = new PhWith(ret, 2, ret_3);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59");
        ret = new PhLocated(ret, 271, 22, "Φ.org.eolang.negative-infinity-times-multiple-numbers-with-neg-float-zero$t0$t0$generated-scope-3e60345f-1f0a-4532-9b3a-39c19d7f3f59.φ");
      return ret;
    })));
  }
}
}
