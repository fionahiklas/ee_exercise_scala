package com.hiklas.mucking.around.fizzbuzz

object FizzBuzz extends App {
  println("FizzBuzz main code")
}

class FizzBuzz
{
  def divideByThreeTest(numberToTest: Int): Boolean =
  {
    numberToTest != 0 && ( numberToTest % 3) == 0
  }

  def divideByFiveTest(numberToTest: Int): Boolean =
  {
    numberToTest != 0 && ( numberToTest % 5) == 0
  }


}


