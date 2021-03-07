package com.knoldus

object MainClassObj extends App {
  val input = args.toList //val list = args.toList
  val pattern = new numberPattern
  pattern.main_function(input)

}
