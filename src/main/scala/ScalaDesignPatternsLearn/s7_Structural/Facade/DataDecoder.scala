package ScalaDesignPatternsLearn.s7_Structural.Facade

import java.util.Base64

trait DataDecoder {
  // 从Base64编码解码
  def decode(data: Array[Byte]): String = new String(Base64.getDecoder.decode(data), "UTF-8")
}
