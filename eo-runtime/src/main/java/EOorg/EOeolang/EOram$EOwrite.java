/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016-2024 Objectionary.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/*
 * @checkstyle PackageNameCheck (4 lines)
 */
package EOorg.EOeolang;

import java.io.IOException;
import org.eolang.AtVoid;
import org.eolang.Atom;
import org.eolang.Attr;
import org.eolang.Data;
import org.eolang.Param;
import org.eolang.PhDefault;
import org.eolang.Phi;
import org.eolang.Ram;
import org.eolang.Versionized;
import org.eolang.XmirObject;

/**
 * Write into memory.
 * @since 0.1
 * @checkstyle TypeNameCheck (5 lines)
 */
@Versionized
@XmirObject(oname = "ram.write")
public final class EOram$EOwrite extends PhDefault implements Atom {
    /**
     * Ctor.
     * @param sigma Sigma
     */
    public EOram$EOwrite(final Phi sigma) {
        super(sigma);
        this.add("position", new AtVoid("position"));
        this.add("data", new AtVoid("data"));
    }

    @Override
    public Phi lambda() throws IOException {
        final int pos = new Param(this, "position").strong(Long.class).intValue();
        final byte[] bytes = new Param(this, "data").strong(byte[].class);
        Ram.INSTANCE.write(this.take(Attr.RHO), pos, bytes);
        return new Data.ToPhi(true);
    }
}
