val Versions = new {
  val jgit = "5.11.0.202103091610-r"
  val ScalaTest = "3.0.1"
}

name := "git-scan"

version := "0.1.0"

scalaVersion := "2.12.13"

libraryDependencies ++= List(
  "org.eclipse.jgit" % "org.eclipse.jgit"              % Versions.jgit,
  "org.scalatest"     %% "scalatest"                   % Versions.ScalaTest % "test"
)

scalacOptions ++= Seq(
  "-Xfatal-warnings"
)

parallelExecution in Test := false
