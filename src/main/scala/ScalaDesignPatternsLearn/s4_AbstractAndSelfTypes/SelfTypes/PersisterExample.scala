package ScalaDesignPatternsLearn.s4_AbstractAndSelfTypes.SelfTypes

/**
 * self 类型和 继承 是不同的，可以允许我们很好地去分割一些功能.
 * Self types 经常用于依赖注入. 这是 cake design pattern 的主要部分.
 */
object PersisterExample {
  def main(args: Array[String]): Unit = {
    val fileStringPersister = new FilePersister[String]
    val memoryIntPersister = new MemoryPersister[Int]

    fileStringPersister.persist("Something")
    fileStringPersister.persist("Something else")
    memoryIntPersister.persist(100)
    memoryIntPersister.persist(123)
  }
}
