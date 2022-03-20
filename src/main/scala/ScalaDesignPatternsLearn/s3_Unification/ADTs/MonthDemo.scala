package ScalaDesignPatternsLearn.s3_Unification.ADTs

object MonthDemo {
  def main(args: Array[String]): Unit = {
    val month: Month = February
    println(s"The current month is: $month")

    println(s"The current month is: $month and it's number ${Month.toInt(month)}")
  }
}