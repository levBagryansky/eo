package EOorg.EOeolang;

import org.eolang.AtComposite;
import org.eolang.AtVararg;
import org.eolang.PhDefault;
import org.eolang.Phi;
import org.eolang.XmirObject;
@XmirObject(oname = "my-atom.self")
public class EOmy_atom$EOself extends PhDefault {

    /**
     * Ctor.
     * @param sigma Sigma
     */
    public EOmy_atom$EOself(final Phi sigma) {
        super(sigma);
        this.add("x", new AtVararg());
        this.add(
            "φ",
            new AtComposite(
                this,
                rho -> {
                    final Phi parent = rho.attr("ρ").get();
                    return parent;
                }
            )
        );
    }

}
