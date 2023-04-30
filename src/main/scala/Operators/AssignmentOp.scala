package Operators

object AssignmentOp {

  def main(args: Array[String]) {

    var a = 50;
    var b = 40;
    var c = 0;

    // simple addition
    c = a + b;
    println("simple addition: c= a + b = " + c);

    // Add AND assignment
    c += a;
    println("Add and assignment of c += a = " + c);

    // Subtract AND assignment
    c -= a;
    println("Subtract and assignment of c -= a = " + c);

    // Multiply AND assignment
    c *= a;
    println("Multiplication and assignment of c *= a = " + c);

    // Divide AND assignment
    c /= a;
    println("Division and assignment of c /= a = " + c);

    // Modulus AND assignment
    c %= a;
    println("Modulus and assignment of c %= a = " + c);

    // Left shift AND assignment
    c <<= 3;
    println("Left shift and assignment of c <<= 3 = " + c);

    // Right shift AND assignment
    c >>= 3;
    println("Right shift and assignment of c >>= 3 = " + c);

    // Bitwise AND assignment
    c &= a;
    println("Bitwise And assignment of c &= 3 = " + c);

    // Bitwise exclusive OR and assignment
    c ^= a;
    println("Bitwise Xor and assignment of c ^= a = " + c);

    // Bitwise inclusive OR and assignment
    c |= a;
    println("Bitwise Or and assignment of c |= a = " + c);
  }
}

