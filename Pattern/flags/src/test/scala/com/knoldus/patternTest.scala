package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class patternTest extends AnyFlatSpec {
  val obj = new numberPattern
  "-p1" should "show as correct flag" in {
    assert(obj.get_flag("-p1") === "pattern1")
  }
  "-p2" should "show as correct flag" in {
    assert(obj.get_flag("-p2") === "pattern2")
  }
  "-a" should "show as incorrect flag" in {
    assert(obj.get_flag("-a") === "~")
  }
  "-p3" should "show as correct flag" in {
    assert(obj.get_flag("-p3") === "pattern3")
  }
  "-p4" should "show as incorrect flag" in {
    assert(obj.get_flag("-p4") === "pattern4")
  }
}

