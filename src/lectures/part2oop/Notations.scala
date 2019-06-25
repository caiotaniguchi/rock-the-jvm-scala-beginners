package lectures.part2oop

object Notations extends App {
  class Person(val name: String, favouriteMovie: String, age: Int = 0) {
    def likes(movie: String): Boolean = movie == this.favouriteMovie

    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def +(title: String): Person = new Person(s"${this.name} (${title})", this.favouriteMovie, this.age)
  }

  val caio = new Person("Caio", "Inception")

  println(caio.likes("Inception"))
  println(caio likes "Inception")
//  infix notation = operator notation (only works for one-parameter method) -> syntactic sugar

  val leticia = new Person("Leticia", "Chicas Del Cable")
  println(caio hangOutWith leticia)

//  ALL OPERATORS (like + / ?) ARE METHODS
  println(1 + 2)
  println(1.+(2))

  println((caio + "the Mountain").name)


}

