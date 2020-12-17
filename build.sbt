lazy val root = (project in file(".")).
  settings(
    name := "sbt-hello",
    version := "1.0",
    scalaVersion := "3.0.0-M3",
    libraryDependencies ++= Seq(
      ("org.http4s" %% "http4s-core" % "0.21.14").withDottyCompat(scalaVersion.value),
      ("org.http4s" %% "http4s-dsl" % "0.21.14").withDottyCompat(scalaVersion.value)
    )
  )
