package ScalaDesignPatternsLearn.s5_AspectOriented.Robot

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

trait TimeComponent {
  val time: Time

  class TimeImpl extends Time {
    val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss")

    override def getTime: String = s"The time is:${LocalDateTime.now().format(formatter)}"
  }
}