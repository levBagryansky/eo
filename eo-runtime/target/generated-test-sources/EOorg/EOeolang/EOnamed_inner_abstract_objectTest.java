
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="232" loc="Φ.org.eolang.named-inner-abstract-object" name="named-inner-abstract-object" original-name="named-inner-abstract-object" pos="0"> 
//   <o base="named-inner-abstract-object$@" cut="360" line="233" loc="Φ.org.eolang.named-inner-abstract-object.φ" name="@" pos="2" ref="233"/>
// </o>
@XmirObject(name = "named-inner-abstract-objectTest", oname = "named-inner-abstract-object", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOnamed_inner_abstract_objectTest extends PhDefault {
  public EOnamed_inner_abstract_objectTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω1φ(rho);
        ret = new PhLocated(ret, 233, 2, "Φ.org.eolang.named-inner-abstract-object.φ");
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOnamed_inner_abstract_objectTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }

// <o abstract="" ancestors="1" line="233" loc="Φ.org.eolang.named-inner-abstract-object$@" name="named-inner-abstract-object$@" original-name="@" parent="named-inner-abstract-object" pos="2"> 
//   <o base="org.eolang.seq" line="234" loc="Φ.org.eolang.named-inner-abstract-object$@.φ" name="@" pos="4"> 
//     <o base="a" cut="1" line="235" loc="Φ.org.eolang.named-inner-abstract-object$@.φ.α0" ref="235"/>
//   </o>
//   <o base="named-inner-abstract-object$@$a" cut="362" line="235" loc="Φ.org.eolang.named-inner-abstract-object$@.a" name="a" pos="6" ref="235"/>
// </o>
@XmirObject(name = "ω1@", oname = "@", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω1φ extends PhDefault {
  public EOω1φ(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("seq").get();
        ret = new PhLocated(ret, 234, 4, "Φ.org.eolang.named-inner-abstract-object$@.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new PhMethod(rho, "a");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("a", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOω2a(rho);
        ret = new PhLocated(ret, 235, 6, "Φ.org.eolang.named-inner-abstract-object$@.a");
      return ret;
    })));
  }

// <o abstract="" ancestors="2" line="235" loc="Φ.org.eolang.named-inner-abstract-object$@$a" name="named-inner-abstract-object$@$a" original-name="a" parent="named-inner-abstract-object$@" pos="6"> 
//   <o base="org.eolang.bool" data="bool" line="236" loc="Φ.org.eolang.named-inner-abstract-object$@$a.φ" name="@" pos="8">TRUE</o>
// </o>
@XmirObject(name = "ω2a", oname = "a", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/runtime-tests.eo")
public final class EOω2a extends PhDefault {
  public EOω2a(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOorg.EOeolang.EObool(Phi.Φ);
        ret = new PhLocated(ret, 236, 8, "Φ.org.eolang.named-inner-abstract-object$@$a.φ");
        ret = new PhWith(ret, "Δ", new Data.Value<>(Boolean.TRUE));
      return ret;
    })));
  }
}
}
}