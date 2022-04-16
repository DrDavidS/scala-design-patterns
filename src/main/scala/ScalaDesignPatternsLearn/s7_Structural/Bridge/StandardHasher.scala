package ScalaDesignPatternsLearn.s7_Structural.Bridge

import org.apache.commons.codec.binary.Hex

trait Sha1Hasher extends Hasher {
  override def hash(data: String): String =
    new String(Hex.encodeHex(getDigest("SHA-1", data).digest()))
}

trait Sha256Hasher extends Hasher {
  override def hash(data: String): String =
    new String(Hex.encodeHex(getDigest("SHA-256", data).digest()))
}

trait Md5Hasher extends Hasher {
  override def hash(data: String): String =
    new String(Hex.encodeHex(getDigest("MD5", data).digest()))
}
