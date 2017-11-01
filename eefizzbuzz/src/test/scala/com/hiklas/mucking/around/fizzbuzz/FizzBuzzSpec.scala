package com.hiklas.mucking.around.fizzbuzz

import org.scalatest._

class FizzBuzzSpec extends FlatSpec with Matchers {

  def fixture = new {
    val fizzbuzzToTest = new FizzBuzz()
  }


  "Check One Number" should "return '0' for 0 input" in {
    val fizzBuzz = fixture.fizzbuzzToTest

    // Question: does == in Scala actually call .equals?  Would be nice
    // if it did!
    assert( fizzBuzz.checkOneNumber(0) == "0" )
  }

  it should "return 'fizz' for 6"  in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.checkOneNumber(6) == "fizz")
  }

  it should "return 'buzz' for 5"  in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.checkOneNumber(5) == "buzz")
  }

  it should "return 'fizzbuzz' for 15"  in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.checkOneNumber(15) == "fizzbuzz")
  }

  it should "return 'luck' for 3"  in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.checkOneNumber(3) == "luck")
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

  "Contains digit three" should "return false for 0" in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.containsDigitThree(0) == false )
  }

  it should "return true for 13" in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.containsDigitThree(13) == true )
  }

  it should "return false for 12" in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.containsDigitThree(12) == false )
  }

  it should "return true for 33" in {
    val fizzBuzz = fixture.fizzbuzzToTest

    assert( fizzBuzz.containsDigitThree(33) == true )
  }
}
