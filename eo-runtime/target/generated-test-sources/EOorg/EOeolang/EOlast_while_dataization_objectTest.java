
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="139" loc="Φ.org.eolang.last-while-dataization-object" name="last-while-dataization-object" original-name="last-while-dataization-object" pos="0"> 
//   <o base="org.eolang.memory" line="140" loc="Φ.org.eolang.last-while-dataization-object.x" name="x" pos="2"> 
//     <o base="org.eolang.int" data="int" line="140" loc="Φ.org.eolang.last-while-dataization-object.x.α0" pos="9">0</o>
//   </o>
//   <o base=".eq" line="141" loc="Φ.org.eolang.last-while-dataization-object.φ" name="@" pos="2"> 
//     <o base=".while" line="142" loc="Φ.org.eolang.last-while-dataization-object.φ.ρ" pos="4"> 
//       <o base=".lt" line="143" loc="Φ.org.eolang.last-while-dataization-object.φ.ρ.ρ" pos="14"> 
//         <o base=".as-int" line="143" loc="Φ.org.eolang.last-while-dataization-object.φ.ρ.ρ.ρ" pos="7"> 
//           <o base="x" line="143" loc="Φ.org.eolang.last-while-dataization-object.φ.ρ.ρ.ρ.ρ" pos="6" ref="140"/>
//         </o>
//         <o base="org.eolang.int" data="int" line="143" loc="Φ.org.eolang.last-while-dataization-object.φ.ρ.ρ.α0" pos="18">2</o>
//       </o>
//       <o base="last-while-dataization-object$t1$t0$a1" cut="229" line="144" loc="Φ.org.eolang.last-while-dataization-object.φ.ρ.α0" pos="6" ref="144"> 
//         <o as="x" base="x" level="1" loc="Φ.org.eolang.last-while-dataization-object.φ.ρ.α0.α0" ref="140"/>
//       </o>
//     </o>
//     <o base="org.eolang.int" data="int" line="148" loc="Φ.org.eolang.last-while-dataization-object.φ.α0" pos="4">3</o>
//   </o>
// </o>
@XmirObject(name = "last-while-dataization-objectTest", oname = "last-while-dataization-object", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bool-tests.eo")
public final class EOlast_while_dataization_objectTest extends PhDefault {
    
  public EOlast_while_dataization_objectTest() {
    this.add("x", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("memory").get();
        ret = new PhLocated(ret, 140, 2, "Φ.org.eolang.last-while-dataization-object.x");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 140, 9, "Φ.org.eolang.last-while-dataization-object.x.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(0L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base_base_base = new PhMethod(rho, "x");
        ret_base_base_base_base = new PhLocated(ret_base_base_base_base, 143, 6, "Φ.org.eolang.last-while-dataization-object.φ.ρ.ρ.ρ.ρ");
      Phi ret_base_base_base = new PhMethod(ret_base_base_base_base, "as-int");
        ret_base_base_base = new PhLocated(ret_base_base_base, 143, 7, "Φ.org.eolang.last-while-dataization-object.φ.ρ.ρ.ρ");
      Phi ret_base_base = new PhMethod(ret_base_base_base, "lt");
        ret_base_base = new PhLocated(ret_base_base, 143, 14, "Φ.org.eolang.last-while-dataization-object.φ.ρ.ρ");
      ret_base_base = new PhCopy(ret_base_base);
        Phi ret_base_base_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_base_base_1 = new PhLocated(ret_base_base_1, 143, 18, "Φ.org.eolang.last-while-dataization-object.φ.ρ.ρ.α0");
          ret_base_base_1 = new PhWith(ret_base_base_1, "Δ", new Data.Value<>(2L));
        ret_base_base = new PhWith(ret_base_base, 0, ret_base_base_1);
      Phi ret_base = new PhMethod(ret_base_base, "while");
        ret_base = new PhLocated(ret_base, 142, 4, "Φ.org.eolang.last-while-dataization-object.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new EOω1t1$EOt0$EOa1(rho);
          ret_base_1 = new PhLocated(ret_base_1, 144, 6, "Φ.org.eolang.last-while-dataization-object.φ.ρ.α0");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 141, 2, "Φ.org.eolang.last-while-dataization-object.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 148, 4, "Φ.org.eolang.last-while-dataization-object.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(3L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOlast_while_dataization_objectTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="144" loc="Φ.org.eolang.last-while-dataization-object$t1$t0$a1" name="last-while-dataization-object$t1$t0$a1" parent="last-while-dataization-object" pos="6"> 
//   <o line="144" loc="Φ.org.eolang.last-while-dataization-object$t1$t0$a1.i" name="i" pos="7"/>
//   <o base="org.eolang.seq" line="145" loc="Φ.org.eolang.last-while-dataization-object$t1$t0$a1.φ" name="@" pos="8"> 
//     <o base=".write" line="146" loc="Φ.org.eolang.last-while-dataization-object$t1$t0$a1.φ.α0" pos="11"> 
//       <o base="x" line="146" loc="Φ.org.eolang.last-while-dataization-object$t1$t0$a1.φ.α0.ρ" pos="10" ref="144.140.463"/>
//       <o base="last-while-dataization-object$t1$t0$a1$t1$t0$generated-scope-72bb692e-05c5-49b8-b550-296d9cdd3751" cut="231" line="146" loc="Φ.org.eolang.last-while-dataization-object$t1$t0$a1.φ.α0.generated-scope-72bb692e-05c5-49b8-b550-296d9cdd3751" name="generated-scope-72bb692e-05c5-49b8-b550-296d9cdd3751" pos="27" ref="146"> 
//         <o as="x" base="x" level="2" loc="Φ.org.eolang.last-while-dataization-object$t1$t0$a1.φ.α0.generated-scope-72bb692e-05c5-49b8-b550-296d9cdd3751.α0" ref="144.140.463"/>
//       </o>
//     </o>
//     <o base=".as-int" line="147" loc="Φ.org.eolang.last-while-dataization-object$t1$t0$a1.φ.α1" pos="11"> 
//       <o base="x" line="147" loc="Φ.org.eolang.last-while-dataization-object$t1$t0$a1.φ.α1.ρ" pos="10" ref="144.140.463"/>
//     </o>
//   </o>
//   <o level="1" line="144.140.463" loc="Φ.org.eolang.last-while-dataization-object$t1$t0$a1.x" name="x"/>
// </o>
@XmirObject(name = "ω1t1$t0$a1", oname = "ω1t1$t0$a1", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bool-tests.eo")
public final class EOω1t1$EOt0$EOa1 extends PhDefault {
    
  public EOω1t1$EOt0$EOa1(final Phi sigma) {
    super(sigma);
    this.add("i", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("seq").get();
        ret = new PhLocated(ret, 145, 8, "Φ.org.eolang.last-while-dataization-object$t1$t0$a1.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(new PhMethod(rho, "σ"), "x");
          ret_1_base = new PhLocated(ret_1_base, 146, 10, "Φ.org.eolang.last-while-dataization-object$t1$t0$a1.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "write");
          ret_1 = new PhLocated(ret_1, 146, 11, "Φ.org.eolang.last-while-dataization-object$t1$t0$a1.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new EOω2t1$EOt0$EOgenerated_scope_72bb692e_05c5_49b8_b550_296d9cdd3751(rho);
            ret_1_1 = new PhLocated(ret_1_1, 146, 27, "Φ.org.eolang.last-while-dataization-object$t1$t0$a1.φ.α0.generated-scope-72bb692e-05c5-49b8-b550-296d9cdd3751");
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base = new PhMethod(new PhMethod(rho, "σ"), "x");
          ret_2_base = new PhLocated(ret_2_base, 147, 10, "Φ.org.eolang.last-while-dataization-object$t1$t0$a1.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "as-int");
          ret_2 = new PhLocated(ret_2, 147, 11, "Φ.org.eolang.last-while-dataization-object$t1$t0$a1.φ.α1");
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

// <o abstract="" ancestors="2" line="146" loc="Φ.org.eolang.last-while-dataization-object$t1$t0$a1$t1$t0$generated-scope-72bb692e-05c5-49b8-b550-296d9cdd3751" name="last-while-dataization-object$t1$t0$a1$t1$t0$generated-scope-72bb692e-05c5-49b8-b550-296d9cdd3751" original-name="generated-scope-72bb692e-05c5-49b8-b550-296d9cdd3751" parent="last-while-dataization-object$t1$t0$a1" pos="27"> 
//   <o base=".plus" line="146" loc="Φ.org.eolang.last-while-dataization-object$t1$t0$a1$t1$t0$generated-scope-72bb692e-05c5-49b8-b550-296d9cdd3751.org.eolang.scope-72bb692e-05c5-49b8-b550-296d9cdd3751" name="org.eolang.scope-72bb692e-05c5-49b8-b550-296d9cdd3751" pos="27" scope="scope-72bb692e-05c5-49b8-b550-296d9cdd3751"> 
//     <o base=".as-int" line="146" loc="Φ.org.eolang.last-while-dataization-object$t1$t0$a1$t1$t0$generated-scope-72bb692e-05c5-49b8-b550-296d9cdd3751.org.eolang.scope-72bb692e-05c5-49b8-b550-296d9cdd3751.ρ" pos="20" scope="scope-72bb692e-05c5-49b8-b550-296d9cdd3751"> 
//       <o base="x" line="146" loc="Φ.org.eolang.last-while-dataization-object$t1$t0$a1$t1$t0$generated-scope-72bb692e-05c5-49b8-b550-296d9cdd3751.org.eolang.scope-72bb692e-05c5-49b8-b550-296d9cdd3751.ρ.ρ" pos="19" ref="146.140.464" scope="scope-72bb692e-05c5-49b8-b550-296d9cdd3751"/>
//     </o>
//     <o base="org.eolang.int" data="int" line="146" loc="Φ.org.eolang.last-while-dataization-object$t1$t0$a1$t1$t0$generated-scope-72bb692e-05c5-49b8-b550-296d9cdd3751.org.eolang.scope-72bb692e-05c5-49b8-b550-296d9cdd3751.α0" pos="33" scope="scope-72bb692e-05c5-49b8-b550-296d9cdd3751">1</o>
//   </o>
//   <o base="org.eolang.scope-72bb692e-05c5-49b8-b550-296d9cdd3751" line="146" loc="Φ.org.eolang.last-while-dataization-object$t1$t0$a1$t1$t0$generated-scope-72bb692e-05c5-49b8-b550-296d9cdd3751.φ" name="@" pos="27" ref="146"/>
//   <o level="2" line="146.140.464" loc="Φ.org.eolang.last-while-dataization-object$t1$t0$a1$t1$t0$generated-scope-72bb692e-05c5-49b8-b550-296d9cdd3751.x" name="x"/>
// </o>
@XmirObject(name = "ω2t1$t0$generated-scope-72bb692e-05c5-49b8-b550-296d9cdd3751", oname = "generated-scope-72bb692e-05c5-49b8-b550-296d9cdd3751", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/bool-tests.eo")
public final class EOω2t1$EOt0$EOgenerated_scope_72bb692e_05c5_49b8_b550_296d9cdd3751 extends PhDefault {
    
  public EOω2t1$EOt0$EOgenerated_scope_72bb692e_05c5_49b8_b550_296d9cdd3751(final Phi sigma) {
    super(sigma);
    this.add("org.eolang.scope-72bb692e-05c5-49b8-b550-296d9cdd3751", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new PhMethod(new PhMethod(new PhMethod(rho, "σ"), "σ"), "x");
        ret_base_base = new PhLocated(ret_base_base, 146, 19, "Φ.org.eolang.last-while-dataization-object$t1$t0$a1$t1$t0$generated-scope-72bb692e-05c5-49b8-b550-296d9cdd3751.org.eolang.scope-72bb692e-05c5-49b8-b550-296d9cdd3751.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "as-int");
        ret_base = new PhLocated(ret_base, 146, 20, "Φ.org.eolang.last-while-dataization-object$t1$t0$a1$t1$t0$generated-scope-72bb692e-05c5-49b8-b550-296d9cdd3751.org.eolang.scope-72bb692e-05c5-49b8-b550-296d9cdd3751.ρ");
      Phi ret = new PhMethod(ret_base, "plus");
        ret = new PhLocated(ret, 146, 27, "Φ.org.eolang.last-while-dataization-object$t1$t0$a1$t1$t0$generated-scope-72bb692e-05c5-49b8-b550-296d9cdd3751.org.eolang.scope-72bb692e-05c5-49b8-b550-296d9cdd3751");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 146, 33, "Φ.org.eolang.last-while-dataization-object$t1$t0$a1$t1$t0$generated-scope-72bb692e-05c5-49b8-b550-296d9cdd3751.org.eolang.scope-72bb692e-05c5-49b8-b550-296d9cdd3751.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(1L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "org.eolang.scope-72bb692e-05c5-49b8-b550-296d9cdd3751");
        ret = new PhLocated(ret, 146, 27, "Φ.org.eolang.last-while-dataization-object$t1$t0$a1$t1$t0$generated-scope-72bb692e-05c5-49b8-b550-296d9cdd3751.φ");
      return ret;
    })));
  }
}
}
}
