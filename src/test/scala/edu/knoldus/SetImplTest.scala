package edu.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class SetImplTest extends AnyFlatSpec {

  val intSet: Set[Value] = new Empty[Value].incl(Value(3)).incl(Value(4))

  "incl" should "insert the value in Set" in {
    val updatedIntSet = intSet.incl(Value(5))
    assert(updatedIntSet.contains(Value(5)))
  }

  "contains" should "return true if element exists" in {
    assert(intSet.contains(Value(3)))
  }

  it should "return false if element does not exists" in {
    assert(!intSet.contains(Value(5)))
  }
}
