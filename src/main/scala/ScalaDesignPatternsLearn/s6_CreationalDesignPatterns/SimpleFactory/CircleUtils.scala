package ScalaDesignPatternsLearn.s6_CreationalDesignPatterns.SimpleFactory

import java.util.Properties

object CircleUtils {
  val basicPi = 3.14
  lazy val precisePi: Double = {
    println("Reading properties for the precise PI.")
    val props = new Properties()

    props.load(getClass.getResourceAsStream("pi.properties"))
    props.getProperty("pi.high").toDouble
  }

  /**
   *
   * @param radius    半径
   * @param isPrecise 是否需要高精度π
   * @return 圆的面积
   */
  def area(radius: Double, isPrecise: Boolean = false): Double = {
    val pi: Double = if (isPrecise) precisePi else basicPi
    pi * Math.pow(radius, 2)
  }
}