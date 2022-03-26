package ScalaDesignPatternsLearn.s6_CreationalDesignPatterns.DBClientFactory

import ScalaDesignPatternsLearn.s6_CreationalDesignPatterns.DBClient.SimpleConnection

class DatabaseClient(connectorFactory: DatabaseConnectorFactory) {
  def executeQuery(query: String): Unit = {
    val connection: SimpleConnection = connectorFactory.connect()
    connection.executeQuery(query)
  }
}