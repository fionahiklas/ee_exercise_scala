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
}
