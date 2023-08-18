
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOmath;

import org.eolang.*;

// <o abstract="" line="34" loc="Φ.org.eolang.math.number" name="number" original-name="number" pos="0"> 
//   <o line="34" loc="Φ.org.eolang.math.number.n" name="n" pos="1"/>
//   <o base="n" line="35" loc="Φ.org.eolang.math.number.φ" name="@" pos="2" ref="34"/>
//   <o base="number$is-int" cut="2" line="37" loc="Φ.org.eolang.math.number.is-int" name="is-int" pos="2" ref="37"/>
//   <o base="number$is-float" cut="20" line="53" loc="Φ.org.eolang.math.number.is-float" name="is-float" pos="2" ref="53"/>
//   <o base="number$is-nan" cut="38" line="69" loc="Φ.org.eolang.math.number.is-nan" name="is-nan" pos="2" ref="69"/>
//   <o base="number$is-infinite" cut="45" line="76" loc="Φ.org.eolang.math.number.is-infinite" name="is-infinite" pos="2" ref="76"/>
//   <o base="number$xor" cut="55" line="86" loc="Φ.org.eolang.math.number.xor" name="xor" pos="2" ref="86"> 
//     <o as="is-int" base="is-int" level="1" loc="Φ.org.eolang.math.number.xor.α0" ref="37"/>
//   </o>
//   <o base="number$or" cut="68" line="95" loc="Φ.org.eolang.math.number.or" name="or" pos="2" ref="95"> 
//     <o as="is-int" base="is-int" level="1" loc="Φ.org.eolang.math.number.or.α0" ref="37"/>
//   </o>
//   <o base="number$and" cut="81" line="104" loc="Φ.org.eolang.math.number.and" name="and" pos="2" ref="104"> 
//     <o as="is-int" base="is-int" level="1" loc="Φ.org.eolang.math.number.and.α0" ref="37"/>
//   </o>
//   <o base="number$left" cut="94" line="113" loc="Φ.org.eolang.math.number.left" name="left" pos="2" ref="113"> 
//     <o as="is-int" base="is-int" level="1" loc="Φ.org.eolang.math.number.left.α0" ref="37"/>
//   </o>
//   <o base="number$right" cut="106" line="123" loc="Φ.org.eolang.math.number.right" name="right" pos="2" ref="123"> 
//     <o as="is-int" base="is-int" level="1" loc="Φ.org.eolang.math.number.right.α0" ref="37"/>
//   </o>
//   <o base="number$neq" cut="118" line="133" loc="Φ.org.eolang.math.number.neq" name="neq" pos="2" ref="133"/>
//   <o base="number$mod" cut="127" line="137" loc="Φ.org.eolang.math.number.mod" name="mod" pos="2" ref="137"/>
//   <o base="number$abs" cut="159" line="159" loc="Φ.org.eolang.math.number.abs" name="abs" pos="2" ref="159"> 
//     <o as="is-int" base="is-int" level="1" loc="Φ.org.eolang.math.number.abs.α0" ref="37"/>
//   </o>
//   <o base="number$ceil" cut="178" line="173" loc="Φ.org.eolang.math.number.ceil" name="ceil" pos="2" ref="173"> 
//     <o as="is-int" base="is-int" level="1" loc="Φ.org.eolang.math.number.ceil.α0" ref="37"/>
//     <o as="is-nan" base="is-nan" level="1" loc="Φ.org.eolang.math.number.ceil.α1" ref="69"/>
//     <o as="as-int" base="as-int" level="1" loc="Φ.org.eolang.math.number.ceil.α2" ref="393"/>
//   </o>
//   <o atom="?" base="number$pow" cut="202" line="194" loc="Φ.org.eolang.math.number.pow" name="pow" pos="2" ref="194"/>
//   <o base="number$power" cut="204" line="197" loc="Φ.org.eolang.math.number.power" name="power" pos="2" ref="197"> 
//     <o as="n" base="n" level="1" loc="Φ.org.eolang.math.number.power.α0" ref="34"/>
//     <o as="is-int" base="is-int" level="1" loc="Φ.org.eolang.math.number.power.α1" ref="37"/>
//     <o as="is-nan" base="is-nan" level="1" loc="Φ.org.eolang.math.number.power.α2" ref="69"/>
//     <o as="is-infinite" base="is-infinite" level="1" loc="Φ.org.eolang.math.number.power.α3" ref="76"/>
//     <o as="as-float" base="as-float" level="1" loc="Φ.org.eolang.math.number.power.α4" ref="390"/>
//   </o>
//   <o base="number$sqrt" cut="389" line="337" loc="Φ.org.eolang.math.number.sqrt" name="sqrt" pos="2" ref="337"> 
//     <o as="n" base="n" level="1" loc="Φ.org.eolang.math.number.sqrt.α0" ref="34"/>
//     <o as="is-nan" base="is-nan" level="1" loc="Φ.org.eolang.math.number.sqrt.α1" ref="69"/>
//     <o as="as-float" base="as-float" level="1" loc="Φ.org.eolang.math.number.sqrt.α2" ref="390"/>
//   </o>
//   <o atom="float" base="number$as-float" cut="453" line="390" loc="Φ.org.eolang.math.number.as-float" name="as-float" pos="2" ref="390"/>
//   <o atom="int" base="number$as-int" cut="454" line="393" loc="Φ.org.eolang.math.number.as-int" name="as-int" pos="2" ref="393"/>
//   <o atom="string" base="number$as-string" cut="455" line="396" loc="Φ.org.eolang.math.number.as-string" name="as-string" pos="2" ref="396"/>
//   <o base="number$signum" cut="456" line="399" loc="Φ.org.eolang.math.number.signum" name="signum" pos="2" ref="399"> 
//     <o as="is-int" base="is-int" level="1" loc="Φ.org.eolang.math.number.signum.α0" ref="37"/>
//   </o>
//   <o base="number$exp" cut="485" line="419" loc="Φ.org.eolang.math.number.exp" name="exp" pos="2" ref="419"> 
//     <o as="n" base="n" level="1" loc="Φ.org.eolang.math.number.exp.α0" ref="34"/>
//     <o as="is-nan" base="is-nan" level="1" loc="Φ.org.eolang.math.number.exp.α1" ref="69"/>
//     <o as="as-float" base="as-float" level="1" loc="Φ.org.eolang.math.number.exp.α2" ref="390"/>
//   </o>
//   <o base="number$taylor" cut="536" line="464" loc="Φ.org.eolang.math.number.taylor" name="taylor" pos="2" ref="464"> 
//     <o as="is-nan" base="is-nan" level="1" loc="Φ.org.eolang.math.number.taylor.α0" ref="69"/>
//     <o as="is-infinite" base="is-infinite" level="1" loc="Φ.org.eolang.math.number.taylor.α1" ref="76"/>
//     <o as="power" base="power" level="1" loc="Φ.org.eolang.math.number.taylor.α2" ref="197"/>
//   </o>
//   <o base="number$log" cut="590" line="502" loc="Φ.org.eolang.math.number.log" name="log" pos="2" ref="502"> 
//     <o as="is-nan" base="is-nan" level="1" loc="Φ.org.eolang.math.number.log.α0" ref="69"/>
//     <o as="is-infinite" base="is-infinite" level="1" loc="Φ.org.eolang.math.number.log.α1" ref="76"/>
//     <o as="as-float" base="as-float" level="1" loc="Φ.org.eolang.math.number.log.α2" ref="390"/>
//   </o>
//   <o base="number$ln" cut="675" line="562" loc="Φ.org.eolang.math.number.ln" name="ln" pos="2" ref="562"> 
//     <o as="n" base="n" level="1" loc="Φ.org.eolang.math.number.ln.α0" ref="34"/>
//     <o as="is-nan" base="is-nan" level="1" loc="Φ.org.eolang.math.number.ln.α1" ref="69"/>
//     <o as="as-float" base="as-float" level="1" loc="Φ.org.eolang.math.number.ln.α2" ref="390"/>
//   </o>
//   <o base="number$arccos" cut="810" line="658" loc="Φ.org.eolang.math.number.arccos" name="arccos" pos="2" ref="658"> 
//     <o as="n" base="n" level="1" loc="Φ.org.eolang.math.number.arccos.α0" ref="34"/>
//   </o>
// </o>
@XmirObject(name = "number", oname = "number", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/math/number.eo")
public final class EOnumber extends PhDefault {
  public EOnumber(final Phi sigma) {
    super(sigma);
    this.add("n", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "n");
        ret = new PhLocated(ret, 35, 2, "Φ.org.eolang.math.number.φ");
      return ret;
    })));
    this.add("is-int", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOnumber$EOis_int(rho);
        ret = new PhLocated(ret, 37, 2, "Φ.org.eolang.math.number.is-int");
      return ret;
    })));
    this.add("is-float", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOnumber$EOis_float(rho);
        ret = new PhLocated(ret, 53, 2, "Φ.org.eolang.math.number.is-float");
      return ret;
    })));
    this.add("is-nan", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOnumber$EOis_nan(rho);
        ret = new PhLocated(ret, 69, 2, "Φ.org.eolang.math.number.is-nan");
      return ret;
    })));
    this.add("is-infinite", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOnumber$EOis_infinite(rho);
        ret = new PhLocated(ret, 76, 2, "Φ.org.eolang.math.number.is-infinite");
      return ret;
    })));
    this.add("xor", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOnumber$EOxor(rho);
        ret = new PhLocated(ret, 86, 2, "Φ.org.eolang.math.number.xor");
      return ret;
    })));
    this.add("or", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOnumber$EOor(rho);
        ret = new PhLocated(ret, 95, 2, "Φ.org.eolang.math.number.or");
      return ret;
    })));
    this.add("and", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOnumber$EOand(rho);
        ret = new PhLocated(ret, 104, 2, "Φ.org.eolang.math.number.and");
      return ret;
    })));
    this.add("left", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOnumber$EOleft(rho);
        ret = new PhLocated(ret, 113, 2, "Φ.org.eolang.math.number.left");
      return ret;
    })));
    this.add("right", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOnumber$EOright(rho);
        ret = new PhLocated(ret, 123, 2, "Φ.org.eolang.math.number.right");
      return ret;
    })));
    this.add("neq", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOnumber$EOneq(rho);
        ret = new PhLocated(ret, 133, 2, "Φ.org.eolang.math.number.neq");
      return ret;
    })));
    this.add("mod", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOnumber$EOmod(rho);
        ret = new PhLocated(ret, 137, 2, "Φ.org.eolang.math.number.mod");
      return ret;
    })));
    this.add("abs", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOnumber$EOabs(rho);
        ret = new PhLocated(ret, 159, 2, "Φ.org.eolang.math.number.abs");
      return ret;
    })));
    this.add("ceil", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOnumber$EOceil(rho);
        ret = new PhLocated(ret, 173, 2, "Φ.org.eolang.math.number.ceil");
      return ret;
    })));
    this.add("pow", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOnumber$EOpow(rho);
        ret = new PhLocated(ret, 194, 2, "Φ.org.eolang.math.number.pow");
      return ret;
    })));
    this.add("power", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOnumber$EOpower(rho);
        ret = new PhLocated(ret, 197, 2, "Φ.org.eolang.math.number.power");
      return ret;
    })));
    this.add("sqrt", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOnumber$EOsqrt(rho);
        ret = new PhLocated(ret, 337, 2, "Φ.org.eolang.math.number.sqrt");
      return ret;
    })));
    this.add("as-float", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOnumber$EOas_float(rho);
        ret = new PhLocated(ret, 390, 2, "Φ.org.eolang.math.number.as-float");
      return ret;
    })));
    this.add("as-int", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOnumber$EOas_int(rho);
        ret = new PhLocated(ret, 393, 2, "Φ.org.eolang.math.number.as-int");
      return ret;
    })));
    this.add("as-string", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOnumber$EOas_string(rho);
        ret = new PhLocated(ret, 396, 2, "Φ.org.eolang.math.number.as-string");
      return ret;
    })));
    this.add("signum", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOnumber$EOsignum(rho);
        ret = new PhLocated(ret, 399, 2, "Φ.org.eolang.math.number.signum");
      return ret;
    })));
    this.add("exp", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOnumber$EOexp(rho);
        ret = new PhLocated(ret, 419, 2, "Φ.org.eolang.math.number.exp");
      return ret;
    })));
    this.add("taylor", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOnumber$EOtaylor(rho);
        ret = new PhLocated(ret, 464, 2, "Φ.org.eolang.math.number.taylor");
      return ret;
    })));
    this.add("log", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOnumber$EOlog(rho);
        ret = new PhLocated(ret, 502, 2, "Φ.org.eolang.math.number.log");
      return ret;
    })));
    this.add("ln", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOnumber$EOln(rho);
        ret = new PhLocated(ret, 562, 2, "Φ.org.eolang.math.number.ln");
      return ret;
    })));
    this.add("arccos", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOnumber$EOarccos(rho);
        ret = new PhLocated(ret, 658, 2, "Φ.org.eolang.math.number.arccos");
      return ret;
    })));
  }
}
