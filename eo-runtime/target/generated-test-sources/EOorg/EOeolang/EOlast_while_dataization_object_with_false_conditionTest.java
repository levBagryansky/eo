
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="198" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition" name="last-while-dataization-object-with-false-condition" original-name="last-while-dataization-object-with-false-condition" pos="0"> 
//   <o base="org.eolang.memory" line="199" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition.x" name="x" pos="2"> 
//     <o base="org.eolang.int" data="int" line="199" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition.x.α0" pos="9">3</o>
//   </o>
//   <o base="org.eolang.hamcrest.assert-that" line="200" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition.φ" name="@" pos="2"> 
//     <o base=".while" line="201" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition.φ.α0" pos="4"> 
//       <o base=".lt" line="202" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition.φ.α0.ρ" pos="7"> 
//         <o base="x" line="202" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition.φ.α0.ρ.ρ" pos="6" ref="199"/>
//         <o base="org.eolang.int" data="int" line="202" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition.φ.α0.ρ.α0" pos="11">1</o>
//       </o>
//       <o base="last-while-dataization-object-with-false-condition$t1$t0$a1" cut="362" line="203" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition.φ.α0.α0" pos="6" ref="203"> 
//         <o as="x" base="x" level="1" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition.φ.α0.α0.α0" ref="199"/>
//       </o>
//     </o>
//     <o base=".equal-to" line="207" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition.φ.α1" pos="5"> 
//       <o base="$" line="207" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.bool" data="bool" line="207" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition.φ.α1.α0" pos="15">FALSE</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "last-while-dataization-object-with-false-conditionTest", oname = "last-while-dataization-object-with-false-condition", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bool-tests.eo")
public final class EOlast_while_dataization_object_with_false_conditionTest extends PhDefault {
  public EOlast_while_dataization_object_with_false_conditionTest() {
    this.add("x", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("memory").get();
        ret = new PhLocated(ret, 199, 2, "Φ.org.eolang.last-while-dataization-object-with-false-condition.x");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 199, 9, "Φ.org.eolang.last-while-dataization-object-with-false-condition.x.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(3L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 200, 2, "Φ.org.eolang.last-while-dataization-object-with-false-condition.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base_base = new PhMethod(rho, "x");
          ret_1_base_base = new PhLocated(ret_1_base_base, 202, 6, "Φ.org.eolang.last-while-dataization-object-with-false-condition.φ.α0.ρ.ρ");
        Phi ret_1_base = new PhMethod(ret_1_base_base, "lt");
          ret_1_base = new PhLocated(ret_1_base, 202, 7, "Φ.org.eolang.last-while-dataization-object-with-false-condition.φ.α0.ρ");
        ret_1_base = new PhCopy(ret_1_base);
          Phi ret_1_base_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_base_1 = new PhLocated(ret_1_base_1, 202, 11, "Φ.org.eolang.last-while-dataization-object-with-false-condition.φ.α0.ρ.α0");
            ret_1_base_1 = new PhWith(ret_1_base_1, "Δ", new Data.Value<>(1L));
          ret_1_base = new PhWith(ret_1_base, 0, ret_1_base_1);
        Phi ret_1 = new PhMethod(ret_1_base, "while");
          ret_1 = new PhLocated(ret_1, 201, 4, "Φ.org.eolang.last-while-dataization-object-with-false-condition.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOω1t1$EOt0$EOa1(rho);
            ret_1_1 = new PhLocated(ret_1_1, 203, 6, "Φ.org.eolang.last-while-dataization-object-with-false-condition.φ.α0.α0");
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 207, 4, "Φ.org.eolang.last-while-dataization-object-with-false-condition.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 207, 5, "Φ.org.eolang.last-while-dataization-object-with-false-condition.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EObool(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 207, 15, "Φ.org.eolang.last-while-dataization-object-with-false-condition.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(Boolean.FALSE));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOlast_while_dataization_object_with_false_conditionTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="203" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition$t1$t0$a1" name="last-while-dataization-object-with-false-condition$t1$t0$a1" parent="last-while-dataization-object-with-false-condition" pos="6"> 
//   <o line="203" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition$t1$t0$a1.i" name="i" pos="7"/>
//   <o base="org.eolang.seq" line="204" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition$t1$t0$a1.φ" name="@" pos="8"> 
//     <o base=".write" line="205" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition$t1$t0$a1.φ.α0" pos="11"> 
//       <o base="x" line="205" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition$t1$t0$a1.φ.α0.ρ" pos="10" ref="203.199.459"/>
//       <o base="last-while-dataization-object-with-false-condition$t1$t0$a1$t1$t0$generated-scope-437309e4-7906-4e3f-b823-4be4228fc2f6" cut="364" line="205" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition$t1$t0$a1.φ.α0.generated-scope-437309e4-7906-4e3f-b823-4be4228fc2f6" name="generated-scope-437309e4-7906-4e3f-b823-4be4228fc2f6" pos="20" ref="205"> 
//         <o as="x" base="x" level="2" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition$t1$t0$a1.φ.α0.generated-scope-437309e4-7906-4e3f-b823-4be4228fc2f6.α0" ref="203.199.459"/>
//       </o>
//     </o>
//     <o base="x" line="206" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition$t1$t0$a1.φ.α1" pos="10" ref="203.199.459"/>
//   </o>
//   <o level="1" line="203.199.459" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition$t1$t0$a1.x" name="x"/>
// </o>
@XmirObject(name = "ω1t1$t0$a1", oname = "ω1t1$t0$a1", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bool-tests.eo")
public final class EOω1t1$EOt0$EOa1 extends PhDefault {
  public EOω1t1$EOt0$EOa1(final Phi sigma) {
    super(sigma);
    this.add("i", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("seq").get();
        ret = new PhLocated(ret, 204, 8, "Φ.org.eolang.last-while-dataization-object-with-false-condition$t1$t0$a1.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(new PhMethod(rho, "σ"), "x");
          ret_1_base = new PhLocated(ret_1_base, 205, 10, "Φ.org.eolang.last-while-dataization-object-with-false-condition$t1$t0$a1.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "write");
          ret_1 = new PhLocated(ret_1, 205, 11, "Φ.org.eolang.last-while-dataization-object-with-false-condition$t1$t0$a1.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOω2t1$EOt0$EOgenerated_scope_437309e4_7906_4e3f_b823_4be4228fc2f6(rho);
            ret_1_1 = new PhLocated(ret_1_1, 205, 20, "Φ.org.eolang.last-while-dataization-object-with-false-condition$t1$t0$a1.φ.α0.generated-scope-437309e4-7906-4e3f-b823-4be4228fc2f6");
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2 = new PhMethod(new PhMethod(rho, "σ"), "x");
          ret_2 = new PhLocated(ret_2, 206, 10, "Φ.org.eolang.last-while-dataization-object-with-false-condition$t1$t0$a1.φ.α1");
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

// <o abstract="" ancestors="2" line="205" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition$t1$t0$a1$t1$t0$generated-scope-437309e4-7906-4e3f-b823-4be4228fc2f6" name="last-while-dataization-object-with-false-condition$t1$t0$a1$t1$t0$generated-scope-437309e4-7906-4e3f-b823-4be4228fc2f6" original-name="generated-scope-437309e4-7906-4e3f-b823-4be4228fc2f6" parent="last-while-dataization-object-with-false-condition$t1$t0$a1" pos="20"> 
//   <o base=".plus" line="205" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition$t1$t0$a1$t1$t0$generated-scope-437309e4-7906-4e3f-b823-4be4228fc2f6.org.eolang.scope-437309e4-7906-4e3f-b823-4be4228fc2f6" name="org.eolang.scope-437309e4-7906-4e3f-b823-4be4228fc2f6" pos="20" scope="scope-437309e4-7906-4e3f-b823-4be4228fc2f6"> 
//     <o base="x" line="205" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition$t1$t0$a1$t1$t0$generated-scope-437309e4-7906-4e3f-b823-4be4228fc2f6.org.eolang.scope-437309e4-7906-4e3f-b823-4be4228fc2f6.ρ" pos="19" ref="205.199.460" scope="scope-437309e4-7906-4e3f-b823-4be4228fc2f6"/>
//     <o base="org.eolang.int" data="int" line="205" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition$t1$t0$a1$t1$t0$generated-scope-437309e4-7906-4e3f-b823-4be4228fc2f6.org.eolang.scope-437309e4-7906-4e3f-b823-4be4228fc2f6.α0" pos="26" scope="scope-437309e4-7906-4e3f-b823-4be4228fc2f6">1</o>
//   </o>
//   <o base="org.eolang.scope-437309e4-7906-4e3f-b823-4be4228fc2f6" line="205" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition$t1$t0$a1$t1$t0$generated-scope-437309e4-7906-4e3f-b823-4be4228fc2f6.φ" name="@" pos="20" ref="205"/>
//   <o level="2" line="205.199.460" loc="Φ.org.eolang.last-while-dataization-object-with-false-condition$t1$t0$a1$t1$t0$generated-scope-437309e4-7906-4e3f-b823-4be4228fc2f6.x" name="x"/>
// </o>
@XmirObject(name = "ω2t1$t0$generated-scope-437309e4-7906-4e3f-b823-4be4228fc2f6", oname = "generated-scope-437309e4-7906-4e3f-b823-4be4228fc2f6", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bool-tests.eo")
public final class EOω2t1$EOt0$EOgenerated_scope_437309e4_7906_4e3f_b823_4be4228fc2f6 extends PhDefault {
  public EOω2t1$EOt0$EOgenerated_scope_437309e4_7906_4e3f_b823_4be4228fc2f6(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-437309e4-7906-4e3f-b823-4be4228fc2f6", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(new PhMethod(new PhMethod(rho, "σ"), "σ"), "x");
        ret_base = new PhLocated(ret_base, 205, 19, "Φ.org.eolang.last-while-dataization-object-with-false-condition$t1$t0$a1$t1$t0$generated-scope-437309e4-7906-4e3f-b823-4be4228fc2f6.org.eolang.scope-437309e4-7906-4e3f-b823-4be4228fc2f6.ρ");
      Phi ret = new PhMethod(ret_base, "plus");
        ret = new PhLocated(ret, 205, 20, "Φ.org.eolang.last-while-dataization-object-with-false-condition$t1$t0$a1$t1$t0$generated-scope-437309e4-7906-4e3f-b823-4be4228fc2f6.org.eolang.scope-437309e4-7906-4e3f-b823-4be4228fc2f6");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 205, 26, "Φ.org.eolang.last-while-dataization-object-with-false-condition$t1$t0$a1$t1$t0$generated-scope-437309e4-7906-4e3f-b823-4be4228fc2f6.org.eolang.scope-437309e4-7906-4e3f-b823-4be4228fc2f6.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(1L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-437309e4-7906-4e3f-b823-4be4228fc2f6");
        ret = new PhLocated(ret, 205, 20, "Φ.org.eolang.last-while-dataization-object-with-false-condition$t1$t0$a1$t1$t0$generated-scope-437309e4-7906-4e3f-b823-4be4228fc2f6.φ");
      return ret;
    })));
  }
}
}
}