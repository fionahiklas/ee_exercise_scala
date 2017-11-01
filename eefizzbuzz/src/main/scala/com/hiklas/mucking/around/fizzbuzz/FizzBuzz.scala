package com.hiklas.mucking.around.fizzbuzz

object FizzBuzz extends App {
  println("FizzBuzz main code")
}

class FizzBuzz
{
  def divideByThreeTest(numberToTest: Int): Boolean =
  {
    divideByNumberTest(numberToTest, 3)
  }

  def divideByFiveTest(numberToTest: Int): Boolean =
  {
    divideByNumberTest(numberToTest, 5);
  }

  def containsDigitThree(numberToTest: Int): Boolean =
  {
    numberToTest.toString().contains("3")
  }


  /**
    * Check that the given numberToTest can be divided equally by the divisor.
    * If the number to test is zero return false also - normally the
    * modulus operation of 0 returns 0 which leads to a false positive.
    *
    * NOTE: This code assumes that the divisor is non-zero, a DivideByZero exception
    * will be raised if this is not the case.
    *
    * @param numberToTest
    * @param divisor
    * @return
    */
  private def divideByNumberTest(numberToTest: Int, divisor: Int): Boolean =
  {
    numberToTest != 0 && ( numberToTest % divisor) == 0
  }
}


