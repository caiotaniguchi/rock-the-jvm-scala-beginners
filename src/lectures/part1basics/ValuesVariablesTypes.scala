package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x = 42
  println(x)

  //  VALS ARE IMMUTABLE (like const in JS)
  //  COMPILER CAN INFER TYPES

  val aString: String = "Hello, this is a string"
  println(aString)

  val aBoolean: Boolean = false
  val aChar: Char = 'c'
  val aShort: Short = 1213
  val aLong: Long = 81038091082919081L
  val aFloat: Float = 2.08908f
  val aDouble: Double = 2.191

  //  variables
  var aVariable = 4
  aVariable = 5  // side effect
}
