package ScalaDesignPatternsLearn.s6_CreationalDesignPatterns.SimpleFactory

import java.util.Properties

/**
 * lazy
 *
 * 好处就是如果要经过一个很慢的初始化过程的时候，将其推后到真正需要用时才初始化。
 *
 * 当然也有坏处，就是在JAVA中这样不太线程安全。
 */
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