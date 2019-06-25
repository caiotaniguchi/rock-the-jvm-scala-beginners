package lectures.part2oop

object Generics extends App {
  class MyList[A] {
    // Use the type of 'A'
  }

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]
}
