package ScalaDesignPatternsLearn.s4_AbstractAndSelfTypes.SelfTypes.Cars

trait Engine {
  private var running = false

  def start(): Unit = {
    if (!running) println("Engine started")
    running = true
  }

  def stop(): Unit = {
    if (running) println("Engine stopped")
    running = false
  }

  def isRunning: Boolean = running

  def fuelType: FuelType
}
