name := "my-scala-app"

version := "1.0"

scalaVersion := "2.13.5"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.7"

mainClass in Compile := Some("com.example.Main")