
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOtxt;

import org.eolang.*;

// <o abstract="" ancestors="2" line="160" loc="Φ.org.eolang.txt.text$index-of$t2$a2" name="text$index-of$t2$a2" parent="text$index-of" pos="6"> 
//   <o line="160" loc="Φ.org.eolang.txt.text$index-of$t2$a2.a" name="a" pos="7"/>
//   <o line="160" loc="Φ.org.eolang.txt.text$index-of$t2$a2.i" name="i" pos="9"/>
//   <o line="160" loc="Φ.org.eolang.txt.text$index-of$t2$a2.x" name="x" pos="11"/>
//   <o base="check-if-starts-from-index" const="" line="161" loc="Φ.org.eolang.txt.text$index-of$t2$a2.res" name="res" pos="8" ref="160.175.497"> 
//     <o base="s" line="162" loc="Φ.org.eolang.txt.text$index-of$t2$a2.res.α0" pos="10" ref="160.32.497"/>
//     <o base="substr" line="163" loc="Φ.org.eolang.txt.text$index-of$t2$a2.res.α1" pos="10" ref="160.152.497"/>
//     <o base="i" line="164" loc="Φ.org.eolang.txt.text$index-of$t2$a2.res.α2" pos="10" ref="160"/>
//   </o>
//   <o base=".if" line="165" loc="Φ.org.eolang.txt.text$index-of$t2$a2.φ" name="@" pos="8"> 
//     <o base=".eq" line="166" loc="Φ.org.eolang.txt.text$index-of$t2$a2.φ.ρ" pos="10"> 
//       <o base="a" line="167" loc="Φ.org.eolang.txt.text$index-of$t2$a2.φ.ρ.ρ" pos="12" ref="160"/>
//       <o base="org.eolang.int" data="int" line="168" loc="Φ.org.eolang.txt.text$index-of$t2$a2.φ.ρ.α0" pos="12">-1</o>
//     </o>
//     <o base=".if" line="169" loc="Φ.org.eolang.txt.text$index-of$t2$a2.φ.α0" pos="10"> 
//       <o base="res" line="170" loc="Φ.org.eolang.txt.text$index-of$t2$a2.φ.α0.ρ" pos="12" ref="161"/>
//       <o base="i" line="171" loc="Φ.org.eolang.txt.text$index-of$t2$a2.φ.α0.α0" pos="12" ref="160"/>
//       <o base="a" line="172" loc="Φ.org.eolang.txt.text$index-of$t2$a2.φ.α0.α1" pos="12" ref="160"/>
//     </o>
//     <o base="a" line="173" loc="Φ.org.eolang.txt.text$index-of$t2$a2.φ.α1" pos="10" ref="160"/>
//   </o>
//   <o level="1" line="160.152.497" loc="Φ.org.eolang.txt.text$index-of$t2$a2.substr" name="substr"/>
//   <o level="1" line="160.175.497" loc="Φ.org.eolang.txt.text$index-of$t2$a2.check-if-starts-from-index" name="check-if-starts-from-index"/>
//   <o level="2" line="160.32.497" loc="Φ.org.eolang.txt.text$index-of$t2$a2.s" name="s"/>
// </o>
@XmirObject(name = "text$index-of$t2$a2", oname = "text$index-of$t2$a2", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/txt/text.eo")
public final class EOtext$EOindex_of$EOt2$EOa2 extends PhDefault {
  public EOtext$EOindex_of$EOt2$EOa2(final Phi sigma) {
    super(sigma);
    this.add("a", new AtFree(/* default */));
    this.add("i", new AtFree(/* default */));
    this.add("x", new AtFree(/* default */));
    this.add("res", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(new PhMethod(rho, "σ"), "check-if-starts-from-index");
        ret = new PhLocated(ret, 161, 8, "Φ.org.eolang.txt.text$index-of$t2$a2.res");
      ret = new PhCopy(ret);
        Phi ret_1 = new PhMethod(new PhMethod(new PhMethod(rho, "σ"), "σ"), "s");
          ret_1 = new PhLocated(ret_1, 162, 10, "Φ.org.eolang.txt.text$index-of$t2$a2.res.α0");
        Phi ret_2 = new PhMethod(new PhMethod(rho, "σ"), "substr");
          ret_2 = new PhLocated(ret_2, 163, 10, "Φ.org.eolang.txt.text$index-of$t2$a2.res.α1");
        Phi ret_3 = new PhMethod(rho, "i");
          ret_3 = new PhLocated(ret_3, 164, 10, "Φ.org.eolang.txt.text$index-of$t2$a2.res.α2");
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
        ret = new PhWith(ret, 2, ret_3);
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new PhMethod(rho, "a");
        ret_base_base = new PhLocated(ret_base_base, 167, 12, "Φ.org.eolang.txt.text$index-of$t2$a2.φ.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "eq");
        ret_base = new PhLocated(ret_base, 166, 10, "Φ.org.eolang.txt.text$index-of$t2$a2.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_base_1 = new PhLocated(ret_base_1, 168, 12, "Φ.org.eolang.txt.text$index-of$t2$a2.φ.ρ.α0");
          ret_base_1 = new PhWith(ret_base_1, "Δ", new Data.Value<>(-1L));
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "if");
        ret = new PhLocated(ret, 165, 8, "Φ.org.eolang.txt.text$index-of$t2$a2.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(rho, "res");
          ret_1_base = new PhLocated(ret_1_base, 170, 12, "Φ.org.eolang.txt.text$index-of$t2$a2.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "if");
          ret_1 = new PhLocated(ret_1, 169, 10, "Φ.org.eolang.txt.text$index-of$t2$a2.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new PhMethod(rho, "i");
            ret_1_1 = new PhLocated(ret_1_1, 171, 12, "Φ.org.eolang.txt.text$index-of$t2$a2.φ.α0.α0");
          Phi ret_1_2 = new PhMethod(rho, "a");
            ret_1_2 = new PhLocated(ret_1_2, 172, 12, "Φ.org.eolang.txt.text$index-of$t2$a2.φ.α0.α1");
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
          ret_1 = new PhWith(ret_1, 1, ret_1_2);
        Phi ret_2 = new PhMethod(rho, "a");
          ret_2 = new PhLocated(ret_2, 173, 10, "Φ.org.eolang.txt.text$index-of$t2$a2.φ.α1");
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }
}
