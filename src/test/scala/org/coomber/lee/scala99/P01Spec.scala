package org.coomber.lee.scala99

import org.specs2.mutable._

object P01Spec extends Specification {
  "P01Spec" should {
    val testVals = List(1, 1, 2, 3, 5, 8)

    // TODO: Is there a way of declaring the type more elegantly
    val methods = Seq[List[Any] => Any](P01.lastListMethod _, 
                                        P01.lastListLength _,
                                        P01.lastRecursive _)

    "return the last element" in {
      ((_:List[Any] => Any)(testVals) mustEqual 8).forall(methods) 
    }
  }
}
