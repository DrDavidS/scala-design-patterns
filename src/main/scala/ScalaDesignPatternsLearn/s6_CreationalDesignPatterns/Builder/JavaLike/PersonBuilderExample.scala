package ScalaDesignPatternsLearn.s6_CreationalDesignPatterns.Builder.JavaLike

object PersonBuilderExample {
  def main(args: Array[String]): Unit = {
    val person: Person = new PersonBuilder()
      .setFirstName("Ivan")
      .setLastName("Nikolov")
      .setAge(26)
      .build()

    println(s"Person: ${person.firstName} ${person.lastName}.Age: ${person.age}.")
  }
}
