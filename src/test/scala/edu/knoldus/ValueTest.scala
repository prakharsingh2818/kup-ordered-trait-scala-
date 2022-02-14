package edu.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class ValueTest extends AnyFlatSpec {
  val one: Value = Value(1)
  val two: Value = Value(2)

  "compare" should "compare the 2 Values" in {
    assert(one < two)
  }

}
