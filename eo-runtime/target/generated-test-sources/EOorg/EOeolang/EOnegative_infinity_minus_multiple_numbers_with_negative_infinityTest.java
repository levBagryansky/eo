
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="428" loc="Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity" name="negative-infinity-minus-multiple-numbers-with-negative-infinity" original-name="negative-infinity-minus-multiple-numbers-with-negative-infinity" pos="0"> 
//   <o base="org.eolang.negative-infinity" const="" line="429" loc="Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity.neg-inf" name="neg-inf" pos="2"/>
//   <o base="org.eolang.hamcrest.assert-that" line="430" loc="Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity.φ" name="@" pos="2"> 
//     <o base=".as-bytes" line="431" loc="Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity.φ.α0" pos="33"> 
//       <o base="negative-infinity-minus-multiple-numbers-with-negative-infinity$t1$t0$generated-scope-c9cf6f4c-07aa-4022-ae38-d641229a7951" cut="643" line="431" loc="Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity.φ.α0.generated-scope-c9cf6f4c-07aa-4022-ae38-d641229a7951" name="generated-scope-c9cf6f4c-07aa-4022-ae38-d641229a7951" pos="12" ref="431"> 
//         <o as="neg-inf" base="neg-inf" level="1" loc="Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity.φ.α0.generated-scope-c9cf6f4c-07aa-4022-ae38-d641229a7951.α0" ref="429"/>
//       </o>
//     </o>
//     <o base=".equal-to" line="432" loc="Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity.φ.α1" pos="5"> 
//       <o base="$" line="432" loc="Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity.φ.α1.ρ" pos="4"/>
//       <o base=".as-bytes" line="432" loc="Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity.φ.α1.α0" pos="18"> 
//         <o base="org.eolang.nan" line="432" loc="Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity.φ.α1.α0.ρ" pos="15"/>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "negative-infinity-minus-multiple-numbers-with-negative-infinityTest", oname = "negative-infinity-minus-multiple-numbers-with-negative-infinity", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/negative-infinity-tests.eo")
public final class EOnegative_infinity_minus_multiple_numbers_with_negative_infinityTest extends PhDefault {
  public EOnegative_infinity_minus_multiple_numbers_with_negative_infinityTest() {
    this.add("neg-inf", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("negative-infinity").get();
        ret = new PhLocated(ret, 429, 2, "Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity.neg-inf");
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 430, 2, "Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new EOω1t1$EOt0$EOgenerated_scope_c9cf6f4c_07aa_4022_ae38_d641229a7951(rho);
          ret_1_base = new PhLocated(ret_1_base, 431, 12, "Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity.φ.α0.generated-scope-c9cf6f4c-07aa-4022-ae38-d641229a7951");
        Phi ret_1 = new PhMethod(ret_1_base, "as-bytes");
          ret_1 = new PhLocated(ret_1, 431, 33, "Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 432, 4, "Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 432, 5, "Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("nan").get();
            ret_2_1_base = new PhLocated(ret_2_1_base, 432, 15, "Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity.φ.α1.α0.ρ");
          Phi ret_2_1 = new PhMethod(ret_2_1_base, "as-bytes");
            ret_2_1 = new PhLocated(ret_2_1, 432, 18, "Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity.φ.α1.α0");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOnegative_infinity_minus_multiple_numbers_with_negative_infinityTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="431" loc="Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity$t1$t0$generated-scope-c9cf6f4c-07aa-4022-ae38-d641229a7951" name="negative-infinity-minus-multiple-numbers-with-negative-infinity$t1$t0$generated-scope-c9cf6f4c-07aa-4022-ae38-d641229a7951" original-name="generated-scope-c9cf6f4c-07aa-4022-ae38-d641229a7951" parent="negative-infinity-minus-multiple-numbers-with-negative-infinity" pos="12"> 
//   <o base=".minus" line="431" loc="Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity$t1$t0$generated-scope-c9cf6f4c-07aa-4022-ae38-d641229a7951.org.eolang.scope-c9cf6f4c-07aa-4022-ae38-d641229a7951" name="org.eolang.scope-c9cf6f4c-07aa-4022-ae38-d641229a7951" pos="12" scope="scope-c9cf6f4c-07aa-4022-ae38-d641229a7951"> 
//     <o base="neg-inf" line="431" loc="Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity$t1$t0$generated-scope-c9cf6f4c-07aa-4022-ae38-d641229a7951.org.eolang.scope-c9cf6f4c-07aa-4022-ae38-d641229a7951.ρ" pos="5" ref="431.429.463" scope="scope-c9cf6f4c-07aa-4022-ae38-d641229a7951"/>
//     <o base="org.eolang.int" data="int" line="431" loc="Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity$t1$t0$generated-scope-c9cf6f4c-07aa-4022-ae38-d641229a7951.org.eolang.scope-c9cf6f4c-07aa-4022-ae38-d641229a7951.α0" pos="19" scope="scope-c9cf6f4c-07aa-4022-ae38-d641229a7951">42</o>
//     <o base="neg-inf" line="431" loc="Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity$t1$t0$generated-scope-c9cf6f4c-07aa-4022-ae38-d641229a7951.org.eolang.scope-c9cf6f4c-07aa-4022-ae38-d641229a7951.α1" pos="22" ref="431.429.463" scope="scope-c9cf6f4c-07aa-4022-ae38-d641229a7951"/>
//     <o base="org.eolang.int" data="int" line="431" loc="Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity$t1$t0$generated-scope-c9cf6f4c-07aa-4022-ae38-d641229a7951.org.eolang.scope-c9cf6f4c-07aa-4022-ae38-d641229a7951.α2" pos="30" scope="scope-c9cf6f4c-07aa-4022-ae38-d641229a7951">30</o>
//   </o>
//   <o base="org.eolang.scope-c9cf6f4c-07aa-4022-ae38-d641229a7951" line="431" loc="Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity$t1$t0$generated-scope-c9cf6f4c-07aa-4022-ae38-d641229a7951.φ" name="@" pos="12" ref="431"/>
//   <o level="1" line="431.429.463" loc="Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity$t1$t0$generated-scope-c9cf6f4c-07aa-4022-ae38-d641229a7951.neg-inf" name="neg-inf"/>
// </o>
@XmirObject(name = "ω1t1$t0$generated-scope-c9cf6f4c-07aa-4022-ae38-d641229a7951", oname = "generated-scope-c9cf6f4c-07aa-4022-ae38-d641229a7951", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/negative-infinity-tests.eo")
public final class EOω1t1$EOt0$EOgenerated_scope_c9cf6f4c_07aa_4022_ae38_d641229a7951 extends PhDefault {
  public EOω1t1$EOt0$EOgenerated_scope_c9cf6f4c_07aa_4022_ae38_d641229a7951(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-c9cf6f4c-07aa-4022-ae38-d641229a7951", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(new PhMethod(rho, "σ"), "neg-inf");
        ret_base = new PhLocated(ret_base, 431, 5, "Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity$t1$t0$generated-scope-c9cf6f4c-07aa-4022-ae38-d641229a7951.org.eolang.scope-c9cf6f4c-07aa-4022-ae38-d641229a7951.ρ");
      Phi ret = new PhMethod(ret_base, "minus");
        ret = new PhLocated(ret, 431, 12, "Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity$t1$t0$generated-scope-c9cf6f4c-07aa-4022-ae38-d641229a7951.org.eolang.scope-c9cf6f4c-07aa-4022-ae38-d641229a7951");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 431, 19, "Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity$t1$t0$generated-scope-c9cf6f4c-07aa-4022-ae38-d641229a7951.org.eolang.scope-c9cf6f4c-07aa-4022-ae38-d641229a7951.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(42L));
        Phi ret_2 = new PhMethod(new PhMethod(rho, "σ"), "neg-inf");
          ret_2 = new PhLocated(ret_2, 431, 22, "Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity$t1$t0$generated-scope-c9cf6f4c-07aa-4022-ae38-d641229a7951.org.eolang.scope-c9cf6f4c-07aa-4022-ae38-d641229a7951.α1");
        Phi ret_3 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_3 = new PhLocated(ret_3, 431, 30, "Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity$t1$t0$generated-scope-c9cf6f4c-07aa-4022-ae38-d641229a7951.org.eolang.scope-c9cf6f4c-07aa-4022-ae38-d641229a7951.α2");
          ret_3 = new PhWith(ret_3, "Δ", new Data.Value<>(30L));
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
        ret = new PhWith(ret, 2, ret_3);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-c9cf6f4c-07aa-4022-ae38-d641229a7951");
        ret = new PhLocated(ret, 431, 12, "Φ.org.eolang.negative-infinity-minus-multiple-numbers-with-negative-infinity$t1$t0$generated-scope-c9cf6f4c-07aa-4022-ae38-d641229a7951.φ");
      return ret;
    })));
  }
}
}