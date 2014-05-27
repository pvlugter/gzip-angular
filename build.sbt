lazy val root = (project in file(".")).enablePlugins(PlayScala)

pipelineStages := Seq(gzip)

libraryDependencies += "org.webjars" % "angularjs" % "1.3.0-beta.8"
