package ScalaDesignPatternsLearn.s4_AbstractAndSelfTypes.AbstractTypes

object PrinterExample {
  def main(args: Array[String]): Unit = {
    val laser = new LaserPrinter
    val threeD = new ThreeDPrinter
    System.out.println(laser.print(Text(), Toner(), Paper()))
    System.out.println(threeD.print(Model(), Plastic(), Air()))
    // System.out.println(laser.print(Model(), Plastic(), Air()))  // 使用抽象类型就比较OK，会识别到错误

    val genericLaser = new GenericLaserPrinter[Text, Toner, Paper]
    val genericThreeD = new GenericThreeDPrinter[Model, Plastic, Air]
    System.out.println(genericLaser.print(Text(), Toner(), Paper()))
    System.out.println(genericThreeD.print(Model(), Plastic(), Air()))

    // 本不应该这样，使用泛型可能会有一些逻辑错误
    // 如果使用抽象类型，则可以避免，因为已经规定好了
    val wrongPrinter = new GenericPrinterImpl[Model, Toner, Air]
    System.out.println(wrongPrinter.print(Model(), Toner(), Air()))
  }
}
