package ScalaDesignPatternsLearn.s4_AbstractAndSelfTypes.AbstractTypes

object GenericsExamples extends Adder {
  def main(args: Array[String]): Unit = {
    println(s"1 + 3 = ${sum(1, 3)}")
    println(s"1.2 + 6.7 = ${sum(1.2, 6.7)}")
    // println(s"abc + cde = ${sum("abc", "cde")}") // compilation fails

    val intContainer = new Container(10)
    println(s"Comparing with int: ${intContainer.compare(11)}")

    val stringContainer = new Container("some text")
    println(s"Comparing with string: ${stringContainer.compare("some text")}")
  }
}
