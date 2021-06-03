package scala2

import scala3.{Scala3CaseClass, Scala3Method}

object Main {
  val local = Scala2() // compiles ok
  val importedMethod = Scala3Method.callMe() // compiles ok
  val importedCaseClass = Scala3CaseClass() // fails with "not enough arguments for method apply"
  val importedCaseClassExplicit = Scala3CaseClass.apply() // also fails with "not enough arguments for method apply"
}
