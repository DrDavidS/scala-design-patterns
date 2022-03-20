package ScalaDesignPatternsLearn.s3_Unification.Modules

trait AlarmUser extends Alarm with Tick {
  class AlarmUserImpl extends Alarmer {
    override def trigger(): Unit = {
      if (ticker.count() % 10 == 0) {
        System.out.println(s"Alarm triggered at ${ticker.count()}!")
      }
    }
  }

  object alarm extends AlarmUserImpl
}

object ModuleDemo extends AlarmUser with TickUser {
  def main(args: Array[String]): Unit = {
    println("Running the ticker. Should trigger the alarm every 10 times.")
    (1 to 100).foreach {
      _ =>
        ticker.tick()  // 秒钟+1
        alarm.trigger()
    }
  }
}