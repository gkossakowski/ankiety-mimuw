package pl.edu.mimuw.ankiety

import java.sql.{ResultSet, Connection, DriverManager}

object Main {

  def getConnection: Connection = {
    Class.forName("org.postgresql.Driver");
    import PostgresConf._
    val url = "jdbc:postgresql://%s/%s".format(hostname, db)
    DriverManager.getConnection(url, username, password)
  }

  def main(args: Array[String]) {
    val connection = getConnection
    val stmt = connection.createStatement
    val rs: ResultSet = stmt.executeQuery("SELECT * FROM costam")
    rs.next
    println(rs.getInt("id"))
    println("hello")
  }

}
