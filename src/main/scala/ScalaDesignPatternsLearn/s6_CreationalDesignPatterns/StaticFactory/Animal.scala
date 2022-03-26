package ScalaDesignPatternsLearn.s6_CreationalDesignPatterns.StaticFactory

trait Animal

class Bird extends Animal

class Mammal extends Animal

class Fish extends Animal

// 如果新增一种动物类型，那么下面的case需要修改
object Animal {
  def apply(animal: String): Animal = animal.toLowerCase match {
    case "bird" => new Bird
    case "mammal" => new Mammal
    case "fish" => new Fish
    case x: String => throw new RuntimeException(s"Unknown animal: $x")
  }
}