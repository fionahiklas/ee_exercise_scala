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

  it should "return all correct sum for random test numbers" in {
    val fizzBuzz = fixture.fizzbuzzToTest

    val result = fizzBuzz.sumCount((4,9,42,3,18), (132,17,10000,53,93))
    assert( result == (136,26,10042,56,111))
  }


  "Check processAndSumList" should "return empty list and all zeros for sum for empty list input" in {
    val fizzBuzz = fixture.fizzbuzzToTest

    val (list, totals) = fizzBuzz.processAndSumList(List[Int]())
    assert( list == List[String]() )
    assert( totals == (0,0,0,0,0) )
  }

  it should "return one list item and simple totals for one input item" in {
    val fizzBuzz = fixture.fizzbuzzToTest

    val testList = 2 :: Nil
    val (list, totals) = fizzBuzz.processAndSumList(testList)

    assert( list == "2" :: Nil )
    assert( totals == (0,0,0,0,1) )
  }



}
