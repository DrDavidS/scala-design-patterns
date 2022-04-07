package ScalaDesignPatternsLearn.s7_Structural.Adapter

class Logger {
  def log(message: String, severity: String): Unit = {
    System.out.println(s"${severity.toUpperCase}: $message")
  }
}
