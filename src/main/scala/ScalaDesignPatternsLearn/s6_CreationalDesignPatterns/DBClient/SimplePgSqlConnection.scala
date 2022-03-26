package ScalaDesignPatternsLearn.s6_CreationalDesignPatterns.DBClient

class SimplePgSqlConnection extends SimpleConnection {
  override def getName: String = "SimplePgSqlConnection"

  override def executeQuery(query: String): Unit = {
    println(s"Executing the query '$query' the PgSQL way.")
  }
}
