package com.hiklas.mucking.around.fizzbuzz

import org.scalatest._

class FizzBuzzSpec extends FlatSpec with Matchers {

  def fixture = new {
    val fizzbuzzToTest = new FizzBuzz()
  }

  "Divide by three function" should "exist" in {
    val fix = fixture
    val fizzBuzz = fix.fizzbuzzToTest

    val functionToTest = fizzBuzz.divideByThreeTest _

    assert(functionToTest != null)

  }
}
