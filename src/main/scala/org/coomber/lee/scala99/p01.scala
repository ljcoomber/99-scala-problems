package org.coomber.lee.scala99

/**
 * P01 (*) Find the last element of a list.
 *   Example:
 *
 *   scala> last(List(1, 1, 2, 3, 5, 8))
 *   res0: Int = 8
 *
 * TODO: Use reflection (or Scala dynamic dispatch? to test)
 */

object P01 {

  val testList = List(1, 1, 2, 3, 5, 8)

  def lastListMethod(l: List[_]) = l.last

  def lastListLength(l: List[_]) = l(l.length - 1)

  def lastRecursive[A](l: List[A]) : A = l match {
    case h :: Nil  => h
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }

  // TODO: Break into test class
  def test() {
    assert(lastListMethod(testList) == 8)
    assert(lastListLength(testList) == 8)
    assert(lastRecursive(testList) == 8)
  }
}

