
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="68" loc="Φ.org.eolang.goto-jumps-forward" name="goto-jumps-forward" original-name="goto-jumps-forward" pos="0"> 
//   <o base="goto-jumps-forward$div" cut="66" line="69" loc="Φ.org.eolang.goto-jumps-forward.div" name="div" pos="2" ref="69"/>
//   <o base="org.eolang.hamcrest.assert-that" line="82" loc="Φ.org.eolang.goto-jumps-forward.φ" name="@" pos="2"> 
//     <o base=".and" line="83" loc="Φ.org.eolang.goto-jumps-forward.φ.α0" pos="4"> 
//       <o base=".eq" line="84" loc="Φ.org.eolang.goto-jumps-forward.φ.α0.ρ" pos="6"> 
//         <o base="div" line="85" loc="Φ.org.eolang.goto-jumps-forward.φ.α0.ρ.ρ" pos="8" ref="69"> 
//           <o base="org.eolang.int" data="int" line="85" loc="Φ.org.eolang.goto-jumps-forward.φ.α0.ρ.ρ.α0" pos="12">7</o>
//         </o>
//         <o base="org.eolang.int" data="int" line="86" loc="Φ.org.eolang.goto-jumps-forward.φ.α0.ρ.α0" pos="8">6</o>
//       </o>
//       <o base=".eq" line="87" loc="Φ.org.eolang.goto-jumps-forward.φ.α0.α0" pos="6"> 
//         <o base="div" line="88" loc="Φ.org.eolang.goto-jumps-forward.φ.α0.α0.ρ" pos="8" ref="69"> 
//           <o base="org.eolang.int" data="int" line="88" loc="Φ.org.eolang.goto-jumps-forward.φ.α0.α0.ρ.α0" pos="12">0</o>
//         </o>
//         <o base="org.eolang.int" data="int" line="89" loc="Φ.org.eolang.goto-jumps-forward.φ.α0.α0.α0" pos="8">0</o>
//       </o>
//     </o>
//     <o base=".equal-to" line="90" loc="Φ.org.eolang.goto-jumps-forward.φ.α1" pos="5"> 
//       <o base="$" line="90" loc="Φ.org.eolang.goto-jumps-forward.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.bool" data="bool" line="90" loc="Φ.org.eolang.goto-jumps-forward.φ.α1.α0" pos="15">TRUE</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "goto-jumps-forwardTest", oname = "goto-jumps-forward", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/goto-tests.eo")
public final class EOgoto_jumps_forwardTest extends PhDefault {
  public EOgoto_jumps_forwardTest() {
    this.add("div", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω1div(rho);
        ret = new PhLocated(ret, 69, 2, "Φ.org.eolang.goto-jumps-forward.div");
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 82, 2, "Φ.org.eolang.goto-jumps-forward.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base_base = new PhMethod(rho, "div");
          ret_1_base_base = new PhLocated(ret_1_base_base, 85, 8, "Φ.org.eolang.goto-jumps-forward.φ.α0.ρ.ρ");
        ret_1_base_base = new PhCopy(ret_1_base_base);
          Phi ret_1_base_base_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_base_base_1 = new PhLocated(ret_1_base_base_1, 85, 12, "Φ.org.eolang.goto-jumps-forward.φ.α0.ρ.ρ.α0");
            ret_1_base_base_1 = new PhWith(ret_1_base_base_1, "Δ", new Data.Value<>(7L));
          ret_1_base_base = new PhWith(ret_1_base_base, 0, ret_1_base_base_1);
        Phi ret_1_base = new PhMethod(ret_1_base_base, "eq");
          ret_1_base = new PhLocated(ret_1_base, 84, 6, "Φ.org.eolang.goto-jumps-forward.φ.α0.ρ");
        ret_1_base = new PhCopy(ret_1_base);
          Phi ret_1_base_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_base_1 = new PhLocated(ret_1_base_1, 86, 8, "Φ.org.eolang.goto-jumps-forward.φ.α0.ρ.α0");
            ret_1_base_1 = new PhWith(ret_1_base_1, "Δ", new Data.Value<>(6L));
          ret_1_base = new PhWith(ret_1_base, 0, ret_1_base_1);
        Phi ret_1 = new PhMethod(ret_1_base, "and");
          ret_1 = new PhLocated(ret_1, 83, 4, "Φ.org.eolang.goto-jumps-forward.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1_base = new PhMethod(rho, "div");
            ret_1_1_base = new PhLocated(ret_1_1_base, 88, 8, "Φ.org.eolang.goto-jumps-forward.φ.α0.α0.ρ");
          ret_1_1_base = new PhCopy(ret_1_1_base);
            Phi ret_1_1_base_1 = new EOorg.EOeolang.EOint(Phi.Φ);
              ret_1_1_base_1 = new PhLocated(ret_1_1_base_1, 88, 12, "Φ.org.eolang.goto-jumps-forward.φ.α0.α0.ρ.α0");
              ret_1_1_base_1 = new PhWith(ret_1_1_base_1, "Δ", new Data.Value<>(0L));
            ret_1_1_base = new PhWith(ret_1_1_base, 0, ret_1_1_base_1);
          Phi ret_1_1 = new PhMethod(ret_1_1_base, "eq");
            ret_1_1 = new PhLocated(ret_1_1, 87, 6, "Φ.org.eolang.goto-jumps-forward.φ.α0.α0");
          ret_1_1 = new PhCopy(ret_1_1);
            Phi ret_1_1_1 = new EOorg.EOeolang.EOint(Phi.Φ);
              ret_1_1_1 = new PhLocated(ret_1_1_1, 89, 8, "Φ.org.eolang.goto-jumps-forward.φ.α0.α0.α0");
              ret_1_1_1 = new PhWith(ret_1_1_1, "Δ", new Data.Value<>(0L));
            ret_1_1 = new PhWith(ret_1_1, 0, ret_1_1_1);
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 90, 4, "Φ.org.eolang.goto-jumps-forward.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 90, 5, "Φ.org.eolang.goto-jumps-forward.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EObool(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 90, 15, "Φ.org.eolang.goto-jumps-forward.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(Boolean.TRUE));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOgoto_jumps_forwardTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="69" loc="Φ.org.eolang.goto-jumps-forward$div" name="goto-jumps-forward$div" original-name="div" parent="goto-jumps-forward" pos="2"> 
//   <o line="69" loc="Φ.org.eolang.goto-jumps-forward$div.x" name="x" pos="3"/>
//   <o base="org.eolang.memory" line="70" loc="Φ.org.eolang.goto-jumps-forward$div.r" name="r" pos="4"> 
//     <o base="org.eolang.int" data="int" line="70" loc="Φ.org.eolang.goto-jumps-forward$div.r.α0" pos="11">0</o>
//   </o>
//   <o base="org.eolang.seq" line="71" loc="Φ.org.eolang.goto-jumps-forward$div.φ" name="@" pos="4"> 
//     <o base=".write" line="72" loc="Φ.org.eolang.goto-jumps-forward$div.φ.α0" pos="7"> 
//       <o base="r" line="72" loc="Φ.org.eolang.goto-jumps-forward$div.φ.α0.ρ" pos="6" ref="70"/>
//       <o base="org.eolang.int" data="int" line="72" loc="Φ.org.eolang.goto-jumps-forward$div.φ.α0.α0" pos="14">0</o>
//     </o>
//     <o base="org.eolang.goto" line="73" loc="Φ.org.eolang.goto-jumps-forward$div.φ.α1" pos="6"> 
//       <o base="goto-jumps-forward$div$t2$t1$a0" cut="72" line="74" loc="Φ.org.eolang.goto-jumps-forward$div.φ.α1.α0" pos="8" ref="74"> 
//         <o as="x" base="x" level="1" loc="Φ.org.eolang.goto-jumps-forward$div.φ.α1.α0.α0" ref="69"/>
//         <o as="r" base="r" level="1" loc="Φ.org.eolang.goto-jumps-forward$div.φ.α1.α0.α1" ref="70"/>
//       </o>
//     </o>
//     <o base="r" line="81" loc="Φ.org.eolang.goto-jumps-forward$div.φ.α2" pos="6" ref="70"/>
//   </o>
// </o>
@XmirObject(name = "ω1div", oname = "div", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/goto-tests.eo")
public final class EOω1div extends PhDefault {
  public EOω1div(final Phi sigma) {
    super(sigma);
    this.add("x", new AtFree(/* default */));
    this.add("r", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("memory").get();
        ret = new PhLocated(ret, 70, 4, "Φ.org.eolang.goto-jumps-forward$div.r");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 70, 11, "Φ.org.eolang.goto-jumps-forward$div.r.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(0L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("seq").get();
        ret = new PhLocated(ret, 71, 4, "Φ.org.eolang.goto-jumps-forward$div.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(rho, "r");
          ret_1_base = new PhLocated(ret_1_base, 72, 6, "Φ.org.eolang.goto-jumps-forward$div.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "write");
          ret_1 = new PhLocated(ret_1, 72, 7, "Φ.org.eolang.goto-jumps-forward$div.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_1 = new PhLocated(ret_1_1, 72, 14, "Φ.org.eolang.goto-jumps-forward$div.φ.α0.α0");
            ret_1_1 = new PhWith(ret_1_1, "Δ", new Data.Value<>(0L));
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2 = Phi.Φ.attr("org").get().attr("eolang").get().attr("goto").get();
          ret_2 = new PhLocated(ret_2, 73, 6, "Φ.org.eolang.goto-jumps-forward$div.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOω2t2$EOt1$EOa0(rho);
            ret_2_1 = new PhLocated(ret_2_1, 74, 8, "Φ.org.eolang.goto-jumps-forward$div.φ.α1.α0");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        Phi ret_3 = new PhMethod(rho, "r");
          ret_3 = new PhLocated(ret_3, 81, 6, "Φ.org.eolang.goto-jumps-forward$div.φ.α2");
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
        ret = new PhWith(ret, 2, ret_3);
      return ret;
    })));
  }

// <o abstract="" ancestors="2" line="74" loc="Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0" name="goto-jumps-forward$div$t2$t1$a0" parent="goto-jumps-forward$div" pos="8"> 
//   <o line="74" loc="Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.g" name="g" pos="9"/>
//   <o base="org.eolang.seq" line="75" loc="Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ" name="@" pos="10"> 
//     <o base=".if" line="76" loc="Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ.α0" pos="12"> 
//       <o base=".eq" line="77" loc="Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ.α0.ρ" pos="15"> 
//         <o base="x" line="77" loc="Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ.α0.ρ.ρ" pos="14" ref="74.69.467"/>
//         <o base="org.eolang.int" data="int" line="77" loc="Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ.α0.ρ.α0" pos="19">0</o>
//       </o>
//       <o base=".forward" line="78" loc="Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ.α0.α0" pos="15"> 
//         <o base="g" line="78" loc="Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ.α0.α0.ρ" pos="14" ref="74"/>
//         <o base="org.eolang.bool" data="bool" line="78" loc="Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ.α0.α0.α0" pos="24">TRUE</o>
//       </o>
//       <o base="org.eolang.bool" data="bool" line="79" loc="Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ.α0.α1" pos="14">TRUE</o>
//     </o>
//     <o base=".write" line="80" loc="Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ.α1" pos="13"> 
//       <o base="r" line="80" loc="Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ.α1.ρ" pos="12" ref="74.70.467"/>
//       <o base="goto-jumps-forward$div$t2$t1$a0$t1$t1$generated-scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3" cut="82" line="80" loc="Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ.α1.generated-scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3" name="generated-scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3" pos="23" ref="80"> 
//         <o as="x" base="x" level="2" loc="Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ.α1.generated-scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3.α0" ref="74.69.467"/>
//         <o as="r" base="r" level="2" loc="Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ.α1.generated-scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3.α1" ref="74.70.467"/>
//       </o>
//     </o>
//   </o>
//   <o level="1" line="74.69.467" loc="Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.x" name="x"/>
//   <o level="1" line="74.70.467" loc="Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.r" name="r"/>
// </o>
@XmirObject(name = "ω2t2$t1$a0", oname = "ω2t2$t1$a0", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/goto-tests.eo")
public final class EOω2t2$EOt1$EOa0 extends PhDefault {
  public EOω2t2$EOt1$EOa0(final Phi sigma) {
    super(sigma);
    this.add("g", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("seq").get();
        ret = new PhLocated(ret, 75, 10, "Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base_base = new PhMethod(new PhMethod(rho, "σ"), "x");
          ret_1_base_base = new PhLocated(ret_1_base_base, 77, 14, "Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ.α0.ρ.ρ");
        Phi ret_1_base = new PhMethod(ret_1_base_base, "eq");
          ret_1_base = new PhLocated(ret_1_base, 77, 15, "Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ.α0.ρ");
        ret_1_base = new PhCopy(ret_1_base);
          Phi ret_1_base_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_1_base_1 = new PhLocated(ret_1_base_1, 77, 19, "Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ.α0.ρ.α0");
            ret_1_base_1 = new PhWith(ret_1_base_1, "Δ", new Data.Value<>(0L));
          ret_1_base = new PhWith(ret_1_base, 0, ret_1_base_1);
        Phi ret_1 = new PhMethod(ret_1_base, "if");
          ret_1 = new PhLocated(ret_1, 76, 12, "Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1_base = new PhMethod(rho, "g");
            ret_1_1_base = new PhLocated(ret_1_1_base, 78, 14, "Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ.α0.α0.ρ");
          Phi ret_1_1 = new PhMethod(ret_1_1_base, "forward");
            ret_1_1 = new PhLocated(ret_1_1, 78, 15, "Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ.α0.α0");
          ret_1_1 = new PhCopy(ret_1_1);
            Phi ret_1_1_1 = new EOorg.EOeolang.EObool(Phi.Φ);
              ret_1_1_1 = new PhLocated(ret_1_1_1, 78, 24, "Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ.α0.α0.α0");
              ret_1_1_1 = new PhWith(ret_1_1_1, "Δ", new Data.Value<>(Boolean.TRUE));
            ret_1_1 = new PhWith(ret_1_1, 0, ret_1_1_1);
          Phi ret_1_2 = new EOorg.EOeolang.EObool(Phi.Φ);
            ret_1_2 = new PhLocated(ret_1_2, 79, 14, "Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ.α0.α1");
            ret_1_2 = new PhWith(ret_1_2, "Δ", new Data.Value<>(Boolean.TRUE));
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
          ret_1 = new PhWith(ret_1, 1, ret_1_2);
        Phi ret_2_base = new PhMethod(new PhMethod(rho, "σ"), "r");
          ret_2_base = new PhLocated(ret_2_base, 80, 12, "Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "write");
          ret_2 = new PhLocated(ret_2, 80, 13, "Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOω3t1$EOt1$EOgenerated_scope_a98888f1_86d8_4a8a_ae61_af463d0a10a3(rho);
            ret_2_1 = new PhLocated(ret_2_1, 80, 23, "Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0.φ.α1.generated-scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

// <o abstract="" ancestors="3" line="80" loc="Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0$t1$t1$generated-scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3" name="goto-jumps-forward$div$t2$t1$a0$t1$t1$generated-scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3" original-name="generated-scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3" parent="goto-jumps-forward$div$t2$t1$a0" pos="23"> 
//   <o base=".div" line="80" loc="Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0$t1$t1$generated-scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3.org.eolang.scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3" name="org.eolang.scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3" pos="23" scope="scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3"> 
//     <o base="org.eolang.int" data="int" line="80" loc="Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0$t1$t1$generated-scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3.org.eolang.scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3.ρ" pos="21" scope="scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3">42</o>
//     <o base="x" line="80" loc="Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0$t1$t1$generated-scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3.org.eolang.scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3.α0" pos="28" ref="80.69.468" scope="scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3"/>
//   </o>
//   <o base="org.eolang.scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3" line="80" loc="Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0$t1$t1$generated-scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3.φ" name="@" pos="23" ref="80"/>
//   <o level="2" line="80.69.468" loc="Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0$t1$t1$generated-scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3.x" name="x"/>
//   <o level="2" line="80.70.468" loc="Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0$t1$t1$generated-scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3.r" name="r"/>
// </o>
@XmirObject(name = "ω3t1$t1$generated-scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3", oname = "generated-scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/goto-tests.eo")
public final class EOω3t1$EOt1$EOgenerated_scope_a98888f1_86d8_4a8a_ae61_af463d0a10a3 extends PhDefault {
  public EOω3t1$EOt1$EOgenerated_scope_a98888f1_86d8_4a8a_ae61_af463d0a10a3(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new EOorg.EOeolang.EOint(Phi.Φ);
        ret_base = new PhLocated(ret_base, 80, 21, "Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0$t1$t1$generated-scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3.org.eolang.scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3.ρ");
        ret_base = new PhWith(ret_base, "Δ", new Data.Value<>(42L));
      Phi ret = new PhMethod(ret_base, "div");
        ret = new PhLocated(ret, 80, 23, "Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0$t1$t1$generated-scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3.org.eolang.scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3");
      ret = new PhCopy(ret);
        Phi ret_1 = new PhMethod(new PhMethod(new PhMethod(rho, "σ"), "σ"), "x");
          ret_1 = new PhLocated(ret_1, 80, 28, "Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0$t1$t1$generated-scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3.org.eolang.scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3.α0");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3");
        ret = new PhLocated(ret, 80, 23, "Φ.org.eolang.goto-jumps-forward$div$t2$t1$a0$t1$t1$generated-scope-a98888f1-86d8-4a8a-ae61-af463d0a10a3.φ");
      return ret;
    })));
  }
}
}
}
}
