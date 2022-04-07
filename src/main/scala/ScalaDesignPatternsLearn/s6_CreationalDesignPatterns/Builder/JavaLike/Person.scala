package ScalaDesignPatternsLearn.s6_CreationalDesignPatterns.Builder.JavaLike

class Person(builder: PersonBuilder) {
  val firstName: String = builder.firstName
  val lastName: String = builder.lastName
  val age: Int = builder.age

}
