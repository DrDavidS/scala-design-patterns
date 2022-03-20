package ScalaDesignPatternsLearn.s3_Unification.Modules

trait TickUser extends Tick {
  class TickUserImpl extends Ticker {
    var curr = 0
    override def count(): Int = curr
    override def tick(): Unit = {
      curr = curr + 1
    }
  }
  object ticker extends TickUserImpl
}