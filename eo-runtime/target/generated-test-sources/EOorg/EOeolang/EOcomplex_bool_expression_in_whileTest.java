
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="124" loc="Φ.org.eolang.complex-bool-expression-in-while" name="complex-bool-expression-in-while" original-name="complex-bool-expression-in-while" pos="0"> 
//   <o base="org.eolang.memory" line="125" loc="Φ.org.eolang.complex-bool-expression-in-while.m" name="m" pos="2"> 
//     <o base="org.eolang.int" data="int" line="125" loc="Φ.org.eolang.complex-bool-expression-in-while.m.α0" pos="9">0</o>
//   </o>
//   <o base="org.eolang.seq" line="126" loc="Φ.org.eolang.complex-bool-expression-in-while.φ" name="@" pos="2"> 
//     <o base=".write" line="127" loc="Φ.org.eolang.complex-bool-expression-in-while.φ.α0" pos="5"> 
//       <o base="m" line="127" loc="Φ.org.eolang.complex-bool-expression-in-while.φ.α0.ρ" pos="4" ref="125"/>
//       <o base="org.eolang.int" data="int" line="127" loc="Φ.org.eolang.complex-bool-expression-in-while.φ.α0.α0" pos="12">5</o>
//     </o>
//     <o base=".while" line="128" loc="Φ.org.eolang.complex-bool-expression-in-while.φ.α1" pos="4"> 
//       <o base=".eq" line="129" loc="Φ.org.eolang.complex-bool-expression-in-while.φ.α1.ρ" pos="6"> 
//         <o base=".gt" line="130" loc="Φ.org.eolang.complex-bool-expression-in-while.φ.α1.ρ.ρ" pos="16"> 
//           <o base=".as-int" line="130" loc="Φ.org.eolang.complex-bool-expression-in-while.φ.α1.ρ.ρ.ρ" pos="9"> 
//             <o base="m" line="130" loc="Φ.org.eolang.complex-bool-expression-in-while.φ.α1.ρ.ρ.ρ.ρ" pos="8" ref="125"/>
//           </o>
//           <o base="org.eolang.int" data="int" line="130" loc="Φ.org.eolang.complex-bool-expression-in-while.φ.α1.ρ.ρ.α0" pos="20">0</o>
//         </o>
//         <o base="org.eolang.bool" data="bool" line="131" loc="Φ.org.eolang.complex-bool-expression-in-while.φ.α1.ρ.α0" pos="8">TRUE</o>
//       </o>
//       <o base="complex-bool-expression-in-while$t1$t1$a1" cut="209" line="132" loc="Φ.org.eolang.complex-bool-expression-in-while.φ.α1.α0" pos="6" ref="132"> 
//         <o as="m" base="m" level="1" loc="Φ.org.eolang.complex-bool-expression-in-while.φ.α1.α0.α0" ref="125"/>
//       </o>
//     </o>
//     <o base="org.eolang.bool" data="bool" line="137" loc="Φ.org.eolang.complex-bool-expression-in-while.φ.α2" pos="4">TRUE</o>
//   </o>
// </o>
@XmirObject(name = "complex-bool-expression-in-whileTest", oname = "complex-bool-expression-in-while", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bool-tests.eo")
public final class EOcomplex_bool_expression_in_whileTest extends PhDefault {
    
  public EOcomplex_bool_expression_in_whileTest() {
    this.add("m", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("memory").get();
        ret = new PhLocated(ret, 125, 2, "Φ.org.eolang.complex-bool-expression-in-while.m");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 125, 9, "Φ.org.eolang.complex-bool-expression-in-while.m.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(0L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("seq").get();
        ret = new PhLocated(ret, 126, 2, "Φ.org.eolang.complex-bool-expression-in-while.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(rho, "m");
          ret_1_base = new PhLocated(ret_1_base, 127, 4, "Φ.org.eolang.complex-bool-expression-in-while.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "write");
          ret_1 = new PhLocated(ret_1, 127, 5, "Φ.org.eolang.complex-bool-expression-in-while.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_1 = new PhLocated(ret_1_1, 127, 12, "Φ.org.eolang.complex-bool-expression-in-while.φ.α0.α0");
            ret_1_1 = new PhWith(ret_1_1, "Δ", new Data.Value<>(5L));
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base_base_base_base = new PhMethod(rho, "m");
          ret_2_base_base_base_base = new PhLocated(ret_2_base_base_base_base, 130, 8, "Φ.org.eolang.complex-bool-expression-in-while.φ.α1.ρ.ρ.ρ.ρ");
        Phi ret_2_base_base_base = new PhMethod(ret_2_base_base_base_base, "as-int");
          ret_2_base_base_base = new PhLocated(ret_2_base_base_base, 130, 9, "Φ.org.eolang.complex-bool-expression-in-while.φ.α1.ρ.ρ.ρ");
        Phi ret_2_base_base = new PhMethod(ret_2_base_base_base, "gt");
          ret_2_base_base = new PhLocated(ret_2_base_base, 130, 16, "Φ.org.eolang.complex-bool-expression-in-while.φ.α1.ρ.ρ");
        ret_2_base_base = new PhCopy(ret_2_base_base);
          Phi ret_2_base_base_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_2_base_base_1 = new PhLocated(ret_2_base_base_1, 130, 20, "Φ.org.eolang.complex-bool-expression-in-while.φ.α1.ρ.ρ.α0");
            ret_2_base_base_1 = new PhWith(ret_2_base_base_1, "Δ", new Data.Value<>(0L));
          ret_2_base_base = new PhWith(ret_2_base_base, 0, ret_2_base_base_1);
        Phi ret_2_base = new PhMethod(ret_2_base_base, "eq");
          ret_2_base = new PhLocated(ret_2_base, 129, 6, "Φ.org.eolang.complex-bool-expression-in-while.φ.α1.ρ");
        ret_2_base = new PhCopy(ret_2_base);
          Phi ret_2_base_1 = new EOorg.EOeolang.EObool(Phi.Φ);
            ret_2_base_1 = new PhLocated(ret_2_base_1, 131, 8, "Φ.org.eolang.complex-bool-expression-in-while.φ.α1.ρ.α0");
            ret_2_base_1 = new PhWith(ret_2_base_1, "Δ", new Data.Value<>(Boolean.TRUE));
          ret_2_base = new PhWith(ret_2_base, 0, ret_2_base_1);
        Phi ret_2 = new PhMethod(ret_2_base, "while");
          ret_2 = new PhLocated(ret_2, 128, 4, "Φ.org.eolang.complex-bool-expression-in-while.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOω1t1$EOt1$EOa1(rho);
            ret_2_1 = new PhLocated(ret_2_1, 132, 6, "Φ.org.eolang.complex-bool-expression-in-while.φ.α1.α0");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        Phi ret_3 = new EOorg.EOeolang.EObool(Phi.Φ);
          ret_3 = new PhLocated(ret_3, 137, 4, "Φ.org.eolang.complex-bool-expression-in-while.φ.α2");
          ret_3 = new PhWith(ret_3, "Δ", new Data.Value<>(Boolean.TRUE));
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
        ret = new PhWith(ret, 2, ret_3);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOcomplex_bool_expression_in_whileTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="132" loc="Φ.org.eolang.complex-bool-expression-in-while$t1$t1$a1" name="complex-bool-expression-in-while$t1$t1$a1" parent="complex-bool-expression-in-while" pos="6"> 
//   <o line="132" loc="Φ.org.eolang.complex-bool-expression-in-while$t1$t1$a1.i" name="i" pos="7"/>
//   <o base="org.eolang.seq" line="133" loc="Φ.org.eolang.complex-bool-expression-in-while$t1$t1$a1.φ" name="@" pos="8"> 
//     <o base=".write" line="134" loc="Φ.org.eolang.complex-bool-expression-in-while$t1$t1$a1.φ.α0" pos="11"> 
//       <o base="m" line="134" loc="Φ.org.eolang.complex-bool-expression-in-while$t1$t1$a1.φ.α0.ρ" pos="10" ref="132.125.462"/>
//       <o base=".minus" line="135" loc="Φ.org.eolang.complex-bool-expression-in-while$t1$t1$a1.φ.α0.α0" pos="20"> 
//         <o base=".as-int" line="135" loc="Φ.org.eolang.complex-bool-expression-in-while$t1$t1$a1.φ.α0.α0.ρ" pos="13"> 
//           <o base="m" line="135" loc="Φ.org.eolang.complex-bool-expression-in-while$t1$t1$a1.φ.α0.α0.ρ.ρ" pos="12" ref="132.125.462"/>
//         </o>
//         <o base="org.eolang.int" data="int" line="135" loc="Φ.org.eolang.complex-bool-expression-in-while$t1$t1$a1.φ.α0.α0.α0" pos="27">1</o>
//       </o>
//     </o>
//     <o base="org.eolang.bool" data="bool" line="136" loc="Φ.org.eolang.complex-bool-expression-in-while$t1$t1$a1.φ.α1" pos="10">TRUE</o>
//   </o>
//   <o level="1" line="132.125.462" loc="Φ.org.eolang.complex-bool-expression-in-while$t1$t1$a1.m" name="m"/>
// </o>
@XmirObject(name = "ω1t1$t1$a1", oname = "ω1t1$t1$a1", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bool-tests.eo")
public final class EOω1t1$EOt1$EOa1 extends PhDefault {
    
  public EOω1t1$EOt1$EOa1(final Phi sigma) {
    super(sigma);
    this.add("i", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("seq").get();
        ret = new PhLocated(ret, 133, 8, "Φ.org.eolang.complex-bool-expression-in-while$t1$t1$a1.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(new PhMethod(rho, "σ"), "m");
          ret_1_base = new PhLocated(ret_1_base, 134, 10, "Φ.org.eolang.complex-bool-expression-in-while$t1$t1$a1.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "write");
          ret_1 = new PhLocated(ret_1, 134, 11, "Φ.org.eolang.complex-bool-expression-in-while$t1$t1$a1.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1_base_base = new PhMethod(new PhMethod(rho, "σ"), "m");
            ret_1_1_base_base = new PhLocated(ret_1_1_base_base, 135, 12, "Φ.org.eolang.complex-bool-expression-in-while$t1$t1$a1.φ.α0.α0.ρ.ρ");
          Phi ret_1_1_base = new PhMethod(ret_1_1_base_base, "as-int");
            ret_1_1_base = new PhLocated(ret_1_1_base, 135, 13, "Φ.org.eolang.complex-bool-expression-in-while$t1$t1$a1.φ.α0.α0.ρ");
          Phi ret_1_1 = new PhMethod(ret_1_1_base, "minus");
            ret_1_1 = new PhLocated(ret_1_1, 135, 20, "Φ.org.eolang.complex-bool-expression-in-while$t1$t1$a1.φ.α0.α0");
          ret_1_1 = new PhCopy(ret_1_1);
            Phi ret_1_1_1 = new EOorg.EOeolang.EOint(Phi.Φ);
              ret_1_1_1 = new PhLocated(ret_1_1_1, 135, 27, "Φ.org.eolang.complex-bool-expression-in-while$t1$t1$a1.φ.α0.α0.α0");
              ret_1_1_1 = new PhWith(ret_1_1_1, "Δ", new Data.Value<>(1L));
            ret_1_1 = new PhWith(ret_1_1, 0, ret_1_1_1);
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2 = new EOorg.EOeolang.EObool(Phi.Φ);
          ret_2 = new PhLocated(ret_2, 136, 10, "Φ.org.eolang.complex-bool-expression-in-while$t1$t1$a1.φ.α1");
          ret_2 = new PhWith(ret_2, "Δ", new Data.Value<>(Boolean.TRUE));
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }
}
}
