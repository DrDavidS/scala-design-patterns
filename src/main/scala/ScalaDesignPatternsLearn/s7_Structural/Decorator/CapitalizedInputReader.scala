package ScalaDesignPatternsLearn.s7_Structural.Decorator

class CapitalizedInputReader(inputReader: InputReader) extends InputReaderDecorator(inputReader) {
  override def readLines(): Stream[String] =
    super.readLines().map((_: String).toUpperCase)
}
