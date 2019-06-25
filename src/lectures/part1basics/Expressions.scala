package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2 // Expression
  println(x)

//  Instructions (DO) vs Expressions (VALUE)
//  IF Expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF returns a value, it's an expression
  println(aConditionedValue)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }
//  AVOID LOOPS LIKE THE PLAGUE

//  EVERYTHING in Scala is an Expression!

  val aWeirdValue = (i = 3)
  println(aWeirdValue)

//  side effects: println(), loops, reassigning
//  reassignment is also an expression that return a unit ()

  val aCodeBlock = {
    val y = 2
    val z = y + 3

    if (z > 2) "hello" else "goodbye"
  }
//  The value of a block is the value of the last expression

  println(aCodeBlock)
}
