package org.coomber.lee.scala99

import org.specs2.mutable._
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
object P03Spec extends Specification {
  "P03Spec" should {
    val testVals = List(1, 1, 2, 3, 5, 8)

    // TODO: Is there a way of declaring the type more elegantly
    val methods = Seq[(Int, List[Any]) => Any](P03.nthBuiltin _, 
                                        P03.nthRecursive _)

    "return the nth element" in {
      ((_:(Int, List[Any]) => Any)(2, testVals) mustEqual 2).forall(methods) 
    }

    "throw exception if beyond bounds" in {
      ((_:(Int, List[Any]) => Any)(6, testVals) must throwA[IndexOutOfBoundsException]).forall(methods) 
    }
  }
}
