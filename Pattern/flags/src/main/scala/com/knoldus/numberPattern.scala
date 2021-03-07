package com.knoldus

class numberPattern extends App {
  def main_function(flags: List[String]): Unit = {
    for (indexNo <- flags.indices) {
      val flag = flags(indexNo)
      if (flag(0) == '-') get_flag(flags.head)
    }
  }

  def get_flag(flag: String): Any = {
    val actualFlag = Map("-p1" -> "pattern1", "-p2" -> "pattern2", "-p3" -> "pattern3", "-p4" -> "pattern4", "-p5" -> "pattern5")
    val row = 5
    var test = " "
    try {
      test = actualFlag(flag)
    } catch {
      case _: NoSuchElementException => println("No such flag found"); test = "~"
    }
    test match {
      case "pattern1" => repeatNumbers(row)
      case "pattern2" => pascal(row)
      case "pattern3" => simplePattern(row)
      case "pattern4" => numberPattern(row)
      case "pattern5" => hourglass(row)
      case "~" => println("Please recheck your flag\n  The available flags are:\n -p1 \t->\t To print normal pattern\n -p2 \t->\t To print the Pascal pattern\n -p3 \t->\t To print the general number pattern\n -p4 \t->\t To print the number in hour glass pattern\n")
    }
    test
  }

  def repeatNumbers(row: Int): Unit = {
    var indexNo = 0
    var jIndexNo = 0
    var num = 0
    indexNo = 0
    while (indexNo < row) {
      num = 1
      jIndexNo = 0
      while (jIndexNo <= indexNo) {
        print(num + " ")
        num += 1
        jIndexNo += 1
      }
      println()
      indexNo += 1
    }
    print("\n\n")
  }

  def pascal(row: Int): Unit = {
    for (indexNo <- 0 until row) {
      var number = 1
      printf("%" + (row - indexNo) * 2 + "s", "")
      for (jIndexNo <- 0 to indexNo) {
        printf("%4d", number)
        number = number * (indexNo - jIndexNo) / (jIndexNo + 1)
      }
      println()
    }
    print("\n\n")
  }

  def simplePattern(row: Int): Unit = {
    var indexNo = 0
    var jIndexNo = 0
    var kIndexNo = 1
    indexNo = 1
    while (indexNo <= row) {
      jIndexNo = 1
      while (jIndexNo < indexNo + 1) {
        print({
          kIndexNo += 1
          kIndexNo - 1
        } + " ")
        jIndexNo += 1
      }
      println()
      indexNo += 1
    }
    print("\n\n")
  }

  def numberPattern(row: Int): Unit = {
    for (indexNo <- 1 to row) {
      for (_ <- 1 to indexNo) {
        print(indexNo + " ")
      }
      println()
    }
    print("\n\n")
  }

  def hourglass(row: Int): Unit = {
    for (indexNo <- 1 to row) {
      for (_ <- 1 until indexNo) {
        print(" ")
      }
      for (jIndexNo <- indexNo to row) {
        print(jIndexNo + " ")
      }
      println()
    }
    for (indexNo <- row - 1 to 1 by -1) {
      for (_ <- 1 until indexNo) {
        print(" ")
      }
      for (jIndexNo <- indexNo to row) {
        print(jIndexNo + " ")
      }
      println()
    }
    print("\n\n")
  }
}