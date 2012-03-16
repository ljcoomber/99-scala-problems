/** Project */
name := "99-scala-problems"

version := "1.0-SNAPSHOT"

organization := "org.coomber.lee"

scalaVersion := "2.9.1"

/** Dependencies */
resolvers ++= Seq("Sonatype Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
                  "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases")

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.7.1" % "test"
)

/** Compilation */
scalacOptions += "-deprecation"

testOptions := Seq(Tests.Filter(s =>
  Seq("Spec", "Suite", "Unit", "all").exists(s.endsWith(_)) &&
    ! s.endsWith("FeaturesSpec") ||
    s.contains("UserGuide") ||
    s.matches("org.specs2.guide.*")))

javaOptions += "-Xss4M"

/** Console */
initialCommands in console := "import org.specs2._"
