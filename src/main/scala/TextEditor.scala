import scala.io.StdIn.readLine
import scala.util.{Try, Using}

object TextEditor {
  def main(args: Array[String]): Unit = {
    println("Welcome to the Text Editor!")
    val filename = readLine("Enter the filename: ")
    val fileContent = getFileContent(filename)
    println(s"File content:\n$fileContent")
    var content = fileContent
    var exit = false
    while (!exit) {
      println("Select an option:")
      println("1. View content")
      println("2. Edit content")
      println("3. Save and exit")
      val option = readLine().toInt
      option match {
        case 1 => println(s"File content:\n$content")
        case 2 =>
          println("Enter the new content:")
          content = readLine()
        case 3 =>
          println("Saving and exiting...")
          saveToFile(filename, content)
          exit = true
        case _ => println("Invalid option. Please try again.")
      }
    }
  }

  def getFileContent(filename: String): String = {
    Using(io.Source.fromFile(filename))(_.mkString).getOrElse("")
  }

  def saveToFile(filename: String, content: String): Unit = {
    Using(new java.io.PrintWriter(filename))(_.write(content)).getOrElse()
  }
}
