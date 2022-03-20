package ScalaDesignPatternsLearn.s3_Unification.FunctionLiterals

/**
 * 函数常量
 */
class FunctionLiterals {
  val sum: (Int, Int) => Int = (a: Int, b: Int) => a + b

  // 语法糖
  def runOperation(f: (Int, Int) => Int, a: Int, b: Int): Int = {
    f(a, b)
  }
}

object FunctionLiterals {
  def main(args: Array[String]): Unit = {
    val obj = new FunctionLiterals
    println(s"3 + 9 = ${obj.sum(3, 9)}")
  }
}