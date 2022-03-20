package ScalaDesignPatternsLearn.s4_AbstractAndSelfTypes.AbstractTypes

object AbstractTypesExamples {
  def main(args: Array[String]): Unit = {
    val stringContainer = new StringContainer("some text")
    println(s"Comparing with string: ${stringContainer.compare("some text")}")
  }
}
