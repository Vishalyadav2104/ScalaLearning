package AccessModifers

class dataops {
  // declaration of protected member
  protected var a: Int = 123

  def display() {
    a = 8
    println(a)
  }
}

// class new1 extends by class gfg
class new1 extends dataops {
  def display1() {
    a = 9
    println(a)
  }
}

object prot extends App {
  // class abc is accessible because this
  // is in the same enclosing scope
  var e = new dataops()
  e.display()
  var e1 = new new1()
  e1.display1()

}

