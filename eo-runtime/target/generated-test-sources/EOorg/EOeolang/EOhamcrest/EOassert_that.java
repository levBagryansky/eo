
/* This file was auto-generated by eo-maven-plugin (1.0-SNAPSHOT b5a4c9a 2023-08-17T12:29:38) on 2023-08-18T14:42:30.920527Z; your changes will be discarded on the next build */
package EOorg.EOeolang.EOhamcrest;

import org.eolang.*;

// <o abstract="" line="51" loc="Φ.org.eolang.hamcrest.assert-that" name="assert-that" original-name="assert-that" pos="0"> 
//   <o line="51" loc="Φ.org.eolang.hamcrest.assert-that.actual" name="actual" pos="1"/>
//   <o line="51" loc="Φ.org.eolang.hamcrest.assert-that.matcher" name="matcher" pos="8"/>
//   <o line="51" loc="Φ.org.eolang.hamcrest.assert-that.reasons" name="reasons" pos="16" vararg=""/>
//   <o base="actual" const="" line="52" loc="Φ.org.eolang.hamcrest.assert-that.act" name="act" pos="2" ref="51"/>
//   <o base=".if" line="54" loc="Φ.org.eolang.hamcrest.assert-that.φ" name="@" pos="2"> 
//     <o base=".match" line="55" loc="Φ.org.eolang.hamcrest.assert-that.φ.ρ" pos="11"> 
//       <o base="matcher" line="55" loc="Φ.org.eolang.hamcrest.assert-that.φ.ρ.ρ" pos="4" ref="51"/>
//       <o base="act" line="55" loc="Φ.org.eolang.hamcrest.assert-that.φ.ρ.α0" pos="18" ref="52"/>
//     </o>
//     <o base="org.eolang.bool" data="bool" line="56" loc="Φ.org.eolang.hamcrest.assert-that.φ.α0" pos="4">TRUE</o>
//     <o base="org.eolang.txt.sprintf" line="57" loc="Φ.org.eolang.hamcrest.assert-that.φ.α1" pos="4"> 
//       <o base="org.eolang.string" data="string" line="58" loc="Φ.org.eolang.hamcrest.assert-that.φ.α1.α0" pos="6">%s\nExpected: %s\n     but: %s</o>
//       <o base=".if" line="59" loc="Φ.org.eolang.hamcrest.assert-that.φ.α1.α1" pos="6"> 
//         <o base=".is-empty" line="60" loc="Φ.org.eolang.hamcrest.assert-that.φ.α1.α1.ρ" pos="8"> 
//           <o base="org.eolang.collections.list" line="61" loc="Φ.org.eolang.hamcrest.assert-that.φ.α1.α1.ρ.ρ" pos="10"> 
//             <o base="reasons" line="62" loc="Φ.org.eolang.hamcrest.assert-that.φ.α1.α1.ρ.ρ.α0" pos="12" ref="51"/>
//           </o>
//         </o>
//         <o base="org.eolang.string" data="string" line="63" loc="Φ.org.eolang.hamcrest.assert-that.φ.α1.α1.α0" pos="8"/>
//         <o base=".at" line="64" loc="Φ.org.eolang.hamcrest.assert-that.φ.α1.α1.α1" pos="15"> 
//           <o base="reasons" line="64" loc="Φ.org.eolang.hamcrest.assert-that.φ.α1.α1.α1.ρ" pos="8" ref="51"/>
//           <o base="org.eolang.int" data="int" line="64" loc="Φ.org.eolang.hamcrest.assert-that.φ.α1.α1.α1.α0" pos="19">0</o>
//         </o>
//       </o>
//       <o base=".description-of" line="65" loc="Φ.org.eolang.hamcrest.assert-that.φ.α1.α2" pos="6"> 
//         <o base="matcher" line="66" loc="Φ.org.eolang.hamcrest.assert-that.φ.α1.α2.ρ" pos="8" ref="51"/>
//       </o>
//       <o base=".describe-mismatch" line="67" loc="Φ.org.eolang.hamcrest.assert-that.φ.α1.α3" pos="6"> 
//         <o base="matcher" line="68" loc="Φ.org.eolang.hamcrest.assert-that.φ.α1.α3.ρ" pos="8" ref="51"/>
//         <o base="act" line="69" loc="Φ.org.eolang.hamcrest.assert-that.φ.α1.α3.α0" pos="8" ref="52"/>
//       </o>
//     </o>
//   </o>
//   <o base="assert-that$equal-to" cut="24" line="71" loc="Φ.org.eolang.hamcrest.assert-that.equal-to" name="equal-to" pos="2" ref="71"/>
//   <o base="assert-that$not" cut="28" line="75" loc="Φ.org.eolang.hamcrest.assert-that.not" name="not" pos="2" ref="75"> 
//     <o as="matcher" base="matcher" level="1" loc="Φ.org.eolang.hamcrest.assert-that.not.α0" ref="51"/>
//   </o>
//   <o base="assert-that$all-of" cut="32" line="79" loc="Φ.org.eolang.hamcrest.assert-that.all-of" name="all-of" pos="2" ref="79"/>
//   <o base="assert-that$any-of" cut="36" line="85" loc="Φ.org.eolang.hamcrest.assert-that.any-of" name="any-of" pos="2" ref="85"/>
//   <o base="assert-that$greater-than" cut="40" line="91" loc="Φ.org.eolang.hamcrest.assert-that.greater-than" name="greater-than" pos="2" ref="91"/>
//   <o base="assert-that$less-than" cut="44" line="96" loc="Φ.org.eolang.hamcrest.assert-that.less-than" name="less-than" pos="2" ref="96"/>
//   <o base="assert-that$close-to" cut="48" line="101" loc="Φ.org.eolang.hamcrest.assert-that.close-to" name="close-to" pos="2" ref="101"/>
//   <o base="assert-that$is" cut="54" line="108" loc="Φ.org.eolang.hamcrest.assert-that.is" name="is" pos="2" ref="108"> 
//     <o as="matcher" base="matcher" level="1" loc="Φ.org.eolang.hamcrest.assert-that.is.α0" ref="51"/>
//   </o>
//   <o base="assert-that$anything" cut="58" line="113" loc="Φ.org.eolang.hamcrest.assert-that.anything" name="anything" pos="2" ref="113"/>
//   <o base="assert-that$described-as" cut="60" line="117" loc="Φ.org.eolang.hamcrest.assert-that.described-as" name="described-as" pos="2" ref="117"> 
//     <o as="matcher" base="matcher" level="1" loc="Φ.org.eolang.hamcrest.assert-that.described-as.α0" ref="51"/>
//   </o>
//   <o base="assert-that$has-item" cut="68" line="126" loc="Φ.org.eolang.hamcrest.assert-that.has-item" name="has-item" pos="2" ref="126"> 
//     <o as="matcher" base="matcher" level="1" loc="Φ.org.eolang.hamcrest.assert-that.has-item.α0" ref="51"/>
//   </o>
//   <o base="assert-that$has-items" cut="72" line="130" loc="Φ.org.eolang.hamcrest.assert-that.has-items" name="has-items" pos="2" ref="130"/>
//   <o base="assert-that$array-each" cut="76" line="135" loc="Φ.org.eolang.hamcrest.assert-that.array-each" name="array-each" pos="2" ref="135"/>
//   <o base="assert-that$contains-string" cut="80" line="141" loc="Φ.org.eolang.hamcrest.assert-that.contains-string" name="contains-string" pos="2" ref="141"/>
//   <o base="assert-that$string-ends-with" cut="84" line="146" loc="Φ.org.eolang.hamcrest.assert-that.string-ends-with" name="string-ends-with" pos="2" ref="146"/>
//   <o base="assert-that$string-starts-with" cut="88" line="151" loc="Φ.org.eolang.hamcrest.assert-that.string-starts-with" name="string-starts-with" pos="2" ref="151"/>
//   <o base="assert-that$matches-regex" cut="92" line="156" loc="Φ.org.eolang.hamcrest.assert-that.matches-regex" name="matches-regex" pos="2" ref="156"/>
//   <o base="assert-that$is-substring" cut="96" line="161" loc="Φ.org.eolang.hamcrest.assert-that.is-substring" name="is-substring" pos="2" ref="161"/>
//   <o base="assert-that$blank-string" cut="100" line="166" loc="Φ.org.eolang.hamcrest.assert-that.blank-string" name="blank-string" pos="2" ref="166"/>
//   <o base="assert-that$empty-string" cut="102" line="170" loc="Φ.org.eolang.hamcrest.assert-that.empty-string" name="empty-string" pos="2" ref="170"/>
// </o>
@XmirObject(name = "assert-that", oname = "assert-that", source = "/home/tardis3/eo/eo-runtime/target/eo-test/3-pull/org/eolang/hamcrest/assert-that.eo")
public final class EOassert_that extends PhDefault {
  public EOassert_that(final Phi sigma) {
    super(sigma);
    this.add("actual", new AtFree(/* default */));
    this.add("matcher", new AtFree(/* default */));
    this.add("reasons", new AtVararg(/* default */));
    this.add("act", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new PhMethod(rho, "actual");
        ret = new PhLocated(ret, 52, 2, "Φ.org.eolang.hamcrest.assert-that.act");
      ret = new PhConst(ret);
      return ret;
    })));
    this.add("φ", new AtOnce(new AtComposite(this, rho -> {
      Phi ret_base_base = new PhMethod(rho, "matcher");
        ret_base_base = new PhLocated(ret_base_base, 55, 4, "Φ.org.eolang.hamcrest.assert-that.φ.ρ.ρ");
      Phi ret_base = new PhMethod(ret_base_base, "match");
        ret_base = new PhLocated(ret_base, 55, 11, "Φ.org.eolang.hamcrest.assert-that.φ.ρ");
      ret_base = new PhCopy(ret_base);
        Phi ret_base_1 = new PhMethod(rho, "act");
          ret_base_1 = new PhLocated(ret_base_1, 55, 18, "Φ.org.eolang.hamcrest.assert-that.φ.ρ.α0");
        ret_base = new PhWith(ret_base, 0, ret_base_1);
      Phi ret = new PhMethod(ret_base, "if");
        ret = new PhLocated(ret, 54, 2, "Φ.org.eolang.hamcrest.assert-that.φ");
      ret = new PhCopy(ret);
        Phi ret_1 = new EOorg.EOeolang.EObool(Phi.Φ);
          ret_1 = new PhLocated(ret_1, 56, 4, "Φ.org.eolang.hamcrest.assert-that.φ.α0");
          ret_1 = new PhWith(ret_1, "Δ", new Data.Value<>(Boolean.TRUE));
        Phi ret_2 = Phi.Φ.attr("org").get().attr("eolang").get().attr("txt").get().attr("sprintf").get();
          ret_2 = new PhLocated(ret_2, 57, 4, "Φ.org.eolang.hamcrest.assert-that.φ.α1");
        ret_2 = new PhCopy(ret_2);
          Phi ret_2_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
            ret_2_1 = new PhLocated(ret_2_1, 58, 6, "Φ.org.eolang.hamcrest.assert-that.φ.α1.α0");
            ret_2_1 = new PhWith(ret_2_1, "Δ", new Data.Value<>("%s\nExpected: %s\n     but: %s"));
          Phi ret_2_2_base_base = Phi.Φ.attr("org").get().attr("eolang").get().attr("collections").get().attr("list").get();
            ret_2_2_base_base = new PhLocated(ret_2_2_base_base, 61, 10, "Φ.org.eolang.hamcrest.assert-that.φ.α1.α1.ρ.ρ");
          ret_2_2_base_base = new PhCopy(ret_2_2_base_base);
            Phi ret_2_2_base_base_1 = new PhMethod(rho, "reasons");
              ret_2_2_base_base_1 = new PhLocated(ret_2_2_base_base_1, 62, 12, "Φ.org.eolang.hamcrest.assert-that.φ.α1.α1.ρ.ρ.α0");
            ret_2_2_base_base = new PhWith(ret_2_2_base_base, 0, ret_2_2_base_base_1);
          Phi ret_2_2_base = new PhMethod(ret_2_2_base_base, "is-empty");
            ret_2_2_base = new PhLocated(ret_2_2_base, 60, 8, "Φ.org.eolang.hamcrest.assert-that.φ.α1.α1.ρ");
          Phi ret_2_2 = new PhMethod(ret_2_2_base, "if");
            ret_2_2 = new PhLocated(ret_2_2, 59, 6, "Φ.org.eolang.hamcrest.assert-that.φ.α1.α1");
          ret_2_2 = new PhCopy(ret_2_2);
            Phi ret_2_2_1 = new EOorg.EOeolang.EOstring(Phi.Φ);
              ret_2_2_1 = new PhLocated(ret_2_2_1, 63, 8, "Φ.org.eolang.hamcrest.assert-that.φ.α1.α1.α0");
              ret_2_2_1 = new PhWith(ret_2_2_1, "Δ", new Data.Value<>(""));
            Phi ret_2_2_2_base = new PhMethod(rho, "reasons");
              ret_2_2_2_base = new PhLocated(ret_2_2_2_base, 64, 8, "Φ.org.eolang.hamcrest.assert-that.φ.α1.α1.α1.ρ");
            Phi ret_2_2_2 = new PhMethod(ret_2_2_2_base, "at");
              ret_2_2_2 = new PhLocated(ret_2_2_2, 64, 15, "Φ.org.eolang.hamcrest.assert-that.φ.α1.α1.α1");
            ret_2_2_2 = new PhCopy(ret_2_2_2);
              Phi ret_2_2_2_1 = new EOorg.EOeolang.EOint(Phi.Φ);
                ret_2_2_2_1 = new PhLocated(ret_2_2_2_1, 64, 19, "Φ.org.eolang.hamcrest.assert-that.φ.α1.α1.α1.α0");
                ret_2_2_2_1 = new PhWith(ret_2_2_2_1, "Δ", new Data.Value<>(0L));
              ret_2_2_2 = new PhWith(ret_2_2_2, 0, ret_2_2_2_1);
            ret_2_2 = new PhWith(ret_2_2, 0, ret_2_2_1);
            ret_2_2 = new PhWith(ret_2_2, 1, ret_2_2_2);
          Phi ret_2_3_base = new PhMethod(rho, "matcher");
            ret_2_3_base = new PhLocated(ret_2_3_base, 66, 8, "Φ.org.eolang.hamcrest.assert-that.φ.α1.α2.ρ");
          Phi ret_2_3 = new PhMethod(ret_2_3_base, "description-of");
            ret_2_3 = new PhLocated(ret_2_3, 65, 6, "Φ.org.eolang.hamcrest.assert-that.φ.α1.α2");
          Phi ret_2_4_base = new PhMethod(rho, "matcher");
            ret_2_4_base = new PhLocated(ret_2_4_base, 68, 8, "Φ.org.eolang.hamcrest.assert-that.φ.α1.α3.ρ");
          Phi ret_2_4 = new PhMethod(ret_2_4_base, "describe-mismatch");
            ret_2_4 = new PhLocated(ret_2_4, 67, 6, "Φ.org.eolang.hamcrest.assert-that.φ.α1.α3");
          ret_2_4 = new PhCopy(ret_2_4);
            Phi ret_2_4_1 = new PhMethod(rho, "act");
              ret_2_4_1 = new PhLocated(ret_2_4_1, 69, 8, "Φ.org.eolang.hamcrest.assert-that.φ.α1.α3.α0");
            ret_2_4 = new PhWith(ret_2_4, 0, ret_2_4_1);
          ret_2 = new PhWith(ret_2, 0, ret_2_1);
          ret_2 = new PhWith(ret_2, 1, ret_2_2);
          ret_2 = new PhWith(ret_2, 2, ret_2_3);
          ret_2 = new PhWith(ret_2, 3, ret_2_4);
        ret = new PhWith(ret, 0, ret_1);
        ret = new PhWith(ret, 1, ret_2);
      return ret;
    })));
    this.add("equal-to", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOassert_that$EOequal_to(rho);
        ret = new PhLocated(ret, 71, 2, "Φ.org.eolang.hamcrest.assert-that.equal-to");
      return ret;
    })));
    this.add("not", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOassert_that$EOnot(rho);
        ret = new PhLocated(ret, 75, 2, "Φ.org.eolang.hamcrest.assert-that.not");
      return ret;
    })));
    this.add("all-of", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOassert_that$EOall_of(rho);
        ret = new PhLocated(ret, 79, 2, "Φ.org.eolang.hamcrest.assert-that.all-of");
      return ret;
    })));
    this.add("any-of", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOassert_that$EOany_of(rho);
        ret = new PhLocated(ret, 85, 2, "Φ.org.eolang.hamcrest.assert-that.any-of");
      return ret;
    })));
    this.add("greater-than", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOassert_that$EOgreater_than(rho);
        ret = new PhLocated(ret, 91, 2, "Φ.org.eolang.hamcrest.assert-that.greater-than");
      return ret;
    })));
    this.add("less-than", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOassert_that$EOless_than(rho);
        ret = new PhLocated(ret, 96, 2, "Φ.org.eolang.hamcrest.assert-that.less-than");
      return ret;
    })));
    this.add("close-to", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOassert_that$EOclose_to(rho);
        ret = new PhLocated(ret, 101, 2, "Φ.org.eolang.hamcrest.assert-that.close-to");
      return ret;
    })));
    this.add("is", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOassert_that$EOis(rho);
        ret = new PhLocated(ret, 108, 2, "Φ.org.eolang.hamcrest.assert-that.is");
      return ret;
    })));
    this.add("anything", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOassert_that$EOanything(rho);
        ret = new PhLocated(ret, 113, 2, "Φ.org.eolang.hamcrest.assert-that.anything");
      return ret;
    })));
    this.add("described-as", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOassert_that$EOdescribed_as(rho);
        ret = new PhLocated(ret, 117, 2, "Φ.org.eolang.hamcrest.assert-that.described-as");
      return ret;
    })));
    this.add("has-item", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOassert_that$EOhas_item(rho);
        ret = new PhLocated(ret, 126, 2, "Φ.org.eolang.hamcrest.assert-that.has-item");
      return ret;
    })));
    this.add("has-items", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOassert_that$EOhas_items(rho);
        ret = new PhLocated(ret, 130, 2, "Φ.org.eolang.hamcrest.assert-that.has-items");
      return ret;
    })));
    this.add("array-each", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOassert_that$EOarray_each(rho);
        ret = new PhLocated(ret, 135, 2, "Φ.org.eolang.hamcrest.assert-that.array-each");
      return ret;
    })));
    this.add("contains-string", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOassert_that$EOcontains_string(rho);
        ret = new PhLocated(ret, 141, 2, "Φ.org.eolang.hamcrest.assert-that.contains-string");
      return ret;
    })));
    this.add("string-ends-with", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOassert_that$EOstring_ends_with(rho);
        ret = new PhLocated(ret, 146, 2, "Φ.org.eolang.hamcrest.assert-that.string-ends-with");
      return ret;
    })));
    this.add("string-starts-with", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOassert_that$EOstring_starts_with(rho);
        ret = new PhLocated(ret, 151, 2, "Φ.org.eolang.hamcrest.assert-that.string-starts-with");
      return ret;
    })));
    this.add("matches-regex", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOassert_that$EOmatches_regex(rho);
        ret = new PhLocated(ret, 156, 2, "Φ.org.eolang.hamcrest.assert-that.matches-regex");
      return ret;
    })));
    this.add("is-substring", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOassert_that$EOis_substring(rho);
        ret = new PhLocated(ret, 161, 2, "Φ.org.eolang.hamcrest.assert-that.is-substring");
      return ret;
    })));
    this.add("blank-string", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOassert_that$EOblank_string(rho);
        ret = new PhLocated(ret, 166, 2, "Φ.org.eolang.hamcrest.assert-that.blank-string");
      return ret;
    })));
    this.add("empty-string", new AtOnce(new AtComposite(this, rho -> {
      Phi ret = new EOassert_that$EOempty_string(rho);
        ret = new PhLocated(ret, 170, 2, "Φ.org.eolang.hamcrest.assert-that.empty-string");
      return ret;
    })));
  }
}