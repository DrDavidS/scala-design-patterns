package ScalaDesignPatternsLearn.s4_AbstractAndSelfTypes.Polymorphism

trait Adder[T] {
  def sum(a: T, b: T): T
}

/**
 * implicitly 隐式地声明，存在一个从 T 到 Adder[T] 的转换
 *
 * 特殊的多态性允许我们在不修改基类的情况下扩展代码
 */
object Adder {
  def sum[T: Adder](a: T, b: T): T = implicitly[Adder[T]].sum(a, b)

  implicit val int2Adder: Adder[Int] = new Adder[Int] {
    override def sum(a: Int, b: Int): Int = a + b
  }

  // same implementation as above, but allowed when the trait has a single method
  implicit val string2Adder: Adder[String] =
    (a: String, b: String) => s"$a concatenated with $b"
}

object AdhocPolymorphismExample {

  import Adder._

  // 我们的代码是不知道怎么自动将 int 或者 string 转换为 Adder[Int] 或者 Adder[String].
  // 所以需要在上面的 Adder 里面写明白
  def main(args: Array[String]): Unit = {
    System.out.println(s"The sum of 1 + 2 is ${sum(1, 2)}")
    System.out.println(s"The sum of abc + def is ${sum("abc", "def")}")
  }
}