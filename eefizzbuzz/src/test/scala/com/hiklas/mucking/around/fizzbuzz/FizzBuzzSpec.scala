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


  "Check sum of counts" should "return all zeros for 0" in {
    val fizzBuzz = fixture.fizzbuzzToTest

    val result = fizzBuzz.sumCount((0,0,0,0,0), (0,0,0,0,0))
    assert( result == (0,0,0,0,0))
  }

  it should "return all 2s for all 1s + all 1s" in {
    val fizzBuzz = fixture.fizzbuzzToTest

    val result = fizzBuzz.sumCount((1,1,1,1,1), (1,1,1,1,1))
    assert( result == (2,2,2,2,2))
  }

  it should "return all correct sum for random test numbers" in {
    val fizzBuzz = fixture.fizzbuzzToTest

    val result = fizzBuzz.sumCount((4,9,42,3,18), (132,17,10000,53,93))
    assert( result == (136,26,10042,56,111))
  }

}
