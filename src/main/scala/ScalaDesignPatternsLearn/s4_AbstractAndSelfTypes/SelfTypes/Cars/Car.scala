package ScalaDesignPatternsLearn.s4_AbstractAndSelfTypes.SelfTypes.Cars

trait Car {
  this: Engine => // self-type
  def drive(): Unit = {
    start()
    println("Vroom vroom!")
  }

  def park(): Unit = {
    println("Break!")
    stop()
  }
}