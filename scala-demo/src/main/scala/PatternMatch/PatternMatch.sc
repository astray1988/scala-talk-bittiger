
/**
  * 值匹配
  */
var x = 1

x match {
  case 1 => "one"
  case 2 => "two"
  case _ => "Nether One nor Two"
}

/**
  *
  *
  *
  * int number = 1;
    int i = number;
    switch (i)
      {
      default:
        doDefault(); break;
      case 2:
        doSomethingElse(); break;
      case 1:
        doSomething();
      }

  */





var value: Any = "hello"

value match {
  case string: String => string
  case num: Int => {

    num match {
      case 1 => "One"
      case 2 => "Two"
      case _ => "Other number"
    }
  }

  case doublenum: Double => doublenum

}












