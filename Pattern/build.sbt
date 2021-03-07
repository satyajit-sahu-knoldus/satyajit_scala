
name := "Pattern"

version := "0.1"

scalaVersion := "2.13.5"

maintainer := "Satyajit Sahu <satyajit.sahu@knoldus.com>"

lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.5" % "test"

lazy val root = project.in(file(".")).settings(
  libraryDependencies += scalaTest,
  maintainer := "Satyajit Sahu <satyajit.sahu@knoldus.com>"
).aggregate(flags, cliParser)
  .enablePlugins(UniversalPlugin)
  .enablePlugins(JavaAppPackaging, GraalVMNativeImagePlugin)


lazy val cliParser = project.in(file("cli-parser"))
  .settings(
    libraryDependencies += scalaTest,
    maintainer := "Satyajit Sahu <satyajit.sahu@knoldus.com>"
  ).dependsOn(flags)
  .enablePlugins(UniversalPlugin)
  .enablePlugins(JavaAppPackaging, GraalVMNativeImagePlugin)

lazy val flags = project.in(file("flags"))
  .settings(
    libraryDependencies += scalaTest,
    maintainer := "Satyajit Sahu <satyajit.sahu@knoldus.com>"
  )
  .enablePlugins(UniversalPlugin)
  .enablePlugins(JavaAppPackaging, GraalVMNativeImagePlugin)

