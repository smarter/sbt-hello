lazy val root = (project in file(".")).
  settings(
    name := "sbt-hello",
    version := "1.0",
    scalaVersion := "2.12.2",

    // For sbt 1
    // classpathOptions := new xsbti.compile.ClasspathOptions(true, false, false, /*autoBoot =*/ false, /*filterLibrary =*/ false)
    // For sbt 0.13
    classpathOptions := classpathOptions.value.copy(autoBoot = false, filterLibrary = false)
  )
