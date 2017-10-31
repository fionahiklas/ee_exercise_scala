package com.hiklas.mucking.around.fizzbuzz

object FizzBuzz extends App {
  println("FizzBuzz main code")
}

class FizzBuzz
{
  def divideByNumberTest(numberToTest: Int, divisor: Int): Boolean =
  {
    numberToTest != 0 && ( numberToTest % divisor) == 0
  }

  def divideByThreeTest(numberToTest: Int): Boolean =
  {
    divideByNumberTest(numberToTest, 3)
  }

  def divideByFiveTest(numberToTest: Int): Boolean =
  {
    divideByNumberTest(numberToTest, 5);
  }


}


