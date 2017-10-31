package com.hiklas.mucking.around.fizzbuzz

import org.scalatest._

class FizzBuzzSpec extends FlatSpec with Matchers {

  def fixture = new {
    val fizzbuzzToTest = new FizzBuzz()
  }

  "Divide by three function" should "exist" in {
    val fizzBuzz = fixture.fizzbuzzToTest

    val functionToTest = fizzBuzz.divideByThreeTest _

    assert(functionToTest != null)
  }

  it should "return false for 0"  in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.divideByThreeTest(0) == false )
  }

  it should "return true for 3"  in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.divideByThreeTest(3) == true )
  }

  it should "return true for 15"  in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.divideByThreeTest(15) == true)
  }

  "Divide by five function" should "exist" in {
    val fizzBuzz = fixture.fizzbuzzToTest

    val functionToTest = fizzBuzz.divideByFiveTest _

    assert(functionToTest != null)
  }

  it should "return false for 0"  in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.divideByFiveTest(0) == false )
  }

  it should "return true for 5"  in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.divideByFiveTest(5) == true )
  }

  it should "return true for 15"  in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.divideByFiveTest(15) == true)
  }



}
