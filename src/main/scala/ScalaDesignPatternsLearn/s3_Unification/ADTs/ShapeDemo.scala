package ScalaDesignPatternsLearn.s3_Unification.ADTs

object ShapeDemo {
  def main(args: Array[String]): Unit = {
    val circle: Circle = Circle(Point(1, 2), 2.5)
    val rect: Rectangle = Rectangle(Point(6, 7), 5, 6)

    println(s"The circle area is: ${Shape.area(circle)}")
    println(s"The rectangle area is: ${Shape.area(rect)}")
  }
}