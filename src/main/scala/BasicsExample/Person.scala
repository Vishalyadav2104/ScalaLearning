package BasicsExample

class Person(name: String, age: Int) extends Greetable {
  def greet(): Unit = {
    println(s"Hello, my name is $name and I'm $age years old.")
  }
}


case class Employee(name: String, age: Int, salary: Double)

