
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="180" loc="Φ.org.eolang.tuple-with-negative-index-gets-last" name="tuple-with-negative-index-gets-last" original-name="tuple-with-negative-index-gets-last" pos="0"> 
//   <o base="org.eolang.tuple" data="tuple" line="181" loc="Φ.org.eolang.tuple-with-negative-index-gets-last.arr" name="arr" pos="2"> 
//     <o base="org.eolang.int" data="int" line="181" loc="Φ.org.eolang.tuple-with-negative-index-gets-last.arr.α0" pos="4">0</o>
//     <o base="org.eolang.int" data="int" line="181" loc="Φ.org.eolang.tuple-with-negative-index-gets-last.arr.α1" pos="6">1</o>
//     <o base="org.eolang.int" data="int" line="181" loc="Φ.org.eolang.tuple-with-negative-index-gets-last.arr.α2" pos="8">2</o>
//     <o base="org.eolang.int" data="int" line="181" loc="Φ.org.eolang.tuple-with-negative-index-gets-last.arr.α3" pos="10">3</o>
//     <o base="org.eolang.int" data="int" line="181" loc="Φ.org.eolang.tuple-with-negative-index-gets-last.arr.α4" pos="12">4</o>
//   </o>
//   <o base=".eq" line="182" loc="Φ.org.eolang.tuple-with-negative-index-gets-last.φ" name="@" pos="2"> 
//     <o base=".at" line="183" loc="Φ.org.eolang.tuple-with-negative-index-gets-last.φ.ρ" pos="7"> 
//       <o base="arr" line="183" loc="Φ.org.eolang.tuple-with-negative-index-gets-last.φ.ρ.ρ" pos="4" ref="181"/>
//       <o base="org.eolang.int" data="int" line="183" loc="Φ.org.eolang.tuple-with-negative-index-gets-last.φ.ρ.α0" pos="11">-1</o>
//     </o>
//     <o base="org.eolang.int" data="int" line="184" loc="Φ.org.eolang.tuple-with-negative-index-gets-last.φ.α0" pos="4">4</o>
//   </o>
// </o>
@XmirObject(name = "tuple-with-negative-index-gets-lastTest", oname = "tuple-with-negative-index-gets-last", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/tuple-tests.eo")
public final class EOtuple_with_negative_index_gets_lastTest extends PhDefault {
    
  public EOtuple_with_negative_index_gets_lastTest() {
    this.add("arr", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("tuple").get();
        ret = new PhLocated(ret, 181, 2, "Φ.org.eolang.tuple-with-negative-index-gets-last.arr");
        Phi[] ret_a = new Phi[5];
        Phi ret_a0 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_a0 = new PhLocated(ret_a0, 181, 4, "Φ.org.eolang.tuple-with-negative-index-gets-last.arr.α0");
          ret_a0 = new PhWith(ret_a0, "Δ", new Data.Value<>(0L));
        ret_a[0] = ret_a0;
        Phi ret_a1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_a1 = new PhLocated(ret_a1, 181, 6, "Φ.org.eolang.tuple-with-negative-index-gets-last.arr.α1");
          ret_a1 = new PhWith(ret_a1, "Δ", new Data.Value<>(1L));
        ret_a[1] = ret_a1;
        Phi ret_a2 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_a2 = new PhLocated(ret_a2, 181, 8, "Φ.org.eolang.tuple-with-negative-index-gets-last.arr.α2");
          ret_a2 = new PhWith(ret_a2, "Δ", new Data.Value<>(2L));
        ret_a[2] = ret_a2;
        Phi ret_a3 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_a3 = new PhLocated(ret_a3, 181, 10, "Φ.org.eolang.tuple-with-negative-index-gets-last.arr.α3");
          ret_a3 = new PhWith(ret_a3, "Δ", new Data.Value<>(3L));
        ret_a[3] = ret_a3;
        Phi ret_a4 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_a4 = new PhLocated(ret_a4, 181, 12, "Φ.org.eolang.tuple-with-negative-index-gets-last.arr.α4");
          ret_a4 = new PhWith(ret_a4, "Δ", new Data.Value<>(4L));
        ret_a[4] = ret_a4;
        ret = new PhWith(new PhCopy(ret), "Δ", new Data.Value<Phi[]>(ret_a));
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new PhMethod(rho, "arr");
        ret_base_base = new PhLocated(ret_base_base, 183, 4, "Φ.org.eolang.tuple-with-negative-index-gets-last.φ.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "at");
        ret_base = new PhLocated(ret_base, 183, 7, "Φ.org.eolang.tuple-with-negative-index-gets-last.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_base_1 = new PhLocated(ret_base_1, 183, 11, "Φ.org.eolang.tuple-with-negative-index-gets-last.φ.ρ.α0");
          ret_base_1 = new PhWith(ret_base_1, "Δ", new Data.Value<>(-1L));
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 182, 2, "Φ.org.eolang.tuple-with-negative-index-gets-last.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 184, 4, "Φ.org.eolang.tuple-with-negative-index-gets-last.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(4L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOtuple_with_negative_index_gets_lastTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
