
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="53" loc="Φ.org.eolang.cage-nested-objects" name="cage-nested-objects" original-name="cage-nested-objects" pos="0"> 
//   <o base="cage-nested-objects$dummy" cut="37" line="54" loc="Φ.org.eolang.cage-nested-objects.dummy" name="dummy" pos="2" ref="54"/>
//   <o base="org.eolang.cage" line="56" loc="Φ.org.eolang.cage-nested-objects.c" name="c" pos="2"> 
//     <o base="dummy" line="56" loc="Φ.org.eolang.cage-nested-objects.c.α0" pos="7" ref="54"/>
//   </o>
//   <o base="c" copy="" line="57" loc="Φ.org.eolang.cage-nested-objects.copy" name="copy" pos="2" ref="56"/>
//   <o base=".eq" line="58" loc="Φ.org.eolang.cage-nested-objects.φ" name="@" pos="2"> 
//     <o base="org.eolang.seq" line="59" loc="Φ.org.eolang.cage-nested-objects.φ.ρ" pos="4"> 
//       <o base=".write" line="60" loc="Φ.org.eolang.cage-nested-objects.φ.ρ.α0" pos="7"> 
//         <o base="c" line="60" loc="Φ.org.eolang.cage-nested-objects.φ.ρ.α0.ρ" pos="6" ref="56"/>
//         <o base="dummy" line="60" loc="Φ.org.eolang.cage-nested-objects.φ.ρ.α0.α0" pos="15" ref="54" scope="scope-09c80319-cad4-4c52-a1dd-78fc9dc91341"> 
//           <o base="org.eolang.int" data="int" line="60" loc="Φ.org.eolang.cage-nested-objects.φ.ρ.α0.α0.α0" pos="21" scope="scope-09c80319-cad4-4c52-a1dd-78fc9dc91341">42</o>
//         </o>
//       </o>
//       <o base=".<" line="61" loc="Φ.org.eolang.cage-nested-objects.φ.ρ.α1" pos="10"> 
//         <o base="copy" line="61" loc="Φ.org.eolang.cage-nested-objects.φ.ρ.α1.ρ" pos="6" ref="57"/>
//       </o>
//       <o base=".write" line="62" loc="Φ.org.eolang.cage-nested-objects.φ.ρ.α2" pos="7"> 
//         <o base="c" line="62" loc="Φ.org.eolang.cage-nested-objects.φ.ρ.α2.ρ" pos="6" ref="56"/>
//         <o base="dummy" line="62" loc="Φ.org.eolang.cage-nested-objects.φ.ρ.α2.α0" pos="15" ref="54" scope="scope-021994c3-b79f-4e24-88a6-46b27bc8bdf6"> 
//           <o base="copy" line="62" loc="Φ.org.eolang.cage-nested-objects.φ.ρ.α2.α0.α0" pos="21" ref="57" scope="scope-021994c3-b79f-4e24-88a6-46b27bc8bdf6"/>
//         </o>
//       </o>
//       <o base=".x" line="63" loc="Φ.org.eolang.cage-nested-objects.φ.ρ.α3" pos="9"> 
//         <o base=".x" line="63" loc="Φ.org.eolang.cage-nested-objects.φ.ρ.α3.ρ" pos="7"> 
//           <o base="c" line="63" loc="Φ.org.eolang.cage-nested-objects.φ.ρ.α3.ρ.ρ" pos="6" ref="56"/>
//         </o>
//       </o>
//     </o>
//     <o base="org.eolang.int" data="int" line="64" loc="Φ.org.eolang.cage-nested-objects.φ.α0" pos="4">42</o>
//   </o>
// </o>
@XmirObject(name = "cage-nested-objectsTest", oname = "cage-nested-objects", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/cage-tests.eo")
public final class EOcage_nested_objectsTest extends PhDefault {
    
  public EOcage_nested_objectsTest() {
    this.add("dummy", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω1dummy(rho);
        ret = new PhLocated(ret, 54, 2, "Φ.org.eolang.cage-nested-objects.dummy");
      return ret;
    })));
    this.add("c", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("cage").get();
        ret = new PhLocated(ret, 56, 2, "Φ.org.eolang.cage-nested-objects.c");
      ret = new PhCopy(ret);
        Phi ret_1 = new PhMethod(rho, "dummy");
          ret_1 = new PhLocated(ret_1, 56, 7, "Φ.org.eolang.cage-nested-objects.c.α0");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("copy", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "c");
        ret = new PhLocated(ret, 57, 2, "Φ.org.eolang.cage-nested-objects.copy");
        ret = new PhCopy(ret);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("seq").get();
        ret_base = new PhLocated(ret_base, 59, 4, "Φ.org.eolang.cage-nested-objects.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1_base = new PhMethod(rho, "c");
          ret_base_1_base = new PhLocated(ret_base_1_base, 60, 6, "Φ.org.eolang.cage-nested-objects.φ.ρ.α0.ρ");
        Phi ret_base_1 = new PhMethod(ret_base_1_base, "write");
          ret_base_1 = new PhLocated(ret_base_1, 60, 7, "Φ.org.eolang.cage-nested-objects.φ.ρ.α0");
        ret_base_1 = new PhCopy(ret_base_1);
          Phi ret_base_1_1 = new PhMethod(rho, "dummy");
            ret_base_1_1 = new PhLocated(ret_base_1_1, 60, 15, "Φ.org.eolang.cage-nested-objects.φ.ρ.α0.α0");
          ret_base_1_1 = new PhCopy(ret_base_1_1);
            Phi ret_base_1_1_1 = new EOorg.EOeolang.EOint(Phi.Φ);
              ret_base_1_1_1 = new PhLocated(ret_base_1_1_1, 60, 21, "Φ.org.eolang.cage-nested-objects.φ.ρ.α0.α0.α0");
              ret_base_1_1_1 = new PhWith(ret_base_1_1_1, "Δ", new Data.Value<>(42L));
            ret_base_1_1 = new PhWith(ret_base_1_1, 0, ret_base_1_1_1);
          ret_base_1 = new PhWith(ret_base_1, 0, ret_base_1_1);
        Phi ret_base_2_base = new PhMethod(rho, "copy");
          ret_base_2_base = new PhLocated(ret_base_2_base, 61, 6, "Φ.org.eolang.cage-nested-objects.φ.ρ.α1.ρ");
        Phi ret_base_2 = new PhMethod(ret_base_2_base, "ν");
          ret_base_2 = new PhLocated(ret_base_2, 61, 10, "Φ.org.eolang.cage-nested-objects.φ.ρ.α1");
        Phi ret_base_3_base = new PhMethod(rho, "c");
          ret_base_3_base = new PhLocated(ret_base_3_base, 62, 6, "Φ.org.eolang.cage-nested-objects.φ.ρ.α2.ρ");
        Phi ret_base_3 = new PhMethod(ret_base_3_base, "write");
          ret_base_3 = new PhLocated(ret_base_3, 62, 7, "Φ.org.eolang.cage-nested-objects.φ.ρ.α2");
        ret_base_3 = new PhCopy(ret_base_3);
          Phi ret_base_3_1 = new PhMethod(rho, "dummy");
            ret_base_3_1 = new PhLocated(ret_base_3_1, 62, 15, "Φ.org.eolang.cage-nested-objects.φ.ρ.α2.α0");
          ret_base_3_1 = new PhCopy(ret_base_3_1);
            Phi ret_base_3_1_1 = new PhMethod(rho, "copy");
              ret_base_3_1_1 = new PhLocated(ret_base_3_1_1, 62, 21, "Φ.org.eolang.cage-nested-objects.φ.ρ.α2.α0.α0");
            ret_base_3_1 = new PhWith(ret_base_3_1, 0, ret_base_3_1_1);
          ret_base_3 = new PhWith(ret_base_3, 0, ret_base_3_1);
        Phi ret_base_4_base_base = new PhMethod(rho, "c");
          ret_base_4_base_base = new PhLocated(ret_base_4_base_base, 63, 6, "Φ.org.eolang.cage-nested-objects.φ.ρ.α3.ρ.ρ");
        Phi ret_base_4_base = new PhMethod(ret_base_4_base_base, "x");
          ret_base_4_base = new PhLocated(ret_base_4_base, 63, 7, "Φ.org.eolang.cage-nested-objects.φ.ρ.α3.ρ");
        Phi ret_base_4 = new PhMethod(ret_base_4_base, "x");
          ret_base_4 = new PhLocated(ret_base_4, 63, 9, "Φ.org.eolang.cage-nested-objects.φ.ρ.α3");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
        ret_base = new PhWith(ret_base, 1, ret_base_2);
        ret_base = new PhWith(ret_base, 2, ret_base_3);
        ret_base = new PhWith(ret_base, 3, ret_base_4);
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 58, 2, "Φ.org.eolang.cage-nested-objects.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 64, 4, "Φ.org.eolang.cage-nested-objects.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(42L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOcage_nested_objectsTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="54" loc="Φ.org.eolang.cage-nested-objects$dummy" name="cage-nested-objects$dummy" original-name="dummy" parent="cage-nested-objects" pos="2"> 
//   <o line="54" loc="Φ.org.eolang.cage-nested-objects$dummy.x" name="x" pos="3"/>
//   <o base="x" line="55" loc="Φ.org.eolang.cage-nested-objects$dummy.φ" name="@" pos="4" ref="54"/>
// </o>
@XmirObject(name = "ω1dummy", oname = "dummy", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/cage-tests.eo")
public final class EOω1dummy extends PhDefault {
    
  public EOω1dummy(final Phi sigma) {
    super(sigma);
    this.add("x", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "x");
        ret = new PhLocated(ret, 55, 4, "Φ.org.eolang.cage-nested-objects$dummy.φ");
      return ret;
    })));
  }
}
}
