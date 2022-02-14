package edu.knoldus

case class Value(element: Int) extends Ordered[Value] {
  override def compare(that: Value): Int = {
    this.element - that.element
  }
}
