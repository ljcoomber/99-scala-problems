package org.coomber.lee.scala99

import org.specs2.mutable._
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
object P02Spec extends Specification {
  "P02Spec" should {
    val testVals = List(1, 1, 2, 3, 5, 8)

    // TODO: Is there a way of declaring the type more elegantly
    val methods = Seq[List[Any] => Any](P02.penultimateMethod _, 
                                        P02.penultimateLength _,
                                        P02.penultimateRecursive _)

    "return the last element" in {
      ((_:List[Any] => Any)(testVals) mustEqual 5).forall(methods) 
    }

    "throw exception if no elements" in {
      ((_:List[Any] => Any)(Nil) must throwA[NoSuchElementException]).forall(methods) 
    }
    
    "throw exception if one element" in {
      ((_:List[Any] => Any)(List(1)) must throwA[NoSuchElementException]).forall(methods) 
    }
  }
}
