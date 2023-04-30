package AccessModifers


class interns{
  var a: Int = 123
}

object pub extends App {
  var e = new interns()
  e.a = 444
  println(e.a)
}

