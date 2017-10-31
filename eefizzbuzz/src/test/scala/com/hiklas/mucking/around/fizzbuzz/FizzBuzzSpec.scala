package com.hiklas.mucking.around.fizzbuzz

import org.scalatest._

class FizzBuzzSpec extends FlatSpec with Matchers {

  def fixture = new {
    val fizzbuzzToTest = new FizzBuzz()
  }

  "Divide by a number function" should  "return false for 0, 3"  in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.divideByNumberTest(0, 3) == false )
  }

  it should "return true for 15, 5"  in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.divideByNumberTest(15,5) == true)
  }

  it should "return true for 15, 3"  in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.divideByNumberTest(15,3) == true)
  }

  it should "return false for 10, 3"  in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.divideByNumberTest(10,3) == false)
  }

  "Divide by three function" should  "return true for 3"  in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.divideByThreeTest(3) == true )
  }

  it should "return true for 15"  in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.divideByThreeTest(15) == true)
  }

  it should  "return false for 0"  in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.divideByThreeTest(0) == false )
  }



  "Divide by five function" should  "return true for 5"  in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.divideByFiveTest(5) == true )
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
