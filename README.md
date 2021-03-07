# ASSIGNMENT-1 (CLI-PARSER USING SCALA)

A simple client server application. The client would send requests based on the data contained in the flags to the server using Unix Domain Socket. The Server after processing the request will send the reply back to be shown by the cli. 

This is a multimodule command line parser written in Scala using sbt as a build tool. I have defined my own flags for printing different patterns for the numbers. The user enters any valid flag into the CLI, parser interprets it and shows the corresponding output pattern. If an invalid flag is used by the user, an exception is thrown which is handled by displaying the details of the valid flags. and details of the valid flags are displayed.

To package the application I have used the sbt-native-packager (universal plugin) and also I have used GraalVm native-image. It creates a distribution that is not tied to any particular platform.

__Plugins Used :__
`addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.6.1") //For native packager
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.6")  //For assembly  __`

__Enabling the plugin:__
`enablePlugins(UniversalPlugin)
enablePlugins(JavaAppPackaging, GraalVMNativeImagePlugin)__`

Go to your sbt project path and compile it and run below command to create a .zip file

***To make and run Universal Package***
 
 **Create a .zip file:-**
`sbt modulename/universal:packageBin`


**To run the application :**
`./applicationname flag-name`

**To make jar file and run using GraalVm:**

**Create a native image:**
```$GRAAL_HOME/native-image -jar file-name.jar```

**Run a native image:**
`./cliParser-assembly-0.1.0-SNAPSHOT flag-name`

**Available flags :**
```
* -p1	: Pattern1
* -p2	: Pattern2
* -p3	: Pattern3
* -p4 : Pattern4
* -p5	: Pattern5
```
