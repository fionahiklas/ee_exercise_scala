package com.hiklas.mucking.around.fizzbuzz

object FizzBuzz extends App {
  println("FizzBuzz main code")
}

class FizzBuzz
{

  /**
    * Takes a single integer and figures out whether to leave it as a number,
    * or convert it to fizz, buzz, or luck.
    *
    * @param numberToTest
    * @return String output for the number
    */
  def checkOneNumber(numberToTest: Int): String =
  {
    if( containsDigitThree(numberToTest) )
    {
      return "luck"
    }

    if( divideByThreeTest(numberToTest) && divideByFiveTest(numberToTest) )
    {
      return "fizzbuzz"
    }

    if( divideByThreeTest(numberToTest) )
    {
      return "fizz"
    }

    if( divideByFiveTest(numberToTest) )
    {
      return "buzz"
    }

    // Default
    numberToTest.toString
  }


  def divideByThreeTest(numberToTest: Int): Boolean =
  {
    divideByNumberTest(numberToTest, 3)
  }

  def divideByFiveTest(numberToTest: Int): Boolean =
  {
    divideByNumberTest(numberToTest, 5)
  }

  /**
    * Check if the number contains a '3' digit
    *
    * TODO: This does not handle nulls very well!
    *
    * @param numberToTest
    * @return
    */
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


