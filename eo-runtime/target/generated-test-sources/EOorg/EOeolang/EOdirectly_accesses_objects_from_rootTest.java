
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="251" loc="Φ.org.eolang.directly-accesses-objects-from-root" name="directly-accesses-objects-from-root" original-name="directly-accesses-objects-from-root" pos="0"> 
//   <o base=".memory" line="252" loc="Φ.org.eolang.directly-accesses-objects-from-root.m" name="m" pos="14"> 
//     <o base=".eolang" line="252" loc="Φ.org.eolang.directly-accesses-objects-from-root.m.ρ" pos="7"> 
//       <o base=".org" line="252" loc="Φ.org.eolang.directly-accesses-objects-from-root.m.ρ.ρ" pos="3"> 
//         <o base="Q" line="252" loc="Φ.org.eolang.directly-accesses-objects-from-root.m.ρ.ρ.ρ" pos="2"/>
//       </o>
//     </o>
//     <o base="org.eolang.int" data="int" line="252" loc="Φ.org.eolang.directly-accesses-objects-from-root.m.α0" pos="22">0</o>
//   </o>
//   <o base=".eq" line="253" loc="Φ.org.eolang.directly-accesses-objects-from-root.φ" name="@" pos="2"> 
//     <o base="org.eolang.seq" line="254" loc="Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ" pos="4"> 
//       <o base=".write" line="255" loc="Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α0" pos="7"> 
//         <o base="m" line="255" loc="Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α0.ρ" pos="6" ref="252"/>
//         <o base="org.eolang.int" data="int" line="255" loc="Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α0.α0" pos="14">42</o>
//       </o>
//       <o base=".stdout" line="256" loc="Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α1" pos="21"> 
//         <o base=".io" line="256" loc="Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α1.ρ" pos="18"> 
//           <o base=".eolang" line="256" loc="Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α1.ρ.ρ" pos="11"> 
//             <o base=".org" line="256" loc="Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α1.ρ.ρ.ρ" pos="7"> 
//               <o base="Q" line="256" loc="Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α1.ρ.ρ.ρ.ρ" pos="6"/>
//             </o>
//           </o>
//         </o>
//         <o base="org.eolang.string" data="string" line="257" loc="Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α1.α0" pos="8">Hello, world!</o>
//       </o>
//       <o base=".write" line="258" loc="Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α2" pos="7"> 
//         <o base="m" line="258" loc="Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α2.ρ" pos="6" ref="252"/>
//         <o base=".minus" line="259" loc="Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α2.α0" pos="16"> 
//           <o base=".as-int" line="259" loc="Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α2.α0.ρ" pos="9"> 
//             <o base="m" line="259" loc="Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α2.α0.ρ.ρ" pos="8" ref="252"/>
//           </o>
//           <o base="org.eolang.int" data="int" line="259" loc="Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α2.α0.α0" pos="23">2</o>
//         </o>
//       </o>
//     </o>
//     <o base="org.eolang.int" data="int" line="260" loc="Φ.org.eolang.directly-accesses-objects-from-root.φ.α0" pos="4">40</o>
//   </o>
// </o>
@XmirObject(name = "directly-accesses-objects-from-rootTest", oname = "directly-accesses-objects-from-root", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOdirectly_accesses_objects_from_rootTest extends PhDefault {
    
  public EOdirectly_accesses_objects_from_rootTest() {
    this.add("m", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base_base = Phi.Φ;
        ret_base_base_base = new PhLocated(ret_base_base_base, 252, 2, "Φ.org.eolang.directly-accesses-objects-from-root.m.ρ.ρ.ρ");
      Phi ret_base_base = new PhMethod(ret_base_base_base, "org");
        ret_base_base = new PhLocated(ret_base_base, 252, 3, "Φ.org.eolang.directly-accesses-objects-from-root.m.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "eolang");
        ret_base = new PhLocated(ret_base, 252, 7, "Φ.org.eolang.directly-accesses-objects-from-root.m.ρ");
      Phi ret = new PhMethod(ret_base, "memory");
        ret = new PhLocated(ret, 252, 14, "Φ.org.eolang.directly-accesses-objects-from-root.m");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 252, 22, "Φ.org.eolang.directly-accesses-objects-from-root.m.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(0L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("seq").get();
        ret_base = new PhLocated(ret_base, 254, 4, "Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1_base = new PhMethod(rho, "m");
          ret_base_1_base = new PhLocated(ret_base_1_base, 255, 6, "Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α0.ρ");
        Phi ret_base_1 = new PhMethod(ret_base_1_base, "write");
          ret_base_1 = new PhLocated(ret_base_1, 255, 7, "Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α0");
        ret_base_1 = new PhCopy(ret_base_1);
          Phi ret_base_1_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_base_1_1 = new PhLocated(ret_base_1_1, 255, 14, "Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α0.α0");
            ret_base_1_1 = new PhWith(ret_base_1_1, "Δ", new Data.Value<>(42L));
          ret_base_1 = new PhWith(ret_base_1, 0, ret_base_1_1);
        Phi ret_base_2_base_base_base_base = Phi.Φ;
          ret_base_2_base_base_base_base = new PhLocated(ret_base_2_base_base_base_base, 256, 6, "Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α1.ρ.ρ.ρ.ρ");
        Phi ret_base_2_base_base_base = new PhMethod(ret_base_2_base_base_base_base, "org");
          ret_base_2_base_base_base = new PhLocated(ret_base_2_base_base_base, 256, 7, "Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α1.ρ.ρ.ρ");
        Phi ret_base_2_base_base = new PhMethod(ret_base_2_base_base_base, "eolang");
          ret_base_2_base_base = new PhLocated(ret_base_2_base_base, 256, 11, "Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α1.ρ.ρ");
        Phi ret_base_2_base = new PhMethod(ret_base_2_base_base, "io");
          ret_base_2_base = new PhLocated(ret_base_2_base, 256, 18, "Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α1.ρ");
        Phi ret_base_2 = new PhMethod(ret_base_2_base, "stdout");
          ret_base_2 = new PhLocated(ret_base_2, 256, 21, "Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α1");
        ret_base_2 = new PhCopy(ret_base_2);
          Phi ret_base_2_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
            ret_base_2_1 = new PhLocated(ret_base_2_1, 257, 8, "Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α1.α0");
            ret_base_2_1 = new PhWith(ret_base_2_1, "Δ", new Data.Value<>("Hello, world!"));
          ret_base_2 = new PhWith(ret_base_2, 0, ret_base_2_1);
        Phi ret_base_3_base = new PhMethod(rho, "m");
          ret_base_3_base = new PhLocated(ret_base_3_base, 258, 6, "Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α2.ρ");
        Phi ret_base_3 = new PhMethod(ret_base_3_base, "write");
          ret_base_3 = new PhLocated(ret_base_3, 258, 7, "Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α2");
        ret_base_3 = new PhCopy(ret_base_3);
          Phi ret_base_3_1_base_base = new PhMethod(rho, "m");
            ret_base_3_1_base_base = new PhLocated(ret_base_3_1_base_base, 259, 8, "Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α2.α0.ρ.ρ");
          Phi ret_base_3_1_base = new PhMethod(ret_base_3_1_base_base, "as-int");
            ret_base_3_1_base = new PhLocated(ret_base_3_1_base, 259, 9, "Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α2.α0.ρ");
          Phi ret_base_3_1 = new PhMethod(ret_base_3_1_base, "minus");
            ret_base_3_1 = new PhLocated(ret_base_3_1, 259, 16, "Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α2.α0");
          ret_base_3_1 = new PhCopy(ret_base_3_1);
            Phi ret_base_3_1_1 = new EOorg.EOeolang.EOint(Phi.Φ);
              ret_base_3_1_1 = new PhLocated(ret_base_3_1_1, 259, 23, "Φ.org.eolang.directly-accesses-objects-from-root.φ.ρ.α2.α0.α0");
              ret_base_3_1_1 = new PhWith(ret_base_3_1_1, "Δ", new Data.Value<>(2L));
            ret_base_3_1 = new PhWith(ret_base_3_1, 0, ret_base_3_1_1);
          ret_base_3 = new PhWith(ret_base_3, 0, ret_base_3_1);
        ret_base = new PhWith(ret_base, 0, ret_base_1);
        ret_base = new PhWith(ret_base, 1, ret_base_2);
        ret_base = new PhWith(ret_base, 2, ret_base_3);
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 253, 2, "Φ.org.eolang.directly-accesses-objects-from-root.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 260, 4, "Φ.org.eolang.directly-accesses-objects-from-root.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(40L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOdirectly_accesses_objects_from_rootTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
