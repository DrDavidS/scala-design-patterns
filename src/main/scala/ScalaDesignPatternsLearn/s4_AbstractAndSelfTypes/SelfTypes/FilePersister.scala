package ScalaDesignPatternsLearn.s4_AbstractAndSelfTypes.SelfTypes

class FilePersister[T] extends Persister[T]
  with FileDatabase[T]
  with History
  with Mystery {
  override def add(): Unit = {
    super[History].add()
  }
}