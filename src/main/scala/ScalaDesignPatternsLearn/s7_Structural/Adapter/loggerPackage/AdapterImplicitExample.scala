package ScalaDesignPatternsLearn.s7_Structural.Adapter.loggerPackage

import ScalaDesignPatternsLearn.s7_Structural.Adapter.{FinalLogger, Log}

object AdapterImplicitExample {
  def main(args: Array[String]): Unit = {
    val logger: Log = new FinalLogger
    logger.info("This is an info message.")
    logger.debug("Debug something here.")
    logger.error("Show an error message.")
    logger.warning("About to finish.")
    logger.info("Bye!")
  }
}
