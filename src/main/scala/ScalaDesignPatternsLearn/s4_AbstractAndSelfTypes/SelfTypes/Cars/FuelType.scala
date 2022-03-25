package ScalaDesignPatternsLearn.s4_AbstractAndSelfTypes.SelfTypes.Cars

// 燃油种类
sealed trait FuelType

case object Gasoline extends FuelType

case object Diesel extends FuelType
