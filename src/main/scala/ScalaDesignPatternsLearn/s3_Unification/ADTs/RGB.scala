package ScalaDesignPatternsLearn.s3_Unification.ADTs

sealed case class RGB(red: Int, green: Int, blue: Int)

/**
 * 我们不能人力穷举所有的RGB色彩，但是可以用一个构造器来生成不同的值。
 */
object RGBDemo {
  def main(args: Array[String]): Unit = {
    val magenta: RGB = RGB(255, 0, 255)
    println(s"Magenta in RGB is: $magenta")
  }
}
