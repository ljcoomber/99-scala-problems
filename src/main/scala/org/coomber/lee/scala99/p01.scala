package org.coomber.lee.scala99

/**
 * P01 (*) Find the last element of a list.
 *   Example:
 *
 *   scala> last(List(1, 1, 2, 3, 5, 8))
 *   res0: Int = 8
 */

object P01 {

  def lastListMethod(l: List[_]) = l.last

  def lastListLength(l: List[_]) = l(l.length - 1)

  def lastRecursive[A](l: List[A]) : A = l match {
    case h :: Nil  => h
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }
}

