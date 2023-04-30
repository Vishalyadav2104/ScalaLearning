package AccessModifers

class abc {
  private var a: Int = 123

  def display() {
    a = 8
    println(a)
  }
}

object pvt extends App {
  // class abc is accessible
  // because this is in the same enclosing scope
  var e = new abc()
  e.display()
}


