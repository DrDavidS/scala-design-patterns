package ScalaDesignPatternsLearn.s7_Structural.Flyweight

import scala.collection.mutable

class Circle(color: Color) {
  println(s"Creating a circle with $color color.")

  override def toString: String = s"Circle($color)"
}

object Circle {
  val cache = mutable.Map.empty[Color, Circle]

  def apply(color: Color): Circle = cache.getOrElseUpdate(color, new Circle(color))

  def circlesCreated(): Int = cache.size
}