
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT e24f541 2023-09-12T11:41:32) on 2023-10-03T10:45:38.539230Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="56" loc="Φ.org.eolang.kids-are-accessible-in-const-object" name="kids-are-accessible-in-const-object" original-name="kids-are-accessible-in-const-object" pos="0"> 
//   <o base="kids-are-accessible-in-const-object$a" cut="30" line="57" loc="Φ.org.eolang.kids-are-accessible-in-const-object.a" name="a" pos="2" ref="57"/>
//   <o base="a" const="" line="60" loc="Φ.org.eolang.kids-are-accessible-in-const-object.b" name="b" pos="2" ref="57"/>
//   <o base=".eq" line="61" loc="Φ.org.eolang.kids-are-accessible-in-const-object.φ" name="@" pos="2"> 
//     <o base=".hello" line="62" loc="Φ.org.eolang.kids-are-accessible-in-const-object.φ.ρ" pos="5"> 
//       <o base="b" line="62" loc="Φ.org.eolang.kids-are-accessible-in-const-object.φ.ρ.ρ" pos="4" ref="60"/>
//     </o>
//     <o base="org.eolang.int" data="int" line="63" loc="Φ.org.eolang.kids-are-accessible-in-const-object.φ.α0" pos="4">42</o>
//   </o>
// </o>
@XmirObject(name = "kids-are-accessible-in-const-objectTest", oname = "kids-are-accessible-in-const-object", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOkids_are_accessible_in_const_objectTest extends PhDefault {
    
  public EOkids_are_accessible_in_const_objectTest() {
    this.add("a", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω1a(rho);
        ret = new PhLocated(ret, 57, 2, "Φ.org.eolang.kids-are-accessible-in-const-object.a");
      return ret;
    })));
    this.add("b", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "a");
        ret = new PhLocated(ret, 60, 2, "Φ.org.eolang.kids-are-accessible-in-const-object.b");
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new PhMethod(rho, "b");
        ret_base_base = new PhLocated(ret_base_base, 62, 4, "Φ.org.eolang.kids-are-accessible-in-const-object.φ.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "hello");
        ret_base = new PhLocated(ret_base, 62, 5, "Φ.org.eolang.kids-are-accessible-in-const-object.φ.ρ");
      Phi ret = new PhMethod(ret_base, "eq");
        ret = new PhLocated(ret, 61, 2, "Φ.org.eolang.kids-are-accessible-in-const-object.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 63, 4, "Φ.org.eolang.kids-are-accessible-in-const-object.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(42L));
        ret = new PhWith(ret, 0, ret_1);
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

// <o abstract="" ancestors="1" line="57" loc="Φ.org.eolang.kids-are-accessible-in-const-object$a" name="kids-are-accessible-in-const-object$a" original-name="a" parent="kids-are-accessible-in-const-object" pos="2"> 
//   <o base="kids-are-accessible-in-const-object$a$hello" cut="30" line="58" loc="Φ.org.eolang.kids-are-accessible-in-const-object$a.hello" name="hello" pos="4" ref="58"/>
// </o>
@XmirObject(name = "ω1a", oname = "a", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω1a extends PhDefault {
    
  public EOω1a(final Phi sigma) {
    super(sigma);
    this.add("hello", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω2hello(rho);
        ret = new PhLocated(ret, 58, 4, "Φ.org.eolang.kids-are-accessible-in-const-object$a.hello");
      return ret;
    })));
  }

// <o abstract="" ancestors="2" line="58" loc="Φ.org.eolang.kids-are-accessible-in-const-object$a$hello" name="kids-are-accessible-in-const-object$a$hello" original-name="hello" parent="kids-are-accessible-in-const-object$a" pos="4"> 
//   <o base="org.eolang.int" data="int" line="59" loc="Φ.org.eolang.kids-are-accessible-in-const-object$a$hello.φ" name="@" pos="6">42</o>
// </o>
@XmirObject(name = "ω2hello", oname = "hello", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω2hello extends PhDefault {
    
  public EOω2hello(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOorg.EOeolang.EOint(Phi.Φ);
        ret = new PhLocated(ret, 59, 6, "Φ.org.eolang.kids-are-accessible-in-const-object$a$hello.φ");
        ret = new PhWith(ret, "Δ", new Data.Value<>(42L));
      return ret;
    })));
  }
}
}
}
