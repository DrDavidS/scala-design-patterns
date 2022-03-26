package ScalaDesignPatternsLearn.s6_CreationalDesignPatterns.DBClient

class SimplePgSqlConnectionPrinter extends SimpleConnectionPrinter {
  override def printSimpleConnection(connection: SimpleConnection): Unit = {
    println(s"I require a PgSQL connection. It is:'${connection.getName}'")
  }
}
