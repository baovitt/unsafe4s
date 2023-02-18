import Dependencies._

ThisBuild / scalaVersion     := "3.2.0"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.baovitt"
ThisBuild / organizationName := "baovitt"

lazy val root = (project in file("."))
  .settings(
    name := "unsafe4s",
    libraryDependencies += munit % Test
  )