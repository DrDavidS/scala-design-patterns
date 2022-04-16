package ScalaDesignPatternsLearn.s7_Structural.Bridge

import java.security.MessageDigest

trait Hasher {
  def hash(data: String): String

  protected def getDigest(algorithm: String, data: String): MessageDigest = {
    val crypt: MessageDigest = MessageDigest.getInstance(algorithm)  // 标准JAVA平台都支持MD5\SHA1\SHA256
    crypt.reset()
    crypt.update(data.getBytes("UTF-8"))
    crypt
  }
}
