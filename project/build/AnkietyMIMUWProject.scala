import sbt._

class AnkietyMIMUWProject(info: ProjectInfo) extends DefaultProject(info) with IdeaPlugin {
  val postgresql = "postgresql" % "postgresql" % "8.4-701.jdbc4" 
}
