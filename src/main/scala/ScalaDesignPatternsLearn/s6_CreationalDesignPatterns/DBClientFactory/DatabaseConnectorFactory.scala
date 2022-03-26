package ScalaDesignPatternsLearn.s6_CreationalDesignPatterns.DBClientFactory

import ScalaDesignPatternsLearn.s6_CreationalDesignPatterns.DBClient.{SimpleConnection, SimpleMysqlConnection, SimplePgSqlConnection}

trait DatabaseConnectorFactory {
  def connect(): SimpleConnection
}

class MySqlFactory extends DatabaseConnectorFactory {
  override def connect(): SimpleConnection = new SimpleMysqlConnection
}

class PgSqlFactory extends DatabaseConnectorFactory {
  override def connect(): SimpleConnection = new SimplePgSqlConnection
}