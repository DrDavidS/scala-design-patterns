package ScalaDesignPatternsLearn.s6_CreationalDesignPatterns.Singleton

object StringUtils {
  def countNumberOfSpaces(text: String): Int = text.split("\\s+").length - 1
}
