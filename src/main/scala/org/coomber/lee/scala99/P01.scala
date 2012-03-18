package org.coomber.lee.scala99

/**
 * P01 (*) Find the last element of a list.
 *   Example:
 *
 *   scala> last(List(1, 1, 2, 3, 5, 8))
 *   res0: Int = 8
 */

object P01 {

  def lastListMethod(l: List[_]) =
    if(l.length > 1) l.last else throw new NoSuchElementException

  def lastListLength(l: List[_]) = 
    if(l.length > 1) l(l.length - 1) else throw new NoSuchElementException

  def lastRecursive[A](l: List[A]) : A = l match {
    case h :: Nil  => h
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }
}

