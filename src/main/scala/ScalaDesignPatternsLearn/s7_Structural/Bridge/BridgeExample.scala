package ScalaDesignPatternsLearn.s7_Structural.Bridge

object BridgeExample {
  def main(args: Array[String]): Unit = {
    val p1 = new SimplePasswordConverterScala with Sha256Hasher
    val p2 = new SimplePasswordConverterScala with Md5Hasher
    val p3 = new SaltedPasswordConverterScala("8jsdf32T^$%") with Sha1Hasher
    val p4 = new SaltedPasswordConverterScala("8jsdf32T^$%") with Sha256Hasher
    System.out.println(s"'password' in SHA-256 is:${p1.convert ("password")}")
    System.out.println(s"'1234567890' in MD5 is:${p2.convert ("1234567890")}")
    System.out.println(s"'password' in salted SHA-1 is:${p3.convert ("password")}")
    System.out.println(s"'password' in salted SHA-256 is:${p4.convert ("password")}")
  }
}
