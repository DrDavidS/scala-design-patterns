package ScalaDesignPatternsLearn.s5_AspectOriented.Robot

object RobotExample {
  def main(args: Array[String]): Unit = {
    val robot = new Robot

    println(robot.getTime)
    println(robot.cook("chips"))
    println(robot.cook("sandwich"))
  }
}
