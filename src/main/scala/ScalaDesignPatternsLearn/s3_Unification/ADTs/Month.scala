package ScalaDesignPatternsLearn.s3_Unification.ADTs

/**
 * Sum ADTs
 *
 * 在 Sum 代数类型中，我们可以简单枚举一个类型的所有可能值。比如一年有12个月。12个月是固定的，不会变换的。
 */

sealed trait Month

case object January extends Month

case object February extends Month

case object March extends Month

case object April extends Month

case object May extends Month

case object June extends Month

case object July extends Month

case object August extends Month

case object September extends Month

case object October extends Month

case object November extends Month

case object December extends Month

object Month {
  def toInt(month: Month): Int =
    month match {
      case January => 1
      case February => 2
      case March => 3
      case April => 4
      case May => 5
      case June => 6
      case July => 7
      case August => 8
      case September => 9
      case October => 10
      case November => 11
      case December => 12
      case _ => 0
    }
}