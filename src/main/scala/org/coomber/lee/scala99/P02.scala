package org.coomber.lee.scala99

/**
 * P02 (*) Find the last but one element of a list.
 *   Example:
 *
 *   scala> penultimate(List(1, 1, 2, 3, 5, 8))
 *   res0: Int = 5
 */

object P02 {

  def penultimateMethod(l: List[_]) = 
    if(l.length > 2) l.takeRight(2).head else throw new NoSuchElementException

  def penultimateLength(l: List[_]) = 
    if(l.length > 2) l(l.length - 2) else throw new NoSuchElementException

  def penultimateRecursive[A](l: List[A]) : A = l match {
    case h :: _ :: Nil  => h
    case _ :: tail => penultimateRecursive(tail)
    case _         => throw new NoSuchElementException
  }
}

