
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="386" loc="Φ.org.eolang.moves-copy-to-new-parent" name="moves-copy-to-new-parent" original-name="moves-copy-to-new-parent" pos="0"> 
//   <o base=".eq" line="387" loc="Φ.org.eolang.moves-copy-to-new-parent.φ" name="@" pos="2"> 
//     <o base="app" cut="11" line="388" loc="Φ.org.eolang.moves-copy-to-new-parent.φ.ρ" ref="388"/>
//     <o base="org.eolang.int" data="int" line="398" loc="Φ.org.eolang.moves-copy-to-new-parent.φ.α0" pos="4">66</o>
//   </o>
//   <o base="moves-copy-to-new-parent$app" cut="575" line="388" loc="Φ.org.eolang.moves-copy-to-new-parent.app" name="app" pos="4" ref="388"/>
// </o>
@XmirObject(name = "moves-copy-to-new-parentTest", oname = "moves-copy-to-new-parent", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOmoves_copy_to_new_parentTest extends PhDefault {
    
  public EOmoves_copy_to_new_parentTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "app");
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 387, 2, "Φ.org.eolang.moves-copy-to-new-parent.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 398, 4, "Φ.org.eolang.moves-copy-to-new-parent.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(66L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("app", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω1app(rho);
        ret = new PhLocated(ret, 388, 4, "Φ.org.eolang.moves-copy-to-new-parent.app");
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOmoves_copy_to_new_parentTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="388" loc="Φ.org.eolang.moves-copy-to-new-parent$app" name="moves-copy-to-new-parent$app" original-name="app" parent="moves-copy-to-new-parent" pos="4"> 
//   <o base="moves-copy-to-new-parent$app$@" cut="575" line="389" loc="Φ.org.eolang.moves-copy-to-new-parent$app.φ" name="@" pos="6" ref="389"> 
//     <o as="foo" base="foo" level="1" loc="Φ.org.eolang.moves-copy-to-new-parent$app.φ.α0" ref="394"/>
//   </o>
//   <o base="moves-copy-to-new-parent$app$foo" cut="580" line="394" loc="Φ.org.eolang.moves-copy-to-new-parent$app.foo" name="foo" pos="6" ref="394"/>
// </o>
@XmirObject(name = "ω1app", oname = "app", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω1app extends PhDefault {
    
  public EOω1app(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω2φ(rho);
        ret = new PhLocated(ret, 389, 6, "Φ.org.eolang.moves-copy-to-new-parent$app.φ");
      return ret;
    })));
    this.add("foo", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω2foo(rho);
        ret = new PhLocated(ret, 394, 6, "Φ.org.eolang.moves-copy-to-new-parent$app.foo");
      return ret;
    })));
  }

// <o abstract="" ancestors="2" line="389" loc="Φ.org.eolang.moves-copy-to-new-parent$app$@" name="moves-copy-to-new-parent$app$@" original-name="@" parent="moves-copy-to-new-parent$app" pos="6"> 
//   <o base="org.eolang.int" data="int" line="390" loc="Φ.org.eolang.moves-copy-to-new-parent$app$@.x" name="x" pos="8">42</o>
//   <o base="foo" line="391" loc="Φ.org.eolang.moves-copy-to-new-parent$app$@.φ" name="@" pos="8" ref="389.394.456"> 
//     <o as="^" base="$" line="392" loc="Φ.org.eolang.moves-copy-to-new-parent$app$@.φ.α0" pos="10"/>
//     <o as="h" base="org.eolang.int" data="int" line="393" loc="Φ.org.eolang.moves-copy-to-new-parent$app$@.φ.α1" pos="10">24</o>
//   </o>
//   <o level="1" line="389.394.456" loc="Φ.org.eolang.moves-copy-to-new-parent$app$@.foo" name="foo"/>
// </o>
@XmirObject(name = "ω2@", oname = "@", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω2φ extends PhDefault {
    
  public EOω2φ(final Phi sigma) {
    super(sigma);
    this.add("x", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOorg.EOeolang.EOint(Phi.Φ);
        ret = new PhLocated(ret, 390, 8, "Φ.org.eolang.moves-copy-to-new-parent$app$@.x");
        ret = new PhWith(ret, "Δ", new Data.Value<>(42L));
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(new PhMethod(rho, "σ"), "foo");
        ret = new PhLocated(ret, 391, 8, "Φ.org.eolang.moves-copy-to-new-parent$app$@.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = rho;
          ret_1 = new PhLocated(ret_1, 392, 10, "Φ.org.eolang.moves-copy-to-new-parent$app$@.φ.α0");
        Phi ret_2 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_2 = new PhLocated(ret_2, 393, 10, "Φ.org.eolang.moves-copy-to-new-parent$app$@.φ.α1");
          ret_2 = new PhWith(ret_2, "Δ", new Data.Value<>(24L));
        ret = new PhWith(ret, "ρ", ret_1);
        ret = new PhWith(ret, "h", ret_2);
      return ret;
    })));
  }
}

// <o abstract="" ancestors="2" line="394" loc="Φ.org.eolang.moves-copy-to-new-parent$app$foo" name="moves-copy-to-new-parent$app$foo" original-name="foo" parent="moves-copy-to-new-parent$app" pos="6"> 
//   <o line="394" loc="Φ.org.eolang.moves-copy-to-new-parent$app$foo.h" name="h" pos="7"/>
//   <o base=".plus" line="395" loc="Φ.org.eolang.moves-copy-to-new-parent$app$foo.φ" name="@" pos="8"> 
//     <o base="h" line="396" loc="Φ.org.eolang.moves-copy-to-new-parent$app$foo.φ.ρ" pos="10" ref="394"/>
//     <o base=".x" line="397" loc="Φ.org.eolang.moves-copy-to-new-parent$app$foo.φ.α0" pos="11"> 
//       <o base="^" line="397" loc="Φ.org.eolang.moves-copy-to-new-parent$app$foo.φ.α0.ρ" pos="10"/>
//     </o>
//   </o>
// </o>
@XmirObject(name = "ω2foo", oname = "foo", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω2foo extends PhDefault {
    
  public EOω2foo(final Phi sigma) {
    super(sigma);
    this.add("h", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "h");
        ret_base = new PhLocated(ret_base, 396, 10, "Φ.org.eolang.moves-copy-to-new-parent$app$foo.φ.ρ");
      Phi ret = new PhMethod(ret_base, "plus");
        ret = new PhLocated(ret, 395, 8, "Φ.org.eolang.moves-copy-to-new-parent$app$foo.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(rho, "ρ");
          ret_1_base = new PhLocated(ret_1_base, 397, 10, "Φ.org.eolang.moves-copy-to-new-parent$app$foo.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "x");
          ret_1 = new PhLocated(ret_1, 397, 11, "Φ.org.eolang.moves-copy-to-new-parent$app$foo.φ.α0");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }
}
}
}
