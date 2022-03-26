package ScalaDesignPatternsLearn.s6_CreationalDesignPatterns.DBClient

class SimpleLindormConnection extends SimpleConnection {
  override def getName: String = "SimpleLindormConnection"

  override def executeQuery(query: String): Unit = {
    println(s"Executing the query '$query' the Lindorm way.")
  }
}
