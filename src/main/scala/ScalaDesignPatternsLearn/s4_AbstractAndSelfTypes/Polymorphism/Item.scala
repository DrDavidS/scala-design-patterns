package ScalaDesignPatternsLearn.s4_AbstractAndSelfTypes.Polymorphism

/**
 * 多态的应用
 *
 * 这是每个开发人员都知道的多态性，它与具体类实现中的重写方法有关。考虑以下简单的层次结构:
 */
abstract class Item {
  def pack: String
}

class Fruit extends Item {
  override def pack: String = "I'm a fruit and I'm packed in a bag."
}

class Drink extends Item {
  override def pack: String = "I'm a drink and I'm packed in a bottle."
}

object SubtypePolymorphismExample {
  def main(args: Array[String]): Unit = {
    val shoppingBasket: List[Item] = List(
      new Fruit,
      new Drink
    )
    shoppingBasket.foreach((i: Item) => System.out.println(i.pack))
  }
}