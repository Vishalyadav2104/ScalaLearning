package SearchAlgorithm

object BinarySearch {
  def binarySearchRec(arr: Array[Int], elementToSearch: Int, start: Int, end: Int): Int = {
    if (start > end)
      return -1
    val mid = start + (end - start) / 2
    if (arr(mid) == elementToSearch)
      return mid
    else if (arr(mid) > elementToSearch)
      return binarySearchRec(arr, elementToSearch, start, mid - 1)
    else
      return binarySearchRec(arr, elementToSearch, mid + 1, end)
  }

  def main(args: Array[String]) {
    val sortedArray = Array(2,5,8,12,16,23,38,56,72,91)
    println("Enter element to search: " )
    val searchElement = scala.io.StdIn.readInt()
    val elementIndex = binarySearchRec(sortedArray, searchElement, 0, sortedArray.length - 1)
    if (elementIndex == -1)
      println("Element not found")
    else
      println("Element found at index " + elementIndex)
  }
}



