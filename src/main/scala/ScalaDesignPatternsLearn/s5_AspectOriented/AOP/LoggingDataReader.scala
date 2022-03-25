package ScalaDesignPatternsLearn.s5_AspectOriented.AOP

trait LoggingDataReader extends DataReader {
  // abstract override 是什么意思？
  abstract override def readData(): List[Person] = {
    val startMillis: Long = System.currentTimeMillis()
    val result: List[Person] = super.readData() // 这里后面执行的就是DataReaderImpl重写的逻辑
    val time: Long = System.currentTimeMillis() - startMillis
    System.err.println(s"readData took $time milliseconds.")
    result
  }

  abstract override def readDataInefficiently(): List[Person] = {
    val startMillis: Long = System.currentTimeMillis()
    val result: List[Person] = super.readDataInefficiently() // 这里后面执行的就是DataReaderImpl重写的逻辑
    val time: Long = System.currentTimeMillis() - startMillis
    System.err.println(s"readDataInefficiently took $time milliseconds.")
    result
  }
}

object DataReaderAOPExample {
  def main(args: Array[String]): Unit = {
    val dataReader = new DataReaderImpl with LoggingDataReader // 关键在这里
    // 我们以后可以加入更多特性，比如更多的logging，重试逻辑等等，只需要mix in就行了
    System.out.println(s"I just read the following data efficiently:${dataReader.readData()}")
    System.out.println(s"I just read the following data inefficiently:${dataReader.readDataInefficiently()}")
  }
}