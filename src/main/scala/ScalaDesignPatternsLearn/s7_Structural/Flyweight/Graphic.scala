package ScalaDesignPatternsLearn.s7_Structural.Flyweight

import scala.collection.mutable.ListBuffer

class Graphic {
  val items: ListBuffer[(Int, Int, Double, Circle)] = ListBuffer.empty[(Int, Int, Double, Circle)]

  def addCircle(x: Int, y: Int, radius: Double, circle: Circle): Unit = {
    items += ((x, y, radius, circle))
  }

  def draw(): Unit = {
    items.foreach {
      case (x, y, radius, circle) =>
        println(s"Drawing a circle at ($x, $y) with radius $radius: $circle")
    }
  }
}
