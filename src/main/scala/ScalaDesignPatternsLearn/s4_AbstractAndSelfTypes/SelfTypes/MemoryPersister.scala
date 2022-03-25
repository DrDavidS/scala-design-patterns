package ScalaDesignPatternsLearn.s4_AbstractAndSelfTypes.SelfTypes

class MemoryPersister[T] extends Persister[T]
  with MemoryDatabase[T]
  with History
  with Mystery {
  override def add(): Unit = {
    super[History].add()
  }
}