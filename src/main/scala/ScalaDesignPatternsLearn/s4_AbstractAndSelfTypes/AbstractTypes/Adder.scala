package ScalaDesignPatternsLearn.s4_AbstractAndSelfTypes.AbstractTypes

/**
 * 泛型的运用
 *
 * 这里定义了一个 sum 方法，可以用在各种数据类型中。
 * 我们当然不希望用重载的方法挨个试一遍，所以在这里使用泛型。
 */
trait Adder {
  def sum[T](a: T, b: T)(implicit numeric: Numeric[T]): T =
    numeric.plus(a, b)
}
