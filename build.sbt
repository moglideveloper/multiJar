name := "multiJar"

val testSourceDirectories = Seq("specA", "specB", "specC")

// https://mvnrepository.com/artifact/org.scalatest/scalatest
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0" % Test

unmanagedSourceDirectories in Test ++= testSourceDirectories.map { src => (baseDirectory in Test).value / src }

enablePlugins(PackPlugin)