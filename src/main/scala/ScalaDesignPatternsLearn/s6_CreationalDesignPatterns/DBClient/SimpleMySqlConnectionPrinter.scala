package ScalaDesignPatternsLearn.s6_CreationalDesignPatterns.DBClient

class SimpleMySqlConnectionPrinter extends SimpleConnectionPrinter {
  override def printSimpleConnection(connection: SimpleConnection): Unit = {
    println(s"I require a MySQL connection. It is:'${connection.getName}'")
  }
}
