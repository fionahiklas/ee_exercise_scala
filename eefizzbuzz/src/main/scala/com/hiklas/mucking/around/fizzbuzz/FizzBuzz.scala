package com.hiklas.mucking.around.fizzbuzz

object FizzBuzz extends App {

  // TODO: Not entirely sure this is the right place for a helper class but
  // TODO: it does make it accessible without an instance of the FizzBuzz object
  case class OutputCounter(fizz: Int, buzz: Int, fizzbuzz: Int, luck: Int, digit: Int)
  {
    def +(right: OutputCounter): OutputCounter =
    {
      return OutputCounter(
        fizz = this.fizz + right.fizz,
        buzz = this.buzz + right.buzz,
        fizzbuzz = this.fizzbuzz + right.fizzbuzz,
        luck = this.luck + right.luck,
        digit = this.digit + right.digit)
    }
  }

  println("FizzBuzz main code")
}

class FizzBuzz
{
  // Avoid typing
  import FizzBuzz.OutputCounter

  /**
    * For a list of numbers the output is another list and a total.
    *
    * [ a, b, c, d, e, f, g ] -> ( [ fn(a), fn(b), fn(c), fn(d), fn(e), fn(f), fn(g) ] , ( totals ) )
    *
    * The final output can be generated by prepending the current element to the
    * result list from the rest and adding the totals.
    *
    * The totals itself is an object, an instance of a case class OutputCounter
    * ( fizz, buzz, fizzbuzz, luck, digit)
    */
  def processAndSumList(listToProcess: List[Int]): (List[String], OutputCounter ) =
  {
    if ( listToProcess.isEmpty )
    {
      return ( List[String](), OutputCounter(0,0,0,0,0) )
    }

    val resultStringForHead = checkOneNumber(listToProcess.head)
    val resultCountForHead = countOutput(resultStringForHead)

    if ( listToProcess.tail == Nil)
    {
      return ( resultStringForHead :: Nil, resultCountForHead )
    }
    else
    {
      val ( resultListForTail, resultCountForTail ) = processAndSumList(listToProcess.tail)

      return (  resultStringForHead ::  resultListForTail, resultCountForHead + resultCountForTail)
    }
  }


  private def countOutput(outputToCount: String): OutputCounter =
  {
    if(outputToCount != "")
    {
      outputToCount match {
        case "fizz" => OutputCounter(1, 0, 0, 0, 0)
        case "buzz" => OutputCounter(0, 1, 0, 0, 0)
        case "fizzbuzz" => OutputCounter(0, 0, 1, 0, 0)
        case "luck" => OutputCounter(0, 0, 0, 1, 0)
        case _ => OutputCounter(0, 0, 0, 0, 1)
      }
    }
    else
    {
      OutputCounter(0,0,0,0,0)
    }
  }

  /**
    * Takes a single integer and figures out whether to leave it as a number,
    * or convert it to fizz, buzz, or luck.
    *
    * @param numberToTest
    * @return String output for the number
    */
  private def checkOneNumber(numberToTest: Int): String =
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


  private def divideByThreeTest(numberToTest: Int): Boolean =
  {
    divideByNumberTest(numberToTest, 3)
  }

  private def divideByFiveTest(numberToTest: Int): Boolean =
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
  private def containsDigitThree(numberToTest: Int): Boolean =
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


