package edu.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class EmptyTest extends AnyFlatSpec {
  val emptySet = new Empty[Value]

  "incl" should "insert the value in Set" in {
    val updatedSet = emptySet.incl(Value(0))
    assert(updatedSet.contains(Value(0)))
  }
}
