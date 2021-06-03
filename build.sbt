name := "tasty-default-param-bug"

version := "0.1"

lazy val scala2 = project.dependsOn(scala3).settings(
  scalacOptions += "-Ytasty-reader",
  scalaVersion := "2.13.6",
)

lazy val scala3 = project.settings(
  scalaVersion := "3.0.0"
)
