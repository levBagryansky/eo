
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="65" loc="Φ.org.eolang.takes-parent-through-attribute" name="takes-parent-through-attribute" original-name="takes-parent-through-attribute" pos="0"> 
//   <o base="org.eolang.int" data="int" line="66" loc="Φ.org.eolang.takes-parent-through-attribute.x" name="x" pos="2">42</o>
//   <o base="$" line="67" loc="Φ.org.eolang.takes-parent-through-attribute.this" name="this" pos="2"/>
//   <o base="takes-parent-through-attribute$@" cut="41" line="68" loc="Φ.org.eolang.takes-parent-through-attribute.φ" name="@" pos="2" ref="68"> 
//     <o as="this" base="this" level="1" loc="Φ.org.eolang.takes-parent-through-attribute.φ.α0" ref="67"/>
//   </o>
// </o>
@XmirObject(name = "takes-parent-through-attributeTest", oname = "takes-parent-through-attribute", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOtakes_parent_through_attributeTest extends PhDefault {
    
  public EOtakes_parent_through_attributeTest() {
    this.add("x", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOorg.EOeolang.EOint(Phi.Φ);
        ret = new PhLocated(ret, 66, 2, "Φ.org.eolang.takes-parent-through-attribute.x");
        ret = new PhWith(ret, "Δ", new Data.Value<>(42L));
      return ret;
    })));
    this.add("this", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = rho;
        ret = new PhLocated(ret, 67, 2, "Φ.org.eolang.takes-parent-through-attribute.this");
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω1φ(rho);
        ret = new PhLocated(ret, 68, 2, "Φ.org.eolang.takes-parent-through-attribute.φ");
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOtakes_parent_through_attributeTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="68" loc="Φ.org.eolang.takes-parent-through-attribute$@" name="takes-parent-through-attribute$@" original-name="@" parent="takes-parent-through-attribute" pos="2"> 
//   <o base="takes-parent-through-attribute$@$@" cut="41" line="69" loc="Φ.org.eolang.takes-parent-through-attribute$@.φ" name="@" pos="4" ref="69"> 
//     <o as="this" base="this" level="2" loc="Φ.org.eolang.takes-parent-through-attribute$@.φ.α0" ref="68.67.454"/>
//   </o>
//   <o level="1" line="68.67.454" loc="Φ.org.eolang.takes-parent-through-attribute$@.this" name="this"/>
// </o>
@XmirObject(name = "ω1@", oname = "@", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω1φ extends PhDefault {
    
  public EOω1φ(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω2φ(rho);
        ret = new PhLocated(ret, 69, 4, "Φ.org.eolang.takes-parent-through-attribute$@.φ");
      return ret;
    })));
  }

// <o abstract="" ancestors="2" line="69" loc="Φ.org.eolang.takes-parent-through-attribute$@$@" name="takes-parent-through-attribute$@$@" original-name="@" parent="takes-parent-through-attribute$@" pos="4"> 
//   <o base="takes-parent-through-attribute$@$@$@" cut="41" line="70" loc="Φ.org.eolang.takes-parent-through-attribute$@$@.φ" name="@" pos="6" ref="70"> 
//     <o as="this" base="this" level="3" loc="Φ.org.eolang.takes-parent-through-attribute$@$@.φ.α0" ref="69.67.455"/>
//   </o>
//   <o level="2" line="69.67.455" loc="Φ.org.eolang.takes-parent-through-attribute$@$@.this" name="this"/>
// </o>
@XmirObject(name = "ω2@", oname = "@", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω2φ extends PhDefault {
    
  public EOω2φ(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω3φ(rho);
        ret = new PhLocated(ret, 70, 6, "Φ.org.eolang.takes-parent-through-attribute$@$@.φ");
      return ret;
    })));
  }

// <o abstract="" ancestors="3" line="70" loc="Φ.org.eolang.takes-parent-through-attribute$@$@$@" name="takes-parent-through-attribute$@$@$@" original-name="@" parent="takes-parent-through-attribute$@$@" pos="6"> 
//   <o base=".eq" line="71" loc="Φ.org.eolang.takes-parent-through-attribute$@$@$@.φ" name="@" pos="8"> 
//     <o base=".x" line="72" loc="Φ.org.eolang.takes-parent-through-attribute$@$@$@.φ.ρ" pos="14"> 
//       <o base="this" line="72" loc="Φ.org.eolang.takes-parent-through-attribute$@$@$@.φ.ρ.ρ" pos="10" ref="70.67.456"/>
//     </o>
//     <o base="org.eolang.int" data="int" line="73" loc="Φ.org.eolang.takes-parent-through-attribute$@$@$@.φ.α0" pos="10">42</o>
//   </o>
//   <o level="3" line="70.67.456" loc="Φ.org.eolang.takes-parent-through-attribute$@$@$@.this" name="this"/>
// </o>
@XmirObject(name = "ω3@", oname = "@", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω3φ extends PhDefault {
    
  public EOω3φ(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new PhMethod(new PhMethod(new PhMethod(new PhMethod(rho, "σ"), "σ"), "σ"), "this");
        ret_base_base = new PhLocated(ret_base_base, 72, 10, "Φ.org.eolang.takes-parent-through-attribute$@$@$@.φ.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "x");
        ret_base = new PhLocated(ret_base, 72, 14, "Φ.org.eolang.takes-parent-through-attribute$@$@$@.φ.ρ");
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 71, 8, "Φ.org.eolang.takes-parent-through-attribute$@$@$@.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 73, 10, "Φ.org.eolang.takes-parent-through-attribute$@$@$@.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(42L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }
}
}
}
}
