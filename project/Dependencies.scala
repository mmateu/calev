import sbt._

object Dependencies {

  val circeVersion   = "0.14.1"
  val doobieVersion  = "0.13.4"
  val fs2Version     = "2.5.6"
  val h2Version      = "1.4.200"
  val log4sVersion   = "1.8.2"
  val logbackVersion = "1.2.3"
  val munitVersion   = "0.7.26"

  val munit = Seq(
    "org.scalameta" %% "munit"            % munitVersion,
    "org.scalameta" %% "munit-scalacheck" % munitVersion
  )

  val fs2 = Seq(
    "co.fs2" %% "fs2-core" % fs2Version
  )

  val fs2io = Seq(
    "co.fs2" %% "fs2-io" % fs2Version
  )

  // https://github.com/Log4s/log4s;ASL 2.0
  val loggingApi = Seq(
    "org.log4s" %% "log4s" % log4sVersion
  )

  val logback = Seq(
    "ch.qos.logback" % "logback-classic" % logbackVersion
  )

  val doobie = Seq(
    "org.tpolecat" %% "doobie-core" % doobieVersion
  )
  val h2 = Seq(
    "com.h2database" % "h2" % h2Version
  )

  val circe = Seq(
    "io.circe" %% "circe-core" % circeVersion
  )
  val circeAll = Seq(
    "io.circe" %% "circe-generic" % circeVersion,
    "io.circe" %% "circe-parser"  % circeVersion
  )
}
