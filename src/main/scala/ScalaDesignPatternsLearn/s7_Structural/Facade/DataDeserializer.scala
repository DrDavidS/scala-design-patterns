package ScalaDesignPatternsLearn.s7_Structural.Facade

import org.json4s.DefaultFormats
import org.json4s.jackson.JsonMethods

trait DataDeserializer {
  // εεΊεε
  implicit val formats: DefaultFormats.type = DefaultFormats

  def parse[T](data: String)(implicit m: Manifest[T]): T = {
    JsonMethods.parse(data).extract[T]
  }
}
