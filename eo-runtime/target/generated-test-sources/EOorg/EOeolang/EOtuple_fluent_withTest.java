
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="168" loc="Φ.org.eolang.tuple-fluent-with" name="tuple-fluent-with" original-name="tuple-fluent-with" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="169" loc="Φ.org.eolang.tuple-fluent-with.φ" name="@" pos="2"> 
//     <o base=".with" line="170" loc="Φ.org.eolang.tuple-fluent-with.φ.α0" pos="23"> 
//       <o base="tuple-fluent-with$t0$t0$generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb" cut="239" line="170" loc="Φ.org.eolang.tuple-fluent-with.φ.α0.generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb" name="generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb" pos="15" ref="170"/>
//       <o base="org.eolang.int" data="int" line="170" loc="Φ.org.eolang.tuple-fluent-with.φ.α0.α0" pos="29">3</o>
//     </o>
//     <o base=".equal-to" line="171" loc="Φ.org.eolang.tuple-fluent-with.φ.α1" pos="5"> 
//       <o base="$" line="171" loc="Φ.org.eolang.tuple-fluent-with.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.collections.list" line="172" loc="Φ.org.eolang.tuple-fluent-with.φ.α1.α0" pos="6"> 
//         <o base="org.eolang.tuple" data="tuple" line="173" loc="Φ.org.eolang.tuple-fluent-with.φ.α1.α0.α0" pos="8"> 
//           <o base="org.eolang.int" data="int" line="173" loc="Φ.org.eolang.tuple-fluent-with.φ.α1.α0.α0.α0" pos="10">1</o>
//           <o base="org.eolang.int" data="int" line="173" loc="Φ.org.eolang.tuple-fluent-with.φ.α1.α0.α0.α1" pos="12">2</o>
//           <o base="org.eolang.int" data="int" line="173" loc="Φ.org.eolang.tuple-fluent-with.φ.α1.α0.α0.α2" pos="14">3</o>
//         </o>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "tuple-fluent-withTest", oname = "tuple-fluent-with", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/tuple-tests.eo")
public final class EOtuple_fluent_withTest extends PhDefault {
  public EOtuple_fluent_withTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 169, 2, "Φ.org.eolang.tuple-fluent-with.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new EOω1t0$EOt0$EOgenerated_scope_b2c78e1a_0aba_4d9f_881c_a836743176bb(rho);
          ret_1_base = new PhLocated(ret_1_base, 170, 15, "Φ.org.eolang.tuple-fluent-with.φ.α0.generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb");
        Phi ret_1 = new PhMethod(ret_1_base, "with");
          ret_1 = new PhLocated(ret_1, 170, 23, "Φ.org.eolang.tuple-fluent-with.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_1 = new PhLocated(ret_1_1, 170, 29, "Φ.org.eolang.tuple-fluent-with.φ.α0.α0");
            ret_1_1 = new PhWith(ret_1_1, "Δ", new Data.Value<>(3L));
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 171, 4, "Φ.org.eolang.tuple-fluent-with.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 171, 5, "Φ.org.eolang.tuple-fluent-with.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("collections").get().attr("list").get();
            ret_2_1 = new PhLocated(ret_2_1, 172, 6, "Φ.org.eolang.tuple-fluent-with.φ.α1.α0");
          ret_2_1 = new PhCopy(ret_2_1);
            Phi ret_2_1_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("tuple").get();
              ret_2_1_1 = new PhLocated(ret_2_1_1, 173, 8, "Φ.org.eolang.tuple-fluent-with.φ.α1.α0.α0");
              Phi[] ret_2_1_1_a = new Phi[3];
              Phi ret_2_1_1_a0 = new EOorg.EOeolang.EOint(Phi.Φ);
                ret_2_1_1_a0 = new PhLocated(ret_2_1_1_a0, 173, 10, "Φ.org.eolang.tuple-fluent-with.φ.α1.α0.α0.α0");
                ret_2_1_1_a0 = new PhWith(ret_2_1_1_a0, "Δ", new Data.Value<>(1L));
              ret_2_1_1_a[0] = ret_2_1_1_a0;
              Phi ret_2_1_1_a1 = new EOorg.EOeolang.EOint(Phi.Φ);
                ret_2_1_1_a1 = new PhLocated(ret_2_1_1_a1, 173, 12, "Φ.org.eolang.tuple-fluent-with.φ.α1.α0.α0.α1");
                ret_2_1_1_a1 = new PhWith(ret_2_1_1_a1, "Δ", new Data.Value<>(2L));
              ret_2_1_1_a[1] = ret_2_1_1_a1;
              Phi ret_2_1_1_a2 = new EOorg.EOeolang.EOint(Phi.Φ);
                ret_2_1_1_a2 = new PhLocated(ret_2_1_1_a2, 173, 14, "Φ.org.eolang.tuple-fluent-with.φ.α1.α0.α0.α2");
                ret_2_1_1_a2 = new PhWith(ret_2_1_1_a2, "Δ", new Data.Value<>(3L));
              ret_2_1_1_a[2] = ret_2_1_1_a2;
              ret_2_1_1 = new PhWith(new PhCopy(ret_2_1_1), "Δ", new Data.Value<Phi[]>(ret_2_1_1_a));
            ret_2_1 = new PhWith(ret_2_1, 0, ret_2_1_1);
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOtuple_fluent_withTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="170" loc="Φ.org.eolang.tuple-fluent-with$t0$t0$generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb" name="tuple-fluent-with$t0$t0$generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb" original-name="generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb" parent="tuple-fluent-with" pos="15"> 
//   <o base=".with" line="170" loc="Φ.org.eolang.tuple-fluent-with$t0$t0$generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb.org.eolang.scope-b2c78e1a-0aba-4d9f-881c-a836743176bb" name="org.eolang.scope-b2c78e1a-0aba-4d9f-881c-a836743176bb" pos="15" scope="scope-b2c78e1a-0aba-4d9f-881c-a836743176bb"> 
//     <o base="tuple-fluent-with$t0$t0$generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb$t0$generated-scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb" cut="239" line="170" loc="Φ.org.eolang.tuple-fluent-with$t0$t0$generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb.org.eolang.scope-b2c78e1a-0aba-4d9f-881c-a836743176bb.generated-scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb" name="generated-scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb" pos="7" ref="170"/>
//     <o base="org.eolang.int" data="int" line="170" loc="Φ.org.eolang.tuple-fluent-with$t0$t0$generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb.org.eolang.scope-b2c78e1a-0aba-4d9f-881c-a836743176bb.α0" pos="21" scope="scope-b2c78e1a-0aba-4d9f-881c-a836743176bb">2</o>
//   </o>
//   <o base="org.eolang.scope-b2c78e1a-0aba-4d9f-881c-a836743176bb" line="170" loc="Φ.org.eolang.tuple-fluent-with$t0$t0$generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb.φ" name="@" pos="15" ref="170"/>
// </o>
@XmirObject(name = "ω1t0$t0$generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb", oname = "generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/tuple-tests.eo")
public final class EOω1t0$EOt0$EOgenerated_scope_b2c78e1a_0aba_4d9f_881c_a836743176bb extends PhDefault {
  public EOω1t0$EOt0$EOgenerated_scope_b2c78e1a_0aba_4d9f_881c_a836743176bb(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-b2c78e1a-0aba-4d9f-881c-a836743176bb", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new EOω2t0$EOgenerated_scope_4462ec61_1104_4a15_a67e_00fbf274ff79_scope_b2c78e1a_0aba_4d9f_881c_a836743176bb(rho);
        ret_base = new PhLocated(ret_base, 170, 7, "Φ.org.eolang.tuple-fluent-with$t0$t0$generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb.org.eolang.scope-b2c78e1a-0aba-4d9f-881c-a836743176bb.generated-scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb");
      Phi ret = new PhMethod(ret_base, "with");
        ret = new PhLocated(ret, 170, 15, "Φ.org.eolang.tuple-fluent-with$t0$t0$generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb.org.eolang.scope-b2c78e1a-0aba-4d9f-881c-a836743176bb");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 170, 21, "Φ.org.eolang.tuple-fluent-with$t0$t0$generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb.org.eolang.scope-b2c78e1a-0aba-4d9f-881c-a836743176bb.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(2L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-b2c78e1a-0aba-4d9f-881c-a836743176bb");
        ret = new PhLocated(ret, 170, 15, "Φ.org.eolang.tuple-fluent-with$t0$t0$generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb.φ");
      return ret;
    })));
  }

// <o abstract="" ancestors="2" line="170" loc="Φ.org.eolang.tuple-fluent-with$t0$t0$generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb$t0$generated-scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb" name="tuple-fluent-with$t0$t0$generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb$t0$generated-scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb" original-name="generated-scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb" parent="tuple-fluent-with$t0$t0$generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb" pos="7"> 
//   <o base=".with" line="170" loc="Φ.org.eolang.tuple-fluent-with$t0$t0$generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb$t0$generated-scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb.org.eolang.scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb" name="org.eolang.scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb" pos="7" scope="scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb"> 
//     <o base="org.eolang.tuple" data="tuple" line="170" loc="Φ.org.eolang.tuple-fluent-with$t0$t0$generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb$t0$generated-scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb.org.eolang.scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb.ρ" pos="6" scope="scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb"/>
//     <o base="org.eolang.int" data="int" line="170" loc="Φ.org.eolang.tuple-fluent-with$t0$t0$generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb$t0$generated-scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb.org.eolang.scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb.α0" pos="13" scope="scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb">1</o>
//   </o>
//   <o base="org.eolang.scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb" line="170" loc="Φ.org.eolang.tuple-fluent-with$t0$t0$generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb$t0$generated-scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb.φ" name="@" pos="7" ref="170"/>
// </o>
@XmirObject(name = "ω2t0$generated-scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb", oname = "generated-scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/tuple-tests.eo")
public final class EOω2t0$EOgenerated_scope_4462ec61_1104_4a15_a67e_00fbf274ff79_scope_b2c78e1a_0aba_4d9f_881c_a836743176bb extends PhDefault {
  public EOω2t0$EOgenerated_scope_4462ec61_1104_4a15_a67e_00fbf274ff79_scope_b2c78e1a_0aba_4d9f_881c_a836743176bb(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("tuple").get();
        ret_base = new PhLocated(ret_base, 170, 6, "Φ.org.eolang.tuple-fluent-with$t0$t0$generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb$t0$generated-scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb.org.eolang.scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb.ρ");
        Phi[] ret_base_a = new Phi[0];
        ret_base = new PhWith(new PhCopy(ret_base), "Δ", new Data.Value<Phi[]>(ret_base_a));
      Phi ret = new PhMethod(ret_base, "with");
        ret = new PhLocated(ret, 170, 7, "Φ.org.eolang.tuple-fluent-with$t0$t0$generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb$t0$generated-scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb.org.eolang.scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 170, 13, "Φ.org.eolang.tuple-fluent-with$t0$t0$generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb$t0$generated-scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb.org.eolang.scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(1L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb");
        ret = new PhLocated(ret, 170, 7, "Φ.org.eolang.tuple-fluent-with$t0$t0$generated-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb$t0$generated-scope-4462ec61-1104-4a15-a67e-00fbf274ff79-scope-b2c78e1a-0aba-4d9f-881c-a836743176bb.φ");
      return ret;
    })));
  }
}
}
}