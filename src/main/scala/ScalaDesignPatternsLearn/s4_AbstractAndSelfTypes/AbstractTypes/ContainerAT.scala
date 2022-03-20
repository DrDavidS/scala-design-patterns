package ScalaDesignPatternsLearn.s4_AbstractAndSelfTypes.AbstractTypes

/**
 * 除了泛型以外，还可以使用抽象类型
 */
trait ContainerAT {
  type T
  val data: T

  def compare(other: T): Boolean = data.equals(other)
}
