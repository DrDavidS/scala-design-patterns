package ScalaDesignPatternsLearn.s7_Structural.Bridge

abstract class PasswordConverterBase {
  self: Hasher =>
  def convert(password: String): String
}