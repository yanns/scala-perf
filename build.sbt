organization := "github.com/yanns"

name := "scala-perf"

scalaVersion := "2.12.8"

version      := "0.1.0-SNAPSHOT"

enablePlugins(JmhPlugin)

libraryDependencies += "org.typelevel" %% "cats-core" % "1.5.0"

scalacOptions += "-Ypartial-unification"
