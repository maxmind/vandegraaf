package com.maxmind.gatling.dev

import com.maxmind.gatling.test.MockServer
import spray.http.Uri

import scala.io.StdIn

/** Mock server launcher for manual self-test outside of test env.
  */
object MockServerLauncherApp extends App {

  val server = MockServer()
  println(s"# Started $server, hit <Enter> key to stop.")
  StdIn readLine ()
  server stop ()
  println("# Server stopped.")

}
