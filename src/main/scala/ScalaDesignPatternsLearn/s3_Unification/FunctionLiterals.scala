package ScalaDesignPatternsLearn.s3_Unification

/**
 * 函数常量
 */
class FunctionLiterals {
  val sum: (Int, Int) => Int = (a: Int, b: Int) => a + b
}

object FunctionLiterals {
  def main(args: Array[String]): Unit = {
    val obj = new FunctionLiterals
    println(s"3 + 9 = ${obj.sum(3, 9)}")
  }
}