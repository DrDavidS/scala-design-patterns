package ScalaDesignPatternsLearn.s5_AspectOriented.Robot

case class Food(name: String)

trait Time {
  def getTime: String
}

trait RecipeFinder {
  def findRecipe(dish: String): String
}

trait Cooker {
  def cook(what: String): Food
}
