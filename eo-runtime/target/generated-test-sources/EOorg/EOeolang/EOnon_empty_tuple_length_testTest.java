
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="49" loc="Φ.org.eolang.non-empty-tuple-length-test" name="non-empty-tuple-length-test" original-name="non-empty-tuple-length-test" pos="0"> 
//   <o base="non-empty-tuple-length-test$arr" cut="28" line="50" loc="Φ.org.eolang.non-empty-tuple-length-test.arr" name="arr" pos="2" ref="50"/>
//   <o base="org.eolang.hamcrest.assert-that" line="51" loc="Φ.org.eolang.non-empty-tuple-length-test.φ" name="@" pos="2"> 
//     <o base=".length" line="52" loc="Φ.org.eolang.non-empty-tuple-length-test.φ.α0" pos="38"> 
//       <o base=".elements" line="52" loc="Φ.org.eolang.non-empty-tuple-length-test.φ.α0.ρ" pos="29"> 
//         <o base="non-empty-tuple-length-test$t1$t0$t0$generated-scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d" cut="30" line="52" loc="Φ.org.eolang.non-empty-tuple-length-test.φ.α0.ρ.generated-scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d" name="generated-scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d" pos="5" ref="52"> 
//           <o as="arr" base="arr" level="1" loc="Φ.org.eolang.non-empty-tuple-length-test.φ.α0.ρ.generated-scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.α0" ref="50"/>
//         </o>
//       </o>
//     </o>
//     <o base=".equal-to" line="53" loc="Φ.org.eolang.non-empty-tuple-length-test.φ.α1" pos="5"> 
//       <o base="$" line="53" loc="Φ.org.eolang.non-empty-tuple-length-test.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.int" data="int" line="53" loc="Φ.org.eolang.non-empty-tuple-length-test.φ.α1.α0" pos="15">5</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "non-empty-tuple-length-testTest", oname = "non-empty-tuple-length-test", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/tuple-tests.eo")
public final class EOnon_empty_tuple_length_testTest extends PhDefault {
  public EOnon_empty_tuple_length_testTest() {
    this.add("arr", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω1arr(rho);
        ret = new PhLocated(ret, 50, 2, "Φ.org.eolang.non-empty-tuple-length-test.arr");
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 51, 2, "Φ.org.eolang.non-empty-tuple-length-test.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base_base = new EOω1t1$EOt0$EOt0$EOgenerated_scope_c323ae7c_ab3e_48be_8dfe_407f306cd97d(rho);
          ret_1_base_base = new PhLocated(ret_1_base_base, 52, 5, "Φ.org.eolang.non-empty-tuple-length-test.φ.α0.ρ.generated-scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d");
        Phi ret_1_base = new PhMethod(ret_1_base_base, "elements");
          ret_1_base = new PhLocated(ret_1_base, 52, 29, "Φ.org.eolang.non-empty-tuple-length-test.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "length");
          ret_1 = new PhLocated(ret_1, 52, 38, "Φ.org.eolang.non-empty-tuple-length-test.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 53, 4, "Φ.org.eolang.non-empty-tuple-length-test.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 53, 5, "Φ.org.eolang.non-empty-tuple-length-test.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 53, 15, "Φ.org.eolang.non-empty-tuple-length-test.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(5L));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOnon_empty_tuple_length_testTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="50" loc="Φ.org.eolang.non-empty-tuple-length-test$arr" name="non-empty-tuple-length-test$arr" original-name="arr" parent="non-empty-tuple-length-test" pos="2"> 
//   <o line="50" loc="Φ.org.eolang.non-empty-tuple-length-test$arr.elements" name="elements" pos="3" vararg=""/>
// </o>
@XmirObject(name = "ω1arr", oname = "arr", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/tuple-tests.eo")
public final class EOω1arr extends PhDefault {
  public EOω1arr(final Phi sigma) {
    super(sigma);
    this.add("elements", new AtVararg(/* default */));
  }
}

// <o abstract="" ancestors="1" line="52" loc="Φ.org.eolang.non-empty-tuple-length-test$t1$t0$t0$generated-scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d" name="non-empty-tuple-length-test$t1$t0$t0$generated-scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d" original-name="generated-scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d" parent="non-empty-tuple-length-test" pos="5"> 
//   <o base="arr" line="52" loc="Φ.org.eolang.non-empty-tuple-length-test$t1$t0$t0$generated-scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.org.eolang.scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d" name="org.eolang.scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d" pos="5" ref="52.50.471" scope="scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d"> 
//     <o base="org.eolang.string" data="string" line="52" loc="Φ.org.eolang.non-empty-tuple-length-test$t1$t0$t0$generated-scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.org.eolang.scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.α0" pos="9" scope="scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d">a</o>
//     <o base="org.eolang.string" data="string" line="52" loc="Φ.org.eolang.non-empty-tuple-length-test$t1$t0$t0$generated-scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.org.eolang.scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.α1" pos="13" scope="scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d">b</o>
//     <o base="org.eolang.string" data="string" line="52" loc="Φ.org.eolang.non-empty-tuple-length-test$t1$t0$t0$generated-scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.org.eolang.scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.α2" pos="17" scope="scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d">c</o>
//     <o base="org.eolang.string" data="string" line="52" loc="Φ.org.eolang.non-empty-tuple-length-test$t1$t0$t0$generated-scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.org.eolang.scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.α3" pos="21" scope="scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d">d</o>
//     <o base="org.eolang.string" data="string" line="52" loc="Φ.org.eolang.non-empty-tuple-length-test$t1$t0$t0$generated-scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.org.eolang.scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.α4" pos="25" scope="scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d">e</o>
//   </o>
//   <o base="org.eolang.scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d" line="52" loc="Φ.org.eolang.non-empty-tuple-length-test$t1$t0$t0$generated-scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.φ" name="@" pos="5" ref="52"/>
//   <o level="1" line="52.50.471" loc="Φ.org.eolang.non-empty-tuple-length-test$t1$t0$t0$generated-scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.arr" name="arr"/>
// </o>
@XmirObject(name = "ω1t1$t0$t0$generated-scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d", oname = "generated-scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/tuple-tests.eo")
public final class EOω1t1$EOt0$EOt0$EOgenerated_scope_c323ae7c_ab3e_48be_8dfe_407f306cd97d extends PhDefault {
  public EOω1t1$EOt0$EOt0$EOgenerated_scope_c323ae7c_ab3e_48be_8dfe_407f306cd97d(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(new PhMethod(rho, "σ"), "arr");
        ret = new PhLocated(ret, 52, 5, "Φ.org.eolang.non-empty-tuple-length-test$t1$t0$t0$generated-scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.org.eolang.scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 52, 9, "Φ.org.eolang.non-empty-tuple-length-test$t1$t0$t0$generated-scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.org.eolang.scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>("a"));
        Phi ret_2 = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_2 = new PhLocated(ret_2, 52, 13, "Φ.org.eolang.non-empty-tuple-length-test$t1$t0$t0$generated-scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.org.eolang.scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.α1");
          ret_2 = new PhWith(ret_2, "Δ", new Data.Value<>("b"));
        Phi ret_3 = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_3 = new PhLocated(ret_3, 52, 17, "Φ.org.eolang.non-empty-tuple-length-test$t1$t0$t0$generated-scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.org.eolang.scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.α2");
          ret_3 = new PhWith(ret_3, "Δ", new Data.Value<>("c"));
        Phi ret_4 = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_4 = new PhLocated(ret_4, 52, 21, "Φ.org.eolang.non-empty-tuple-length-test$t1$t0$t0$generated-scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.org.eolang.scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.α3");
          ret_4 = new PhWith(ret_4, "Δ", new Data.Value<>("d"));
        Phi ret_5 = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_5 = new PhLocated(ret_5, 52, 25, "Φ.org.eolang.non-empty-tuple-length-test$t1$t0$t0$generated-scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.org.eolang.scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.α4");
          ret_5 = new PhWith(ret_5, "Δ", new Data.Value<>("e"));
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
        ret = new PhWith(ret, 2, ret_3);
        ret = new PhWith(ret, 3, ret_4);
        ret = new PhWith(ret, 4, ret_5);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d");
        ret = new PhLocated(ret, 52, 5, "Φ.org.eolang.non-empty-tuple-length-test$t1$t0$t0$generated-scope-c323ae7c-ab3e-48be-8dfe-407f306cd97d.φ");
      return ret;
    })));
  }
}
}