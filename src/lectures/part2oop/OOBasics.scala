package lectures.part2oop

object OOBasics extends App {
  val me = new Writer("Caio", "Taniguchi", 1990)
  val novel = new Novel(author = me)
  println(novel.authorAgeAtRelease())
  println(novel.isWrittenBy())
  println(novel.copy(2010).authorAgeAtRelease())

  val cnt = new MyCounter(0)
  println(cnt.curCount())
  println(cnt.increment().curCount())
  println(cnt.decrement().curCount())
  println(cnt.decrement(5).curCount())
  println(cnt.increment(6).curCount())
}

// Constructor
class Person(name: String, val age: Int) {
//  Class Body

}

// Class parameters are not class fields
// Needs to declare val to be accessible from the outside

class Writer(firstName: String = "John", lastName: String = "Doe", val birthYear: Int = 1970) {
  def fullName(): String = s"$firstName $lastName"
}

class Novel(title: String = "A Book", yearOfRelease: Int = 2000, author: Writer = new Writer()) {
  def authorAgeAtRelease(): Int =
    this.yearOfRelease - this.author.birthYear

  def isWrittenBy(): String =
    this.author.fullName()

  def copy(newYearOfRelease: Int): Novel =
    new Novel(this.title, newYearOfRelease, this.author)
}

class MyCounter(value: Int) {
  def curCount(): Int = this.value

  def increment(): MyCounter = new MyCounter(this.value + 1) // immutability

  def increment(incrementBy: Int): MyCounter = new MyCounter(this.value + incrementBy)

  def decrement(): MyCounter = new MyCounter(this.value - 1)

  def decrement(decrementBy: Int): MyCounter = new MyCounter(this.value - decrementBy)

}