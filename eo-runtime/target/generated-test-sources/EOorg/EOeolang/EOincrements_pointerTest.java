
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="85" loc="Φ.org.eolang.increments-pointer" name="increments-pointer" original-name="increments-pointer" pos="0"> 
//   <o base="org.eolang.heap" line="86" loc="Φ.org.eolang.increments-pointer.h" name="h" pos="2"> 
//     <o base="org.eolang.int" data="int" line="86" loc="Φ.org.eolang.increments-pointer.h.α0" pos="7">1024</o>
//   </o>
//   <o base=".pointer" line="87" loc="Φ.org.eolang.increments-pointer.p1" name="p1" pos="3"> 
//     <o base="h" line="87" loc="Φ.org.eolang.increments-pointer.p1.ρ" pos="2" ref="86"/>
//     <o base="org.eolang.int" data="int" line="87" loc="Φ.org.eolang.increments-pointer.p1.α0" pos="12">0</o>
//     <o base="org.eolang.int" data="int" line="87" loc="Φ.org.eolang.increments-pointer.p1.α1" pos="14">2</o>
//   </o>
//   <o base=".add" line="88" loc="Φ.org.eolang.increments-pointer.p2" name="p2" pos="4"> 
//     <o base="p1" line="88" loc="Φ.org.eolang.increments-pointer.p2.ρ" pos="2" ref="87"/>
//     <o base="org.eolang.int" data="int" line="88" loc="Φ.org.eolang.increments-pointer.p2.α0" pos="9">2</o>
//   </o>
//   <o base=".sub" line="89" loc="Φ.org.eolang.increments-pointer.p3" name="p3" pos="4"> 
//     <o base="p2" line="89" loc="Φ.org.eolang.increments-pointer.p3.ρ" pos="2" ref="88"/>
//     <o base="org.eolang.int" data="int" line="89" loc="Φ.org.eolang.increments-pointer.p3.α0" pos="9">1</o>
//   </o>
//   <o base=".eq" line="90" loc="Φ.org.eolang.increments-pointer.φ" name="@" pos="2"> 
//     <o base=".and" line="91" loc="Φ.org.eolang.increments-pointer.φ.ρ" pos="4"> 
//       <o base=".write" line="92" loc="Φ.org.eolang.increments-pointer.φ.ρ.ρ" pos="18"> 
//         <o base="increments-pointer$t4$t0$t0$generated-scope-3593cf44-da2b-42d5-9914-50b7c203f6fb" cut="102" line="92" loc="Φ.org.eolang.increments-pointer.φ.ρ.ρ.generated-scope-3593cf44-da2b-42d5-9914-50b7c203f6fb" name="generated-scope-3593cf44-da2b-42d5-9914-50b7c203f6fb" pos="9" ref="92"> 
//           <o as="p1" base="p1" level="1" loc="Φ.org.eolang.increments-pointer.φ.ρ.ρ.generated-scope-3593cf44-da2b-42d5-9914-50b7c203f6fb.α0" ref="87"/>
//         </o>
//         <o base=".as-bytes" line="92" loc="Φ.org.eolang.increments-pointer.φ.ρ.ρ.α0" pos="34" scope="scope-72827434-9814-426c-ba7c-370c4cb6e53b"> 
//           <o base="org.eolang.string" data="string" line="92" loc="Φ.org.eolang.increments-pointer.φ.ρ.ρ.α0.ρ" pos="26" scope="scope-72827434-9814-426c-ba7c-370c4cb6e53b">HELLO!</o>
//         </o>
//       </o>
//       <o base=".eq" line="93" loc="Φ.org.eolang.increments-pointer.φ.ρ.α0" pos="6"> 
//         <o base=".block" line="94" loc="Φ.org.eolang.increments-pointer.φ.ρ.α0.ρ" pos="10"> 
//           <o base="p2" line="94" loc="Φ.org.eolang.increments-pointer.φ.ρ.α0.ρ.ρ" pos="8" ref="88"/>
//           <o base="org.eolang.int" data="int" line="95" loc="Φ.org.eolang.increments-pointer.φ.ρ.α0.ρ.α0" pos="10">2</o>
//           <o base="increments-pointer$t4$t0$t1$t0$a2" cut="112" line="96" loc="Φ.org.eolang.increments-pointer.φ.ρ.α0.ρ.α1" pos="10" ref="96"/>
//         </o>
//         <o base="org.eolang.string" data="string" line="97" loc="Φ.org.eolang.increments-pointer.φ.ρ.α0.α0" pos="8">O!</o>
//       </o>
//       <o base=".eq" line="98" loc="Φ.org.eolang.increments-pointer.φ.ρ.α1" pos="6"> 
//         <o base=".block" line="99" loc="Φ.org.eolang.increments-pointer.φ.ρ.α1.ρ" pos="10"> 
//           <o base="p3" line="99" loc="Φ.org.eolang.increments-pointer.φ.ρ.α1.ρ.ρ" pos="8" ref="89"/>
//           <o base="org.eolang.int" data="int" line="100" loc="Φ.org.eolang.increments-pointer.φ.ρ.α1.ρ.α0" pos="10">2</o>
//           <o base="increments-pointer$t4$t0$t2$t0$a2" cut="121" line="101" loc="Φ.org.eolang.increments-pointer.φ.ρ.α1.ρ.α1" pos="10" ref="101"/>
//         </o>
//         <o base="org.eolang.string" data="string" line="102" loc="Φ.org.eolang.increments-pointer.φ.ρ.α1.α0" pos="8">LL</o>
//       </o>
//     </o>
//     <o base="org.eolang.bool" data="bool" line="103" loc="Φ.org.eolang.increments-pointer.φ.α0" pos="4">TRUE</o>
//   </o>
// </o>
@XmirObject(name = "increments-pointerTest", oname = "increments-pointer", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/heap-tests.eo")
public final class EOincrements_pointerTest extends PhDefault {
    
  public EOincrements_pointerTest() {
    this.add("h", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("heap").get();
        ret = new PhLocated(ret, 86, 2, "Φ.org.eolang.increments-pointer.h");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 86, 7, "Φ.org.eolang.increments-pointer.h.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(1024L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("p1", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "h");
        ret_base = new PhLocated(ret_base, 87, 2, "Φ.org.eolang.increments-pointer.p1.ρ");
      Phi ret = new PhMethod(ret_base, "pointer");
        ret = new PhLocated(ret, 87, 3, "Φ.org.eolang.increments-pointer.p1");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 87, 12, "Φ.org.eolang.increments-pointer.p1.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(0L));
        Phi ret_2 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_2 = new PhLocated(ret_2, 87, 14, "Φ.org.eolang.increments-pointer.p1.α1");
          ret_2 = new PhWith(ret_2, "Δ", new Data.Value<>(2L));
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
    this.add("p2", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "p1");
        ret_base = new PhLocated(ret_base, 88, 2, "Φ.org.eolang.increments-pointer.p2.ρ");
      Phi ret = new PhMethod(ret_base, "add");
        ret = new PhLocated(ret, 88, 4, "Φ.org.eolang.increments-pointer.p2");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 88, 9, "Φ.org.eolang.increments-pointer.p2.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(2L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("p3", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "p2");
        ret_base = new PhLocated(ret_base, 89, 2, "Φ.org.eolang.increments-pointer.p3.ρ");
      Phi ret = new PhMethod(ret_base, "sub");
        ret = new PhLocated(ret, 89, 4, "Φ.org.eolang.increments-pointer.p3");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 89, 9, "Φ.org.eolang.increments-pointer.p3.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(1L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base_base = new EOω1t4$EOt0$EOt0$EOgenerated_scope_3593cf44_da2b_42d5_9914_50b7c203f6fb(rho);
        ret_base_base_base = new PhLocated(ret_base_base_base, 92, 9, "Φ.org.eolang.increments-pointer.φ.ρ.ρ.generated-scope-3593cf44-da2b-42d5-9914-50b7c203f6fb");
      Phi ret_base_base = new PhMethod(ret_base_base_base, "write");
        ret_base_base = new PhLocated(ret_base_base, 92, 18, "Φ.org.eolang.increments-pointer.φ.ρ.ρ");
      ret_base_base = new PhCopy(ret_base_base);
        Phi ret_base_base_1_base = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_base_base_1_base = new PhLocated(ret_base_base_1_base, 92, 26, "Φ.org.eolang.increments-pointer.φ.ρ.ρ.α0.ρ");
          ret_base_base_1_base = new PhWith(ret_base_base_1_base, "Δ", new Data.Value<>("HELLO!"));
        Phi ret_base_base_1 = new PhMethod(ret_base_base_1_base, "as-bytes");
          ret_base_base_1 = new PhLocated(ret_base_base_1, 92, 34, "Φ.org.eolang.increments-pointer.φ.ρ.ρ.α0");
        ret_base_base = new PhWith(ret_base_base, 0, ret_base_base_1);
      Phi ret_base = new PhMethod(ret_base_base, "and");
        ret_base = new PhLocated(ret_base, 91, 4, "Φ.org.eolang.increments-pointer.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1_base_base = new PhMethod(rho, "p2");
          ret_base_1_base_base = new PhLocated(ret_base_1_base_base, 94, 8, "Φ.org.eolang.increments-pointer.φ.ρ.α0.ρ.ρ");
        Phi ret_base_1_base = new PhMethod(ret_base_1_base_base, "block");
          ret_base_1_base = new PhLocated(ret_base_1_base, 94, 10, "Φ.org.eolang.increments-pointer.φ.ρ.α0.ρ");
        ret_base_1_base = new PhCopy(ret_base_1_base);
          Phi ret_base_1_base_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_base_1_base_1 = new PhLocated(ret_base_1_base_1, 95, 10, "Φ.org.eolang.increments-pointer.φ.ρ.α0.ρ.α0");
            ret_base_1_base_1 = new PhWith(ret_base_1_base_1, "Δ", new Data.Value<>(2L));
          Phi ret_base_1_base_2 = new EOω1t4$EOt0$EOt1$EOt0$EOa2(rho);
            ret_base_1_base_2 = new PhLocated(ret_base_1_base_2, 96, 10, "Φ.org.eolang.increments-pointer.φ.ρ.α0.ρ.α1");
          ret_base_1_base = new PhWith(ret_base_1_base, 0, ret_base_1_base_1);
          ret_base_1_base = new PhWith(ret_base_1_base, 1, ret_base_1_base_2);
        Phi ret_base_1 = new PhMethod(ret_base_1_base, "eq");
          ret_base_1 = new PhLocated(ret_base_1, 93, 6, "Φ.org.eolang.increments-pointer.φ.ρ.α0");
        ret_base_1 = new PhCopy(ret_base_1);
          Phi ret_base_1_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
            ret_base_1_1 = new PhLocated(ret_base_1_1, 97, 8, "Φ.org.eolang.increments-pointer.φ.ρ.α0.α0");
            ret_base_1_1 = new PhWith(ret_base_1_1, "Δ", new Data.Value<>("O!"));
          ret_base_1 = new PhWith(ret_base_1, 0, ret_base_1_1);
        Phi ret_base_2_base_base = new PhMethod(rho, "p3");
          ret_base_2_base_base = new PhLocated(ret_base_2_base_base, 99, 8, "Φ.org.eolang.increments-pointer.φ.ρ.α1.ρ.ρ");
        Phi ret_base_2_base = new PhMethod(ret_base_2_base_base, "block");
          ret_base_2_base = new PhLocated(ret_base_2_base, 99, 10, "Φ.org.eolang.increments-pointer.φ.ρ.α1.ρ");
        ret_base_2_base = new PhCopy(ret_base_2_base);
          Phi ret_base_2_base_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_base_2_base_1 = new PhLocated(ret_base_2_base_1, 100, 10, "Φ.org.eolang.increments-pointer.φ.ρ.α1.ρ.α0");
            ret_base_2_base_1 = new PhWith(ret_base_2_base_1, "Δ", new Data.Value<>(2L));
          Phi ret_base_2_base_2 = new EOω1t4$EOt0$EOt2$EOt0$EOa2(rho);
            ret_base_2_base_2 = new PhLocated(ret_base_2_base_2, 101, 10, "Φ.org.eolang.increments-pointer.φ.ρ.α1.ρ.α1");
          ret_base_2_base = new PhWith(ret_base_2_base, 0, ret_base_2_base_1);
          ret_base_2_base = new PhWith(ret_base_2_base, 1, ret_base_2_base_2);
        Phi ret_base_2 = new PhMethod(ret_base_2_base, "eq");
          ret_base_2 = new PhLocated(ret_base_2, 98, 6, "Φ.org.eolang.increments-pointer.φ.ρ.α1");
        ret_base_2 = new PhCopy(ret_base_2);
          Phi ret_base_2_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
            ret_base_2_1 = new PhLocated(ret_base_2_1, 102, 8, "Φ.org.eolang.increments-pointer.φ.ρ.α1.α0");
            ret_base_2_1 = new PhWith(ret_base_2_1, "Δ", new Data.Value<>("LL"));
          ret_base_2 = new PhWith(ret_base_2, 0, ret_base_2_1);
        ret_base = new PhWith(ret_base, 0, ret_base_1);
        ret_base = new PhWith(ret_base, 1, ret_base_2);
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 90, 2, "Φ.org.eolang.increments-pointer.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EObool(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 103, 4, "Φ.org.eolang.increments-pointer.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(Boolean.TRUE));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOincrements_pointerTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="92" loc="Φ.org.eolang.increments-pointer$t4$t0$t0$generated-scope-3593cf44-da2b-42d5-9914-50b7c203f6fb" name="increments-pointer$t4$t0$t0$generated-scope-3593cf44-da2b-42d5-9914-50b7c203f6fb" original-name="generated-scope-3593cf44-da2b-42d5-9914-50b7c203f6fb" parent="increments-pointer" pos="9"> 
//   <o base=".block" line="92" loc="Φ.org.eolang.increments-pointer$t4$t0$t0$generated-scope-3593cf44-da2b-42d5-9914-50b7c203f6fb.org.eolang.scope-3593cf44-da2b-42d5-9914-50b7c203f6fb" name="org.eolang.scope-3593cf44-da2b-42d5-9914-50b7c203f6fb" pos="9" scope="scope-3593cf44-da2b-42d5-9914-50b7c203f6fb"> 
//     <o base="p1" line="92" loc="Φ.org.eolang.increments-pointer$t4$t0$t0$generated-scope-3593cf44-da2b-42d5-9914-50b7c203f6fb.org.eolang.scope-3593cf44-da2b-42d5-9914-50b7c203f6fb.ρ" pos="7" ref="92.87.455" scope="scope-3593cf44-da2b-42d5-9914-50b7c203f6fb"/>
//     <o base="org.eolang.int" data="int" line="92" loc="Φ.org.eolang.increments-pointer$t4$t0$t0$generated-scope-3593cf44-da2b-42d5-9914-50b7c203f6fb.org.eolang.scope-3593cf44-da2b-42d5-9914-50b7c203f6fb.α0" pos="16" scope="scope-3593cf44-da2b-42d5-9914-50b7c203f6fb">6</o>
//   </o>
//   <o base="org.eolang.scope-3593cf44-da2b-42d5-9914-50b7c203f6fb" line="92" loc="Φ.org.eolang.increments-pointer$t4$t0$t0$generated-scope-3593cf44-da2b-42d5-9914-50b7c203f6fb.φ" name="@" pos="9" ref="92"/>
//   <o level="1" line="92.87.455" loc="Φ.org.eolang.increments-pointer$t4$t0$t0$generated-scope-3593cf44-da2b-42d5-9914-50b7c203f6fb.p1" name="p1"/>
// </o>
@XmirObject(name = "ω1t4$t0$t0$generated-scope-3593cf44-da2b-42d5-9914-50b7c203f6fb", oname = "generated-scope-3593cf44-da2b-42d5-9914-50b7c203f6fb", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/heap-tests.eo")
public final class EOω1t4$EOt0$EOt0$EOgenerated_scope_3593cf44_da2b_42d5_9914_50b7c203f6fb extends PhDefault {
    
  public EOω1t4$EOt0$EOt0$EOgenerated_scope_3593cf44_da2b_42d5_9914_50b7c203f6fb(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-3593cf44-da2b-42d5-9914-50b7c203f6fb", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(new PhMethod(rho, "σ"), "p1");
        ret_base = new PhLocated(ret_base, 92, 7, "Φ.org.eolang.increments-pointer$t4$t0$t0$generated-scope-3593cf44-da2b-42d5-9914-50b7c203f6fb.org.eolang.scope-3593cf44-da2b-42d5-9914-50b7c203f6fb.ρ");
      Phi ret = new PhMethod(ret_base, "block");
        ret = new PhLocated(ret, 92, 9, "Φ.org.eolang.increments-pointer$t4$t0$t0$generated-scope-3593cf44-da2b-42d5-9914-50b7c203f6fb.org.eolang.scope-3593cf44-da2b-42d5-9914-50b7c203f6fb");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 92, 16, "Φ.org.eolang.increments-pointer$t4$t0$t0$generated-scope-3593cf44-da2b-42d5-9914-50b7c203f6fb.org.eolang.scope-3593cf44-da2b-42d5-9914-50b7c203f6fb.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(6L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-3593cf44-da2b-42d5-9914-50b7c203f6fb");
        ret = new PhLocated(ret, 92, 9, "Φ.org.eolang.increments-pointer$t4$t0$t0$generated-scope-3593cf44-da2b-42d5-9914-50b7c203f6fb.φ");
      return ret;
    })));
  }
}

// <o abstract="" ancestors="1" line="96" loc="Φ.org.eolang.increments-pointer$t4$t0$t1$t0$a2" name="increments-pointer$t4$t0$t1$t0$a2" parent="increments-pointer" pos="10"> 
//   <o line="96" loc="Φ.org.eolang.increments-pointer$t4$t0$t1$t0$a2.b" name="b" pos="11"/>
//   <o base=".as-string" line="96" loc="Φ.org.eolang.increments-pointer$t4$t0$t1$t0$a2.φ" name="@" pos="16"> 
//     <o base="b" line="96" loc="Φ.org.eolang.increments-pointer$t4$t0$t1$t0$a2.φ.ρ" pos="15" ref="96"/>
//   </o>
// </o>
@XmirObject(name = "ω1t4$t0$t1$t0$a2", oname = "ω1t4$t0$t1$t0$a2", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/heap-tests.eo")
public final class EOω1t4$EOt0$EOt1$EOt0$EOa2 extends PhDefault {
    
  public EOω1t4$EOt0$EOt1$EOt0$EOa2(final Phi sigma) {
    super(sigma);
    this.add("b", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "b");
        ret_base = new PhLocated(ret_base, 96, 15, "Φ.org.eolang.increments-pointer$t4$t0$t1$t0$a2.φ.ρ");
      Phi ret = new PhMethod(ret_base, "as-string");
        ret = new PhLocated(ret, 96, 16, "Φ.org.eolang.increments-pointer$t4$t0$t1$t0$a2.φ");
      return ret;
    })));
  }
}

// <o abstract="" ancestors="1" line="101" loc="Φ.org.eolang.increments-pointer$t4$t0$t2$t0$a2" name="increments-pointer$t4$t0$t2$t0$a2" parent="increments-pointer" pos="10"> 
//   <o line="101" loc="Φ.org.eolang.increments-pointer$t4$t0$t2$t0$a2.b" name="b" pos="11"/>
//   <o base=".as-string" line="101" loc="Φ.org.eolang.increments-pointer$t4$t0$t2$t0$a2.φ" name="@" pos="16"> 
//     <o base="b" line="101" loc="Φ.org.eolang.increments-pointer$t4$t0$t2$t0$a2.φ.ρ" pos="15" ref="101"/>
//   </o>
// </o>
@XmirObject(name = "ω1t4$t0$t2$t0$a2", oname = "ω1t4$t0$t2$t0$a2", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/heap-tests.eo")
public final class EOω1t4$EOt0$EOt2$EOt0$EOa2 extends PhDefault {
    
  public EOω1t4$EOt0$EOt2$EOt0$EOa2(final Phi sigma) {
    super(sigma);
    this.add("b", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "b");
        ret_base = new PhLocated(ret_base, 101, 15, "Φ.org.eolang.increments-pointer$t4$t0$t2$t0$a2.φ.ρ");
      Phi ret = new PhMethod(ret_base, "as-string");
        ret = new PhLocated(ret, 101, 16, "Φ.org.eolang.increments-pointer$t4$t0$t2$t0$a2.φ");
      return ret;
    })));
  }
}
}
