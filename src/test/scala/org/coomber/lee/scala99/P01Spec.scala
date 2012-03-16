package org.coomber.lee.scala99

import org.specs2.mutable._
import org.specs2.matcher.DataTables

object P01Spec extends Specification /* with DataTables */ {
  "P01Spec" should {
    val testList = List(1, 1, 2, 3, 5, 8)

    val methods = Seq(P01.lastListMethod _,  P01.lastListLength _, P01.lastRecursive _)

    "foo" in {
      2 mustEqual 2
    }

    methods.foreach(println)


    "return the last element" in {
      forall(methods) ((_: (List[Any]))(testList) mustEqual 8)
      (P01.lastListLength _)(testList) mustEqual 8
    }


    // TODO: Work out how to do single columns
    /*
    "impl" in {
      "foo" ! P01.lastListMethod _ |>
      "bar" ! P01.lastListLength _ |
      "baz" ! P01.lastRecursive _ | {
        // TODO: Why do I need to supply parameter types?
        (name: String, impl: (List[_]) => Any ) =>
          println("Impl: " + impl)
          impl(testList) mustEqual 7 // TODO: SHOULD FAIL
      }
    }
    */

  }
}
