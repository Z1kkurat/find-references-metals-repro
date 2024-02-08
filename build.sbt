import Dependencies._

ThisBuild / scalaVersion := "2.13.12"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

lazy val mod1 = project
  .in(file("mod1"))
  .settings(
    name := "mod1",
    libraryDependencies += "com.evolutiongaming" %% "retry" % "3.0.2"
  )

lazy val mod2 = project
  .in(file("mod2"))
  .settings(
    name := "mod2",
    libraryDependencies += "com.evolutiongaming" %% "retry" % "3.0.2"
  )

lazy val root = (project in file("."))
  .settings(
    name := "find-references-metals-repro"
  )
  .aggregate(mod1, mod2)

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
