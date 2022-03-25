package ScalaDesignPatternsLearn.s5_AspectOriented.AOP

import org.json4s._
import org.json4s.jackson.JsonMethods._

// 如果使用time，那么代码可读性大大降低
class DataReaderImpl2 extends DataReader {
  implicit val formats: DefaultFormats.type = DefaultFormats

  private def readUntimed(): List[Person] =
    parse(getClass.getResourceAsStream("file.json")).extract[List[Person]]

  override def readData(): List[Person] = {
    val startMillis: Long = System.currentTimeMillis()
    val result: List[Person] = readUntimed()
    val time: Long = System.currentTimeMillis() - startMillis
    System.err.println(s"readData took $time milliseconds.")
    result
  }

  override def readDataInefficiently(): List[Person] = {
    val startMillis: Long = System.currentTimeMillis()
    (1 to 10000).foreach((_: Int) => readUntimed())
    val result: List[Person] = readUntimed()
    val time: Long = System.currentTimeMillis() - startMillis
    System.err.println(s"readDataInefficiently took $time milliseconds.")
    result
  }
}

object DataReaderExample2 {
  def main(args: Array[String]): Unit = {
    val dataReader = new DataReaderImpl2
    println(s"I just read the following data efficiently:${dataReader.readData()}")
    println(s"I just read the following data inefficiently:${dataReader.readDataInefficiently()}")
  }
}