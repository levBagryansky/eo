
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="104" loc="Φ.org.eolang.calculates-only-once-BROKEN" name="calculates-only-once-BROKEN" original-name="calculates-only-once-BROKEN" pos="0"> 
//   <o base="org.eolang.memory" line="105" loc="Φ.org.eolang.calculates-only-once-BROKEN.x" name="x" pos="2"> 
//     <o base="org.eolang.int" data="int" line="105" loc="Φ.org.eolang.calculates-only-once-BROKEN.x.α0" pos="9">0</o>
//   </o>
//   <o base="calculates-only-once-BROKEN$a" cut="95" line="106" loc="Φ.org.eolang.calculates-only-once-BROKEN.a" name="a" pos="2" ref="106"> 
//     <o as="x" base="x" level="1" loc="Φ.org.eolang.calculates-only-once-BROKEN.a.α0" ref="105"/>
//   </o>
//   <o base=".eq" line="110" loc="Φ.org.eolang.calculates-only-once-BROKEN.φ" name="@" pos="2"> 
//     <o base="org.eolang.seq" line="111" loc="Φ.org.eolang.calculates-only-once-BROKEN.φ.ρ" pos="4"> 
//       <o base=".write" line="112" loc="Φ.org.eolang.calculates-only-once-BROKEN.φ.ρ.α0" pos="7"> 
//         <o base="x" line="112" loc="Φ.org.eolang.calculates-only-once-BROKEN.φ.ρ.α0.ρ" pos="6" ref="105"/>
//         <o base="org.eolang.int" data="int" line="112" loc="Φ.org.eolang.calculates-only-once-BROKEN.φ.ρ.α0.α0" pos="14">0</o>
//       </o>
//       <o base=".eq" line="113" loc="Φ.org.eolang.calculates-only-once-BROKEN.φ.ρ.α1" pos="23"> 
//         <o base=".neg" line="113" loc="Φ.org.eolang.calculates-only-once-BROKEN.φ.ρ.α1.ρ" pos="19"> 
//           <o base=".neg" line="113" loc="Φ.org.eolang.calculates-only-once-BROKEN.φ.ρ.α1.ρ.ρ" pos="15"> 
//             <o base=".neg" line="113" loc="Φ.org.eolang.calculates-only-once-BROKEN.φ.ρ.α1.ρ.ρ.ρ" pos="11"> 
//               <o base=".neg" line="113" loc="Φ.org.eolang.calculates-only-once-BROKEN.φ.ρ.α1.ρ.ρ.ρ.ρ" pos="7"> 
//                 <o base="a" line="113" loc="Φ.org.eolang.calculates-only-once-BROKEN.φ.ρ.α1.ρ.ρ.ρ.ρ.ρ" pos="6" ref="106"/>
//               </o>
//             </o>
//           </o>
//         </o>
//         <o base="org.eolang.int" data="int" line="113" loc="Φ.org.eolang.calculates-only-once-BROKEN.φ.ρ.α1.α0" pos="27">42</o>
//       </o>
//       <o base="x" line="114" loc="Φ.org.eolang.calculates-only-once-BROKEN.φ.ρ.α2" pos="6" ref="105"/>
//     </o>
//     <o base="org.eolang.int" data="int" line="115" loc="Φ.org.eolang.calculates-only-once-BROKEN.φ.α0" pos="4">1</o>
//   </o>
// </o>
@XmirObject(name = "calculates-only-once-BROKENTest", oname = "calculates-only-once-BROKEN", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOcalculates_only_once_BROKENTest extends PhDefault {
    
  public EOcalculates_only_once_BROKENTest() {
    this.add("x", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("memory").get();
        ret = new PhLocated(ret, 105, 2, "Φ.org.eolang.calculates-only-once-BROKEN.x");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 105, 9, "Φ.org.eolang.calculates-only-once-BROKEN.x.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(0L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("a", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω1a(rho);
        ret = new PhLocated(ret, 106, 2, "Φ.org.eolang.calculates-only-once-BROKEN.a");
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("seq").get();
        ret_base = new PhLocated(ret_base, 111, 4, "Φ.org.eolang.calculates-only-once-BROKEN.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1_base = new PhMethod(rho, "x");
          ret_base_1_base = new PhLocated(ret_base_1_base, 112, 6, "Φ.org.eolang.calculates-only-once-BROKEN.φ.ρ.α0.ρ");
        Phi ret_base_1 = new PhMethod(ret_base_1_base, "write");
          ret_base_1 = new PhLocated(ret_base_1, 112, 7, "Φ.org.eolang.calculates-only-once-BROKEN.φ.ρ.α0");
        ret_base_1 = new PhCopy(ret_base_1);
          Phi ret_base_1_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_base_1_1 = new PhLocated(ret_base_1_1, 112, 14, "Φ.org.eolang.calculates-only-once-BROKEN.φ.ρ.α0.α0");
            ret_base_1_1 = new PhWith(ret_base_1_1, "Δ", new Data.Value<>(0L));
          ret_base_1 = new PhWith(ret_base_1, 0, ret_base_1_1);
        Phi ret_base_2_base_base_base_base_base = new PhMethod(rho, "a");
          ret_base_2_base_base_base_base_base = new PhLocated(ret_base_2_base_base_base_base_base, 113, 6, "Φ.org.eolang.calculates-only-once-BROKEN.φ.ρ.α1.ρ.ρ.ρ.ρ.ρ");
        Phi ret_base_2_base_base_base_base = new PhMethod(ret_base_2_base_base_base_base_base, "neg");
          ret_base_2_base_base_base_base = new PhLocated(ret_base_2_base_base_base_base, 113, 7, "Φ.org.eolang.calculates-only-once-BROKEN.φ.ρ.α1.ρ.ρ.ρ.ρ");
        Phi ret_base_2_base_base_base = new PhMethod(ret_base_2_base_base_base_base, "neg");
          ret_base_2_base_base_base = new PhLocated(ret_base_2_base_base_base, 113, 11, "Φ.org.eolang.calculates-only-once-BROKEN.φ.ρ.α1.ρ.ρ.ρ");
        Phi ret_base_2_base_base = new PhMethod(ret_base_2_base_base_base, "neg");
          ret_base_2_base_base = new PhLocated(ret_base_2_base_base, 113, 15, "Φ.org.eolang.calculates-only-once-BROKEN.φ.ρ.α1.ρ.ρ");
        Phi ret_base_2_base = new PhMethod(ret_base_2_base_base, "neg");
          ret_base_2_base = new PhLocated(ret_base_2_base, 113, 19, "Φ.org.eolang.calculates-only-once-BROKEN.φ.ρ.α1.ρ");
        Phi ret_base_2 = new PhMethod(ret_base_2_base, "eq");
          ret_base_2 = new PhLocated(ret_base_2, 113, 23, "Φ.org.eolang.calculates-only-once-BROKEN.φ.ρ.α1");
        ret_base_2 = new PhCopy(ret_base_2);
          Phi ret_base_2_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_base_2_1 = new PhLocated(ret_base_2_1, 113, 27, "Φ.org.eolang.calculates-only-once-BROKEN.φ.ρ.α1.α0");
            ret_base_2_1 = new PhWith(ret_base_2_1, "Δ", new Data.Value<>(42L));
          ret_base_2 = new PhWith(ret_base_2, 0, ret_base_2_1);
        Phi ret_base_3 = new PhMethod(rho, "x");
          ret_base_3 = new PhLocated(ret_base_3, 114, 6, "Φ.org.eolang.calculates-only-once-BROKEN.φ.ρ.α2");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
        ret_base = new PhWith(ret_base, 1, ret_base_2);
        ret_base = new PhWith(ret_base, 2, ret_base_3);
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 110, 2, "Φ.org.eolang.calculates-only-once-BROKEN.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 115, 4, "Φ.org.eolang.calculates-only-once-BROKEN.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(1L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOcalculates_only_once_BROKENTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="106" loc="Φ.org.eolang.calculates-only-once-BROKEN$a" name="calculates-only-once-BROKEN$a" original-name="a" parent="calculates-only-once-BROKEN" pos="2"> 
//   <o base="org.eolang.seq" line="107" loc="Φ.org.eolang.calculates-only-once-BROKEN$a.φ" name="@" pos="4"> 
//     <o base=".write" line="108" loc="Φ.org.eolang.calculates-only-once-BROKEN$a.φ.α0" pos="7"> 
//       <o base="x" line="108" loc="Φ.org.eolang.calculates-only-once-BROKEN$a.φ.α0.ρ" pos="6" ref="106.105.457"/>
//       <o base="calculates-only-once-BROKEN$a$t0$t0$generated-scope-08673313-bbf4-4c8d-8147-89281621744a" cut="96" line="108" loc="Φ.org.eolang.calculates-only-once-BROKEN$a.φ.α0.generated-scope-08673313-bbf4-4c8d-8147-89281621744a" name="generated-scope-08673313-bbf4-4c8d-8147-89281621744a" pos="23" ref="108"> 
//         <o as="x" base="x" level="2" loc="Φ.org.eolang.calculates-only-once-BROKEN$a.φ.α0.generated-scope-08673313-bbf4-4c8d-8147-89281621744a.α0" ref="106.105.457"/>
//       </o>
//     </o>
//     <o base="org.eolang.int" data="int" line="109" loc="Φ.org.eolang.calculates-only-once-BROKEN$a.φ.α1" pos="6">42</o>
//   </o>
//   <o level="1" line="106.105.457" loc="Φ.org.eolang.calculates-only-once-BROKEN$a.x" name="x"/>
// </o>
@XmirObject(name = "ω1a", oname = "a", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω1a extends PhDefault {
    
  public EOω1a(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("seq").get();
        ret = new PhLocated(ret, 107, 4, "Φ.org.eolang.calculates-only-once-BROKEN$a.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(new PhMethod(rho, "σ"), "x");
          ret_1_base = new PhLocated(ret_1_base, 108, 6, "Φ.org.eolang.calculates-only-once-BROKEN$a.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "write");
          ret_1 = new PhLocated(ret_1, 108, 7, "Φ.org.eolang.calculates-only-once-BROKEN$a.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOω2t0$EOt0$EOgenerated_scope_08673313_bbf4_4c8d_8147_89281621744a(rho);
            ret_1_1 = new PhLocated(ret_1_1, 108, 23, "Φ.org.eolang.calculates-only-once-BROKEN$a.φ.α0.generated-scope-08673313-bbf4-4c8d-8147-89281621744a");
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_2 = new PhLocated(ret_2, 109, 6, "Φ.org.eolang.calculates-only-once-BROKEN$a.φ.α1");
          ret_2 = new PhWith(ret_2, "Δ", new Data.Value<>(42L));
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

// <o abstract="" ancestors="2" line="108" loc="Φ.org.eolang.calculates-only-once-BROKEN$a$t0$t0$generated-scope-08673313-bbf4-4c8d-8147-89281621744a" name="calculates-only-once-BROKEN$a$t0$t0$generated-scope-08673313-bbf4-4c8d-8147-89281621744a" original-name="generated-scope-08673313-bbf4-4c8d-8147-89281621744a" parent="calculates-only-once-BROKEN$a" pos="23"> 
//   <o base=".plus" line="108" loc="Φ.org.eolang.calculates-only-once-BROKEN$a$t0$t0$generated-scope-08673313-bbf4-4c8d-8147-89281621744a.org.eolang.scope-08673313-bbf4-4c8d-8147-89281621744a" name="org.eolang.scope-08673313-bbf4-4c8d-8147-89281621744a" pos="23" scope="scope-08673313-bbf4-4c8d-8147-89281621744a"> 
//     <o base=".as-int" line="108" loc="Φ.org.eolang.calculates-only-once-BROKEN$a$t0$t0$generated-scope-08673313-bbf4-4c8d-8147-89281621744a.org.eolang.scope-08673313-bbf4-4c8d-8147-89281621744a.ρ" pos="16" scope="scope-08673313-bbf4-4c8d-8147-89281621744a"> 
//       <o base="x" line="108" loc="Φ.org.eolang.calculates-only-once-BROKEN$a$t0$t0$generated-scope-08673313-bbf4-4c8d-8147-89281621744a.org.eolang.scope-08673313-bbf4-4c8d-8147-89281621744a.ρ.ρ" pos="15" ref="108.105.458" scope="scope-08673313-bbf4-4c8d-8147-89281621744a"/>
//     </o>
//     <o base="org.eolang.int" data="int" line="108" loc="Φ.org.eolang.calculates-only-once-BROKEN$a$t0$t0$generated-scope-08673313-bbf4-4c8d-8147-89281621744a.org.eolang.scope-08673313-bbf4-4c8d-8147-89281621744a.α0" pos="29" scope="scope-08673313-bbf4-4c8d-8147-89281621744a">1</o>
//   </o>
//   <o base="org.eolang.scope-08673313-bbf4-4c8d-8147-89281621744a" line="108" loc="Φ.org.eolang.calculates-only-once-BROKEN$a$t0$t0$generated-scope-08673313-bbf4-4c8d-8147-89281621744a.φ" name="@" pos="23" ref="108"/>
//   <o level="2" line="108.105.458" loc="Φ.org.eolang.calculates-only-once-BROKEN$a$t0$t0$generated-scope-08673313-bbf4-4c8d-8147-89281621744a.x" name="x"/>
// </o>
@XmirObject(name = "ω2t0$t0$generated-scope-08673313-bbf4-4c8d-8147-89281621744a", oname = "generated-scope-08673313-bbf4-4c8d-8147-89281621744a", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω2t0$EOt0$EOgenerated_scope_08673313_bbf4_4c8d_8147_89281621744a extends PhDefault {
    
  public EOω2t0$EOt0$EOgenerated_scope_08673313_bbf4_4c8d_8147_89281621744a(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-08673313-bbf4-4c8d-8147-89281621744a", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new PhMethod(new PhMethod(new PhMethod(rho, "σ"), "σ"), "x");
        ret_base_base = new PhLocated(ret_base_base, 108, 15, "Φ.org.eolang.calculates-only-once-BROKEN$a$t0$t0$generated-scope-08673313-bbf4-4c8d-8147-89281621744a.org.eolang.scope-08673313-bbf4-4c8d-8147-89281621744a.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "as-int");
        ret_base = new PhLocated(ret_base, 108, 16, "Φ.org.eolang.calculates-only-once-BROKEN$a$t0$t0$generated-scope-08673313-bbf4-4c8d-8147-89281621744a.org.eolang.scope-08673313-bbf4-4c8d-8147-89281621744a.ρ");
      Phi ret = new PhMethod(ret_base, "plus");
        ret = new PhLocated(ret, 108, 23, "Φ.org.eolang.calculates-only-once-BROKEN$a$t0$t0$generated-scope-08673313-bbf4-4c8d-8147-89281621744a.org.eolang.scope-08673313-bbf4-4c8d-8147-89281621744a");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 108, 29, "Φ.org.eolang.calculates-only-once-BROKEN$a$t0$t0$generated-scope-08673313-bbf4-4c8d-8147-89281621744a.org.eolang.scope-08673313-bbf4-4c8d-8147-89281621744a.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(1L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-08673313-bbf4-4c8d-8147-89281621744a");
        ret = new PhLocated(ret, 108, 23, "Φ.org.eolang.calculates-only-once-BROKEN$a$t0$t0$generated-scope-08673313-bbf4-4c8d-8147-89281621744a.φ");
      return ret;
    })));
  }
}
}
}
