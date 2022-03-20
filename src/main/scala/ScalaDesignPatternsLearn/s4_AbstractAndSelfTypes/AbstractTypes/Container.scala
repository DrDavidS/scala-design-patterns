package ScalaDesignPatternsLearn.s4_AbstractAndSelfTypes.AbstractTypes

/**
 *
 * @param data 各种不同类型的数据，比如 int、String
 * @tparam T 多种类型，这里演示了  int、String
 */
class Container[T](data: T) {
  def compare(other: T): Boolean = data.equals(other)
}