package ScalaDesignPatternsLearn.s4_AbstractAndSelfTypes.SelfTypes

import scala.collection.mutable

trait Database[T] {
  def save(data: T): Unit
}

trait MemoryDatabase[T] extends Database[T] {
  val db: mutable.MutableList[T] = mutable.MutableList.empty

  override def save(data: T): Unit = {
    println("Saving to in memory database.")
    db.+=:(data)
  }
}

trait FileDatabase[T] extends Database[T] {
  override def save(data: T): Unit = {
    println("Saving to file.")
  }
}
