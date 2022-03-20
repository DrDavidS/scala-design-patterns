package ScalaDesignPatternsLearn.s3_Unification.ADTs

/**
 * Hybrid algebraic data types
 */
case class Point(x: Double, y: Double)

sealed trait Shape

case class Circle(centre: Point, radius: Double) extends Shape

case class Rectangle(topLeft: Point, height: Double, width: Double) extends
  Shape

/**
 * 模式匹配的威力
 */
object Shape {
  def area(shape: Shape): Double =
    shape match {
      case Circle(Point(_, _), radius) => Math.PI * Math.pow(radius, 2)
      case Rectangle(_, h, w) => h * w
    }
}