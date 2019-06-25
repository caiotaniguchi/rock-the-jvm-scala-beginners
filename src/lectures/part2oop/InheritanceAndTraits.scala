package lectures.part2oop

object InheritanceAndTraits extends App {
  class Animal {
    def eat = println("burp")
  }

  class Cat extends Animal

  val cat = new Cat
  cat.eat
}
