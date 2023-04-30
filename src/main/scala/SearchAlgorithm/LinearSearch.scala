package SearchAlgorithm
object LinearSearch {
  def linearSearch(arr: Array[Int], x: Int, i: Int = 0): Int = {
    if (i >= arr.length) {
      -1
    } else if (arr(i) == x) {

      i
    } else {
      linearSearch(arr, x, i + 1)
    }
  }
  def main(args: Array[String]): Unit = {
    val inputArray = Array(10,50,30,70,80,60,20,90,40)
    println("Enter the element to search: ")
    val searchElement = scala.io.StdIn.readInt()

    // perform linear search and print result
    val result = linearSearch(inputArray, searchElement)
    if (result == -1) {
      println(s"$searchElement not found in the array.")
    } else {
      println(s"$searchElement found at index $result.")
    }
  }
}



