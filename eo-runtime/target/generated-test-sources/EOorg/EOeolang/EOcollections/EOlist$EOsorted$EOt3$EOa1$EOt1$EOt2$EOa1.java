
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOcollections;

import org.eolang.*;

// <o abstract="" ancestors="3" line="235" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1" name="list$sorted$t3$a1$t1$t2$a1" parent="list$sorted$t3$a1" pos="12"> 
//   <o line="235" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.iter-j" name="iter-j" pos="13"/>
//   <o base="org.eolang.seq" line="236" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ" name="@" pos="14"> 
//     <o base=".if" line="237" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0" pos="16"> 
//       <o base=".lt" line="238" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.ρ" pos="18"> 
//         <o base=".at" line="239" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.ρ.ρ" pos="23"> 
//           <o base="arr" line="239" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.ρ.ρ.ρ" pos="20" ref="235.28.465"/>
//           <o base="list$sorted$t3$a1$t1$t2$a1$t1$t0$t0$t0$generated-scope-bbb2aa17-25c6-4dba-b117-096f6efb815e" cut="286" line="239" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.ρ.ρ.generated-scope-bbb2aa17-25c6-4dba-b117-096f6efb815e" name="generated-scope-bbb2aa17-25c6-4dba-b117-096f6efb815e" pos="31" ref="239"> 
//             <o as="res" base="res" level="3" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.ρ.ρ.generated-scope-bbb2aa17-25c6-4dba-b117-096f6efb815e.α0" ref="235.220.465"/>
//             <o as="i" base="i" level="3" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.ρ.ρ.generated-scope-bbb2aa17-25c6-4dba-b117-096f6efb815e.α1" ref="235.225.465"/>
//             <o as="j" base="j" level="3" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.ρ.ρ.generated-scope-bbb2aa17-25c6-4dba-b117-096f6efb815e.α2" ref="235.226.465"/>
//             <o as="swap" base="swap" level="3" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.ρ.ρ.generated-scope-bbb2aa17-25c6-4dba-b117-096f6efb815e.α3" ref="235.253.465"/>
//             <o as="arr" base="arr" level="4" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.ρ.ρ.generated-scope-bbb2aa17-25c6-4dba-b117-096f6efb815e.α4" ref="235.28.465"/>
//           </o>
//         </o>
//         <o base=".at" line="240" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.ρ.α0" pos="23"> 
//           <o base="arr" line="240" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.ρ.α0.ρ" pos="20" ref="235.28.465"/>
//           <o base="list$sorted$t3$a1$t1$t2$a1$t1$t0$t0$t1$generated-scope-83e5d750-c634-4654-92f9-075604ce20ca" cut="297" line="240" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.ρ.α0.generated-scope-83e5d750-c634-4654-92f9-075604ce20ca" name="generated-scope-83e5d750-c634-4654-92f9-075604ce20ca" pos="31" ref="240"> 
//             <o as="res" base="res" level="3" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.ρ.α0.generated-scope-83e5d750-c634-4654-92f9-075604ce20ca.α0" ref="235.220.465"/>
//             <o as="i" base="i" level="3" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.ρ.α0.generated-scope-83e5d750-c634-4654-92f9-075604ce20ca.α1" ref="235.225.465"/>
//             <o as="j" base="j" level="3" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.ρ.α0.generated-scope-83e5d750-c634-4654-92f9-075604ce20ca.α2" ref="235.226.465"/>
//             <o as="swap" base="swap" level="3" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.ρ.α0.generated-scope-83e5d750-c634-4654-92f9-075604ce20ca.α3" ref="235.253.465"/>
//             <o as="arr" base="arr" level="4" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.ρ.α0.generated-scope-83e5d750-c634-4654-92f9-075604ce20ca.α4" ref="235.28.465"/>
//           </o>
//         </o>
//       </o>
//       <o base="swap" line="241" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.α0" pos="18" ref="235.253.465"> 
//         <o base="list$sorted$t3$a1$t1$t2$a1$t1$t0$t1$generated-scope-d2b63df2-58f6-4ce1-92aa-95f80368c0dc" cut="304" line="241" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.α0.generated-scope-d2b63df2-58f6-4ce1-92aa-95f80368c0dc" name="generated-scope-d2b63df2-58f6-4ce1-92aa-95f80368c0dc" pos="27" ref="241"> 
//           <o as="res" base="res" level="3" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.α0.generated-scope-d2b63df2-58f6-4ce1-92aa-95f80368c0dc.α0" ref="235.220.465"/>
//           <o as="i" base="i" level="3" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.α0.generated-scope-d2b63df2-58f6-4ce1-92aa-95f80368c0dc.α1" ref="235.225.465"/>
//           <o as="j" base="j" level="3" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.α0.generated-scope-d2b63df2-58f6-4ce1-92aa-95f80368c0dc.α2" ref="235.226.465"/>
//           <o as="swap" base="swap" level="3" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.α0.generated-scope-d2b63df2-58f6-4ce1-92aa-95f80368c0dc.α3" ref="235.253.465"/>
//           <o as="arr" base="arr" level="4" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.α0.generated-scope-d2b63df2-58f6-4ce1-92aa-95f80368c0dc.α4" ref="235.28.465"/>
//         </o>
//         <o base="list$sorted$t3$a1$t1$t2$a1$t1$t0$t1$generated-scope-128649a3-2b9c-46db-a447-ad8329999cf0" cut="309" line="241" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.α0.generated-scope-128649a3-2b9c-46db-a447-ad8329999cf0" name="generated-scope-128649a3-2b9c-46db-a447-ad8329999cf0" pos="38" ref="241"> 
//           <o as="res" base="res" level="3" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.α0.generated-scope-128649a3-2b9c-46db-a447-ad8329999cf0.α0" ref="235.220.465"/>
//           <o as="i" base="i" level="3" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.α0.generated-scope-128649a3-2b9c-46db-a447-ad8329999cf0.α1" ref="235.225.465"/>
//           <o as="j" base="j" level="3" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.α0.generated-scope-128649a3-2b9c-46db-a447-ad8329999cf0.α2" ref="235.226.465"/>
//           <o as="swap" base="swap" level="3" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.α0.generated-scope-128649a3-2b9c-46db-a447-ad8329999cf0.α3" ref="235.253.465"/>
//           <o as="arr" base="arr" level="4" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.α0.generated-scope-128649a3-2b9c-46db-a447-ad8329999cf0.α4" ref="235.28.465"/>
//         </o>
//       </o>
//       <o base="org.eolang.bool" data="bool" line="242" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.α1" pos="18">TRUE</o>
//     </o>
//     <o base=".write" line="243" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α1" pos="17"> 
//       <o base="j" line="243" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α1.ρ" pos="16" ref="235.226.465"/>
//       <o base="list$sorted$t3$a1$t1$t2$a1$t1$t1$generated-scope-20ea2d20-6944-40fa-a4d4-579dad5b1e63" cut="322" line="243" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α1.generated-scope-20ea2d20-6944-40fa-a4d4-579dad5b1e63" name="generated-scope-20ea2d20-6944-40fa-a4d4-579dad5b1e63" pos="26" ref="243"> 
//         <o as="res" base="res" level="3" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α1.generated-scope-20ea2d20-6944-40fa-a4d4-579dad5b1e63.α0" ref="235.220.465"/>
//         <o as="i" base="i" level="3" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α1.generated-scope-20ea2d20-6944-40fa-a4d4-579dad5b1e63.α1" ref="235.225.465"/>
//         <o as="j" base="j" level="3" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α1.generated-scope-20ea2d20-6944-40fa-a4d4-579dad5b1e63.α2" ref="235.226.465"/>
//         <o as="swap" base="swap" level="3" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α1.generated-scope-20ea2d20-6944-40fa-a4d4-579dad5b1e63.α3" ref="235.253.465"/>
//         <o as="arr" base="arr" level="4" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α1.generated-scope-20ea2d20-6944-40fa-a4d4-579dad5b1e63.α4" ref="235.28.465"/>
//       </o>
//     </o>
//   </o>
//   <o level="2" line="235.220.465" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.res" name="res"/>
//   <o level="2" line="235.225.465" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.i" name="i"/>
//   <o level="2" line="235.226.465" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.j" name="j"/>
//   <o level="2" line="235.253.465" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.swap" name="swap"/>
//   <o level="3" line="235.28.465" loc="Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.arr" name="arr"/>
// </o>
@XmirObject(name = "list$sorted$t3$a1$t1$t2$a1", oname = "list$sorted$t3$a1$t1$t2$a1", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/collections/list.eo")
public final class EOlist$EOsorted$EOt3$EOa1$EOt1$EOt2$EOa1 extends PhDefault {
  public EOlist$EOsorted$EOt3$EOa1$EOt1$EOt2$EOa1(final Phi sigma) {
    super(sigma);
    this.add("iter-j", new AtFree(/* default */));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = Phi.Φ.attr("org").get().attr("eolang").get().attr("seq").get();
        ret = new PhLocated(ret, 236, 14, "Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ");
      ret = new PhCopy(ret);
        Phi ret_1_base_base_base = new PhMethod(new PhMethod(new PhMethod(new PhMethod(rho, "σ"), "σ"), "σ"), "arr");
          ret_1_base_base_base = new PhLocated(ret_1_base_base_base, 239, 20, "Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.ρ.ρ.ρ");
        Phi ret_1_base_base = new PhMethod(ret_1_base_base_base, "at");
          ret_1_base_base = new PhLocated(ret_1_base_base, 239, 23, "Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.ρ.ρ");
        ret_1_base_base = new PhCopy(ret_1_base_base);
          Phi ret_1_base_base_1 = new EOlist$EOsorted$EOt3$EOa1$EOt1$EOt2$EOa1$EOt1$EOt0$EOt0$EOt0$EOgenerated_scope_bbb2aa17_25c6_4dba_b117_096f6efb815e(rho);
            ret_1_base_base_1 = new PhLocated(ret_1_base_base_1, 239, 31, "Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.ρ.ρ.generated-scope-bbb2aa17-25c6-4dba-b117-096f6efb815e");
          ret_1_base_base = new PhWith(ret_1_base_base, 0, ret_1_base_base_1);
        Phi ret_1_base = new PhMethod(ret_1_base_base, "lt");
          ret_1_base = new PhLocated(ret_1_base, 238, 18, "Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.ρ");
        ret_1_base = new PhCopy(ret_1_base);
          Phi ret_1_base_1_base = new PhMethod(new PhMethod(new PhMethod(new PhMethod(rho, "σ"), "σ"), "σ"), "arr");
            ret_1_base_1_base = new PhLocated(ret_1_base_1_base, 240, 20, "Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.ρ.α0.ρ");
          Phi ret_1_base_1 = new PhMethod(ret_1_base_1_base, "at");
            ret_1_base_1 = new PhLocated(ret_1_base_1, 240, 23, "Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.ρ.α0");
          ret_1_base_1 = new PhCopy(ret_1_base_1);
            Phi ret_1_base_1_1 = new EOlist$EOsorted$EOt3$EOa1$EOt1$EOt2$EOa1$EOt1$EOt0$EOt0$EOt1$EOgenerated_scope_83e5d750_c634_4654_92f9_075604ce20ca(rho);
              ret_1_base_1_1 = new PhLocated(ret_1_base_1_1, 240, 31, "Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.ρ.α0.generated-scope-83e5d750-c634-4654-92f9-075604ce20ca");
            ret_1_base_1 = new PhWith(ret_1_base_1, 0, ret_1_base_1_1);
          ret_1_base = new PhWith(ret_1_base, 0, ret_1_base_1);
        Phi ret_1 = new PhMethod(ret_1_base, "if");
          ret_1 = new PhLocated(ret_1, 237, 16, "Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0");
        ret_1 = new PhCopy(ret_1);
          Phi ret_1_1 = new PhMethod(new PhMethod(new PhMethod(rho, "σ"), "σ"), "swap");
            ret_1_1 = new PhLocated(ret_1_1, 241, 18, "Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.α0");
          ret_1_1 = new PhCopy(ret_1_1);
            Phi ret_1_1_1 = new EOlist$EOsorted$EOt3$EOa1$EOt1$EOt2$EOa1$EOt1$EOt0$EOt1$EOgenerated_scope_d2b63df2_58f6_4ce1_92aa_95f80368c0dc(rho);
              ret_1_1_1 = new PhLocated(ret_1_1_1, 241, 27, "Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.α0.generated-scope-d2b63df2-58f6-4ce1-92aa-95f80368c0dc");
            Phi ret_1_1_2 = new EOlist$EOsorted$EOt3$EOa1$EOt1$EOt2$EOa1$EOt1$EOt0$EOt1$EOgenerated_scope_128649a3_2b9c_46db_a447_ad8329999cf0(rho);
              ret_1_1_2 = new PhLocated(ret_1_1_2, 241, 38, "Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.α0.generated-scope-128649a3-2b9c-46db-a447-ad8329999cf0");
            ret_1_1 = new PhWith(ret_1_1, 0, ret_1_1_1);
            ret_1_1 = new PhWith(ret_1_1, 1, ret_1_1_2);
          Phi ret_1_2 = new EOorg.EOeolang.EObool(Phi.Φ);
            ret_1_2 = new PhLocated(ret_1_2, 242, 18, "Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α0.α1");
            ret_1_2 = new PhWith(ret_1_2, "Δ", new Data.Value<>(Boolean.TRUE));
          ret_1 = new PhWith(ret_1, 0, ret_1_1);
          ret_1 = new PhWith(ret_1, 1, ret_1_2);
        Phi ret_2_base = new PhMethod(new PhMethod(new PhMethod(rho, "σ"), "σ"), "j");
          ret_2_base = new PhLocated(ret_2_base, 243, 16, "Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α1.ρ");
        Phi ret_2 = new PhMethod(ret_2_base, "write");
          ret_2 = new PhLocated(ret_2, 243, 17, "Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOlist$EOsorted$EOt3$EOa1$EOt1$EOt2$EOa1$EOt1$EOt1$EOgenerated_scope_20ea2d20_6944_40fa_a4d4_579dad5b1e63(rho);
            ret_2_1 = new PhLocated(ret_2_1, 243, 26, "Φ.org.eolang.collections.list$sorted$t3$a1$t1$t2$a1.φ.α1.generated-scope-20ea2d20-6944-40fa-a4d4-579dad5b1e63");
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
  }
}