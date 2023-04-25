class Person(name: String, age: Int) {
  def greet(): Unit = println(s"Hello, my name is $name and I'm $age years old.")
}

val john = new Person("John", 25)
john.greet()
