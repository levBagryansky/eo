package EOorg.EOeolang;

import org.eolang.AtComposite;
import org.eolang.AtVararg;
import org.eolang.Data;
import org.eolang.PhDefault;
import org.eolang.Phi;
import org.eolang.XmirObject;

@XmirObject(oname = "my-atom.print-hash")
public class EOmy_atom$EOprint_hash extends PhDefault {

    /**
     * Ctor.
     * @param sigma Sigma
     */
    public EOmy_atom$EOprint_hash(final Phi sigma) {
        super(sigma);
        this.add("x", new AtVararg());
        this.add(
            "φ",
            new AtComposite(
                this,
                rho -> {
                    System.out.println("print " + rho.attr("ρ").get().hashCode());
                    return new Data.ToPhi(true);
                }
            )
        );
    }

}
