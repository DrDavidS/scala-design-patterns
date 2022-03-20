package ScalaDesignPatternsLearn.s3_Unification.Modules

trait Tick {
  trait Ticker {
    def count(): Int

    def tick(): Unit
  }

  def ticker: Ticker
}
