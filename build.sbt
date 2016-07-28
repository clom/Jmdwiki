name := """Jmdwiki"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  javaCore,
  "mysql" % "mysql-connector-java" % "5.1.39",
  evolutions,
  "com.adrianhurt" %% "play-bootstrap" % "1.1-P25-B3-SNAPSHOT"
)

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

javaOptions in Test += "-Dconfig.file=conf/application.test.conf"
