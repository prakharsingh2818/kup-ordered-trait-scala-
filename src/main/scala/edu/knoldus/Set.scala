package edu.knoldus

abstract class Set[A <: Ordered[A]] {
  def incl(element: A): Set[A]

  def contains(element: A): Boolean
}

