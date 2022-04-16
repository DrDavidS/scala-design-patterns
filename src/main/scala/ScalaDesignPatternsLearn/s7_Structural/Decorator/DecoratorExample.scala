package ScalaDesignPatternsLearn.s7_Structural.Decorator

import java.io.{BufferedInputStream, BufferedReader, InputStreamReader}

object DecoratorExample {
  def main(args: Array[String]): Unit = {
    val stream = new BufferedReader(
      new InputStreamReader(
        new BufferedInputStream(this.getClass.getResourceAsStream("src/main/resource/data.txt"))
      )
    )
    try {
      val reader = new CapitalizedInputReader(new AdvancedInputReader(stream))
      reader.readLines().foreach(println)
    } finally {
      stream.close()
    }
  }
}
