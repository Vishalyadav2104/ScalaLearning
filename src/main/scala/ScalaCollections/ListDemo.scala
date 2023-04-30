package ScalaCollections

//Diff. ways of creating  list

object ListDemo {
  def main(args: Array[String]): Unit = {

    //empty list
    val emptyList = Nil

    //val emptyList = List()
    println(emptyList)

    //Use colon(::) operator
    val firstHalfYear = "January" :: "February" :: "March" :: "April" :: "May" :: "June" :: Nil
    println(firstHalfYear)

    //Use List Apply Method
    val secondHalfYear = List("July", "August", "September", "October", "November", "December")
    println(secondHalfYear)

    //merging two list using ::: or ++ operator
    val year = firstHalfYear ::: secondHalfYear
    println(year)

    //size of list
    println("total months in a year : " + year.size)

    println(year.head)
    println(year.tail)

    for(month <- year){
      println(month)
    }

    val numbers = List.range(1,5)
    var sum  = 0
    numbers.foreach(sum+=_)
    println("sum of numbers in list is :" + sum)
    numbers.foreach(println)

    // map
    println(numbers.map(_*2))

    val shortyear =  year.map(_.substring(0,3))
    println(shortyear)

    //zip
    println(year.zip(shortyear))

    //sorting a list
    val price = List(9,3,11,100,2)
    println(price.sorted)
    println(price.sorted.reverse)

  }

}
