package lectures.part1basics

object Recursion extends App {
  def factorial(n: Int): Int = {
    def factHelper(x: Int, accumulator: Int): Int = {
      if (x <= 1) accumulator
      else factHelper(x - 1, accumulator)
    }
    factHelper(n, 1)
  }

  def concatString(str: String, n: Int): String = {
    def concatHelper(str: String, n: Int, partialStr: String): String = {
      if ( n < 1) partialStr
      else concatHelper(str, n-1, s"$str$partialStr")
    }
    concatHelper(str, n, "")
  }
  println(concatString("hey", 3))
}
