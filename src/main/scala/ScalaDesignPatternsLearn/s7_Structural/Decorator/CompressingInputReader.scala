package ScalaDesignPatternsLearn.s7_Structural.Decorator

import com.typesafe.scalalogging.LazyLogging

import java.io.ByteArrayOutputStream
import java.nio.charset.Charset
import java.util.zip.GZIPOutputStream

class CompressingInputReader(inputReader: InputReader) extends InputReaderDecorator(inputReader) with LazyLogging {
  override def readLines(): Stream[String] = super.readLines().map {
    line: String =>
      val text: Array[Byte] = line.getBytes(Charset.forName("UTF-8"))
      logger.info("Length before compression: {}", text.length.toString)
      val output = new ByteArrayOutputStream() // Creates a new byte array output stream.
      val compressor = new GZIPOutputStream(output) // Creates a new output stream with a default buffer size.
      try {
        compressor.write(text, 0, text.length)
        val outputByteArray: Array[Byte] = output.toByteArray
        logger.info("Length after compression: {}", outputByteArray.length.toString)
        new String(outputByteArray, Charset.forName("UTF-8"))
      } finally {
        compressor.close()
        output.close()
      }
  }
}