
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="427" loc="Φ.org.eolang.or-neg-bytes-as-int-with-zero" name="or-neg-bytes-as-int-with-zero" original-name="or-neg-bytes-as-int-with-zero" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="428" loc="Φ.org.eolang.or-neg-bytes-as-int-with-zero.φ" name="@" pos="2"> 
//     <o base=".as-int" line="429" loc="Φ.org.eolang.or-neg-bytes-as-int-with-zero.φ.α0" pos="44"> 
//       <o base="or-neg-bytes-as-int-with-zero$t0$t0$generated-scope-79124403-8043-4114-8b50-8c56621d8060" cut="646" line="429" loc="Φ.org.eolang.or-neg-bytes-as-int-with-zero.φ.α0.generated-scope-79124403-8043-4114-8b50-8c56621d8060" name="generated-scope-79124403-8043-4114-8b50-8c56621d8060" pos="27" ref="429"/>
//     </o>
//     <o base=".equal-to" line="430" loc="Φ.org.eolang.or-neg-bytes-as-int-with-zero.φ.α1" pos="5"> 
//       <o base="$" line="430" loc="Φ.org.eolang.or-neg-bytes-as-int-with-zero.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.int" data="int" line="430" loc="Φ.org.eolang.or-neg-bytes-as-int-with-zero.φ.α1.α0" pos="15">-4294967296</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "or-neg-bytes-as-int-with-zeroTest", oname = "or-neg-bytes-as-int-with-zero", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bytes-tests.eo")
public final class EOor_neg_bytes_as_int_with_zeroTest extends PhDefault {
  public EOor_neg_bytes_as_int_with_zeroTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 428, 2, "Φ.org.eolang.or-neg-bytes-as-int-with-zero.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new EOω1t0$EOt0$EOgenerated_scope_79124403_8043_4114_8b50_8c56621d8060(rho);
          ret_1_base = new PhLocated(ret_1_base, 429, 27, "Φ.org.eolang.or-neg-bytes-as-int-with-zero.φ.α0.generated-scope-79124403-8043-4114-8b50-8c56621d8060");
        Phi ret_1 = new PhMethod(ret_1_base, "as-int");
          ret_1 = new PhLocated(ret_1, 429, 44, "Φ.org.eolang.or-neg-bytes-as-int-with-zero.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 430, 4, "Φ.org.eolang.or-neg-bytes-as-int-with-zero.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 430, 5, "Φ.org.eolang.or-neg-bytes-as-int-with-zero.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 430, 15, "Φ.org.eolang.or-neg-bytes-as-int-with-zero.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(-4294967296L));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOor_neg_bytes_as_int_with_zeroTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="429" loc="Φ.org.eolang.or-neg-bytes-as-int-with-zero$t0$t0$generated-scope-79124403-8043-4114-8b50-8c56621d8060" name="or-neg-bytes-as-int-with-zero$t0$t0$generated-scope-79124403-8043-4114-8b50-8c56621d8060" original-name="generated-scope-79124403-8043-4114-8b50-8c56621d8060" parent="or-neg-bytes-as-int-with-zero" pos="27"> 
//   <o base=".or" line="429" loc="Φ.org.eolang.or-neg-bytes-as-int-with-zero$t0$t0$generated-scope-79124403-8043-4114-8b50-8c56621d8060.org.eolang.scope-79124403-8043-4114-8b50-8c56621d8060" name="org.eolang.scope-79124403-8043-4114-8b50-8c56621d8060" pos="27" scope="scope-79124403-8043-4114-8b50-8c56621d8060"> 
//     <o base=".as-bytes" line="429" loc="Φ.org.eolang.or-neg-bytes-as-int-with-zero$t0$t0$generated-scope-79124403-8043-4114-8b50-8c56621d8060.org.eolang.scope-79124403-8043-4114-8b50-8c56621d8060.ρ" pos="18" scope="scope-79124403-8043-4114-8b50-8c56621d8060"> 
//       <o base="org.eolang.int" data="int" line="429" loc="Φ.org.eolang.or-neg-bytes-as-int-with-zero$t0$t0$generated-scope-79124403-8043-4114-8b50-8c56621d8060.org.eolang.scope-79124403-8043-4114-8b50-8c56621d8060.ρ.ρ" pos="6" scope="scope-a256e865-6de4-48a6-86d9-ee321f50e308-scope-79124403-8043-4114-8b50-8c56621d8060">-4294967296</o>
//     </o>
//     <o base=".as-bytes" line="429" loc="Φ.org.eolang.or-neg-bytes-as-int-with-zero$t0$t0$generated-scope-79124403-8043-4114-8b50-8c56621d8060.org.eolang.scope-79124403-8043-4114-8b50-8c56621d8060.α0" pos="33" scope="scope-52cb0ad7-9a98-4163-8884-2d58f2eeaf81-scope-79124403-8043-4114-8b50-8c56621d8060"> 
//       <o base="org.eolang.int" data="int" line="429" loc="Φ.org.eolang.or-neg-bytes-as-int-with-zero$t0$t0$generated-scope-79124403-8043-4114-8b50-8c56621d8060.org.eolang.scope-79124403-8043-4114-8b50-8c56621d8060.α0.ρ" pos="32" scope="scope-52cb0ad7-9a98-4163-8884-2d58f2eeaf81-scope-79124403-8043-4114-8b50-8c56621d8060">0</o>
//     </o>
//   </o>
//   <o base="org.eolang.scope-79124403-8043-4114-8b50-8c56621d8060" line="429" loc="Φ.org.eolang.or-neg-bytes-as-int-with-zero$t0$t0$generated-scope-79124403-8043-4114-8b50-8c56621d8060.φ" name="@" pos="27" ref="429"/>
// </o>
@XmirObject(name = "ω1t0$t0$generated-scope-79124403-8043-4114-8b50-8c56621d8060", oname = "generated-scope-79124403-8043-4114-8b50-8c56621d8060", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bytes-tests.eo")
public final class EOω1t0$EOt0$EOgenerated_scope_79124403_8043_4114_8b50_8c56621d8060 extends PhDefault {
  public EOω1t0$EOt0$EOgenerated_scope_79124403_8043_4114_8b50_8c56621d8060(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-79124403-8043-4114-8b50-8c56621d8060", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new EOorg.EOeolang.EOint(Phi.Φ);
        ret_base_base = new PhLocated(ret_base_base, 429, 6, "Φ.org.eolang.or-neg-bytes-as-int-with-zero$t0$t0$generated-scope-79124403-8043-4114-8b50-8c56621d8060.org.eolang.scope-79124403-8043-4114-8b50-8c56621d8060.ρ.ρ");
        ret_base_base = new PhWith(ret_base_base, "Δ", new Data.Value<>(-4294967296L));
      Phi ret_base = new PhMethod(ret_base_base, "as-bytes");
        ret_base = new PhLocated(ret_base, 429, 18, "Φ.org.eolang.or-neg-bytes-as-int-with-zero$t0$t0$generated-scope-79124403-8043-4114-8b50-8c56621d8060.org.eolang.scope-79124403-8043-4114-8b50-8c56621d8060.ρ");
      Phi ret = new PhMethod(ret_base, "or");
        ret = new PhLocated(ret, 429, 27, "Φ.org.eolang.or-neg-bytes-as-int-with-zero$t0$t0$generated-scope-79124403-8043-4114-8b50-8c56621d8060.org.eolang.scope-79124403-8043-4114-8b50-8c56621d8060");
      ret = new PhCopy(ret);
        Phi ret_1_base = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1_base = new PhLocated(ret_1_base, 429, 32, "Φ.org.eolang.or-neg-bytes-as-int-with-zero$t0$t0$generated-scope-79124403-8043-4114-8b50-8c56621d8060.org.eolang.scope-79124403-8043-4114-8b50-8c56621d8060.α0.ρ");
          ret_1_base = new PhWith(ret_1_base, "Δ", new Data.Value<>(0L));
        Phi ret_1 = new PhMethod(ret_1_base, "as-bytes");
          ret_1 = new PhLocated(ret_1, 429, 33, "Φ.org.eolang.or-neg-bytes-as-int-with-zero$t0$t0$generated-scope-79124403-8043-4114-8b50-8c56621d8060.org.eolang.scope-79124403-8043-4114-8b50-8c56621d8060.α0");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-79124403-8043-4114-8b50-8c56621d8060");
        ret = new PhLocated(ret, 429, 27, "Φ.org.eolang.or-neg-bytes-as-int-with-zero$t0$t0$generated-scope-79124403-8043-4114-8b50-8c56621d8060.φ");
      return ret;
    })));
  }
}
}
