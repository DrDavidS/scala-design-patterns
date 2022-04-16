package ScalaDesignPatternsLearn.s7_Structural.Decorator

trait InputReader {
  def readLines(): Stream[String]
}
