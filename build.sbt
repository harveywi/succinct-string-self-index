import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "Pure Functional Succinct String Self-Index",
    libraryDependencies ++= Seq(
      "org.scalaz" %% "scalaz-zio" % "0.9",
      "org.scalaz" %% "scalaz-zio-interop-scalaz7x", "0.9",
      "org.scalaz" %% "scalaz-core" % "7.2.27",
      scalaTest % Test
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
