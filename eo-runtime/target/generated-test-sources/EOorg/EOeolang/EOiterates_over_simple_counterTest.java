
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="63" loc="Φ.org.eolang.iterates-over-simple-counter" name="iterates-over-simple-counter" original-name="iterates-over-simple-counter" pos="0"> 
//   <o base="org.eolang.memory" line="64" loc="Φ.org.eolang.iterates-over-simple-counter.x" name="x" pos="2"> 
//     <o base="org.eolang.int" data="int" line="64" loc="Φ.org.eolang.iterates-over-simple-counter.x.α0" pos="9">0</o>
//   </o>
//   <o base="org.eolang.hamcrest.assert-that" line="65" loc="Φ.org.eolang.iterates-over-simple-counter.φ" name="@" pos="2"> 
//     <o base=".and" line="66" loc="Φ.org.eolang.iterates-over-simple-counter.φ.α0" pos="4"> 
//       <o base=".eq" line="67" loc="Φ.org.eolang.iterates-over-simple-counter.φ.α0.ρ" pos="6"> 
//         <o base=".write" line="68" loc="Φ.org.eolang.iterates-over-simple-counter.φ.α0.ρ.ρ" pos="9"> 
//           <o base="x" line="68" loc="Φ.org.eolang.iterates-over-simple-counter.φ.α0.ρ.ρ.ρ" pos="8" ref="64"/>
//           <o base="org.eolang.int" data="int" line="68" loc="Φ.org.eolang.iterates-over-simple-counter.φ.α0.ρ.ρ.α0" pos="16">5</o>
//         </o>
//         <o base="org.eolang.int" data="int" line="69" loc="Φ.org.eolang.iterates-over-simple-counter.φ.α0.ρ.α0" pos="8">5</o>
//       </o>
//       <o base=".eq" line="70" loc="Φ.org.eolang.iterates-over-simple-counter.φ.α0.α0" pos="6"> 
//         <o base="org.eolang.int" data="int" line="71" loc="Φ.org.eolang.iterates-over-simple-counter.φ.α0.α0.ρ" pos="8">11</o>
//         <o base=".while" line="72" loc="Φ.org.eolang.iterates-over-simple-counter.φ.α0.α0.α0" pos="8"> 
//           <o base=".lt" line="73" loc="Φ.org.eolang.iterates-over-simple-counter.φ.α0.α0.α0.ρ" pos="11"> 
//             <o base="x" line="73" loc="Φ.org.eolang.iterates-over-simple-counter.φ.α0.α0.α0.ρ.ρ" pos="10" ref="64"/>
//             <o base="org.eolang.int" data="int" line="73" loc="Φ.org.eolang.iterates-over-simple-counter.φ.α0.α0.α0.ρ.α0" pos="15">10</o>
//           </o>
//           <o base="iterates-over-simple-counter$t1$t0$t1$t1$a1" cut="55" line="74" loc="Φ.org.eolang.iterates-over-simple-counter.φ.α0.α0.α0.α0" pos="10" ref="74"> 
//             <o as="x" base="x" level="1" loc="Φ.org.eolang.iterates-over-simple-counter.φ.α0.α0.α0.α0.α0" ref="64"/>
//           </o>
//         </o>
//       </o>
//     </o>
//     <o base=".equal-to" line="77" loc="Φ.org.eolang.iterates-over-simple-counter.φ.α1" pos="5"> 
//       <o base="$" line="77" loc="Φ.org.eolang.iterates-over-simple-counter.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.bool" data="bool" line="77" loc="Φ.org.eolang.iterates-over-simple-counter.φ.α1.α0" pos="15">TRUE</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "iterates-over-simple-counterTest", oname = "iterates-over-simple-counter", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bool-tests.eo")
public final class EOiterates_over_simple_counterTest extends PhDefault {
  public EOiterates_over_simple_counterTest() {
    this.add("x", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("memory").get();
        ret = new PhLocated(ret, 64, 2, "Φ.org.eolang.iterates-over-simple-counter.x");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 64, 9, "Φ.org.eolang.iterates-over-simple-counter.x.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(0L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 65, 2, "Φ.org.eolang.iterates-over-simple-counter.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base_base_base = new PhMethod(rho, "x");
          ret_1_base_base_base = new PhLocated(ret_1_base_base_base, 68, 8, "Φ.org.eolang.iterates-over-simple-counter.φ.α0.ρ.ρ.ρ");
        Phi ret_1_base_base = new PhMethod(ret_1_base_base_base, "write");
          ret_1_base_base = new PhLocated(ret_1_base_base, 68, 9, "Φ.org.eolang.iterates-over-simple-counter.φ.α0.ρ.ρ");
        ret_1_base_base = new PhCopy(ret_1_base_base);
          Phi ret_1_base_base_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_base_base_1 = new PhLocated(ret_1_base_base_1, 68, 16, "Φ.org.eolang.iterates-over-simple-counter.φ.α0.ρ.ρ.α0");
            ret_1_base_base_1 = new PhWith(ret_1_base_base_1, "Δ", new Data.Value<>(5L));
          ret_1_base_base = new PhWith(ret_1_base_base, 0, ret_1_base_base_1);
        Phi ret_1_base = new PhMethod(ret_1_base_base, "eq");
          ret_1_base = new PhLocated(ret_1_base, 67, 6, "Φ.org.eolang.iterates-over-simple-counter.φ.α0.ρ");
        ret_1_base = new PhCopy(ret_1_base);
          Phi ret_1_base_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_base_1 = new PhLocated(ret_1_base_1, 69, 8, "Φ.org.eolang.iterates-over-simple-counter.φ.α0.ρ.α0");
            ret_1_base_1 = new PhWith(ret_1_base_1, "Δ", new Data.Value<>(5L));
          ret_1_base = new PhWith(ret_1_base, 0, ret_1_base_1);
        Phi ret_1 = new PhMethod(ret_1_base, "and");
          ret_1 = new PhLocated(ret_1, 66, 4, "Φ.org.eolang.iterates-over-simple-counter.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1_base = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_1_base = new PhLocated(ret_1_1_base, 71, 8, "Φ.org.eolang.iterates-over-simple-counter.φ.α0.α0.ρ");
            ret_1_1_base = new PhWith(ret_1_1_base, "Δ", new Data.Value<>(11L));
          Phi ret_1_1 = new PhMethod(ret_1_1_base, "eq");
            ret_1_1 = new PhLocated(ret_1_1, 70, 6, "Φ.org.eolang.iterates-over-simple-counter.φ.α0.α0");
          ret_1_1 = new PhCopy(ret_1_1);
            Phi ret_1_1_1_base_base = new PhMethod(rho, "x");
              ret_1_1_1_base_base = new PhLocated(ret_1_1_1_base_base, 73, 10, "Φ.org.eolang.iterates-over-simple-counter.φ.α0.α0.α0.ρ.ρ");
            Phi ret_1_1_1_base = new PhMethod(ret_1_1_1_base_base, "lt");
              ret_1_1_1_base = new PhLocated(ret_1_1_1_base, 73, 11, "Φ.org.eolang.iterates-over-simple-counter.φ.α0.α0.α0.ρ");
            ret_1_1_1_base = new PhCopy(ret_1_1_1_base);
              Phi ret_1_1_1_base_1 = new EOorg.EOeolang.EOint(Phi.Φ);
                ret_1_1_1_base_1 = new PhLocated(ret_1_1_1_base_1, 73, 15, "Φ.org.eolang.iterates-over-simple-counter.φ.α0.α0.α0.ρ.α0");
                ret_1_1_1_base_1 = new PhWith(ret_1_1_1_base_1, "Δ", new Data.Value<>(10L));
              ret_1_1_1_base = new PhWith(ret_1_1_1_base, 0, ret_1_1_1_base_1);
            Phi ret_1_1_1 = new PhMethod(ret_1_1_1_base, "while");
              ret_1_1_1 = new PhLocated(ret_1_1_1, 72, 8, "Φ.org.eolang.iterates-over-simple-counter.φ.α0.α0.α0");
            ret_1_1_1 = new PhCopy(ret_1_1_1);
              Phi ret_1_1_1_1 = new EOω1t1$EOt0$EOt1$EOt1$EOa1(rho);
                ret_1_1_1_1 = new PhLocated(ret_1_1_1_1, 74, 10, "Φ.org.eolang.iterates-over-simple-counter.φ.α0.α0.α0.α0");
              ret_1_1_1 = new PhWith(ret_1_1_1, 0, ret_1_1_1_1);
            ret_1_1 = new PhWith(ret_1_1, 0, ret_1_1_1);
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 77, 4, "Φ.org.eolang.iterates-over-simple-counter.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 77, 5, "Φ.org.eolang.iterates-over-simple-counter.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EObool(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 77, 15, "Φ.org.eolang.iterates-over-simple-counter.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(Boolean.TRUE));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOiterates_over_simple_counterTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="74" loc="Φ.org.eolang.iterates-over-simple-counter$t1$t0$t1$t1$a1" name="iterates-over-simple-counter$t1$t0$t1$t1$a1" parent="iterates-over-simple-counter" pos="10"> 
//   <o line="74" loc="Φ.org.eolang.iterates-over-simple-counter$t1$t0$t1$t1$a1.i" name="i" pos="11"/>
//   <o base=".^" line="75" loc="Φ.org.eolang.iterates-over-simple-counter$t1$t0$t1$t1$a1.x" name="x" pos="15"> 
//     <o base=".^" line="75" loc="Φ.org.eolang.iterates-over-simple-counter$t1$t0$t1$t1$a1.x.ρ" pos="13"> 
//       <o base="^" line="75" loc="Φ.org.eolang.iterates-over-simple-counter$t1$t0$t1$t1$a1.x.ρ.ρ" pos="12"/>
//     </o>
//   </o>
//   <o base=".write" line="76" loc="Φ.org.eolang.iterates-over-simple-counter$t1$t0$t1$t1$a1.φ" name="@" pos="13"> 
//     <o base="x" line="76" loc="Φ.org.eolang.iterates-over-simple-counter$t1$t0$t1$t1$a1.φ.ρ" pos="12" ref="75"/>
//     <o base="iterates-over-simple-counter$t1$t0$t1$t1$a1$t2$generated-scope-1ca903fb-15ee-4866-8ba2-410838f2b70f" cut="60" line="76" loc="Φ.org.eolang.iterates-over-simple-counter$t1$t0$t1$t1$a1.φ.generated-scope-1ca903fb-15ee-4866-8ba2-410838f2b70f" name="generated-scope-1ca903fb-15ee-4866-8ba2-410838f2b70f" pos="22" ref="76"> 
//       <o as="x" base="x" level="1" loc="Φ.org.eolang.iterates-over-simple-counter$t1$t0$t1$t1$a1.φ.generated-scope-1ca903fb-15ee-4866-8ba2-410838f2b70f.α0" ref="75"/>
//     </o>
//   </o>
// </o>
@XmirObject(name = "ω1t1$t0$t1$t1$a1", oname = "ω1t1$t0$t1$t1$a1", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bool-tests.eo")
public final class EOω1t1$EOt0$EOt1$EOt1$EOa1 extends PhDefault {
  public EOω1t1$EOt0$EOt1$EOt1$EOa1(final Phi sigma) {
    super(sigma);
    this.add("i", new AtFree(/* default */));
    this.add("x", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new PhMethod(rho, "ρ");
        ret_base_base = new PhLocated(ret_base_base, 75, 12, "Φ.org.eolang.iterates-over-simple-counter$t1$t0$t1$t1$a1.x.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "ρ");
        ret_base = new PhLocated(ret_base, 75, 13, "Φ.org.eolang.iterates-over-simple-counter$t1$t0$t1$t1$a1.x.ρ");
      Phi ret = new PhMethod(ret_base, "ρ");
        ret = new PhLocated(ret, 75, 15, "Φ.org.eolang.iterates-over-simple-counter$t1$t0$t1$t1$a1.x");
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "x");
        ret_base = new PhLocated(ret_base, 76, 12, "Φ.org.eolang.iterates-over-simple-counter$t1$t0$t1$t1$a1.φ.ρ");
      Phi ret = new PhMethod(ret_base, "write");
        ret = new PhLocated(ret, 76, 13, "Φ.org.eolang.iterates-over-simple-counter$t1$t0$t1$t1$a1.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOω2t2$EOgenerated_scope_1ca903fb_15ee_4866_8ba2_410838f2b70f(rho);
          ret_1 = new PhLocated(ret_1, 76, 22, "Φ.org.eolang.iterates-over-simple-counter$t1$t0$t1$t1$a1.φ.generated-scope-1ca903fb-15ee-4866-8ba2-410838f2b70f");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

// <o abstract="" ancestors="2" line="76" loc="Φ.org.eolang.iterates-over-simple-counter$t1$t0$t1$t1$a1$t2$generated-scope-1ca903fb-15ee-4866-8ba2-410838f2b70f" name="iterates-over-simple-counter$t1$t0$t1$t1$a1$t2$generated-scope-1ca903fb-15ee-4866-8ba2-410838f2b70f" original-name="generated-scope-1ca903fb-15ee-4866-8ba2-410838f2b70f" parent="iterates-over-simple-counter$t1$t0$t1$t1$a1" pos="22"> 
//   <o base=".plus" line="76" loc="Φ.org.eolang.iterates-over-simple-counter$t1$t0$t1$t1$a1$t2$generated-scope-1ca903fb-15ee-4866-8ba2-410838f2b70f.org.eolang.scope-1ca903fb-15ee-4866-8ba2-410838f2b70f" name="org.eolang.scope-1ca903fb-15ee-4866-8ba2-410838f2b70f" pos="22" scope="scope-1ca903fb-15ee-4866-8ba2-410838f2b70f"> 
//     <o base="x" line="76" loc="Φ.org.eolang.iterates-over-simple-counter$t1$t0$t1$t1$a1$t2$generated-scope-1ca903fb-15ee-4866-8ba2-410838f2b70f.org.eolang.scope-1ca903fb-15ee-4866-8ba2-410838f2b70f.ρ" pos="21" ref="76.75.464" scope="scope-1ca903fb-15ee-4866-8ba2-410838f2b70f"/>
//     <o base="org.eolang.int" data="int" line="76" loc="Φ.org.eolang.iterates-over-simple-counter$t1$t0$t1$t1$a1$t2$generated-scope-1ca903fb-15ee-4866-8ba2-410838f2b70f.org.eolang.scope-1ca903fb-15ee-4866-8ba2-410838f2b70f.α0" pos="28" scope="scope-1ca903fb-15ee-4866-8ba2-410838f2b70f">1</o>
//   </o>
//   <o base="org.eolang.scope-1ca903fb-15ee-4866-8ba2-410838f2b70f" line="76" loc="Φ.org.eolang.iterates-over-simple-counter$t1$t0$t1$t1$a1$t2$generated-scope-1ca903fb-15ee-4866-8ba2-410838f2b70f.φ" name="@" pos="22" ref="76"/>
//   <o level="1" line="76.75.464" loc="Φ.org.eolang.iterates-over-simple-counter$t1$t0$t1$t1$a1$t2$generated-scope-1ca903fb-15ee-4866-8ba2-410838f2b70f.x" name="x"/>
// </o>
@XmirObject(name = "ω2t2$generated-scope-1ca903fb-15ee-4866-8ba2-410838f2b70f", oname = "generated-scope-1ca903fb-15ee-4866-8ba2-410838f2b70f", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bool-tests.eo")
public final class EOω2t2$EOgenerated_scope_1ca903fb_15ee_4866_8ba2_410838f2b70f extends PhDefault {
  public EOω2t2$EOgenerated_scope_1ca903fb_15ee_4866_8ba2_410838f2b70f(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-1ca903fb-15ee-4866-8ba2-410838f2b70f", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(new PhMethod(rho, "σ"), "x");
        ret_base = new PhLocated(ret_base, 76, 21, "Φ.org.eolang.iterates-over-simple-counter$t1$t0$t1$t1$a1$t2$generated-scope-1ca903fb-15ee-4866-8ba2-410838f2b70f.org.eolang.scope-1ca903fb-15ee-4866-8ba2-410838f2b70f.ρ");
      Phi ret = new PhMethod(ret_base, "plus");
        ret = new PhLocated(ret, 76, 22, "Φ.org.eolang.iterates-over-simple-counter$t1$t0$t1$t1$a1$t2$generated-scope-1ca903fb-15ee-4866-8ba2-410838f2b70f.org.eolang.scope-1ca903fb-15ee-4866-8ba2-410838f2b70f");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 76, 28, "Φ.org.eolang.iterates-over-simple-counter$t1$t0$t1$t1$a1$t2$generated-scope-1ca903fb-15ee-4866-8ba2-410838f2b70f.org.eolang.scope-1ca903fb-15ee-4866-8ba2-410838f2b70f.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(1L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-1ca903fb-15ee-4866-8ba2-410838f2b70f");
        ret = new PhLocated(ret, 76, 22, "Φ.org.eolang.iterates-over-simple-counter$t1$t0$t1$t1$a1$t2$generated-scope-1ca903fb-15ee-4866-8ba2-410838f2b70f.φ");
      return ret;
    })));
  }
}
}
}
