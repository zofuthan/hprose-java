/**********************************************************\
|                                                          |
|                          hprose                          |
|                                                          |
| Official WebSite: http://www.hprose.com/                 |
|                   http://www.hprose.org/                 |
|                                                          |
\**********************************************************/
/**********************************************************\
 *                                                        *
 * BooleanArraySerializer.java                            *
 *                                                        *
 * boolean array serializer class for Java.               *
 *                                                        *
 * LastModified: Sep 15, 2014                             *
 * Author: Ma Bingyao <andot@hprose.com>                  *
 *                                                        *
\**********************************************************/

package hprose.io.serialize;

import hprose.io.HproseWriter;
import java.io.IOException;

final class BooleanArraySerializer implements HproseSerializer<boolean[]> {

    public final static HproseSerializer instance = new BooleanArraySerializer();

    public void write(HproseWriter writer, boolean[] obj) throws IOException {
        writer.writeArrayWithRef(obj);
    }
}
