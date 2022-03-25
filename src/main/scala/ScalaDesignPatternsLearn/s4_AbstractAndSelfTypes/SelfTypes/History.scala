package ScalaDesignPatternsLearn.s4_AbstractAndSelfTypes.SelfTypes

trait History {
  def add(): Unit = {
    println("Action added to history.")
  }
}
