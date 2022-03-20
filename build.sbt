libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.12" % "3.2.1",
  "org.apache.spark" % "spark-graphx_2.12" % "3.2.1"
)



ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.15"

ThisBuild / organization := "com.DavidYang"

lazy val root = (project in file("."))
  .settings(
    name := "scala-design-patterns",
    version := "1.0",
    scalaVersion := "2.12.15"
  )
