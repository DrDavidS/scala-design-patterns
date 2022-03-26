package ScalaDesignPatternsLearn.s6_CreationalDesignPatterns.DBClient

trait SimpleConnection {
  def getName: String

  def executeQuery(query: String): Unit
}
