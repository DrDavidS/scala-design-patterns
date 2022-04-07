package ScalaDesignPatternsLearn.s7_Structural.Adapter

class FinalAppLogger extends Log {
  private val logger = new FinalLogger

  override def info(message: String): Unit = logger.log(message, "info")

  override def warning(message: String): Unit = logger.log(message, "warning")

  override def error(message: String): Unit = logger.log(message, "error")

  override def debug(message: String): Unit = logger.log(message, "debug")

}
