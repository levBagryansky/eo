
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="419" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified" name="correctly-handles-same-name-attrs-simplified" original-name="correctly-handles-same-name-attrs-simplified" pos="0"> 
//   <o base="correctly-handles-same-name-attrs-simplified$calc" cut="628" line="420" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified.calc" name="calc" pos="2" ref="420"/>
//   <o base=".eq" line="424" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified.φ" name="@" pos="2"> 
//     <o base="calc" line="425" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified.φ.ρ" pos="4" ref="420"> 
//       <o base="correctly-handles-same-name-attrs-simplified$t1$t0$a0" cut="634" line="426" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified.φ.ρ.α0" pos="6" ref="426"/>
//       <o base="correctly-handles-same-name-attrs-simplified$t1$t0$a1" cut="640" line="430" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified.φ.ρ.α1" pos="6" ref="430"/>
//     </o>
//     <o base="org.eolang.int" data="int" line="434" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified.φ.α0" pos="4">3</o>
//   </o>
// </o>
@XmirObject(name = "correctly-handles-same-name-attrs-simplifiedTest", oname = "correctly-handles-same-name-attrs-simplified", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOcorrectly_handles_same_name_attrs_simplifiedTest extends PhDefault {
    
  public EOcorrectly_handles_same_name_attrs_simplifiedTest() {
    this.add("calc", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω1calc(rho);
        ret = new PhLocated(ret, 420, 2, "Φ.org.eolang.correctly-handles-same-name-attrs-simplified.calc");
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "calc");
        ret_base = new PhLocated(ret_base, 425, 4, "Φ.org.eolang.correctly-handles-same-name-attrs-simplified.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new EOω1t1$EOt0$EOa0(rho);
          ret_base_1 = new PhLocated(ret_base_1, 426, 6, "Φ.org.eolang.correctly-handles-same-name-attrs-simplified.φ.ρ.α0");
        Phi ret_base_2 = new EOω1t1$EOt0$EOa1(rho);
          ret_base_2 = new PhLocated(ret_base_2, 430, 6, "Φ.org.eolang.correctly-handles-same-name-attrs-simplified.φ.ρ.α1");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
        ret_base = new PhWith(ret_base, 1, ret_base_2);
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 424, 2, "Φ.org.eolang.correctly-handles-same-name-attrs-simplified.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 434, 4, "Φ.org.eolang.correctly-handles-same-name-attrs-simplified.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(3L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOcorrectly_handles_same_name_attrs_simplifiedTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="420" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified$calc" name="correctly-handles-same-name-attrs-simplified$calc" original-name="calc" parent="correctly-handles-same-name-attrs-simplified" pos="2"> 
//   <o line="420" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified$calc.first" name="first" pos="3"/>
//   <o line="420" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified$calc.second" name="second" pos="9"/>
//   <o base=".plus" line="421" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified$calc.φ" name="@" pos="4"> 
//     <o base="first" line="422" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified$calc.φ.ρ" pos="6" ref="420"/>
//     <o base="second" line="423" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified$calc.φ.α0" pos="6" ref="420"/>
//   </o>
// </o>
@XmirObject(name = "ω1calc", oname = "calc", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω1calc extends PhDefault {
    
  public EOω1calc(final Phi sigma) {
    super(sigma);
    this.add("first", new AtFree(/* default */));
    this.add("second", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(rho, "first");
        ret_base = new PhLocated(ret_base, 422, 6, "Φ.org.eolang.correctly-handles-same-name-attrs-simplified$calc.φ.ρ");
      Phi ret = new PhMethod(ret_base, "plus");
        ret = new PhLocated(ret, 421, 4, "Φ.org.eolang.correctly-handles-same-name-attrs-simplified$calc.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new PhMethod(rho, "second");
          ret_1 = new PhLocated(ret_1, 423, 6, "Φ.org.eolang.correctly-handles-same-name-attrs-simplified$calc.φ.α0");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
  }
}

// <o abstract="" ancestors="1" line="426" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified$t1$t0$a0" name="correctly-handles-same-name-attrs-simplified$t1$t0$a0" parent="correctly-handles-same-name-attrs-simplified" pos="6"> 
//   <o base="build" line="427" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified$t1$t0$a0.φ" name="@" pos="8" ref="428"> 
//     <o base="org.eolang.int" data="int" line="427" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified$t1$t0$a0.φ.α0" pos="14">1</o>
//   </o>
//   <o base="correctly-handles-same-name-attrs-simplified$t1$t0$a0$build" cut="636" line="428" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified$t1$t0$a0.build" name="build" pos="8" ref="428"/>
// </o>
@XmirObject(name = "ω1t1$t0$a0", oname = "ω1t1$t0$a0", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω1t1$EOt0$EOa0 extends PhDefault {
    
  public EOω1t1$EOt0$EOa0(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "build");
        ret = new PhLocated(ret, 427, 8, "Φ.org.eolang.correctly-handles-same-name-attrs-simplified$t1$t0$a0.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 427, 14, "Φ.org.eolang.correctly-handles-same-name-attrs-simplified$t1$t0$a0.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(1L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("build", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω2build(rho);
        ret = new PhLocated(ret, 428, 8, "Φ.org.eolang.correctly-handles-same-name-attrs-simplified$t1$t0$a0.build");
      return ret;
    })));
  }

// <o abstract="" ancestors="2" line="428" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified$t1$t0$a0$build" name="correctly-handles-same-name-attrs-simplified$t1$t0$a0$build" original-name="build" parent="correctly-handles-same-name-attrs-simplified$t1$t0$a0" pos="8"> 
//   <o line="428" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified$t1$t0$a0$build.x" name="x" pos="9"/>
//   <o base="x" line="429" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified$t1$t0$a0$build.φ" name="@" pos="10" ref="428"/>
// </o>
@XmirObject(name = "ω2build", oname = "build", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω2build extends PhDefault {
    
  public EOω2build(final Phi sigma) {
    super(sigma);
    this.add("x", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "x");
        ret = new PhLocated(ret, 429, 10, "Φ.org.eolang.correctly-handles-same-name-attrs-simplified$t1$t0$a0$build.φ");
      return ret;
    })));
  }
}
}

// <o abstract="" ancestors="1" line="430" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified$t1$t0$a1" name="correctly-handles-same-name-attrs-simplified$t1$t0$a1" parent="correctly-handles-same-name-attrs-simplified" pos="6"> 
//   <o base="build" line="431" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified$t1$t0$a1.φ" name="@" pos="8" ref="432"> 
//     <o base="org.eolang.int" data="int" line="431" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified$t1$t0$a1.φ.α0" pos="14">2</o>
//   </o>
//   <o base="correctly-handles-same-name-attrs-simplified$t1$t0$a1$build" cut="642" line="432" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified$t1$t0$a1.build" name="build" pos="8" ref="432"/>
// </o>
@XmirObject(name = "ω1t1$t0$a1", oname = "ω1t1$t0$a1", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω1t1$EOt0$EOa1 extends PhDefault {
    
  public EOω1t1$EOt0$EOa1(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "build");
        ret = new PhLocated(ret, 431, 8, "Φ.org.eolang.correctly-handles-same-name-attrs-simplified$t1$t0$a1.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 431, 14, "Φ.org.eolang.correctly-handles-same-name-attrs-simplified$t1$t0$a1.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(2L));
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("build", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω2build(rho);
        ret = new PhLocated(ret, 432, 8, "Φ.org.eolang.correctly-handles-same-name-attrs-simplified$t1$t0$a1.build");
      return ret;
    })));
  }

// <o abstract="" ancestors="2" line="432" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified$t1$t0$a1$build" name="correctly-handles-same-name-attrs-simplified$t1$t0$a1$build" original-name="build" parent="correctly-handles-same-name-attrs-simplified$t1$t0$a1" pos="8"> 
//   <o line="432" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified$t1$t0$a1$build.y" name="y" pos="9"/>
//   <o base="y" line="433" loc="Φ.org.eolang.correctly-handles-same-name-attrs-simplified$t1$t0$a1$build.φ" name="@" pos="10" ref="432"/>
// </o>
@XmirObject(name = "ω2build", oname = "build", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω2build extends PhDefault {
    
  public EOω2build(final Phi sigma) {
    super(sigma);
    this.add("y", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "y");
        ret = new PhLocated(ret, 433, 10, "Φ.org.eolang.correctly-handles-same-name-attrs-simplified$t1$t0$a1$build.φ");
      return ret;
    })));
  }
}
}
}
