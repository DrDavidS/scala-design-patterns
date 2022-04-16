package ScalaDesignPatternsLearn.s7_Structural.Facade

class DataReader extends DataDownloader with DataDecoder with DataDeserializer {
  def readPerson(url: String): Person = {
    val data: Array[Byte] = download(url) // 下载信息，序列化的
    val json: String = decode(data) // 解码
    parse[Person](json)
  }
}
