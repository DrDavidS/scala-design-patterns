package ScalaDesignPatternsLearn.s5_AspectOriented.Robot

class Robot extends RobotRegistry {
  def cook(what: String): Food = cooker.cook(what)

  def getTime: String = time.getTime
}
