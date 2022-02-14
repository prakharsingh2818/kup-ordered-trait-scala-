package edu.knoldus

class SetImpl[A <: Ordered[A]](val value: A, left: Set[A], right: Set[A]) extends Set[A] {
  override def incl(element: A): Set[A] = {
    if (element < value) new SetImpl(value, left.incl(element), right)
    else new SetImpl(value, left, right.incl(element))
  }

  override def contains(element: A): Boolean = {
    if (element == value) true
    else if (element < value) left.contains(element)
    else right.contains(element)
  }
}