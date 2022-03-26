package ScalaDesignPatternsLearn.s6_CreationalDesignPatterns.DBClient

abstract class DatabaseClient {
  def executeQuery(query: String): Unit = {
    val connection: SimpleConnection = connect()
    connection.executeQuery(query)
  }

  protected def connect(): SimpleConnection
}

class MysqlClient extends DatabaseClient {
  override protected def connect(): SimpleConnection = new SimpleMysqlConnection
}

class PgSqlClient extends DatabaseClient {
  override protected def connect(): SimpleConnection = new SimplePgSqlConnection
}

class LindormClient extends DatabaseClient{
  override protected def connect(): SimpleConnection = new SimpleLindormConnection
}