/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package blogito

import java.security.MessageDigest
import org.apache.commons.codec.binary.Base64

/**
 *
 * @author jorgemario
 */
class HashCodec {
	static encode = { srt->
        MessageDigest md = MessageDigest.getInstance("SHA")
        md.update(str.getBytes("UTF-8"))
        return Base64.encodeBase64(md.digest())
   }
}

