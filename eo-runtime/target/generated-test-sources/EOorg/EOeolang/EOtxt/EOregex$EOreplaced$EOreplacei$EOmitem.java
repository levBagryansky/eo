
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOtxt;

import org.eolang.*;

// <o abstract="" ancestors="3" line="103" loc="Φ.org.eolang.txt.regex$replaced$replacei$mitem" name="regex$replaced$replacei$mitem" original-name="mitem" parent="regex$replaced$replacei" pos="6"> 
//   <o base=".at" const="" line="104" loc="Φ.org.eolang.txt.regex$replaced$replacei$mitem.φ" name="@" pos="9"> 
//     <o base="m" line="104" loc="Φ.org.eolang.txt.regex$replaced$replacei$mitem.φ.ρ" pos="8" ref="103.68.474"/>
//     <o base="org.eolang.int" data="int" line="104" loc="Φ.org.eolang.txt.regex$replaced$replacei$mitem.φ.α0" pos="13">0</o>
//   </o>
//   <o level="1" line="103.68.474" loc="Φ.org.eolang.txt.regex$replaced$replacei$mitem.m" name="m"/>
//   <o level="2" line="103.62.474" loc="Φ.org.eolang.txt.regex$replaced$replacei$mitem.txt" name="txt"/>
//   <o level="2" line="103.62.474" loc="Φ.org.eolang.txt.regex$replaced$replacei$mitem.rpl" name="rpl"/>
//   <o level="3" line="103.47.474" loc="Φ.org.eolang.txt.regex$replaced$replacei$mitem.match" name="match"/>
// </o>
@XmirObject(name = "regex$replaced$replacei$mitem", oname = "mitem", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/txt/regex.eo")
public final class EOregex$EOreplaced$EOreplacei$EOmitem extends PhDefault {
  public EOregex$EOreplaced$EOreplacei$EOmitem(final Phi sigma) {
    super(sigma);
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = new PhMethod(new PhMethod(rho, "σ"), "m");
        ret_base = new PhLocated(ret_base, 104, 8, "Φ.org.eolang.txt.regex$replaced$replacei$mitem.φ.ρ");
      Phi ret = new PhMethod(ret_base, "at");
        ret = new PhLocated(ret, 104, 9, "Φ.org.eolang.txt.regex$replaced$replacei$mitem.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 104, 13, "Φ.org.eolang.txt.regex$replaced$replacei$mitem.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(0L));
        ret = new PhWith(ret, 0, ret_1);
      ret = new PhConst(ret);
      return ret;
    })));
  }
}
