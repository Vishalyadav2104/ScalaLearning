import scala.annotation.tailrec
  object TailRecursion {
    def GCD(n: Int, m: Int): Int = {
      // tail recursion function defined
      @tailrec
      def gcd(x: Int, y: Int): Int = {
        if (y == 0) x
        else gcd(y, x % y)
      }
      gcd(n, m)
    }
    def main(args: Array[String]) {
      println(GCD(12, 18))
    }
  }


