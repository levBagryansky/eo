
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="42" loc="Φ.org.eolang.empty-tuple-length" name="empty-tuple-length" original-name="empty-tuple-length" pos="0"> 
//   <o base="empty-tuple-length$arr" cut="18" line="43" loc="Φ.org.eolang.empty-tuple-length.arr" name="arr" pos="2" ref="43"/>
//   <o base="org.eolang.hamcrest.assert-that" line="44" loc="Φ.org.eolang.empty-tuple-length.φ" name="@" pos="2"> 
//     <o base=".length" line="45" loc="Φ.org.eolang.empty-tuple-length.φ.α0" pos="16"> 
//       <o base=".elements" line="45" loc="Φ.org.eolang.empty-tuple-length.φ.α0.ρ" pos="7"> 
//         <o base="arr" line="45" loc="Φ.org.eolang.empty-tuple-length.φ.α0.ρ.ρ" pos="4" ref="43"/>
//       </o>
//     </o>
//     <o base=".equal-to" line="46" loc="Φ.org.eolang.empty-tuple-length.φ.α1" pos="5"> 
//       <o base="$" line="46" loc="Φ.org.eolang.empty-tuple-length.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.int" data="int" line="46" loc="Φ.org.eolang.empty-tuple-length.φ.α1.α0" pos="15">0</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "empty-tuple-lengthTest", oname = "empty-tuple-length", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/tuple-tests.eo")
public final class EOempty_tuple_lengthTest extends PhDefault {
  public EOempty_tuple_lengthTest() {
    this.add("arr", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω1arr(rho);
        ret = new PhLocated(ret, 43, 2, "Φ.org.eolang.empty-tuple-length.arr");
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 44, 2, "Φ.org.eolang.empty-tuple-length.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base_base = new PhMethod(rho, "arr");
          ret_1_base_base = new PhLocated(ret_1_base_base, 45, 4, "Φ.org.eolang.empty-tuple-length.φ.α0.ρ.ρ");
        Phi ret_1_base = new PhMethod(ret_1_base_base, "elements");
          ret_1_base = new PhLocated(ret_1_base, 45, 7, "Φ.org.eolang.empty-tuple-length.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "length");
          ret_1 = new PhLocated(ret_1, 45, 16, "Φ.org.eolang.empty-tuple-length.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 46, 4, "Φ.org.eolang.empty-tuple-length.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 46, 5, "Φ.org.eolang.empty-tuple-length.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 46, 15, "Φ.org.eolang.empty-tuple-length.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(0L));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOempty_tuple_lengthTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="43" loc="Φ.org.eolang.empty-tuple-length$arr" name="empty-tuple-length$arr" original-name="arr" parent="empty-tuple-length" pos="2"> 
//   <o line="43" loc="Φ.org.eolang.empty-tuple-length$arr.elements" name="elements" pos="3" vararg=""/>
// </o>
@XmirObject(name = "ω1arr", oname = "arr", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/tuple-tests.eo")
public final class EOω1arr extends PhDefault {
  public EOω1arr(final Phi sigma) {
    super(sigma);
    this.add("elements", new AtVararg(/* default */));
  }
}
}