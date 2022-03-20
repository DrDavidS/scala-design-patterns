package ScalaDesignPatternsLearn.s3_Unification.Modules

trait Alarm {
  trait Alarmer {
    def trigger(): Unit
  }

  def alarm: Alarmer
}
