
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="30" loc="Φ.org.eolang.x" name="x" original-name="x" pos="0"> 
//   <o base="org.eolang.bool" data="bool" line="31" loc="Φ.org.eolang.x.φ" name="@" pos="2">TRUE</o>
// </o>
@XmirObject(name = "xTest", oname = "x", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/unit-tests.eo")
public final class EOxTest extends PhDefault {
  public EOxTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOorg.EOeolang.EObool(Phi.Φ);
        ret = new PhLocated(ret, 31, 2, "Φ.org.eolang.x.φ");
        ret = new PhWith(ret, "Δ", new Data.Value<>(Boolean.TRUE));
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOxTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
