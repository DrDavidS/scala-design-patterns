package ScalaDesignPatternsLearn.s7_Structural.Composite

class Leaf(data: String) extends Node {
  override def print(prefix: String): Unit =
    println(s"$prefix$data")
}
