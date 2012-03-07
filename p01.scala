/**
 * P01 (*) Find the last element of a list.
 *   Example:
 *
 *   scala> last(List(1, 1, 2, 3, 5, 8))
 *   res0: Int = 8
 *
 * TODO: Use reflection (or Scala dynamic dispatch? to test)
 */

val testList = List(1, 1, 2, 3, 5, 8)

def lastListMethod(l: List[_]) = l.last
assert(lastListMethod(testList) == 8)

def lastListLength(l: List[_]) = l(l.length - 1)
assert(lastListLength(testList) == 8)

def lastRecursive[A](l: List[A]) : A = l match {
  case h :: Nil  => h
  case _ :: tail => lastRecursive(tail)
  case _         => throw new NoSuchElementException
}
assert(lastRecursive(testList) == 8)
