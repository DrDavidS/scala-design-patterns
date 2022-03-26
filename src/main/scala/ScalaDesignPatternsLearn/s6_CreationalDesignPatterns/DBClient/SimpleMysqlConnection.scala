package ScalaDesignPatternsLearn.s6_CreationalDesignPatterns.DBClient

class SimpleMysqlConnection extends SimpleConnection {
  override def getName: String = "SimpleMysqlConnection"

  override def executeQuery(query: String): Unit = {
    println(s"Executing the query '$query' the MySQL way.")
  }
}