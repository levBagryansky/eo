
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="116" loc="Φ.org.eolang.multi-layer-volatility" name="multi-layer-volatility" original-name="multi-layer-volatility" pos="0"> 
//   <o base="org.eolang.memory" line="117" loc="Φ.org.eolang.multi-layer-volatility.ma" name="ma" pos="2"> 
//     <o base="org.eolang.int" data="int" line="117" loc="Φ.org.eolang.multi-layer-volatility.ma.α0" pos="9">0</o>
//   </o>
//   <o base="org.eolang.cage" line="118" loc="Φ.org.eolang.multi-layer-volatility.ca" name="ca" pos="2"> 
//     <o base="a" line="118" loc="Φ.org.eolang.multi-layer-volatility.ca.α0" pos="7" ref="119"/>
//   </o>
//   <o base="multi-layer-volatility$a" cut="161" line="119" loc="Φ.org.eolang.multi-layer-volatility.a" name="a" pos="2" ref="119"> 
//     <o as="ma" base="ma" level="1" loc="Φ.org.eolang.multi-layer-volatility.a.α0" ref="117"/>
//   </o>
//   <o base="org.eolang.memory" line="126" loc="Φ.org.eolang.multi-layer-volatility.mb" name="mb" pos="2"> 
//     <o base="org.eolang.int" data="int" line="126" loc="Φ.org.eolang.multi-layer-volatility.mb.α0" pos="9">0</o>
//   </o>
//   <o base="org.eolang.cage" line="127" loc="Φ.org.eolang.multi-layer-volatility.cb" name="cb" pos="2"> 
//     <o base="b" line="127" loc="Φ.org.eolang.multi-layer-volatility.cb.α0" pos="7" ref="128"/>
//   </o>
//   <o base="multi-layer-volatility$b" cut="178" line="128" loc="Φ.org.eolang.multi-layer-volatility.b" name="b" pos="2" ref="128"> 
//     <o as="mb" base="mb" level="1" loc="Φ.org.eolang.multi-layer-volatility.b.α0" ref="126"/>
//   </o>
//   <o base="org.eolang.hamcrest.assert-that" line="135" loc="Φ.org.eolang.multi-layer-volatility.φ" name="@" pos="2"> 
//     <o base="org.eolang.seq" line="136" loc="Φ.org.eolang.multi-layer-volatility.φ.α0" pos="4"> 
//       <o base="ca" line="137" loc="Φ.org.eolang.multi-layer-volatility.φ.α0.α0" pos="6" ref="118"/>
//       <o base=".plus" line="138" loc="Φ.org.eolang.multi-layer-volatility.φ.α0.α1" pos="8"> 
//         <o base="ca" line="138" loc="Φ.org.eolang.multi-layer-volatility.φ.α0.α1.ρ" pos="6" ref="118"/>
//         <o base="org.eolang.int" data="int" line="138" loc="Φ.org.eolang.multi-layer-volatility.φ.α0.α1.α0" pos="14">40</o>
//       </o>
//     </o>
//     <o base=".equal-to" line="139" loc="Φ.org.eolang.multi-layer-volatility.φ.α1" pos="5"> 
//       <o base="$" line="139" loc="Φ.org.eolang.multi-layer-volatility.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.seq" line="140" loc="Φ.org.eolang.multi-layer-volatility.φ.α1.α0" pos="6"> 
//         <o base=".z" line="141" loc="Φ.org.eolang.multi-layer-volatility.φ.α1.α0.α0" pos="10"> 
//           <o base="cb" line="141" loc="Φ.org.eolang.multi-layer-volatility.φ.α1.α0.α0.ρ" pos="8" ref="127"/>
//         </o>
//         <o base=".plus" line="142" loc="Φ.org.eolang.multi-layer-volatility.φ.α1.α0.α1" pos="12"> 
//           <o base=".z" line="142" loc="Φ.org.eolang.multi-layer-volatility.φ.α1.α0.α1.ρ" pos="10"> 
//             <o base="cb" line="142" loc="Φ.org.eolang.multi-layer-volatility.φ.α1.α0.α1.ρ.ρ" pos="8" ref="127"/>
//           </o>
//           <o base="org.eolang.int" data="int" line="142" loc="Φ.org.eolang.multi-layer-volatility.φ.α1.α0.α1.α0" pos="18">40</o>
//         </o>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "multi-layer-volatilityTest", oname = "multi-layer-volatility", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/cage-tests.eo")
public final class EOmulti_layer_volatilityTest extends PhDefault {
  public EOmulti_layer_volatilityTest() {
    this.add("ma", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("memory").get();
        ret = new PhLocated(ret, 117, 2, "Φ.org.eolang.multi-layer-volatility.ma");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 117, 9, "Φ.org.eolang.multi-layer-volatility.ma.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(0L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("ca", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("cage").get();
        ret = new PhLocated(ret, 118, 2, "Φ.org.eolang.multi-layer-volatility.ca");
      ret = new PhCopy(ret);
        Phi ret_1 = new PhMethod(rho, "a");
          ret_1 = new PhLocated(ret_1, 118, 7, "Φ.org.eolang.multi-layer-volatility.ca.α0");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("a", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω1a(rho);
        ret = new PhLocated(ret, 119, 2, "Φ.org.eolang.multi-layer-volatility.a");
      return ret;
    })));
    this.add("mb", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("memory").get();
        ret = new PhLocated(ret, 126, 2, "Φ.org.eolang.multi-layer-volatility.mb");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 126, 9, "Φ.org.eolang.multi-layer-volatility.mb.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(0L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("cb", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("cage").get();
        ret = new PhLocated(ret, 127, 2, "Φ.org.eolang.multi-layer-volatility.cb");
      ret = new PhCopy(ret);
        Phi ret_1 = new PhMethod(rho, "b");
          ret_1 = new PhLocated(ret_1, 127, 7, "Φ.org.eolang.multi-layer-volatility.cb.α0");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("b", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω1b(rho);
        ret = new PhLocated(ret, 128, 2, "Φ.org.eolang.multi-layer-volatility.b");
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 135, 2, "Φ.org.eolang.multi-layer-volatility.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("seq").get();
          ret_1 = new PhLocated(ret_1, 136, 4, "Φ.org.eolang.multi-layer-volatility.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new PhMethod(rho, "ca");
            ret_1_1 = new PhLocated(ret_1_1, 137, 6, "Φ.org.eolang.multi-layer-volatility.φ.α0.α0");
          Phi ret_1_2_base = new PhMethod(rho, "ca");
            ret_1_2_base = new PhLocated(ret_1_2_base, 138, 6, "Φ.org.eolang.multi-layer-volatility.φ.α0.α1.ρ");
          Phi ret_1_2 = new PhMethod(ret_1_2_base, "plus");
            ret_1_2 = new PhLocated(ret_1_2, 138, 8, "Φ.org.eolang.multi-layer-volatility.φ.α0.α1");
          ret_1_2 = new PhCopy(ret_1_2);
            Phi ret_1_2_1 = new EOorg.EOeolang.EOint(Phi.Φ);
              ret_1_2_1 = new PhLocated(ret_1_2_1, 138, 14, "Φ.org.eolang.multi-layer-volatility.φ.α0.α1.α0");
              ret_1_2_1 = new PhWith(ret_1_2_1, "Δ", new Data.Value<>(40L));
            ret_1_2 = new PhWith(ret_1_2, 0, ret_1_2_1);
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
          ret_1 = new PhWith(ret_1, 1, ret_1_2);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 139, 4, "Φ.org.eolang.multi-layer-volatility.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 139, 5, "Φ.org.eolang.multi-layer-volatility.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("seq").get();
            ret_2_1 = new PhLocated(ret_2_1, 140, 6, "Φ.org.eolang.multi-layer-volatility.φ.α1.α0");
          ret_2_1 = new PhCopy(ret_2_1);
            Phi ret_2_1_1_base = new PhMethod(rho, "cb");
              ret_2_1_1_base = new PhLocated(ret_2_1_1_base, 141, 8, "Φ.org.eolang.multi-layer-volatility.φ.α1.α0.α0.ρ");
            Phi ret_2_1_1 = new PhMethod(ret_2_1_1_base, "z");
              ret_2_1_1 = new PhLocated(ret_2_1_1, 141, 10, "Φ.org.eolang.multi-layer-volatility.φ.α1.α0.α0");
            Phi ret_2_1_2_base_base = new PhMethod(rho, "cb");
              ret_2_1_2_base_base = new PhLocated(ret_2_1_2_base_base, 142, 8, "Φ.org.eolang.multi-layer-volatility.φ.α1.α0.α1.ρ.ρ");
            Phi ret_2_1_2_base = new PhMethod(ret_2_1_2_base_base, "z");
              ret_2_1_2_base = new PhLocated(ret_2_1_2_base, 142, 10, "Φ.org.eolang.multi-layer-volatility.φ.α1.α0.α1.ρ");
            Phi ret_2_1_2 = new PhMethod(ret_2_1_2_base, "plus");
              ret_2_1_2 = new PhLocated(ret_2_1_2, 142, 12, "Φ.org.eolang.multi-layer-volatility.φ.α1.α0.α1");
            ret_2_1_2 = new PhCopy(ret_2_1_2);
              Phi ret_2_1_2_1 = new EOorg.EOeolang.EOint(Phi.Φ);
                ret_2_1_2_1 = new PhLocated(ret_2_1_2_1, 142, 18, "Φ.org.eolang.multi-layer-volatility.φ.α1.α0.α1.α0");
                ret_2_1_2_1 = new PhWith(ret_2_1_2_1, "Δ", new Data.Value<>(40L));
              ret_2_1_2 = new PhWith(ret_2_1_2, 0, ret_2_1_2_1);
            ret_2_1 = new PhWith(ret_2_1, 0, ret_2_1_1);
            ret_2_1 = new PhWith(ret_2_1, 1, ret_2_1_2);
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOmulti_layer_volatilityTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="119" loc="Φ.org.eolang.multi-layer-volatility$a" name="multi-layer-volatility$a" original-name="a" parent="multi-layer-volatility" pos="2"> 
//   <o base="multi-layer-volatility$a$@" cut="161" line="120" loc="Φ.org.eolang.multi-layer-volatility$a.φ" name="@" pos="4" ref="120"> 
//     <o as="ma" base="ma" level="2" loc="Φ.org.eolang.multi-layer-volatility$a.φ.α0" ref="119.117.464"/>
//   </o>
//   <o level="1" line="119.117.464" loc="Φ.org.eolang.multi-layer-volatility$a.ma" name="ma"/>
// </o>
@XmirObject(name = "ω1a", oname = "a", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/cage-tests.eo")
public final class EOω1a extends PhDefault {
  public EOω1a(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω2φ(rho);
        ret = new PhLocated(ret, 120, 4, "Φ.org.eolang.multi-layer-volatility$a.φ");
      return ret;
    })));
  }

// <o abstract="" ancestors="2" line="120" loc="Φ.org.eolang.multi-layer-volatility$a$@" name="multi-layer-volatility$a$@" original-name="@" parent="multi-layer-volatility$a" pos="4"> 
//   <o base="multi-layer-volatility$a$@$@" cut="161" line="121" loc="Φ.org.eolang.multi-layer-volatility$a$@.φ" name="@" pos="6" ref="121"> 
//     <o as="ma" base="ma" level="3" loc="Φ.org.eolang.multi-layer-volatility$a$@.φ.α0" ref="120.117.465"/>
//   </o>
//   <o level="2" line="120.117.465" loc="Φ.org.eolang.multi-layer-volatility$a$@.ma" name="ma"/>
// </o>
@XmirObject(name = "ω2@", oname = "@", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/cage-tests.eo")
public final class EOω2φ extends PhDefault {
  public EOω2φ(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω3φ(rho);
        ret = new PhLocated(ret, 121, 6, "Φ.org.eolang.multi-layer-volatility$a$@.φ");
      return ret;
    })));
  }

// <o abstract="" ancestors="3" line="121" loc="Φ.org.eolang.multi-layer-volatility$a$@$@" name="multi-layer-volatility$a$@$@" original-name="@" parent="multi-layer-volatility$a$@" pos="6"> 
//   <o base="multi-layer-volatility$a$@$@$@" cut="161" line="122" loc="Φ.org.eolang.multi-layer-volatility$a$@$@.φ" name="@" pos="8" ref="122"> 
//     <o as="ma" base="ma" level="4" loc="Φ.org.eolang.multi-layer-volatility$a$@$@.φ.α0" ref="121.117.466"/>
//   </o>
//   <o level="3" line="121.117.466" loc="Φ.org.eolang.multi-layer-volatility$a$@$@.ma" name="ma"/>
// </o>
@XmirObject(name = "ω3@", oname = "@", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/cage-tests.eo")
public final class EOω3φ extends PhDefault {
  public EOω3φ(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω4φ(rho);
        ret = new PhLocated(ret, 122, 8, "Φ.org.eolang.multi-layer-volatility$a$@$@.φ");
      return ret;
    })));
  }

// <o abstract="" ancestors="4" line="122" loc="Φ.org.eolang.multi-layer-volatility$a$@$@$@" name="multi-layer-volatility$a$@$@$@" original-name="@" parent="multi-layer-volatility$a$@$@" pos="8"> 
//   <o base="org.eolang.seq" line="123" loc="Φ.org.eolang.multi-layer-volatility$a$@$@$@.φ" name="@" pos="10"> 
//     <o base=".write" line="124" loc="Φ.org.eolang.multi-layer-volatility$a$@$@$@.φ.α0" pos="14"> 
//       <o base="ma" line="124" loc="Φ.org.eolang.multi-layer-volatility$a$@$@$@.φ.α0.ρ" pos="12" ref="122.117.467"/>
//       <o base="multi-layer-volatility$a$@$@$@$t0$t0$generated-scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac" cut="162" line="124" loc="Φ.org.eolang.multi-layer-volatility$a$@$@$@.φ.α0.generated-scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac" name="generated-scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac" pos="24" ref="124"> 
//         <o as="ma" base="ma" level="5" loc="Φ.org.eolang.multi-layer-volatility$a$@$@$@.φ.α0.generated-scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac.α0" ref="122.117.467"/>
//       </o>
//     </o>
//     <o base="ma" line="125" loc="Φ.org.eolang.multi-layer-volatility$a$@$@$@.φ.α1" pos="12" ref="122.117.467"/>
//   </o>
//   <o level="4" line="122.117.467" loc="Φ.org.eolang.multi-layer-volatility$a$@$@$@.ma" name="ma"/>
// </o>
@XmirObject(name = "ω4@", oname = "@", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/cage-tests.eo")
public final class EOω4φ extends PhDefault {
  public EOω4φ(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("seq").get();
        ret = new PhLocated(ret, 123, 10, "Φ.org.eolang.multi-layer-volatility$a$@$@$@.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(new PhMethod(new PhMethod(new PhMethod(new PhMethod(rho, "σ"), "σ"), "σ"), "σ"), "ma");
          ret_1_base = new PhLocated(ret_1_base, 124, 12, "Φ.org.eolang.multi-layer-volatility$a$@$@$@.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "write");
          ret_1 = new PhLocated(ret_1, 124, 14, "Φ.org.eolang.multi-layer-volatility$a$@$@$@.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOω5t0$EOt0$EOgenerated_scope_3c0b77d3_da66_4949_bbcd_329a2dd6a1ac(rho);
            ret_1_1 = new PhLocated(ret_1_1, 124, 24, "Φ.org.eolang.multi-layer-volatility$a$@$@$@.φ.α0.generated-scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac");
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2 = new PhMethod(new PhMethod(new PhMethod(new PhMethod(new PhMethod(rho, "σ"), "σ"), "σ"), "σ"), "ma");
          ret_2 = new PhLocated(ret_2, 125, 12, "Φ.org.eolang.multi-layer-volatility$a$@$@$@.φ.α1");
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

// <o abstract="" ancestors="5" line="124" loc="Φ.org.eolang.multi-layer-volatility$a$@$@$@$t0$t0$generated-scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac" name="multi-layer-volatility$a$@$@$@$t0$t0$generated-scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac" original-name="generated-scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac" parent="multi-layer-volatility$a$@$@$@" pos="24"> 
//   <o base=".plus" line="124" loc="Φ.org.eolang.multi-layer-volatility$a$@$@$@$t0$t0$generated-scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac.org.eolang.scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac" name="org.eolang.scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac" pos="24" scope="scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac"> 
//     <o base="ma" line="124" loc="Φ.org.eolang.multi-layer-volatility$a$@$@$@$t0$t0$generated-scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac.org.eolang.scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac.ρ" pos="22" ref="124.117.468" scope="scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac"/>
//     <o base="org.eolang.int" data="int" line="124" loc="Φ.org.eolang.multi-layer-volatility$a$@$@$@$t0$t0$generated-scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac.org.eolang.scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac.α0" pos="30" scope="scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac">1</o>
//   </o>
//   <o base="org.eolang.scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac" line="124" loc="Φ.org.eolang.multi-layer-volatility$a$@$@$@$t0$t0$generated-scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac.φ" name="@" pos="24" ref="124"/>
//   <o level="5" line="124.117.468" loc="Φ.org.eolang.multi-layer-volatility$a$@$@$@$t0$t0$generated-scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac.ma" name="ma"/>
// </o>
@XmirObject(name = "ω5t0$t0$generated-scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac", oname = "generated-scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/cage-tests.eo")
public final class EOω5t0$EOt0$EOgenerated_scope_3c0b77d3_da66_4949_bbcd_329a2dd6a1ac extends PhDefault {
  public EOω5t0$EOt0$EOgenerated_scope_3c0b77d3_da66_4949_bbcd_329a2dd6a1ac(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(new PhMethod(new PhMethod(new PhMethod(new PhMethod(new PhMethod(rho, "σ"), "σ"), "σ"), "σ"), "σ"), "ma");
        ret_base = new PhLocated(ret_base, 124, 22, "Φ.org.eolang.multi-layer-volatility$a$@$@$@$t0$t0$generated-scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac.org.eolang.scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac.ρ");
      Phi ret = new PhMethod(ret_base, "plus");
        ret = new PhLocated(ret, 124, 24, "Φ.org.eolang.multi-layer-volatility$a$@$@$@$t0$t0$generated-scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac.org.eolang.scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 124, 30, "Φ.org.eolang.multi-layer-volatility$a$@$@$@$t0$t0$generated-scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac.org.eolang.scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(1L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac");
        ret = new PhLocated(ret, 124, 24, "Φ.org.eolang.multi-layer-volatility$a$@$@$@$t0$t0$generated-scope-3c0b77d3-da66-4949-bbcd-329a2dd6a1ac.φ");
      return ret;
    })));
  }
}
}
}
}
}

// <o abstract="" ancestors="1" line="128" loc="Φ.org.eolang.multi-layer-volatility$b" name="multi-layer-volatility$b" original-name="b" parent="multi-layer-volatility" pos="2"> 
//   <o base="multi-layer-volatility$b$@" cut="178" line="129" loc="Φ.org.eolang.multi-layer-volatility$b.φ" name="@" pos="4" ref="129"> 
//     <o as="mb" base="mb" level="2" loc="Φ.org.eolang.multi-layer-volatility$b.φ.α0" ref="128.126.469"/>
//   </o>
//   <o level="1" line="128.126.469" loc="Φ.org.eolang.multi-layer-volatility$b.mb" name="mb"/>
// </o>
@XmirObject(name = "ω1b", oname = "b", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/cage-tests.eo")
public final class EOω1b extends PhDefault {
  public EOω1b(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω2φ(rho);
        ret = new PhLocated(ret, 129, 4, "Φ.org.eolang.multi-layer-volatility$b.φ");
      return ret;
    })));
  }

// <o abstract="" ancestors="2" line="129" loc="Φ.org.eolang.multi-layer-volatility$b$@" name="multi-layer-volatility$b$@" original-name="@" parent="multi-layer-volatility$b" pos="4"> 
//   <o base="multi-layer-volatility$b$@$@" cut="178" line="130" loc="Φ.org.eolang.multi-layer-volatility$b$@.φ" name="@" pos="6" ref="130"> 
//     <o as="mb" base="mb" level="3" loc="Φ.org.eolang.multi-layer-volatility$b$@.φ.α0" ref="129.126.461"/>
//   </o>
//   <o level="2" line="129.126.461" loc="Φ.org.eolang.multi-layer-volatility$b$@.mb" name="mb"/>
// </o>
@XmirObject(name = "ω2@", oname = "@", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/cage-tests.eo")
public final class EOω2φ extends PhDefault {
  public EOω2φ(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω3φ(rho);
        ret = new PhLocated(ret, 130, 6, "Φ.org.eolang.multi-layer-volatility$b$@.φ");
      return ret;
    })));
  }

// <o abstract="" ancestors="3" line="130" loc="Φ.org.eolang.multi-layer-volatility$b$@$@" name="multi-layer-volatility$b$@$@" original-name="@" parent="multi-layer-volatility$b$@" pos="6"> 
//   <o base="multi-layer-volatility$b$@$@$@" cut="178" line="131" loc="Φ.org.eolang.multi-layer-volatility$b$@$@.φ" name="@" pos="8" ref="131"> 
//     <o as="mb" base="mb" level="4" loc="Φ.org.eolang.multi-layer-volatility$b$@$@.φ.α0" ref="130.126.462"/>
//   </o>
//   <o level="3" line="130.126.462" loc="Φ.org.eolang.multi-layer-volatility$b$@$@.mb" name="mb"/>
// </o>
@XmirObject(name = "ω3@", oname = "@", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/cage-tests.eo")
public final class EOω3φ extends PhDefault {
  public EOω3φ(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω4φ(rho);
        ret = new PhLocated(ret, 131, 8, "Φ.org.eolang.multi-layer-volatility$b$@$@.φ");
      return ret;
    })));
  }

// <o abstract="" ancestors="4" line="131" loc="Φ.org.eolang.multi-layer-volatility$b$@$@$@" name="multi-layer-volatility$b$@$@$@" original-name="@" parent="multi-layer-volatility$b$@$@" pos="8"> 
//   <o base="org.eolang.seq" line="132" loc="Φ.org.eolang.multi-layer-volatility$b$@$@$@.z" name="z" pos="10"> 
//     <o base=".write" line="133" loc="Φ.org.eolang.multi-layer-volatility$b$@$@$@.z.α0" pos="14"> 
//       <o base="mb" line="133" loc="Φ.org.eolang.multi-layer-volatility$b$@$@$@.z.α0.ρ" pos="12" ref="131.126.463"/>
//       <o base="multi-layer-volatility$b$@$@$@$t0$t0$generated-scope-03362bdf-589c-4846-865f-835f488be1a7" cut="179" line="133" loc="Φ.org.eolang.multi-layer-volatility$b$@$@$@.z.α0.generated-scope-03362bdf-589c-4846-865f-835f488be1a7" name="generated-scope-03362bdf-589c-4846-865f-835f488be1a7" pos="24" ref="133"> 
//         <o as="mb" base="mb" level="5" loc="Φ.org.eolang.multi-layer-volatility$b$@$@$@.z.α0.generated-scope-03362bdf-589c-4846-865f-835f488be1a7.α0" ref="131.126.463"/>
//       </o>
//     </o>
//     <o base="mb" line="134" loc="Φ.org.eolang.multi-layer-volatility$b$@$@$@.z.α1" pos="12" ref="131.126.463"/>
//   </o>
//   <o level="4" line="131.126.463" loc="Φ.org.eolang.multi-layer-volatility$b$@$@$@.mb" name="mb"/>
// </o>
@XmirObject(name = "ω4@", oname = "@", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/cage-tests.eo")
public final class EOω4φ extends PhDefault {
  public EOω4φ(final Phi sigma) {
    super(sigma);
    this.add("z", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("seq").get();
        ret = new PhLocated(ret, 132, 10, "Φ.org.eolang.multi-layer-volatility$b$@$@$@.z");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(new PhMethod(new PhMethod(new PhMethod(new PhMethod(rho, "σ"), "σ"), "σ"), "σ"), "mb");
          ret_1_base = new PhLocated(ret_1_base, 133, 12, "Φ.org.eolang.multi-layer-volatility$b$@$@$@.z.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "write");
          ret_1 = new PhLocated(ret_1, 133, 14, "Φ.org.eolang.multi-layer-volatility$b$@$@$@.z.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOω5t0$EOt0$EOgenerated_scope_03362bdf_589c_4846_865f_835f488be1a7(rho);
            ret_1_1 = new PhLocated(ret_1_1, 133, 24, "Φ.org.eolang.multi-layer-volatility$b$@$@$@.z.α0.generated-scope-03362bdf-589c-4846-865f-835f488be1a7");
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2 = new PhMethod(new PhMethod(new PhMethod(new PhMethod(new PhMethod(rho, "σ"), "σ"), "σ"), "σ"), "mb");
          ret_2 = new PhLocated(ret_2, 134, 12, "Φ.org.eolang.multi-layer-volatility$b$@$@$@.z.α1");
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

// <o abstract="" ancestors="5" line="133" loc="Φ.org.eolang.multi-layer-volatility$b$@$@$@$t0$t0$generated-scope-03362bdf-589c-4846-865f-835f488be1a7" name="multi-layer-volatility$b$@$@$@$t0$t0$generated-scope-03362bdf-589c-4846-865f-835f488be1a7" original-name="generated-scope-03362bdf-589c-4846-865f-835f488be1a7" parent="multi-layer-volatility$b$@$@$@" pos="24"> 
//   <o base=".plus" line="133" loc="Φ.org.eolang.multi-layer-volatility$b$@$@$@$t0$t0$generated-scope-03362bdf-589c-4846-865f-835f488be1a7.org.eolang.scope-03362bdf-589c-4846-865f-835f488be1a7" name="org.eolang.scope-03362bdf-589c-4846-865f-835f488be1a7" pos="24" scope="scope-03362bdf-589c-4846-865f-835f488be1a7"> 
//     <o base="mb" line="133" loc="Φ.org.eolang.multi-layer-volatility$b$@$@$@$t0$t0$generated-scope-03362bdf-589c-4846-865f-835f488be1a7.org.eolang.scope-03362bdf-589c-4846-865f-835f488be1a7.ρ" pos="22" ref="133.126.464" scope="scope-03362bdf-589c-4846-865f-835f488be1a7"/>
//     <o base="org.eolang.int" data="int" line="133" loc="Φ.org.eolang.multi-layer-volatility$b$@$@$@$t0$t0$generated-scope-03362bdf-589c-4846-865f-835f488be1a7.org.eolang.scope-03362bdf-589c-4846-865f-835f488be1a7.α0" pos="30" scope="scope-03362bdf-589c-4846-865f-835f488be1a7">1</o>
//   </o>
//   <o base="org.eolang.scope-03362bdf-589c-4846-865f-835f488be1a7" line="133" loc="Φ.org.eolang.multi-layer-volatility$b$@$@$@$t0$t0$generated-scope-03362bdf-589c-4846-865f-835f488be1a7.φ" name="@" pos="24" ref="133"/>
//   <o level="5" line="133.126.464" loc="Φ.org.eolang.multi-layer-volatility$b$@$@$@$t0$t0$generated-scope-03362bdf-589c-4846-865f-835f488be1a7.mb" name="mb"/>
// </o>
@XmirObject(name = "ω5t0$t0$generated-scope-03362bdf-589c-4846-865f-835f488be1a7", oname = "generated-scope-03362bdf-589c-4846-865f-835f488be1a7", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/cage-tests.eo")
public final class EOω5t0$EOt0$EOgenerated_scope_03362bdf_589c_4846_865f_835f488be1a7 extends PhDefault {
  public EOω5t0$EOt0$EOgenerated_scope_03362bdf_589c_4846_865f_835f488be1a7(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-03362bdf-589c-4846-865f-835f488be1a7", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(new PhMethod(new PhMethod(new PhMethod(new PhMethod(new PhMethod(rho, "σ"), "σ"), "σ"), "σ"), "σ"), "mb");
        ret_base = new PhLocated(ret_base, 133, 22, "Φ.org.eolang.multi-layer-volatility$b$@$@$@$t0$t0$generated-scope-03362bdf-589c-4846-865f-835f488be1a7.org.eolang.scope-03362bdf-589c-4846-865f-835f488be1a7.ρ");
      Phi ret = new PhMethod(ret_base, "plus");
        ret = new PhLocated(ret, 133, 24, "Φ.org.eolang.multi-layer-volatility$b$@$@$@$t0$t0$generated-scope-03362bdf-589c-4846-865f-835f488be1a7.org.eolang.scope-03362bdf-589c-4846-865f-835f488be1a7");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 133, 30, "Φ.org.eolang.multi-layer-volatility$b$@$@$@$t0$t0$generated-scope-03362bdf-589c-4846-865f-835f488be1a7.org.eolang.scope-03362bdf-589c-4846-865f-835f488be1a7.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(1L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-03362bdf-589c-4846-865f-835f488be1a7");
        ret = new PhLocated(ret, 133, 24, "Φ.org.eolang.multi-layer-volatility$b$@$@$@$t0$t0$generated-scope-03362bdf-589c-4846-865f-835f488be1a7.φ");
      return ret;
    })));
  }
}
}
}
}
}
}
