package org.coomber.lee.scala99

/**
 * P03 (*) Find the Kth element of a list.
 *  By convention, the first element in the list is element 0.
 *
 *  Example:
 *
 *  scala> nth(2, List(1, 1, 2, 3, 5, 8))
 *  res0: Int = 2
 */

object P03 {

  def nthBuiltin(n: Int, l: List[_]) = l(n)
  
  def nthRecursive(n: Int, l: List[_]): Any = l match {
    case h :: _ if n == 0 => h
    case h :: tail => nthRecursive(n - 1, tail)
    case _ => throw new IndexOutOfBoundsException
  }
}

