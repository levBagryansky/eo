
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="31" loc="Φ.org.eolang.makes-tuple-through-special-syntax" name="makes-tuple-through-special-syntax" original-name="makes-tuple-through-special-syntax" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="32" loc="Φ.org.eolang.makes-tuple-through-special-syntax.φ" name="@" pos="2"> 
//     <o base=".length" line="33" loc="Φ.org.eolang.makes-tuple-through-special-syntax.φ.α0" pos="11"> 
//       <o base="makes-tuple-through-special-syntax$t0$t0$generated-scope-311d6336-8977-452f-bd0f-fae500a5ecb3" cut="0" line="33" loc="Φ.org.eolang.makes-tuple-through-special-syntax.φ.α0.generated-scope-311d6336-8977-452f-bd0f-fae500a5ecb3" name="generated-scope-311d6336-8977-452f-bd0f-fae500a5ecb3" pos="5" ref="33"/>
//     </o>
//     <o base=".equal-to" line="34" loc="Φ.org.eolang.makes-tuple-through-special-syntax.φ.α1" pos="5"> 
//       <o base="$" line="34" loc="Φ.org.eolang.makes-tuple-through-special-syntax.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.int" data="int" line="34" loc="Φ.org.eolang.makes-tuple-through-special-syntax.φ.α1.α0" pos="15">2</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "makes-tuple-through-special-syntaxTest", oname = "makes-tuple-through-special-syntax", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/tuple-tests.eo")
public final class EOmakes_tuple_through_special_syntaxTest extends PhDefault {
  public EOmakes_tuple_through_special_syntaxTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 32, 2, "Φ.org.eolang.makes-tuple-through-special-syntax.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new EOω1t0$EOt0$EOgenerated_scope_311d6336_8977_452f_bd0f_fae500a5ecb3(rho);
          ret_1_base = new PhLocated(ret_1_base, 33, 5, "Φ.org.eolang.makes-tuple-through-special-syntax.φ.α0.generated-scope-311d6336-8977-452f-bd0f-fae500a5ecb3");
        Phi ret_1 = new PhMethod(ret_1_base, "length");
          ret_1 = new PhLocated(ret_1, 33, 11, "Φ.org.eolang.makes-tuple-through-special-syntax.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 34, 4, "Φ.org.eolang.makes-tuple-through-special-syntax.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 34, 5, "Φ.org.eolang.makes-tuple-through-special-syntax.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 34, 15, "Φ.org.eolang.makes-tuple-through-special-syntax.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(2L));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOmakes_tuple_through_special_syntaxTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="33" loc="Φ.org.eolang.makes-tuple-through-special-syntax$t0$t0$generated-scope-311d6336-8977-452f-bd0f-fae500a5ecb3" name="makes-tuple-through-special-syntax$t0$t0$generated-scope-311d6336-8977-452f-bd0f-fae500a5ecb3" original-name="generated-scope-311d6336-8977-452f-bd0f-fae500a5ecb3" parent="makes-tuple-through-special-syntax" pos="5"> 
//   <o base="org.eolang.tuple" data="tuple" line="33" loc="Φ.org.eolang.makes-tuple-through-special-syntax$t0$t0$generated-scope-311d6336-8977-452f-bd0f-fae500a5ecb3.org.eolang.scope-311d6336-8977-452f-bd0f-fae500a5ecb3" name="org.eolang.scope-311d6336-8977-452f-bd0f-fae500a5ecb3" pos="5" scope="scope-311d6336-8977-452f-bd0f-fae500a5ecb3"> 
//     <o base="org.eolang.int" data="int" line="33" loc="Φ.org.eolang.makes-tuple-through-special-syntax$t0$t0$generated-scope-311d6336-8977-452f-bd0f-fae500a5ecb3.org.eolang.scope-311d6336-8977-452f-bd0f-fae500a5ecb3.α0" pos="7" scope="scope-311d6336-8977-452f-bd0f-fae500a5ecb3">1</o>
//     <o base="org.eolang.int" data="int" line="33" loc="Φ.org.eolang.makes-tuple-through-special-syntax$t0$t0$generated-scope-311d6336-8977-452f-bd0f-fae500a5ecb3.org.eolang.scope-311d6336-8977-452f-bd0f-fae500a5ecb3.α1" pos="9" scope="scope-311d6336-8977-452f-bd0f-fae500a5ecb3">2</o>
//   </o>
//   <o base="org.eolang.scope-311d6336-8977-452f-bd0f-fae500a5ecb3" line="33" loc="Φ.org.eolang.makes-tuple-through-special-syntax$t0$t0$generated-scope-311d6336-8977-452f-bd0f-fae500a5ecb3.φ" name="@" pos="5" ref="33"/>
// </o>
@XmirObject(name = "ω1t0$t0$generated-scope-311d6336-8977-452f-bd0f-fae500a5ecb3", oname = "generated-scope-311d6336-8977-452f-bd0f-fae500a5ecb3", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/tuple-tests.eo")
public final class EOω1t0$EOt0$EOgenerated_scope_311d6336_8977_452f_bd0f_fae500a5ecb3 extends PhDefault {
  public EOω1t0$EOt0$EOgenerated_scope_311d6336_8977_452f_bd0f_fae500a5ecb3(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-311d6336-8977-452f-bd0f-fae500a5ecb3", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("tuple").get();
        ret = new PhLocated(ret, 33, 5, "Φ.org.eolang.makes-tuple-through-special-syntax$t0$t0$generated-scope-311d6336-8977-452f-bd0f-fae500a5ecb3.org.eolang.scope-311d6336-8977-452f-bd0f-fae500a5ecb3");
        Phi[] ret_a = new Phi[2];
        Phi ret_a0 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_a0 = new PhLocated(ret_a0, 33, 7, "Φ.org.eolang.makes-tuple-through-special-syntax$t0$t0$generated-scope-311d6336-8977-452f-bd0f-fae500a5ecb3.org.eolang.scope-311d6336-8977-452f-bd0f-fae500a5ecb3.α0");
          ret_a0 = new PhWith(ret_a0, "Δ", new Data.Value<>(1L));
        ret_a[0] = ret_a0;
        Phi ret_a1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_a1 = new PhLocated(ret_a1, 33, 9, "Φ.org.eolang.makes-tuple-through-special-syntax$t0$t0$generated-scope-311d6336-8977-452f-bd0f-fae500a5ecb3.org.eolang.scope-311d6336-8977-452f-bd0f-fae500a5ecb3.α1");
          ret_a1 = new PhWith(ret_a1, "Δ", new Data.Value<>(2L));
        ret_a[1] = ret_a1;
        ret = new PhWith(new PhCopy(ret), "Δ", new Data.Value<Phi[]>(ret_a));
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-311d6336-8977-452f-bd0f-fae500a5ecb3");
        ret = new PhLocated(ret, 33, 5, "Φ.org.eolang.makes-tuple-through-special-syntax$t0$t0$generated-scope-311d6336-8977-452f-bd0f-fae500a5ecb3.φ");
      return ret;
    })));
  }
}
}