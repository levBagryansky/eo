
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="89" loc="Φ.org.eolang.writes-into-two-memory-objects-and-check-first" name="writes-into-two-memory-objects-and-check-first" original-name="writes-into-two-memory-objects-and-check-first" pos="0"> 
//   <o base="org.eolang.memory" line="90" loc="Φ.org.eolang.writes-into-two-memory-objects-and-check-first.a" name="a" pos="2"> 
//     <o base="org.eolang.int" data="int" line="90" loc="Φ.org.eolang.writes-into-two-memory-objects-and-check-first.a.α0" pos="9">0</o>
//   </o>
//   <o base="org.eolang.memory" line="91" loc="Φ.org.eolang.writes-into-two-memory-objects-and-check-first.b" name="b" pos="2"> 
//     <o base="org.eolang.int" data="int" line="91" loc="Φ.org.eolang.writes-into-two-memory-objects-and-check-first.b.α0" pos="9">0</o>
//   </o>
//   <o base="org.eolang.hamcrest.assert-that" line="92" loc="Φ.org.eolang.writes-into-two-memory-objects-and-check-first.φ" name="@" pos="2"> 
//     <o base="org.eolang.seq" line="93" loc="Φ.org.eolang.writes-into-two-memory-objects-and-check-first.φ.α0" pos="4"> 
//       <o base=".write" line="94" loc="Φ.org.eolang.writes-into-two-memory-objects-and-check-first.φ.α0.α0" pos="7"> 
//         <o base="a" line="94" loc="Φ.org.eolang.writes-into-two-memory-objects-and-check-first.φ.α0.α0.ρ" pos="6" ref="90"/>
//         <o base="org.eolang.int" data="int" line="94" loc="Φ.org.eolang.writes-into-two-memory-objects-and-check-first.φ.α0.α0.α0" pos="14">10</o>
//       </o>
//       <o base=".write" line="95" loc="Φ.org.eolang.writes-into-two-memory-objects-and-check-first.φ.α0.α1" pos="7"> 
//         <o base="b" line="95" loc="Φ.org.eolang.writes-into-two-memory-objects-and-check-first.φ.α0.α1.ρ" pos="6" ref="91"/>
//         <o base="org.eolang.int" data="int" line="95" loc="Φ.org.eolang.writes-into-two-memory-objects-and-check-first.φ.α0.α1.α0" pos="14">20</o>
//       </o>
//       <o base="a" line="96" loc="Φ.org.eolang.writes-into-two-memory-objects-and-check-first.φ.α0.α2" pos="6" ref="90"/>
//     </o>
//     <o base=".equal-to" line="97" loc="Φ.org.eolang.writes-into-two-memory-objects-and-check-first.φ.α1" pos="5"> 
//       <o base="$" line="97" loc="Φ.org.eolang.writes-into-two-memory-objects-and-check-first.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.int" data="int" line="97" loc="Φ.org.eolang.writes-into-two-memory-objects-and-check-first.φ.α1.α0" pos="15">10</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "writes-into-two-memory-objects-and-check-firstTest", oname = "writes-into-two-memory-objects-and-check-first", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/memory-tests.eo")
public final class EOwrites_into_two_memory_objects_and_check_firstTest extends PhDefault {
  public EOwrites_into_two_memory_objects_and_check_firstTest() {
    this.add("a", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("memory").get();
        ret = new PhLocated(ret, 90, 2, "Φ.org.eolang.writes-into-two-memory-objects-and-check-first.a");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 90, 9, "Φ.org.eolang.writes-into-two-memory-objects-and-check-first.a.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(0L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("b", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("memory").get();
        ret = new PhLocated(ret, 91, 2, "Φ.org.eolang.writes-into-two-memory-objects-and-check-first.b");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 91, 9, "Φ.org.eolang.writes-into-two-memory-objects-and-check-first.b.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(0L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 92, 2, "Φ.org.eolang.writes-into-two-memory-objects-and-check-first.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = Phi.Φ.attr("org").get().attr("eolang").get().attr("seq").get();
          ret_1 = new PhLocated(ret_1, 93, 4, "Φ.org.eolang.writes-into-two-memory-objects-and-check-first.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1_base = new PhMethod(rho, "a");
            ret_1_1_base = new PhLocated(ret_1_1_base, 94, 6, "Φ.org.eolang.writes-into-two-memory-objects-and-check-first.φ.α0.α0.ρ");
          Phi ret_1_1 = new PhMethod(ret_1_1_base, "write");
            ret_1_1 = new PhLocated(ret_1_1, 94, 7, "Φ.org.eolang.writes-into-two-memory-objects-and-check-first.φ.α0.α0");
          ret_1_1 = new PhCopy(ret_1_1);
            Phi ret_1_1_1 = new EOorg.EOeolang.EOint(Phi.Φ);
              ret_1_1_1 = new PhLocated(ret_1_1_1, 94, 14, "Φ.org.eolang.writes-into-two-memory-objects-and-check-first.φ.α0.α0.α0");
              ret_1_1_1 = new PhWith(ret_1_1_1, "Δ", new Data.Value<>(10L));
            ret_1_1 = new PhWith(ret_1_1, 0, ret_1_1_1);
          Phi ret_1_2_base = new PhMethod(rho, "b");
            ret_1_2_base = new PhLocated(ret_1_2_base, 95, 6, "Φ.org.eolang.writes-into-two-memory-objects-and-check-first.φ.α0.α1.ρ");
          Phi ret_1_2 = new PhMethod(ret_1_2_base, "write");
            ret_1_2 = new PhLocated(ret_1_2, 95, 7, "Φ.org.eolang.writes-into-two-memory-objects-and-check-first.φ.α0.α1");
          ret_1_2 = new PhCopy(ret_1_2);
            Phi ret_1_2_1 = new EOorg.EOeolang.EOint(Phi.Φ);
              ret_1_2_1 = new PhLocated(ret_1_2_1, 95, 14, "Φ.org.eolang.writes-into-two-memory-objects-and-check-first.φ.α0.α1.α0");
              ret_1_2_1 = new PhWith(ret_1_2_1, "Δ", new Data.Value<>(20L));
            ret_1_2 = new PhWith(ret_1_2, 0, ret_1_2_1);
          Phi ret_1_3 = new PhMethod(rho, "a");
            ret_1_3 = new PhLocated(ret_1_3, 96, 6, "Φ.org.eolang.writes-into-two-memory-objects-and-check-first.φ.α0.α2");
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
          ret_1 = new PhWith(ret_1, 1, ret_1_2);
          ret_1 = new PhWith(ret_1, 2, ret_1_3);
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 97, 4, "Φ.org.eolang.writes-into-two-memory-objects-and-check-first.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 97, 5, "Φ.org.eolang.writes-into-two-memory-objects-and-check-first.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 97, 15, "Φ.org.eolang.writes-into-two-memory-objects-and-check-first.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(10L));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOwrites_into_two_memory_objects_and_check_firstTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}