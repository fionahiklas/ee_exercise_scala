package com.hiklas.mucking.around.fizzbuzz

import org.scalatest._

class FizzBuzzSpec extends FlatSpec with Matchers {

  def fixture = new {
    val fizzbuzzToTest = new FizzBuzz()
  }

  "Divide by three function" should  "return false for 4"  in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.divideByThreeTest(4) == false )
  }

  it should "return true for 15"  in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.divideByThreeTest(15) == true)
  }

  it should  "return false for 0"  in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.divideByThreeTest(0) == false )
  }



  "Divide by five function" should  "return false for 4"  in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.divideByFiveTest(4) == false )
  }

  it should "return true for 15"  in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.divideByFiveTest(15) == true)
  }

  it should  "return false for 0"  in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.divideByThreeTest(0) == false )
  }


}
