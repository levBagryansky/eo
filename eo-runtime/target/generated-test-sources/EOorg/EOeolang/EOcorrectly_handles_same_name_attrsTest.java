
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="465" loc="Φ.org.eolang.correctly-handles-same-name-attrs" name="correctly-handles-same-name-attrs" original-name="correctly-handles-same-name-attrs" pos="0"> 
//   <o base="correctly-handles-same-name-attrs$calc" cut="727" line="466" loc="Φ.org.eolang.correctly-handles-same-name-attrs.calc" name="calc" pos="2" ref="466"/>
//   <o base="org.eolang.nop" line="470" loc="Φ.org.eolang.correctly-handles-same-name-attrs.φ" name="@" pos="2"> 
//     <o base="org.eolang.hamcrest.assert-that" line="471" loc="Φ.org.eolang.correctly-handles-same-name-attrs.φ.α0" pos="4"> 
//       <o base="calc" line="472" loc="Φ.org.eolang.correctly-handles-same-name-attrs.φ.α0.α0" pos="6" ref="466"> 
//         <o base="correctly-handles-same-name-attrs$t1$t0$t0$a0" cut="735" line="473" loc="Φ.org.eolang.correctly-handles-same-name-attrs.φ.α0.α0.α0" pos="8" ref="473"/>
//         <o base="correctly-handles-same-name-attrs$t1$t0$t0$a1" cut="749" line="478" loc="Φ.org.eolang.correctly-handles-same-name-attrs.φ.α0.α0.α1" pos="8" ref="478"/>
//       </o>
//       <o base=".equal-to" line="483" loc="Φ.org.eolang.correctly-handles-same-name-attrs.φ.α0.α1" pos="7"> 
//         <o base="$" line="483" loc="Φ.org.eolang.correctly-handles-same-name-attrs.φ.α0.α1.ρ" pos="6"/>
//         <o base="org.eolang.int" data="int" line="483" loc="Φ.org.eolang.correctly-handles-same-name-attrs.φ.α0.α1.α0" pos="17">12</o>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "correctly-handles-same-name-attrsTest", oname = "correctly-handles-same-name-attrs", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOcorrectly_handles_same_name_attrsTest extends PhDefault {
  public EOcorrectly_handles_same_name_attrsTest() {
    this.add("calc", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω1calc(rho);
        ret = new PhLocated(ret, 466, 2, "Φ.org.eolang.correctly-handles-same-name-attrs.calc");
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("nop").get();
        ret = new PhLocated(ret, 470, 2, "Φ.org.eolang.correctly-handles-same-name-attrs.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
          ret_1 = new PhLocated(ret_1, 471, 4, "Φ.org.eolang.correctly-handles-same-name-attrs.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new PhMethod(rho, "calc");
            ret_1_1 = new PhLocated(ret_1_1, 472, 6, "Φ.org.eolang.correctly-handles-same-name-attrs.φ.α0.α0");
          ret_1_1 = new PhCopy(ret_1_1);
            Phi ret_1_1_1 = new EOω1t1$EOt0$EOt0$EOa0(rho);
              ret_1_1_1 = new PhLocated(ret_1_1_1, 473, 8, "Φ.org.eolang.correctly-handles-same-name-attrs.φ.α0.α0.α0");
            Phi ret_1_1_2 = new EOω1t1$EOt0$EOt0$EOa1(rho);
              ret_1_1_2 = new PhLocated(ret_1_1_2, 478, 8, "Φ.org.eolang.correctly-handles-same-name-attrs.φ.α0.α0.α1");
            ret_1_1 = new PhWith(ret_1_1, 0, ret_1_1_1);
            ret_1_1 = new PhWith(ret_1_1, 1, ret_1_1_2);
          Phi ret_1_2_base = rho;
            ret_1_2_base = new PhLocated(ret_1_2_base, 483, 6, "Φ.org.eolang.correctly-handles-same-name-attrs.φ.α0.α1.ρ");
          Phi ret_1_2 = new PhMethod(ret_1_2_base, "equal-to");
            ret_1_2 = new PhLocated(ret_1_2, 483, 7, "Φ.org.eolang.correctly-handles-same-name-attrs.φ.α0.α1");
          ret_1_2 = new PhCopy(ret_1_2);
            Phi ret_1_2_1 = new EOorg.EOeolang.EOint(Phi.Φ);
              ret_1_2_1 = new PhLocated(ret_1_2_1, 483, 17, "Φ.org.eolang.correctly-handles-same-name-attrs.φ.α0.α1.α0");
              ret_1_2_1 = new PhWith(ret_1_2_1, "Δ", new Data.Value<>(12L));
            ret_1_2 = new PhWith(ret_1_2, 0, ret_1_2_1);
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
          ret_1 = new PhWith(ret_1, 1, ret_1_2);
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOcorrectly_handles_same_name_attrsTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="466" loc="Φ.org.eolang.correctly-handles-same-name-attrs$calc" name="correctly-handles-same-name-attrs$calc" original-name="calc" parent="correctly-handles-same-name-attrs" pos="2"> 
//   <o line="466" loc="Φ.org.eolang.correctly-handles-same-name-attrs$calc.f" name="f" pos="3"/>
//   <o line="466" loc="Φ.org.eolang.correctly-handles-same-name-attrs$calc.s" name="s" pos="5"/>
//   <o base=".plus" line="467" loc="Φ.org.eolang.correctly-handles-same-name-attrs$calc.φ" name="@" pos="4"> 
//     <o base=".next" line="468" loc="Φ.org.eolang.correctly-handles-same-name-attrs$calc.φ.ρ" pos="7"> 
//       <o base="f" line="468" loc="Φ.org.eolang.correctly-handles-same-name-attrs$calc.φ.ρ.ρ" pos="6" ref="466"/>
//     </o>
//     <o base=".next" line="469" loc="Φ.org.eolang.correctly-handles-same-name-attrs$calc.φ.α0" pos="7"> 
//       <o base="s" line="469" loc="Φ.org.eolang.correctly-handles-same-name-attrs$calc.φ.α0.ρ" pos="6" ref="466"/>
//     </o>
//   </o>
// </o>
@XmirObject(name = "ω1calc", oname = "calc", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω1calc extends PhDefault {
  public EOω1calc(final Phi sigma) {
    super(sigma);
    this.add("f", new AtFree(/* default */));
    this.add("s", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new PhMethod(rho, "f");
        ret_base_base = new PhLocated(ret_base_base, 468, 6, "Φ.org.eolang.correctly-handles-same-name-attrs$calc.φ.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "next");
        ret_base = new PhLocated(ret_base, 468, 7, "Φ.org.eolang.correctly-handles-same-name-attrs$calc.φ.ρ");
      Phi ret = new PhMethod(ret_base, "plus");
        ret = new PhLocated(ret, 467, 4, "Φ.org.eolang.correctly-handles-same-name-attrs$calc.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(rho, "s");
          ret_1_base = new PhLocated(ret_1_base, 469, 6, "Φ.org.eolang.correctly-handles-same-name-attrs$calc.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "next");
          ret_1 = new PhLocated(ret_1, 469, 7, "Φ.org.eolang.correctly-handles-same-name-attrs$calc.φ.α0");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }
}

// <o abstract="" ancestors="1" line="473" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0" name="correctly-handles-same-name-attrs$t1$t0$t0$a0" parent="correctly-handles-same-name-attrs" pos="8"> 
//   <o base="correctly-handles-same-name-attrs$t1$t0$t0$a0$build" cut="735" line="474" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0.build" name="build" pos="10" ref="474"> 
//     <o as="@" base="@" level="1" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0.build.α0" ref="477"/>
//   </o>
//   <o base="build" line="477" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0.φ" name="@" pos="10" ref="474"> 
//     <o base="org.eolang.int" data="int" line="477" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0.φ.α0" pos="16">1</o>
//   </o>
// </o>
@XmirObject(name = "ω1t1$t0$t0$a0", oname = "ω1t1$t0$t0$a0", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω1t1$EOt0$EOt0$EOa0 extends PhDefault {
  public EOω1t1$EOt0$EOt0$EOa0(final Phi sigma) {
    super(sigma);
    this.add("build", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω2build(rho);
        ret = new PhLocated(ret, 474, 10, "Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0.build");
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "build");
        ret = new PhLocated(ret, 477, 10, "Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 477, 16, "Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(1L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

// <o abstract="" ancestors="2" line="474" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0$build" name="correctly-handles-same-name-attrs$t1$t0$t0$a0$build" original-name="build" parent="correctly-handles-same-name-attrs$t1$t0$t0$a0" pos="10"> 
//   <o line="474" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0$build.x" name="x" pos="11"/>
//   <o base=".plus" line="475" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0$build.φ" name="@" pos="13"> 
//     <o base="x" line="475" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0$build.φ.ρ" pos="12" ref="474"/>
//     <o base="org.eolang.int" data="int" line="475" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0$build.φ.α0" pos="19">1</o>
//   </o>
//   <o base="correctly-handles-same-name-attrs-simplified$t1$t0$a0$build" line="476" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0$build.next" name="next" pos="12" ref="449"> 
//     <o base="correctly-handles-same-name-attrs$t1$t0$t0$a0$build$t2$generated-scope-470e49df-f4df-48af-8276-b47f0ab5f030" cut="739" line="476" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0$build.next.generated-scope-470e49df-f4df-48af-8276-b47f0ab5f030" name="generated-scope-470e49df-f4df-48af-8276-b47f0ab5f030" pos="20" ref="476"> 
//       <o as="@" base="@" level="1" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0$build.next.generated-scope-470e49df-f4df-48af-8276-b47f0ab5f030.α0" ref="475"/>
//     </o>
//   </o>
// </o>
@XmirObject(name = "ω2build", oname = "build", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω2build extends PhDefault {
  public EOω2build(final Phi sigma) {
    super(sigma);
    this.add("x", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "x");
        ret_base = new PhLocated(ret_base, 475, 12, "Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0$build.φ.ρ");
      Phi ret = new PhMethod(ret_base, "plus");
        ret = new PhLocated(ret, 475, 13, "Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0$build.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 475, 19, "Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0$build.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(1L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("next", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω2build(rho);
        ret = new PhLocated(ret, 476, 12, "Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0$build.next");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOω3t2$EOgenerated_scope_470e49df_f4df_48af_8276_b47f0ab5f030(rho);
          ret_1 = new PhLocated(ret_1, 476, 20, "Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0$build.next.generated-scope-470e49df-f4df-48af-8276-b47f0ab5f030");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

// <o abstract="" ancestors="3" line="476" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0$build$t2$generated-scope-470e49df-f4df-48af-8276-b47f0ab5f030" name="correctly-handles-same-name-attrs$t1$t0$t0$a0$build$t2$generated-scope-470e49df-f4df-48af-8276-b47f0ab5f030" original-name="generated-scope-470e49df-f4df-48af-8276-b47f0ab5f030" parent="correctly-handles-same-name-attrs$t1$t0$t0$a0$build" pos="20"> 
//   <o base=".plus" line="476" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0$build$t2$generated-scope-470e49df-f4df-48af-8276-b47f0ab5f030.org.eolang.scope-470e49df-f4df-48af-8276-b47f0ab5f030" name="org.eolang.scope-470e49df-f4df-48af-8276-b47f0ab5f030" pos="20" scope="scope-470e49df-f4df-48af-8276-b47f0ab5f030"> 
//     <o base="@" line="476" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0$build$t2$generated-scope-470e49df-f4df-48af-8276-b47f0ab5f030.org.eolang.scope-470e49df-f4df-48af-8276-b47f0ab5f030.ρ" pos="19" ref="476" scope="scope-470e49df-f4df-48af-8276-b47f0ab5f030"/>
//     <o base="org.eolang.int" data="int" line="476" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0$build$t2$generated-scope-470e49df-f4df-48af-8276-b47f0ab5f030.org.eolang.scope-470e49df-f4df-48af-8276-b47f0ab5f030.α0" pos="26" scope="scope-470e49df-f4df-48af-8276-b47f0ab5f030">1</o>
//   </o>
//   <o base="org.eolang.scope-470e49df-f4df-48af-8276-b47f0ab5f030" line="476" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0$build$t2$generated-scope-470e49df-f4df-48af-8276-b47f0ab5f030.φ" name="@" pos="20" ref="476"/>
// </o>
@XmirObject(name = "ω3t2$generated-scope-470e49df-f4df-48af-8276-b47f0ab5f030", oname = "generated-scope-470e49df-f4df-48af-8276-b47f0ab5f030", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω3t2$EOgenerated_scope_470e49df_f4df_48af_8276_b47f0ab5f030 extends PhDefault {
  public EOω3t2$EOgenerated_scope_470e49df_f4df_48af_8276_b47f0ab5f030(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-470e49df-f4df-48af-8276-b47f0ab5f030", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "φ");
        ret_base = new PhLocated(ret_base, 476, 19, "Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0$build$t2$generated-scope-470e49df-f4df-48af-8276-b47f0ab5f030.org.eolang.scope-470e49df-f4df-48af-8276-b47f0ab5f030.ρ");
      Phi ret = new PhMethod(ret_base, "plus");
        ret = new PhLocated(ret, 476, 20, "Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0$build$t2$generated-scope-470e49df-f4df-48af-8276-b47f0ab5f030.org.eolang.scope-470e49df-f4df-48af-8276-b47f0ab5f030");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 476, 26, "Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0$build$t2$generated-scope-470e49df-f4df-48af-8276-b47f0ab5f030.org.eolang.scope-470e49df-f4df-48af-8276-b47f0ab5f030.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(1L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-470e49df-f4df-48af-8276-b47f0ab5f030");
        ret = new PhLocated(ret, 476, 20, "Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a0$build$t2$generated-scope-470e49df-f4df-48af-8276-b47f0ab5f030.φ");
      return ret;
    })));
  }
}
}
}

// <o abstract="" ancestors="1" line="478" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1" name="correctly-handles-same-name-attrs$t1$t0$t0$a1" parent="correctly-handles-same-name-attrs" pos="8"> 
//   <o base="correctly-handles-same-name-attrs$t1$t0$t0$a1$build" cut="749" line="479" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1.build" name="build" pos="10" ref="479"> 
//     <o as="@" base="@" level="1" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1.build.α0" ref="482"/>
//   </o>
//   <o base="build" line="482" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1.φ" name="@" pos="10" ref="479"> 
//     <o base="org.eolang.int" data="int" line="482" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1.φ.α0" pos="16">2</o>
//   </o>
// </o>
@XmirObject(name = "ω1t1$t0$t0$a1", oname = "ω1t1$t0$t0$a1", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω1t1$EOt0$EOt0$EOa1 extends PhDefault {
  public EOω1t1$EOt0$EOt0$EOa1(final Phi sigma) {
    super(sigma);
    this.add("build", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω2build(rho);
        ret = new PhLocated(ret, 479, 10, "Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1.build");
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "build");
        ret = new PhLocated(ret, 482, 10, "Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 482, 16, "Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(2L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

// <o abstract="" ancestors="2" line="479" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1$build" name="correctly-handles-same-name-attrs$t1$t0$t0$a1$build" original-name="build" parent="correctly-handles-same-name-attrs$t1$t0$t0$a1" pos="10"> 
//   <o line="479" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1$build.y" name="y" pos="11"/>
//   <o base=".plus" line="480" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1$build.φ" name="@" pos="13"> 
//     <o base="y" line="480" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1$build.φ.ρ" pos="12" ref="479"/>
//     <o base="org.eolang.int" data="int" line="480" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1$build.φ.α0" pos="19">2</o>
//   </o>
//   <o base="correctly-handles-same-name-attrs-simplified$t1$t0$a0$build" line="481" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1$build.next" name="next" pos="12" ref="449"> 
//     <o base="correctly-handles-same-name-attrs$t1$t0$t0$a1$build$t2$generated-scope-63bbf964-0293-41f4-a937-8d61ba15c42b" cut="753" line="481" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1$build.next.generated-scope-63bbf964-0293-41f4-a937-8d61ba15c42b" name="generated-scope-63bbf964-0293-41f4-a937-8d61ba15c42b" pos="20" ref="481"> 
//       <o as="@" base="@" level="1" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1$build.next.generated-scope-63bbf964-0293-41f4-a937-8d61ba15c42b.α0" ref="480"/>
//     </o>
//   </o>
// </o>
@XmirObject(name = "ω2build", oname = "build", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω2build extends PhDefault {
  public EOω2build(final Phi sigma) {
    super(sigma);
    this.add("y", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "y");
        ret_base = new PhLocated(ret_base, 480, 12, "Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1$build.φ.ρ");
      Phi ret = new PhMethod(ret_base, "plus");
        ret = new PhLocated(ret, 480, 13, "Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1$build.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 480, 19, "Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1$build.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(2L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("next", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω2build(rho);
        ret = new PhLocated(ret, 481, 12, "Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1$build.next");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOω3t2$EOgenerated_scope_63bbf964_0293_41f4_a937_8d61ba15c42b(rho);
          ret_1 = new PhLocated(ret_1, 481, 20, "Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1$build.next.generated-scope-63bbf964-0293-41f4-a937-8d61ba15c42b");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

// <o abstract="" ancestors="3" line="481" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1$build$t2$generated-scope-63bbf964-0293-41f4-a937-8d61ba15c42b" name="correctly-handles-same-name-attrs$t1$t0$t0$a1$build$t2$generated-scope-63bbf964-0293-41f4-a937-8d61ba15c42b" original-name="generated-scope-63bbf964-0293-41f4-a937-8d61ba15c42b" parent="correctly-handles-same-name-attrs$t1$t0$t0$a1$build" pos="20"> 
//   <o base=".plus" line="481" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1$build$t2$generated-scope-63bbf964-0293-41f4-a937-8d61ba15c42b.org.eolang.scope-63bbf964-0293-41f4-a937-8d61ba15c42b" name="org.eolang.scope-63bbf964-0293-41f4-a937-8d61ba15c42b" pos="20" scope="scope-63bbf964-0293-41f4-a937-8d61ba15c42b"> 
//     <o base="@" line="481" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1$build$t2$generated-scope-63bbf964-0293-41f4-a937-8d61ba15c42b.org.eolang.scope-63bbf964-0293-41f4-a937-8d61ba15c42b.ρ" pos="19" ref="481" scope="scope-63bbf964-0293-41f4-a937-8d61ba15c42b"/>
//     <o base="org.eolang.int" data="int" line="481" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1$build$t2$generated-scope-63bbf964-0293-41f4-a937-8d61ba15c42b.org.eolang.scope-63bbf964-0293-41f4-a937-8d61ba15c42b.α0" pos="26" scope="scope-63bbf964-0293-41f4-a937-8d61ba15c42b">2</o>
//   </o>
//   <o base="org.eolang.scope-63bbf964-0293-41f4-a937-8d61ba15c42b" line="481" loc="Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1$build$t2$generated-scope-63bbf964-0293-41f4-a937-8d61ba15c42b.φ" name="@" pos="20" ref="481"/>
// </o>
@XmirObject(name = "ω3t2$generated-scope-63bbf964-0293-41f4-a937-8d61ba15c42b", oname = "generated-scope-63bbf964-0293-41f4-a937-8d61ba15c42b", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω3t2$EOgenerated_scope_63bbf964_0293_41f4_a937_8d61ba15c42b extends PhDefault {
  public EOω3t2$EOgenerated_scope_63bbf964_0293_41f4_a937_8d61ba15c42b(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-63bbf964-0293-41f4-a937-8d61ba15c42b", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "φ");
        ret_base = new PhLocated(ret_base, 481, 19, "Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1$build$t2$generated-scope-63bbf964-0293-41f4-a937-8d61ba15c42b.org.eolang.scope-63bbf964-0293-41f4-a937-8d61ba15c42b.ρ");
      Phi ret = new PhMethod(ret_base, "plus");
        ret = new PhLocated(ret, 481, 20, "Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1$build$t2$generated-scope-63bbf964-0293-41f4-a937-8d61ba15c42b.org.eolang.scope-63bbf964-0293-41f4-a937-8d61ba15c42b");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 481, 26, "Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1$build$t2$generated-scope-63bbf964-0293-41f4-a937-8d61ba15c42b.org.eolang.scope-63bbf964-0293-41f4-a937-8d61ba15c42b.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(2L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-63bbf964-0293-41f4-a937-8d61ba15c42b");
        ret = new PhLocated(ret, 481, 20, "Φ.org.eolang.correctly-handles-same-name-attrs$t1$t0$t0$a1$build$t2$generated-scope-63bbf964-0293-41f4-a937-8d61ba15c42b.φ");
      return ret;
    })));
  }
}
}
}
}