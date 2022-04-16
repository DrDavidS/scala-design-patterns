package ScalaDesignPatternsLearn.s7_Structural.Decorator

import java.io.BufferedReader
import scala.jdk.CollectionConverters.asScalaIteratorConverter

class AdvancedInputReader(reader: BufferedReader) extends InputReader {
  override def readLines(): Stream[String] =
    reader.lines().iterator().asScala.toStream
}
