
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="304" loc="Φ.org.eolang.takes-object-id-from-abstract-empty" name="takes-object-id-from-abstract-empty" original-name="takes-object-id-from-abstract-empty" pos="0"> 
//   <o base="takes-object-id-from-abstract-empty$foo" cut="492" line="305" loc="Φ.org.eolang.takes-object-id-from-abstract-empty.foo" name="foo" pos="2" ref="305"/>
//   <o base="org.eolang.hamcrest.assert-that" line="307" loc="Φ.org.eolang.takes-object-id-from-abstract-empty.φ" name="@" pos="2"> 
//     <o base=".eq" line="308" loc="Φ.org.eolang.takes-object-id-from-abstract-empty.φ.α0" pos="11"> 
//       <o base=".<" line="308" loc="Φ.org.eolang.takes-object-id-from-abstract-empty.φ.α0.ρ" pos="9"> 
//         <o base=".y" line="308" loc="Φ.org.eolang.takes-object-id-from-abstract-empty.φ.α0.ρ.ρ" pos="7"> 
//           <o base="foo" line="308" loc="Φ.org.eolang.takes-object-id-from-abstract-empty.φ.α0.ρ.ρ.ρ" pos="4" ref="305"/>
//         </o>
//       </o>
//       <o base=".<" line="309" loc="Φ.org.eolang.takes-object-id-from-abstract-empty.φ.α0.α0" pos="11"> 
//         <o base=".y" line="309" loc="Φ.org.eolang.takes-object-id-from-abstract-empty.φ.α0.α0.ρ" pos="9"> 
//           <o base="foo" line="309" loc="Φ.org.eolang.takes-object-id-from-abstract-empty.φ.α0.α0.ρ.ρ" pos="6" ref="305"/>
//         </o>
//       </o>
//     </o>
//     <o base=".equal-to" line="310" loc="Φ.org.eolang.takes-object-id-from-abstract-empty.φ.α1" pos="5"> 
//       <o base="$" line="310" loc="Φ.org.eolang.takes-object-id-from-abstract-empty.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.bool" data="bool" line="310" loc="Φ.org.eolang.takes-object-id-from-abstract-empty.φ.α1.α0" pos="15">TRUE</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "takes-object-id-from-abstract-emptyTest", oname = "takes-object-id-from-abstract-empty", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOtakes_object_id_from_abstract_emptyTest extends PhDefault {
  public EOtakes_object_id_from_abstract_emptyTest() {
    this.add("foo", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω1foo(rho);
        ret = new PhLocated(ret, 305, 2, "Φ.org.eolang.takes-object-id-from-abstract-empty.foo");
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 307, 2, "Φ.org.eolang.takes-object-id-from-abstract-empty.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base_base_base = new PhMethod(rho, "foo");
          ret_1_base_base_base = new PhLocated(ret_1_base_base_base, 308, 4, "Φ.org.eolang.takes-object-id-from-abstract-empty.φ.α0.ρ.ρ.ρ");
        Phi ret_1_base_base = new PhMethod(ret_1_base_base_base, "y");
          ret_1_base_base = new PhLocated(ret_1_base_base, 308, 7, "Φ.org.eolang.takes-object-id-from-abstract-empty.φ.α0.ρ.ρ");
        Phi ret_1_base = new PhMethod(ret_1_base_base, "ν");
          ret_1_base = new PhLocated(ret_1_base, 308, 9, "Φ.org.eolang.takes-object-id-from-abstract-empty.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "eq");
          ret_1 = new PhLocated(ret_1, 308, 11, "Φ.org.eolang.takes-object-id-from-abstract-empty.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1_base_base = new PhMethod(rho, "foo");
            ret_1_1_base_base = new PhLocated(ret_1_1_base_base, 309, 6, "Φ.org.eolang.takes-object-id-from-abstract-empty.φ.α0.α0.ρ.ρ");
          Phi ret_1_1_base = new PhMethod(ret_1_1_base_base, "y");
            ret_1_1_base = new PhLocated(ret_1_1_base, 309, 9, "Φ.org.eolang.takes-object-id-from-abstract-empty.φ.α0.α0.ρ");
          Phi ret_1_1 = new PhMethod(ret_1_1_base, "ν");
            ret_1_1 = new PhLocated(ret_1_1, 309, 11, "Φ.org.eolang.takes-object-id-from-abstract-empty.φ.α0.α0");
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 310, 4, "Φ.org.eolang.takes-object-id-from-abstract-empty.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 310, 5, "Φ.org.eolang.takes-object-id-from-abstract-empty.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EObool(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 310, 15, "Φ.org.eolang.takes-object-id-from-abstract-empty.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(Boolean.TRUE));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOtakes_object_id_from_abstract_emptyTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="305" loc="Φ.org.eolang.takes-object-id-from-abstract-empty$foo" name="takes-object-id-from-abstract-empty$foo" original-name="foo" parent="takes-object-id-from-abstract-empty" pos="2"> 
//   <o base="takes-object-id-from-abstract-empty$foo$y" cut="492" line="306" loc="Φ.org.eolang.takes-object-id-from-abstract-empty$foo.y" name="y" pos="4" ref="306"/>
// </o>
@XmirObject(name = "ω1foo", oname = "foo", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω1foo extends PhDefault {
  public EOω1foo(final Phi sigma) {
    super(sigma);
    this.add("y", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω2y(rho);
        ret = new PhLocated(ret, 306, 4, "Φ.org.eolang.takes-object-id-from-abstract-empty$foo.y");
      return ret;
    })));
  }

// <o abstract="" ancestors="2" line="306" loc="Φ.org.eolang.takes-object-id-from-abstract-empty$foo$y" name="takes-object-id-from-abstract-empty$foo$y" original-name="y" parent="takes-object-id-from-abstract-empty$foo" pos="4"/>
@XmirObject(name = "ω2y", oname = "y", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω2y extends PhDefault {
  public EOω2y(final Phi sigma) {
    super(sigma);
  }
}
}
}
