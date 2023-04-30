package Operators

// Scala program to demonstrate
// the Bitwise Operators
object BitwiseOp {
  def main(args: Array[String]) {
    // variables
    var a = 20;
    var b = 18;
    var c = 0;

    // Bitwise AND operator
    c = a & b;
    println("Bitwise And of a & b = " + c);

    // Bitwise OR operator
    c = a | b;
    println("Bitwise Or of a | b = " + c);

    // Bitwise XOR operator
    c = a ^ b;
    println("Bitwise Xor of a ^ b = " + c);

    // Bitwise once complement operator
    c = ~a;
    println("Bitwise Ones Complement of ~a = " + c);

    // Bitwise left shift operator
    c = a << 3;
    println("Bitwise Left Shift of a << 3 = " + c);

    // Bitwise right shift operator
    c = a >> 3;
    println("Bitwise Right Shift of a >> 3 = " + c);

    // Bitwise shift right zero fill operator
    c = a >>> 4;
    println("Bitwise Shift Right a >>> 4 = " + c);
  }
}

