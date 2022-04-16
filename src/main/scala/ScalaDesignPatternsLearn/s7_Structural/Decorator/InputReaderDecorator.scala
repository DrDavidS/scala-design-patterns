package ScalaDesignPatternsLearn.s7_Structural.Decorator

abstract class InputReaderDecorator(inputReader: InputReader) extends InputReader {
  override def readLines(): Stream[String] =
    inputReader.readLines()
}
