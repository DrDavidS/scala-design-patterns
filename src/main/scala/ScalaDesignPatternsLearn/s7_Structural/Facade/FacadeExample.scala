package ScalaDesignPatternsLearn.s7_Structural.Facade

object FacadeExample {
  def main(args: Array[String]): Unit = {
    val reader = new DataReader
    println(s"We just read the following person:${reader.readPerson("https://www.ivan-nikolov.com/")}")
  }
}

