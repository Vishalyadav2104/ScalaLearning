
class Smartphone {

  // Class variables
   val number: Int = 16
  var nameofcompany: String = "Apple"

  // Class method
  def Display() {
    println("Name of the company : " + nameofcompany);
    println("Total number of Smartphone generation: " + number);
  }
}

object Class {
  def main(args: Array[String]) {

    // Class object
    var obj = new Smartphone()
    obj.Display()
  }
}
