
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="208" loc="Φ.org.eolang.tuple-fluent-with-indented-keyword" name="tuple-fluent-with-indented-keyword" original-name="tuple-fluent-with-indented-keyword" pos="0"> 
//   <o base=".with" line="212" loc="Φ.org.eolang.tuple-fluent-with-indented-keyword.a" name="a" pos="2"> 
//     <o base=".with" line="211" loc="Φ.org.eolang.tuple-fluent-with-indented-keyword.a.ρ" pos="2"> 
//       <o base=".with" line="210" loc="Φ.org.eolang.tuple-fluent-with-indented-keyword.a.ρ.ρ" pos="2"> 
//         <o base="org.eolang.tuple" data="tuple" line="209" loc="Φ.org.eolang.tuple-fluent-with-indented-keyword.a.ρ.ρ.ρ" pos="2"/>
//         <o base="org.eolang.int" data="int" line="210" loc="Φ.org.eolang.tuple-fluent-with-indented-keyword.a.ρ.ρ.α0" pos="8">1</o>
//       </o>
//       <o base="org.eolang.int" data="int" line="211" loc="Φ.org.eolang.tuple-fluent-with-indented-keyword.a.ρ.α0" pos="8">2</o>
//     </o>
//     <o base="org.eolang.int" data="int" line="212" loc="Φ.org.eolang.tuple-fluent-with-indented-keyword.a.α0" pos="8">3</o>
//   </o>
//   <o base="org.eolang.hamcrest.assert-that" line="213" loc="Φ.org.eolang.tuple-fluent-with-indented-keyword.φ" name="@" pos="2"> 
//     <o base="org.eolang.collections.list" line="214" loc="Φ.org.eolang.tuple-fluent-with-indented-keyword.φ.α0" pos="4"> 
//       <o base="a" line="214" loc="Φ.org.eolang.tuple-fluent-with-indented-keyword.φ.α0.α0" pos="9" ref="212"/>
//     </o>
//     <o base=".equal-to" line="215" loc="Φ.org.eolang.tuple-fluent-with-indented-keyword.φ.α1" pos="5"> 
//       <o base="$" line="215" loc="Φ.org.eolang.tuple-fluent-with-indented-keyword.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.collections.list" line="216" loc="Φ.org.eolang.tuple-fluent-with-indented-keyword.φ.α1.α0" pos="6"> 
//         <o base="tuple-fluent-with-indented-keyword$t1$t1$t1$generated-scope-1cf025be-6947-4f31-afe2-73b9495c0162" cut="320" line="216" loc="Φ.org.eolang.tuple-fluent-with-indented-keyword.φ.α1.α0.generated-scope-1cf025be-6947-4f31-afe2-73b9495c0162" name="generated-scope-1cf025be-6947-4f31-afe2-73b9495c0162" pos="12" ref="216"/>
//       </o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "tuple-fluent-with-indented-keywordTest", oname = "tuple-fluent-with-indented-keyword", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/tuple-tests.eo")
public final class EOtuple_fluent_with_indented_keywordTest extends PhDefault {
  public EOtuple_fluent_with_indented_keywordTest() {
    this.add("a", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("tuple").get();
        ret_base_base_base = new PhLocated(ret_base_base_base, 209, 2, "Φ.org.eolang.tuple-fluent-with-indented-keyword.a.ρ.ρ.ρ");
        Phi[] ret_base_base_base_a = new Phi[0];
        ret_base_base_base = new PhWith(new PhCopy(ret_base_base_base), "Δ", new Data.Value<Phi[]>(ret_base_base_base_a));
      Phi ret_base_base = new PhMethod(ret_base_base_base, "with");
        ret_base_base = new PhLocated(ret_base_base, 210, 2, "Φ.org.eolang.tuple-fluent-with-indented-keyword.a.ρ.ρ");
      ret_base_base = new PhCopy(ret_base_base);
        Phi ret_base_base_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_base_base_1 = new PhLocated(ret_base_base_1, 210, 8, "Φ.org.eolang.tuple-fluent-with-indented-keyword.a.ρ.ρ.α0");
          ret_base_base_1 = new PhWith(ret_base_base_1, "Δ", new Data.Value<>(1L));
        ret_base_base = new PhWith(ret_base_base, 0, ret_base_base_1);
      Phi ret_base = new PhMethod(ret_base_base, "with");
        ret_base = new PhLocated(ret_base, 211, 2, "Φ.org.eolang.tuple-fluent-with-indented-keyword.a.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_base_1 = new PhLocated(ret_base_1, 211, 8, "Φ.org.eolang.tuple-fluent-with-indented-keyword.a.ρ.α0");
          ret_base_1 = new PhWith(ret_base_1, "Δ", new Data.Value<>(2L));
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "with");
        ret = new PhLocated(ret, 212, 2, "Φ.org.eolang.tuple-fluent-with-indented-keyword.a");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 212, 8, "Φ.org.eolang.tuple-fluent-with-indented-keyword.a.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(3L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 213, 2, "Φ.org.eolang.tuple-fluent-with-indented-keyword.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("collections").get().attr("list").get();
          ret_1 = new PhLocated(ret_1, 214, 4, "Φ.org.eolang.tuple-fluent-with-indented-keyword.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new PhMethod(rho, "a");
            ret_1_1 = new PhLocated(ret_1_1, 214, 9, "Φ.org.eolang.tuple-fluent-with-indented-keyword.φ.α0.α0");
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 215, 4, "Φ.org.eolang.tuple-fluent-with-indented-keyword.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 215, 5, "Φ.org.eolang.tuple-fluent-with-indented-keyword.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("collections").get().attr("list").get();
            ret_2_1 = new PhLocated(ret_2_1, 216, 6, "Φ.org.eolang.tuple-fluent-with-indented-keyword.φ.α1.α0");
          ret_2_1 = new PhCopy(ret_2_1);
            Phi ret_2_1_1 = new EOω1t1$EOt1$EOt1$EOgenerated_scope_1cf025be_6947_4f31_afe2_73b9495c0162(rho);
              ret_2_1_1 = new PhLocated(ret_2_1_1, 216, 12, "Φ.org.eolang.tuple-fluent-with-indented-keyword.φ.α1.α0.generated-scope-1cf025be-6947-4f31-afe2-73b9495c0162");
            ret_2_1 = new PhWith(ret_2_1, 0, ret_2_1_1);
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOtuple_fluent_with_indented_keywordTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="216" loc="Φ.org.eolang.tuple-fluent-with-indented-keyword$t1$t1$t1$generated-scope-1cf025be-6947-4f31-afe2-73b9495c0162" name="tuple-fluent-with-indented-keyword$t1$t1$t1$generated-scope-1cf025be-6947-4f31-afe2-73b9495c0162" original-name="generated-scope-1cf025be-6947-4f31-afe2-73b9495c0162" parent="tuple-fluent-with-indented-keyword" pos="12"> 
//   <o base="org.eolang.tuple" data="tuple" line="216" loc="Φ.org.eolang.tuple-fluent-with-indented-keyword$t1$t1$t1$generated-scope-1cf025be-6947-4f31-afe2-73b9495c0162.org.eolang.scope-1cf025be-6947-4f31-afe2-73b9495c0162" name="org.eolang.scope-1cf025be-6947-4f31-afe2-73b9495c0162" pos="12" scope="scope-1cf025be-6947-4f31-afe2-73b9495c0162"> 
//     <o base="org.eolang.int" data="int" line="216" loc="Φ.org.eolang.tuple-fluent-with-indented-keyword$t1$t1$t1$generated-scope-1cf025be-6947-4f31-afe2-73b9495c0162.org.eolang.scope-1cf025be-6947-4f31-afe2-73b9495c0162.α0" pos="14" scope="scope-1cf025be-6947-4f31-afe2-73b9495c0162">1</o>
//     <o base="org.eolang.int" data="int" line="216" loc="Φ.org.eolang.tuple-fluent-with-indented-keyword$t1$t1$t1$generated-scope-1cf025be-6947-4f31-afe2-73b9495c0162.org.eolang.scope-1cf025be-6947-4f31-afe2-73b9495c0162.α1" pos="16" scope="scope-1cf025be-6947-4f31-afe2-73b9495c0162">2</o>
//     <o base="org.eolang.int" data="int" line="216" loc="Φ.org.eolang.tuple-fluent-with-indented-keyword$t1$t1$t1$generated-scope-1cf025be-6947-4f31-afe2-73b9495c0162.org.eolang.scope-1cf025be-6947-4f31-afe2-73b9495c0162.α2" pos="18" scope="scope-1cf025be-6947-4f31-afe2-73b9495c0162">3</o>
//   </o>
//   <o base="org.eolang.scope-1cf025be-6947-4f31-afe2-73b9495c0162" line="216" loc="Φ.org.eolang.tuple-fluent-with-indented-keyword$t1$t1$t1$generated-scope-1cf025be-6947-4f31-afe2-73b9495c0162.φ" name="@" pos="12" ref="216"/>
// </o>
@XmirObject(name = "ω1t1$t1$t1$generated-scope-1cf025be-6947-4f31-afe2-73b9495c0162", oname = "generated-scope-1cf025be-6947-4f31-afe2-73b9495c0162", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/tuple-tests.eo")
public final class EOω1t1$EOt1$EOt1$EOgenerated_scope_1cf025be_6947_4f31_afe2_73b9495c0162 extends PhDefault {
  public EOω1t1$EOt1$EOt1$EOgenerated_scope_1cf025be_6947_4f31_afe2_73b9495c0162(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-1cf025be-6947-4f31-afe2-73b9495c0162", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("tuple").get();
        ret = new PhLocated(ret, 216, 12, "Φ.org.eolang.tuple-fluent-with-indented-keyword$t1$t1$t1$generated-scope-1cf025be-6947-4f31-afe2-73b9495c0162.org.eolang.scope-1cf025be-6947-4f31-afe2-73b9495c0162");
        Phi[] ret_a = new Phi[3];
        Phi ret_a0 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_a0 = new PhLocated(ret_a0, 216, 14, "Φ.org.eolang.tuple-fluent-with-indented-keyword$t1$t1$t1$generated-scope-1cf025be-6947-4f31-afe2-73b9495c0162.org.eolang.scope-1cf025be-6947-4f31-afe2-73b9495c0162.α0");
          ret_a0 = new PhWith(ret_a0, "Δ", new Data.Value<>(1L));
        ret_a[0] = ret_a0;
        Phi ret_a1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_a1 = new PhLocated(ret_a1, 216, 16, "Φ.org.eolang.tuple-fluent-with-indented-keyword$t1$t1$t1$generated-scope-1cf025be-6947-4f31-afe2-73b9495c0162.org.eolang.scope-1cf025be-6947-4f31-afe2-73b9495c0162.α1");
          ret_a1 = new PhWith(ret_a1, "Δ", new Data.Value<>(2L));
        ret_a[1] = ret_a1;
        Phi ret_a2 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_a2 = new PhLocated(ret_a2, 216, 18, "Φ.org.eolang.tuple-fluent-with-indented-keyword$t1$t1$t1$generated-scope-1cf025be-6947-4f31-afe2-73b9495c0162.org.eolang.scope-1cf025be-6947-4f31-afe2-73b9495c0162.α2");
          ret_a2 = new PhWith(ret_a2, "Δ", new Data.Value<>(3L));
        ret_a[2] = ret_a2;
        ret = new PhWith(new PhCopy(ret), "Δ", new Data.Value<Phi[]>(ret_a));
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-1cf025be-6947-4f31-afe2-73b9495c0162");
        ret = new PhLocated(ret, 216, 12, "Φ.org.eolang.tuple-fluent-with-indented-keyword$t1$t1$t1$generated-scope-1cf025be-6947-4f31-afe2-73b9495c0162.φ");
      return ret;
    })));
  }
}
}