
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="78" loc="Φ.org.eolang.dataizes-encaged-object-lazily-second" name="dataizes-encaged-object-lazily-second" original-name="dataizes-encaged-object-lazily-second" pos="0"> 
//   <o base="org.eolang.cage" line="79" loc="Φ.org.eolang.dataizes-encaged-object-lazily-second.x" name="x" pos="2"> 
//     <o base="org.eolang.int" data="int" line="79" loc="Φ.org.eolang.dataizes-encaged-object-lazily-second.x.α0" pos="7">0</o>
//   </o>
//   <o base="org.eolang.cage" line="80" loc="Φ.org.eolang.dataizes-encaged-object-lazily-second.sum" name="sum" pos="2"> 
//     <o base=".plus" line="80" loc="Φ.org.eolang.dataizes-encaged-object-lazily-second.sum.α0" pos="8"> 
//       <o base="org.eolang.int" data="int" line="80" loc="Φ.org.eolang.dataizes-encaged-object-lazily-second.sum.α0.ρ" pos="7">0</o>
//     </o>
//   </o>
//   <o base=".eq" line="81" loc="Φ.org.eolang.dataizes-encaged-object-lazily-second.φ" name="@" pos="2"> 
//     <o base="org.eolang.seq" line="82" loc="Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ" pos="4"> 
//       <o base=".write" line="83" loc="Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ.α0" pos="7"> 
//         <o base="x" line="83" loc="Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ.α0.ρ" pos="6" ref="79"/>
//         <o base="org.eolang.int" data="int" line="83" loc="Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ.α0.α0" pos="14">42</o>
//       </o>
//       <o base=".write" line="84" loc="Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ.α1" pos="9"> 
//         <o base="sum" line="84" loc="Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ.α1.ρ" pos="6" ref="80"/>
//         <o base=".plus" line="85" loc="Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ.α1.α0" pos="9"> 
//           <o base="org.eolang.int" data="int" line="85" loc="Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ.α1.α0.ρ" pos="8">1</o>
//           <o base="x" line="85" loc="Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ.α1.α0.α0" pos="15" ref="79"/>
//         </o>
//       </o>
//       <o base=".write" line="86" loc="Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ.α2" pos="7"> 
//         <o base="x" line="86" loc="Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ.α2.ρ" pos="6" ref="79"/>
//         <o base="org.eolang.int" data="int" line="86" loc="Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ.α2.α0" pos="14">7</o>
//       </o>
//       <o base="sum" line="87" loc="Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ.α3" pos="6" ref="80"/>
//     </o>
//     <o base="org.eolang.int" data="int" line="88" loc="Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.α0" pos="4">8</o>
//   </o>
// </o>
@XmirObject(name = "dataizes-encaged-object-lazily-secondTest", oname = "dataizes-encaged-object-lazily-second", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/cage-tests.eo")
public final class EOdataizes_encaged_object_lazily_secondTest extends PhDefault {
    
  public EOdataizes_encaged_object_lazily_secondTest() {
    this.add("x", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("cage").get();
        ret = new PhLocated(ret, 79, 2, "Φ.org.eolang.dataizes-encaged-object-lazily-second.x");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 79, 7, "Φ.org.eolang.dataizes-encaged-object-lazily-second.x.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(0L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("sum", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("cage").get();
        ret = new PhLocated(ret, 80, 2, "Φ.org.eolang.dataizes-encaged-object-lazily-second.sum");
      ret = new PhCopy(ret);
        Phi ret_1_base = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1_base = new PhLocated(ret_1_base, 80, 7, "Φ.org.eolang.dataizes-encaged-object-lazily-second.sum.α0.ρ");
          ret_1_base = new PhWith(ret_1_base, "Δ", new Data.Value<>(0L));
        Phi ret_1 = new PhMethod(ret_1_base, "plus");
          ret_1 = new PhLocated(ret_1, 80, 8, "Φ.org.eolang.dataizes-encaged-object-lazily-second.sum.α0");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("seq").get();
        ret_base = new PhLocated(ret_base, 82, 4, "Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1_base = new PhMethod(rho, "x");
          ret_base_1_base = new PhLocated(ret_base_1_base, 83, 6, "Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ.α0.ρ");
        Phi ret_base_1 = new PhMethod(ret_base_1_base, "write");
          ret_base_1 = new PhLocated(ret_base_1, 83, 7, "Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ.α0");
        ret_base_1 = new PhCopy(ret_base_1);
          Phi ret_base_1_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_base_1_1 = new PhLocated(ret_base_1_1, 83, 14, "Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ.α0.α0");
            ret_base_1_1 = new PhWith(ret_base_1_1, "Δ", new Data.Value<>(42L));
          ret_base_1 = new PhWith(ret_base_1, 0, ret_base_1_1);
        Phi ret_base_2_base = new PhMethod(rho, "sum");
          ret_base_2_base = new PhLocated(ret_base_2_base, 84, 6, "Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ.α1.ρ");
        Phi ret_base_2 = new PhMethod(ret_base_2_base, "write");
          ret_base_2 = new PhLocated(ret_base_2, 84, 9, "Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ.α1");
        ret_base_2 = new PhCopy(ret_base_2);
          Phi ret_base_2_1_base = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_base_2_1_base = new PhLocated(ret_base_2_1_base, 85, 8, "Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ.α1.α0.ρ");
            ret_base_2_1_base = new PhWith(ret_base_2_1_base, "Δ", new Data.Value<>(1L));
          Phi ret_base_2_1 = new PhMethod(ret_base_2_1_base, "plus");
            ret_base_2_1 = new PhLocated(ret_base_2_1, 85, 9, "Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ.α1.α0");
          ret_base_2_1 = new PhCopy(ret_base_2_1);
            Phi ret_base_2_1_1 = new PhMethod(rho, "x");
              ret_base_2_1_1 = new PhLocated(ret_base_2_1_1, 85, 15, "Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ.α1.α0.α0");
            ret_base_2_1 = new PhWith(ret_base_2_1, 0, ret_base_2_1_1);
          ret_base_2 = new PhWith(ret_base_2, 0, ret_base_2_1);
        Phi ret_base_3_base = new PhMethod(rho, "x");
          ret_base_3_base = new PhLocated(ret_base_3_base, 86, 6, "Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ.α2.ρ");
        Phi ret_base_3 = new PhMethod(ret_base_3_base, "write");
          ret_base_3 = new PhLocated(ret_base_3, 86, 7, "Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ.α2");
        ret_base_3 = new PhCopy(ret_base_3);
          Phi ret_base_3_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_base_3_1 = new PhLocated(ret_base_3_1, 86, 14, "Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ.α2.α0");
            ret_base_3_1 = new PhWith(ret_base_3_1, "Δ", new Data.Value<>(7L));
          ret_base_3 = new PhWith(ret_base_3, 0, ret_base_3_1);
        Phi ret_base_4 = new PhMethod(rho, "sum");
          ret_base_4 = new PhLocated(ret_base_4, 87, 6, "Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.ρ.α3");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
        ret_base = new PhWith(ret_base, 1, ret_base_2);
        ret_base = new PhWith(ret_base, 2, ret_base_3);
        ret_base = new PhWith(ret_base, 3, ret_base_4);
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 81, 2, "Φ.org.eolang.dataizes-encaged-object-lazily-second.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 88, 4, "Φ.org.eolang.dataizes-encaged-object-lazily-second.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(8L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOdataizes_encaged_object_lazily_secondTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
