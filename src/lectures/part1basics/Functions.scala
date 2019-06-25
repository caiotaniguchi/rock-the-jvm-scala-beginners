package lectures.part1basics

object Functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hahaha", 1))

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))

//  WHEN YOU NEED LOOPS, USE RECURSSION


  def aGreetingFunction(name: String, age: Int): String = {
    s"Hi, my name is $name and I'm $age years old"
  }

  println(aGreetingFunction("caio", 28))

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n - 1)
  }
  println(factorial(4))

  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

//  def isPrime(n: Int): Boolean = {
//    def isPrimeUntil(t: Int): Boolean = {
//      if (t <= 1) true
//      else  isPrimeUntil(t - 1)
//    }
//  }
}
