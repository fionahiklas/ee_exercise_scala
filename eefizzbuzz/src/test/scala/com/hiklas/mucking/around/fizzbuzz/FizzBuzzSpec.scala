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

  "Check processAndSumList" should "return empty list and all zeros for sum for empty list input" in {
    val fizzBuzz = fixture.fizzbuzzToTest

    val (list, totals) = fizzBuzz.processAndSumList(List[Int]())
    assert( list == List[String]() )
    assert( totals == FizzBuzz.OutputCounter(0,0,0,0,0) )
  }

  it should "return one list item and simple totals for one input item" in {
    val fizzBuzz = fixture.fizzbuzzToTest

    val testList = 2 :: Nil
    val (list, totals) = fizzBuzz.processAndSumList(testList)

    assert( list == "2" :: Nil )
    assert( totals == FizzBuzz.OutputCounter(0,0,0,0,1) )
  }

  it should "return two items and totals for two input items" in {
    val fizzBuzz = fixture.fizzbuzzToTest

    val testList = 2 :: 9 :: Nil
    val (list, totals) = fizzBuzz.processAndSumList(testList)

    assert( list == "2" :: "fizz" :: Nil )
    assert( totals == FizzBuzz.OutputCounter(1,0,0,0,1) )
  }

  it should "return 20 items and totals for numbers 1-20" in {
    val fizzBuzz = fixture.fizzbuzzToTest

    // TODO: There *has* to be a better way to create these list but I don't
    // TODO: currently know what it is!
    val testList = 1 :: 2 :: 3 :: 4 :: 5 :: 6 :: 7 :: 8 :: 9 :: 10 :: 11 :: 12 :: 13 :: 14 :: 15 :: 16 :: 17 :: 18 :: 19 :: 20 :: Nil
    val expectedList = "1" :: "2" :: "luck" :: "4" :: "buzz" :: "fizz" :: "7" :: "8" :: "fizz" :: "buzz" :: "11" :: "fizz" :: "luck" :: "14" :: "fizzbuzz" :: "16" :: "17" :: "fizz" :: "19" :: "buzz" :: Nil

    val (list, totals) = fizzBuzz.processAndSumList(testList)

    assert( list == expectedList )
    assert( totals == FizzBuzz.OutputCounter(4,3,1,2,10) )
  }


  "Count output" should "return all zeros for an empty string" in {
    val fizzBuzz = fixture.fizzbuzzToTest

    val result = fizzBuzz.countOutput("")
    assert( result == FizzBuzz.OutputCounter(0,0,0,0,0) )
  }

  it should "output 1 for fizz" in {
    val fizzBuzz = fixture.fizzbuzzToTest

    val result = fizzBuzz.countOutput("fizz")
    assert( result == FizzBuzz.OutputCounter(1,0,0,0,0) )
  }

  it should "output 1 for buzz" in {
    val fizzBuzz = fixture.fizzbuzzToTest

    val result = fizzBuzz.countOutput("buzz")
    assert( result == FizzBuzz.OutputCounter(0,1,0,0,0) )
  }

  it should "output 1 for fizzbuzz" in {
    val fizzBuzz = fixture.fizzbuzzToTest

    val result = fizzBuzz.countOutput("fizzbuzz")
    assert( result == FizzBuzz.OutputCounter(0,0,1,0,0) )
  }

  it should "output 1 for luck" in {
    val fizzBuzz = fixture.fizzbuzzToTest

    val result = fizzBuzz.countOutput("luck")
    assert( result == FizzBuzz.OutputCounter(0,0,0,1,0) )
  }

  it should "output 1 for a digit" in {
    val fizzBuzz = fixture.fizzbuzzToTest

    val result = fizzBuzz.countOutput("123")
    assert( result == FizzBuzz.OutputCounter(0,0,0,0,1) )
  }


  "Check outputCounter" should "new object return 0 for each field" in {

    val result = FizzBuzz.OutputCounter(0,0,0,0,0)

    assert(result.fizz == 0)
    assert(result.buzz == 0)
    assert(result.fizzbuzz == 0)
    assert(result.luck == 0)
    assert(result.digit == 0)
  }

  it should "Sum two objects correctly" in {

    val left = FizzBuzz.OutputCounter(4,9,42,3,18)
    val right = FizzBuzz.OutputCounter(132,17,10000,53,93)

    val result = left + right

    assert( result == FizzBuzz.OutputCounter(136,26,10042,56,111))
  }
}
