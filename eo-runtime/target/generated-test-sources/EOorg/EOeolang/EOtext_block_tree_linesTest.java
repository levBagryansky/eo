
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang;

import org.eolang.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// <o abstract="" line="86" loc="Φ.org.eolang.text-block-tree-lines" name="text-block-tree-lines" original-name="text-block-tree-lines" pos="0"> 
//   <o base="org.eolang.hamcrest.assert-that" line="87" loc="Φ.org.eolang.text-block-tree-lines.φ" name="@" pos="2"> 
//     <o base=".as-bytes" line="92" loc="Φ.org.eolang.text-block-tree-lines.φ.α0" pos="7"> 
//       <o base="org.eolang.string" data="string" line="88" loc="Φ.org.eolang.text-block-tree-lines.φ.α0.ρ" pos="4">e\ne\ne</o>
//     </o>
//     <o base=".equal-to" line="93" loc="Φ.org.eolang.text-block-tree-lines.φ.α1" pos="5"> 
//       <o base="$" line="93" loc="Φ.org.eolang.text-block-tree-lines.φ.α1.ρ" pos="4"/>
//       <o base="org.eolang.bytes" data="bytes" line="93" loc="Φ.org.eolang.text-block-tree-lines.φ.α1.α0" pos="15">65 0A 65 0A 65</o>
//     </o>
//   </o>
// </o>
@XmirObject(name = "text-block-tree-linesTest", oname = "text-block-tree-lines", source = "/home/tardis3/eo/eo-runtime/src/test/eo/org/eolang/string-tests.eo")
public final class EOtext_block_tree_linesTest extends PhDefault {
  public EOtext_block_tree_linesTest() {
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("hamcrest").get().attr("assert-that").get();
        ret = new PhLocated(ret, 87, 2, "Φ.org.eolang.text-block-tree-lines.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base = new EOorg.EOeolang.EOstring(Phi.Φ);
          ret_1_base = new PhLocated(ret_1_base, 88, 4, "Φ.org.eolang.text-block-tree-lines.φ.α0.ρ");
          ret_1_base = new PhWith(ret_1_base, "Δ", new Data.Value<>("e\ne\ne"));
        Phi ret_1 = new PhMethod(ret_1_base, "as-bytes");
          ret_1 = new PhLocated(ret_1, 92, 7, "Φ.org.eolang.text-block-tree-lines.φ.α0");
        Phi ret_2_base = rho;
          ret_2_base = new PhLocated(ret_2_base, 93, 4, "Φ.org.eolang.text-block-tree-lines.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "equal-to");
          ret_2 = new PhLocated(ret_2, 93, 5, "Φ.org.eolang.text-block-tree-lines.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EObytes(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 93, 15, "Φ.org.eolang.text-block-tree-lines.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>(new byte[] {(byte) 0x65, (byte) 0x0A, (byte) 0x65, (byte) 0x0A, (byte) 0x65}));
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }

  @Test
  public void works() throws java.lang.Exception {
    Object obj = new Dataized(new EOtext_block_tree_linesTest()).take();
    if (obj instanceof String) {
      Assertions.fail(obj.toString());
    } else {
      Assertions.assertTrue((Boolean) obj);
    }
  }
}
