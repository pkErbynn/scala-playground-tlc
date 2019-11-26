object Run extends App {
  val fn = "john"
  val ln = "erbynn"
  val age = 24
  println(raw"Full name: $fn  $ln \n  $age")  // raw interpolation

  // if - other
  val x = 20;
  var res = ""  // NEVER use var
  if (x == 20) {
    res = "twenty"
  }
  else {
    res = "not twenty"
  }
  println(res)

//    ...in scala...with if exprsns
  val res2 = if(x>20 && x<30) "twentys" else "not twentys"
  println(res2)

  // for loop - scala
  for (i <- 1 to 5; j <- 1 to 3) {
    println(s"$i => $j")
  }
  var lst = List(5,6,7,8,9)
  for(i <- lst) if(i>7) println(i)
  for(i <- lst; if(i<7)) println(i)

  val result = for(i <- lst; if(i < 6)) i
  println(result)
  val result2 = for(i <- lst; if(i > 8)) yield i+2
  println(result2)


  // match
  val num = 1
  val result3 = num match {       // ...== switch(num)...num is arg passed
    case 1 => "one"
    case 2 | 3 | 5 | 7 => "prime"
    case _ => "invalid"   // default
  }
  println(result3)


}
