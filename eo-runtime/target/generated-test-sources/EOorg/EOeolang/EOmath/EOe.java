
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOmath;

import org.eolang.*;

// <o abstract="" line="29" loc="Φ.org.eolang.math.e" name="e" original-name="e" pos="0"> 
//   <o base="org.eolang.float" data="float" line="30" loc="Φ.org.eolang.math.e.φ" name="@" pos="2">2.718281828459045</o>
// </o>
@XmirObject(name = "e", oname = "e", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/math/e.eo")
public final class EOe extends PhDefault {
  public EOe(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOorg.EOeolang.EOfloat(Phi.Φ);
        ret = new PhLocated(ret, 30, 2, "Φ.org.eolang.math.e.φ");
        ret = new PhWith(ret, "Δ", new Data.Value<>(2.718281828459045d));
      return ret;
    })));
  }
}
