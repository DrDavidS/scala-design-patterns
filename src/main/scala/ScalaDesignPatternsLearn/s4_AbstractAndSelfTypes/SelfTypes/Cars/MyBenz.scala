package ScalaDesignPatternsLearn.s4_AbstractAndSelfTypes.SelfTypes.Cars

class MyBenz extends Car with Engine {
  override def fuelType: FuelType = Diesel
}

object MyBenz {
  def main(args: Array[String]): Unit = {
    val myCar = new MyBenz
  }
}
