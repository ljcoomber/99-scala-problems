package org.coomber.lee.scala99

import org.specs._

object P01Spec extends Specification {
  "P01Spec" should {
    val testList = List(1, 1, 2, 3, 5, 8)

    "work using method" in {
      P01.lastListMethod(testList) mustEqual 8
    }

    "work using length" in {
      P01.lastListLength(testList) mustEqual 8
    }

    "work using recursion" in {
      P01.lastRecursive(testList) mustEqual 8
    }
  }
}
