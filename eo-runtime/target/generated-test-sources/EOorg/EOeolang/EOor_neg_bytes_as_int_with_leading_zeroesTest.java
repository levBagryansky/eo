
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="397" loc="Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes" name="or-neg-bytes-as-int-with-leading-zeroes" original-name="or-neg-bytes-as-int-with-leading-zeroes" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="398" loc="Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes.φ" name="@" pos="2"> 
//     <o base=".as-int" line="399" loc="Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes.φ.α0" pos="51"> 
//       <o base="or-neg-bytes-as-int-with-leading-zeroes$t0$t0$generated-scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7" cut="568" line="399" loc="Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes.φ.α0.generated-scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7" name="generated-scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7" pos="24" ref="399"/>
//     </o>
//     <o base=".equal-to" line="400" loc="Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes.φ.α1" pos="5"> 
//       <o base="$" line="400" loc="Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.int" data="int" line="400" loc="Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes.φ.α1.α0" pos="15">-1897247567</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "or-neg-bytes-as-int-with-leading-zeroesTest", oname = "or-neg-bytes-as-int-with-leading-zeroes", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bytes-tests.eo")
public final class EOor_neg_bytes_as_int_with_leading_zeroesTest extends PhDefault {
  public EOor_neg_bytes_as_int_with_leading_zeroesTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 398, 2, "Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new EOω1t0$EOt0$EOgenerated_scope_8ae8aa54_c5d0_4130_826e_fe69bc5238d7(rho);
          ret_1_base = new PhLocated(ret_1_base, 399, 24, "Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes.φ.α0.generated-scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7");
        Phi ret_1 = new PhMethod(ret_1_base, "as-int");
          ret_1 = new PhLocated(ret_1, 399, 51, "Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 400, 4, "Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 400, 5, "Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 400, 15, "Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(-1897247567L));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOor_neg_bytes_as_int_with_leading_zeroesTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="399" loc="Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes$t0$t0$generated-scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7" name="or-neg-bytes-as-int-with-leading-zeroes$t0$t0$generated-scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7" original-name="generated-scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7" parent="or-neg-bytes-as-int-with-leading-zeroes" pos="24"> 
//   <o base=".or" line="399" loc="Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes$t0$t0$generated-scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7.org.eolang.scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7" name="org.eolang.scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7" pos="24" scope="scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7"> 
//     <o base=".as-bytes" line="399" loc="Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes$t0$t0$generated-scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7.org.eolang.scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7.ρ" pos="15" scope="scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7"> 
//       <o base="org.eolang.int" data="int" line="399" loc="Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes$t0$t0$generated-scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7.org.eolang.scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7.ρ.ρ" pos="5" scope="scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7">2397719729</o>
//     </o>
//     <o base=".as-bytes" line="399" loc="Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes$t0$t0$generated-scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7.org.eolang.scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7.α0" pos="41" scope="scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7"> 
//       <o base="org.eolang.int" data="int" line="399" loc="Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes$t0$t0$generated-scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7.org.eolang.scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7.α0.ρ" pos="29" scope="scope-92dd32b9-68d5-4ed2-9d5a-2b0e99dc5254-scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7">-4294967296</o>
//     </o>
//   </o>
//   <o base="org.eolang.scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7" line="399" loc="Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes$t0$t0$generated-scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7.φ" name="@" pos="24" ref="399"/>
// </o>
@XmirObject(name = "ω1t0$t0$generated-scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7", oname = "generated-scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bytes-tests.eo")
public final class EOω1t0$EOt0$EOgenerated_scope_8ae8aa54_c5d0_4130_826e_fe69bc5238d7 extends PhDefault {
  public EOω1t0$EOt0$EOgenerated_scope_8ae8aa54_c5d0_4130_826e_fe69bc5238d7(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new EOorg.EOeolang.EOint(Phi.Φ);
        ret_base_base = new PhLocated(ret_base_base, 399, 5, "Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes$t0$t0$generated-scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7.org.eolang.scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7.ρ.ρ");
        ret_base_base = new PhWith(ret_base_base, "Δ", new Data.Value<>(2397719729L));
      Phi ret_base = new PhMethod(ret_base_base, "as-bytes");
        ret_base = new PhLocated(ret_base, 399, 15, "Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes$t0$t0$generated-scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7.org.eolang.scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7.ρ");
      Phi ret = new PhMethod(ret_base, "or");
        ret = new PhLocated(ret, 399, 24, "Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes$t0$t0$generated-scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7.org.eolang.scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7");
      ret = new PhCopy(ret);
        Phi ret_1_base = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1_base = new PhLocated(ret_1_base, 399, 29, "Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes$t0$t0$generated-scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7.org.eolang.scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7.α0.ρ");
          ret_1_base = new PhWith(ret_1_base, "Δ", new Data.Value<>(-4294967296L));
        Phi ret_1 = new PhMethod(ret_1_base, "as-bytes");
          ret_1 = new PhLocated(ret_1, 399, 41, "Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes$t0$t0$generated-scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7.org.eolang.scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7.α0");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7");
        ret = new PhLocated(ret, 399, 24, "Φ.org.eolang.or-neg-bytes-as-int-with-leading-zeroes$t0$t0$generated-scope-8ae8aa54-c5d0-4130-826e-fe69bc5238d7.φ");
      return ret;
    })));
  }
}
}
