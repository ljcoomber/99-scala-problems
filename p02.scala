/**
 * P02 (*) Find the last but one element of a list.
 *   Example:
 *
 *   scala> penultimate(List(1, 1, 2, 3, 5, 8))
 *   res0: Int = 5
 *
 * TODO: Better assertion / fail syntax - use proper test framework? 
 */

val testList = List(1, 1, 2, 3, 5, 8)

def penultimateMethods(l: List[_]) = 
  if (l.isEmpty) throw new NoSuchElementException
  else l.init.last

assert(penultimateMethods(testList) == 5)
try {
  penultimateMethods(Nil)
  assert(false)
}
catch {
  case _ : NoSuchElementException => /* Do nothing */ assert(true)
  case _ => assert(false)
}


def penultimateLength(l: List[_]) = l(math.max(0, l.length - 2))
assert(penultimateLength(testList) == 5)
assert(penultimateLength(List(1)) == 1)

def penultimateRecursive[A](l: List[A]) : A = l match {
  case h :: _  :: Nil => h
  case _ :: tail => penultimateRecursive(tail)
  case _         => throw new NoSuchElementException
}
assert(penultimateRecursive(testList) == 5)
