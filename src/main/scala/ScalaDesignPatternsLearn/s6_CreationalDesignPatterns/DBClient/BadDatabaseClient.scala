package ScalaDesignPatternsLearn.s6_CreationalDesignPatterns.DBClient

abstract class BadDatabaseClient {
  def executeQuery(query: String): Unit = {
    val connection: SimpleConnection = connect()
    val connectionPrinter: SimpleConnectionPrinter = getConnectionPrinter
    connectionPrinter.printSimpleConnection(connection)
    connection.executeQuery(query)
  }

  protected def connect(): SimpleConnection

  protected def getConnectionPrinter: SimpleConnectionPrinter
}
