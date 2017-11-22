package com.hiklas.mucking.around.fizzbuzz

import org.scalatest._

class FizzBuzzSpec extends FlatSpec with Matchers {

  def fixture = new {
    val fizzbuzzToTest = new FizzBuzz()
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

    val testList:List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    val expectedList:List[String] = List("1", "2", "luck", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "luck", "14", "fizzbuzz", "16", "17", "fizz", "19", "buzz" )

    val (list, totals) = fizzBuzz.processAndSumList(testList)

    assert( list == expectedList )
    assert( totals == FizzBuzz.OutputCounter(4,3,1,2,10) )
  }

  /**
    * NOTE: These tests are still included as OutputCounter forms part of the
    * public API for the processAndSumList method
    *
    * TODO: Return something other that this object so that the internals are
    * TODO: hidden from the outside world
    */
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
