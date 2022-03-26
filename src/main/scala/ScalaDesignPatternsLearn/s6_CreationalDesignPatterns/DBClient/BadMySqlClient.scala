package ScalaDesignPatternsLearn.s6_CreationalDesignPatterns.DBClient

class BadMySqlClient extends BadDatabaseClient {
  override protected def connect(): SimpleConnection = new SimpleMysqlConnection

  override protected def getConnectionPrinter: SimpleConnectionPrinter = new SimpleMySqlConnectionPrinter
}

class BadPgSqlClient extends BadDatabaseClient {
  override protected def connect(): SimpleConnection = new SimplePgSqlConnection

  override protected def getConnectionPrinter: SimpleConnectionPrinter = new SimpleMySqlConnectionPrinter  // 这里的问题
}