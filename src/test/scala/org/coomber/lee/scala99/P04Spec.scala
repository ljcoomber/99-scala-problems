package org.coomber.lee.scala99

import org.specs2.mutable._
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
object P04Spec extends Specification {
  "P04Spec" should {
    val testVals = List(1, 1, 2, 3, 5, 8)

    val methods = Seq[List[Any] => Int](P04.lengthBuiltin _, P04.lengthRecursive _)

    "return the number of elements in the list" in {
      ((_:List[Any] => Int)(testVals) mustEqual 6).forall(methods) 
    }
  }
}
