package ScalaDesignPatternsLearn.s4_AbstractAndSelfTypes.SelfTypes.InheritanceLeakingFunctionality

trait DB {
  def connect(): Unit = {
    System.out.println("Connected.")
  }

  def dropDatabase(): Unit = {
    System.out.println("Dropping!")
  }

  def close(): Unit = {
    System.out.println("Closed.")
  }
}

trait UserDB {
  this: DB =>
  def createUser(username: String): Unit = {
    connect()
    try {
      println(s"Creating a user: $username")
    } finally {
      close()
    }
  }

  def getUser(username: String): Unit = {
    connect()
    try {
      println(s"Getting a user: $username")
    } finally {
      close()
    }
  }
}

trait UserService {
  this: UserDB =>
  // does not compile
  // def bad(): Unit = {
  // dropDatabase()
  //}
//  def preCreate(): Unit = {
  //    createUser("David")
  //    println("Create User David.")
  //  }
}
