package ScalaDesignPatternsLearn.s7_Structural.Composite

import scala.collection.mutable.ListBuffer

class Tree extends Node {
  private val children: ListBuffer[Node] = ListBuffer.empty[Node]

  override def print(prefix: String): Unit = {
    println(s"$prefix(")
    children.foreach((_: Node).print(s"$prefix$prefix"))
    println(s"$prefix)")
  }

  def add(child: Node): Unit = {
    children += child
  }

  def remove(): Unit = {
    if (children.nonEmpty) {
      children.remove(0)
    }
  }
}
