package ScalaDesignPatternsLearn.s5_AspectOriented.Robot

trait CookingComponent {
  this: RecipeComponent =>
  val cooker: Cooker

  class CookerImpl extends Cooker {
    override def cook(what: String): Food = {
      val recipeText: String = recipe.findRecipe(what)
      Food(s"We just cooked $what using the following recipe:'$recipeText'.")
    }
  }
}
