package org.coomber.lee.scala99

/**
 * P04 (*) Find the number of elements of a list.
 *   Example:
 *
 *   scala> length(List(1, 1, 2, 3, 5, 8))
 *   res0: Int = 6
 */

object P04 {

  def lengthBuiltin[A](l: List[A]) = l.length
  
  def lengthRecursive[A](l: List[A]) = {
    def lenFunc(i:Int, l: List[_]): Int = l match {
      case Nil => i
      case h :: tail => lenFunc(i + 1, tail)
    }
    
    lenFunc(0, l)
  }
}

