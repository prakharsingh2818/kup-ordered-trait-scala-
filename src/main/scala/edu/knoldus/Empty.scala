package edu.knoldus

class Empty[A <: Ordered[A]] extends Set[A] {
  override def incl(value: A): Set[A] = new SetImpl[A](value, new Empty[A], new Empty[A])

  override def contains(x: A): Boolean = false

}
