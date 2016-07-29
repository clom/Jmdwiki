name := """Jmdwiki"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  javaCore,
  "mysql" % "mysql-connector-java" % "5.1.39",
  evolutions
)

lazy val myProject = (project in file(".")).enablePlugins(PlayJava, PlayEbean)
