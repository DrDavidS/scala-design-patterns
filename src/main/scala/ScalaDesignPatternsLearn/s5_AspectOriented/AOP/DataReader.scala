package ScalaDesignPatternsLearn.s5_AspectOriented.AOP

import org.json4s._
import org.json4s.jackson.JsonMethods._

trait DataReader {
  // 读取数据
  def readData(): List[Person]

  // 不太有效率的读取
  def readDataInefficiently(): List[Person]
}

class DataReaderImpl extends DataReader {

  implicit val formats: DefaultFormats.type = DefaultFormats

  private def readUntimed(): List[Person] =
    parse(getClass.getResourceAsStream("file.json")).extract[List[Person]]

  override def readData(): List[Person] = readUntimed()

  override def readDataInefficiently(): List[Person] = {

    (1 to 10000).foreach((_: Int) => readUntimed())
    readUntimed()
  }
}

object DataReaderExample {
  def main(args: Array[String]): Unit = {
    val dataReader = new DataReaderImpl
    println(s"I just read the following data efficiently:${dataReader.readData()}")
    println(s"I just read the following data inefficiently:${dataReader.readDataInefficiently()}")
  }
}