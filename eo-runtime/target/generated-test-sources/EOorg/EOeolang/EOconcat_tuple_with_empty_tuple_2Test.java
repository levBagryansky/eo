
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="121" loc="Φ.org.eolang.concat-tuple-with-empty-tuple-2" name="concat-tuple-with-empty-tuple-2" original-name="concat-tuple-with-empty-tuple-2" pos="0"> 
//   <o base="org.eolang.tuple" data="tuple" line="122" loc="Φ.org.eolang.concat-tuple-with-empty-tuple-2.a" name="a" pos="2"/>
//   <o base="org.eolang.tuple" data="tuple" line="123" loc="Φ.org.eolang.concat-tuple-with-empty-tuple-2.b" name="b" pos="2"> 
//     <o base="org.eolang.int" data="int" line="123" loc="Φ.org.eolang.concat-tuple-with-empty-tuple-2.b.α0" pos="4">1</o>
//     <o base="org.eolang.int" data="int" line="123" loc="Φ.org.eolang.concat-tuple-with-empty-tuple-2.b.α1" pos="6">2</o>
//     <o base="org.eolang.int" data="int" line="123" loc="Φ.org.eolang.concat-tuple-with-empty-tuple-2.b.α2" pos="8">3</o>
//   </o>
//   <o base=".concat" line="124" loc="Φ.org.eolang.concat-tuple-with-empty-tuple-2.res" name="res" pos="2"> 
//     <o base="org.eolang.collections.list" line="125" loc="Φ.org.eolang.concat-tuple-with-empty-tuple-2.res.ρ" pos="4"> 
//       <o base="a" line="125" loc="Φ.org.eolang.concat-tuple-with-empty-tuple-2.res.ρ.α0" pos="9" ref="122"/>
//     </o>
//     <o base="b" line="126" loc="Φ.org.eolang.concat-tuple-with-empty-tuple-2.res.α0" pos="4" ref="123"/>
//   </o>
//   <o base="org.eolang.hamcrest.assert-that" line="127" loc="Φ.org.eolang.concat-tuple-with-empty-tuple-2.φ" name="@" pos="2"> 
//     <o base=".length" line="128" loc="Φ.org.eolang.concat-tuple-with-empty-tuple-2.φ.α0" pos="7"> 
//       <o base="res" line="128" loc="Φ.org.eolang.concat-tuple-with-empty-tuple-2.φ.α0.ρ" pos="4" ref="124"/>
//     </o>
//     <o base=".equal-to" line="129" loc="Φ.org.eolang.concat-tuple-with-empty-tuple-2.φ.α1" pos="5"> 
//       <o base="$" line="129" loc="Φ.org.eolang.concat-tuple-with-empty-tuple-2.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.int" data="int" line="129" loc="Φ.org.eolang.concat-tuple-with-empty-tuple-2.φ.α1.α0" pos="15">3</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "concat-tuple-with-empty-tuple-2Test", oname = "concat-tuple-with-empty-tuple-2", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/tuple-tests.eo")
public final class EOconcat_tuple_with_empty_tuple_2Test extends PhDefault {
  public EOconcat_tuple_with_empty_tuple_2Test() {
    this.add("a", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("tuple").get();
        ret = new PhLocated(ret, 122, 2, "Φ.org.eolang.concat-tuple-with-empty-tuple-2.a");
        Phi[] ret_a = new Phi[0];
        ret = new PhWith(new PhCopy(ret), "Δ", new Data.Value<Phi[]>(ret_a));
      return ret;
    })));
    this.add("b", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("tuple").get();
        ret = new PhLocated(ret, 123, 2, "Φ.org.eolang.concat-tuple-with-empty-tuple-2.b");
        Phi[] ret_a = new Phi[3];
        Phi ret_a0 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_a0 = new PhLocated(ret_a0, 123, 4, "Φ.org.eolang.concat-tuple-with-empty-tuple-2.b.α0");
          ret_a0 = new PhWith(ret_a0, "Δ", new Data.Value<>(1L));
        ret_a[0] = ret_a0;
        Phi ret_a1 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_a1 = new PhLocated(ret_a1, 123, 6, "Φ.org.eolang.concat-tuple-with-empty-tuple-2.b.α1");
          ret_a1 = new PhWith(ret_a1, "Δ", new Data.Value<>(2L));
        ret_a[1] = ret_a1;
        Phi ret_a2 = new EOorg.EOeolang.EOint(Phi.Φ);
          ret_a2 = new PhLocated(ret_a2, 123, 8, "Φ.org.eolang.concat-tuple-with-empty-tuple-2.b.α2");
          ret_a2 = new PhWith(ret_a2, "Δ", new Data.Value<>(3L));
        ret_a[2] = ret_a2;
        ret = new PhWith(new PhCopy(ret), "Δ", new Data.Value<Phi[]>(ret_a));
      return ret;
    })));
    this.add("res", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("collections").get().attr("list").get();
        ret_base = new PhLocated(ret_base, 125, 4, "Φ.org.eolang.concat-tuple-with-empty-tuple-2.res.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new PhMethod(rho, "a");
          ret_base_1 = new PhLocated(ret_base_1, 125, 9, "Φ.org.eolang.concat-tuple-with-empty-tuple-2.res.ρ.α0");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "concat");
        ret = new PhLocated(ret, 124, 2, "Φ.org.eolang.concat-tuple-with-empty-tuple-2.res");
      ret = new PhCopy(ret);
        Phi ret_1 = new PhMethod(rho, "b");
          ret_1 = new PhLocated(ret_1, 126, 4, "Φ.org.eolang.concat-tuple-with-empty-tuple-2.res.α0");
        ret = new PhWith(ret, 0, ret_1);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 127, 2, "Φ.org.eolang.concat-tuple-with-empty-tuple-2.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new PhMethod(rho, "res");
          ret_1_base = new PhLocated(ret_1_base, 128, 4, "Φ.org.eolang.concat-tuple-with-empty-tuple-2.φ.α0.ρ");
        Phi ret_1 = new PhMethod(ret_1_base, "length");
          ret_1 = new PhLocated(ret_1, 128, 7, "Φ.org.eolang.concat-tuple-with-empty-tuple-2.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 129, 4, "Φ.org.eolang.concat-tuple-with-empty-tuple-2.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 129, 5, "Φ.org.eolang.concat-tuple-with-empty-tuple-2.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EOint(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 129, 15, "Φ.org.eolang.concat-tuple-with-empty-tuple-2.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(3L));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOconcat_tuple_with_empty_tuple_2Test()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}