package ScalaDesignPatternsLearn.s6_CreationalDesignPatterns.DBClient

object BadExample {
  def main(args: Array[String]): Unit = {
    val clientMySql: BadDatabaseClient = new BadMySqlClient
    val clientPgSql: BadDatabaseClient = new BadPgSqlClient

    clientMySql.executeQuery("SELECT * FROM users")
    clientPgSql.executeQuery("SELECT * FROM employees") // 逻辑错误
  }
}
