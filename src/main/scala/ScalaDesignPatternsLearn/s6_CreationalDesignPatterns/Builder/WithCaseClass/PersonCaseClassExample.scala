package ScalaDesignPatternsLearn.s6_CreationalDesignPatterns.Builder.WithCaseClass

object PersonCaseClassExample {
  def main(args: Array[String]): Unit = {
    val person1: Person = Person(
      firstName = "Ivan",
      lastName = "Nikolov",
      age = 26
    )
    val person2: Person = Person(
      firstName = "John"
    )
    println(s"Person 1: $person1")
    println(s"Person 2: $person2")
  }
}
