
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="61" loc="Φ.org.eolang.kids-are-accessible-in-const-object" name="kids-are-accessible-in-const-object" original-name="kids-are-accessible-in-const-object" pos="0"> 
//   <o base="kids-are-accessible-in-const-object$a" cut="39" line="62" loc="Φ.org.eolang.kids-are-accessible-in-const-object.a" name="a" pos="2" ref="62"/>
//   <o base="a" const="" line="65" loc="Φ.org.eolang.kids-are-accessible-in-const-object.b" name="b" pos="2" ref="62"/>
//   <o base="org.eolang.hamcrest.assert-that" line="66" loc="Φ.org.eolang.kids-are-accessible-in-const-object.φ" name="@" pos="2"> 
//     <o base=".hello" line="67" loc="Φ.org.eolang.kids-are-accessible-in-const-object.φ.α0" pos="5"> 
//       <o base="b" line="67" loc="Φ.org.eolang.kids-are-accessible-in-const-object.φ.α0.ρ" pos="4" ref="65"/>
//     </o>
//     <o base=".equal-to" line="68" loc="Φ.org.eolang.kids-are-accessible-in-const-object.φ.α1" pos="5"> 
//       <o base="$" line="68" loc="Φ.org.eolang.kids-are-accessible-in-const-object.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.int" data="int" line="68" loc="Φ.org.eolang.kids-are-accessible-in-const-object.φ.α1.α0" pos="15">42</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "kids-are-accessible-in-const-objectTest", oname = "kids-are-accessible-in-const-object", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOkids_are_accessible_in_const_objectTest extends PhDefault {
  public EOkids_are_accessible_in_const_objectTest() {
    this.add("a", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω1a(rho);
        ret = new PhLocated(ret, 62, 2, "Φ.org.eolang.kids-are-accessible-in-const-object.a");
      return ret;
    })));
    this.add("b", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "a");
        ret = new PhLocated(ret, 65, 2, "Φ.org.eolang.kids-are-accessible-in-const-object.b");
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 66, 2, "Φ.org.eolang.kids-are-accessible-in-const-object.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(rho, "b");
          ret_1_base = new PhLocated(ret_1_base, 67, 4, "Φ.org.eolang.kids-are-accessible-in-const-object.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "hello");
          ret_1 = new PhLocated(ret_1, 67, 5, "Φ.org.eolang.kids-are-accessible-in-const-object.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 68, 4, "Φ.org.eolang.kids-are-accessible-in-const-object.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 68, 5, "Φ.org.eolang.kids-are-accessible-in-const-object.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 68, 15, "Φ.org.eolang.kids-are-accessible-in-const-object.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(42L));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOkids_are_accessible_in_const_objectTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="62" loc="Φ.org.eolang.kids-are-accessible-in-const-object$a" name="kids-are-accessible-in-const-object$a" original-name="a" parent="kids-are-accessible-in-const-object" pos="2"> 
//   <o base="kids-are-accessible-in-const-object$a$hello" cut="39" line="63" loc="Φ.org.eolang.kids-are-accessible-in-const-object$a.hello" name="hello" pos="4" ref="63"/>
// </o>
@XmirObject(name = "ω1a", oname = "a", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω1a extends PhDefault {
  public EOω1a(final Phi sigma) {
    super(sigma);
    this.add("hello", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω2hello(rho);
        ret = new PhLocated(ret, 63, 4, "Φ.org.eolang.kids-are-accessible-in-const-object$a.hello");
      return ret;
    })));
  }

// <o abstract="" ancestors="2" line="63" loc="Φ.org.eolang.kids-are-accessible-in-const-object$a$hello" name="kids-are-accessible-in-const-object$a$hello" original-name="hello" parent="kids-are-accessible-in-const-object$a" pos="4"> 
//   <o base="org.eolang.int" data="int" line="64" loc="Φ.org.eolang.kids-are-accessible-in-const-object$a$hello.φ" name="@" pos="6">42</o>
// </o>
@XmirObject(name = "ω2hello", oname = "hello", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω2hello extends PhDefault {
  public EOω2hello(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOorg.EOeolang.EOint(Phi.Φ);
        ret = new PhLocated(ret, 64, 6, "Φ.org.eolang.kids-are-accessible-in-const-object$a$hello.φ");
        ret = new PhWith(ret, "Δ", new Data.Value<>(42L));
      return ret;
    })));
  }
}
}
}