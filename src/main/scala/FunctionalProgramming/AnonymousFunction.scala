package FunctionalProgramming

object AnonymousFunction {

  def main(args: Array[String]): Unit = {

    var result1 = (a: Int, b: Int) => a + b
    var result2 = (_: Int)+  (_: Int)

    println(result1(1, 10))
    println(result2(10, 10))

  }
}
