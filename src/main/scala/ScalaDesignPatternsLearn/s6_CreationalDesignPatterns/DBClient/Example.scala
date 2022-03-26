package ScalaDesignPatternsLearn.s6_CreationalDesignPatterns.DBClient

object Example {
  def main(args: Array[String]): Unit = {
    val clientMySql: DatabaseClient = new MysqlClient
    val clientPgSql: DatabaseClient = new PgSqlClient
    val clientLindorm: DatabaseClient = new LindormClient

    clientMySql.executeQuery("SELECT * FROM users")
    clientPgSql.executeQuery("SELECT * FROM employees")
    clientLindorm.executeQuery("SELECT * FROM test")
  }
}
