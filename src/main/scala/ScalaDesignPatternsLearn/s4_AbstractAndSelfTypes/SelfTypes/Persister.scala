package ScalaDesignPatternsLearn.s4_AbstractAndSelfTypes.SelfTypes

/**
 * 假如我们想要将数据持久化到数据库
 *
 * 1. Persister extend Database，这样不好
 * 2. Have a variable for Database in Persister and use it.
 * 3. Use self types.
 *
 * @tparam T 泛型
 */
trait Persister[T] {
  this: Database[T] with History with Mystery => // we included our self type using this statement，或者 self 也可以
  def persist(data: T): Unit = {
    println("Calling persist.")
    save(data)
    add()
  }
}
