/**
  * 匹配类成员
  */



// avoid null

case class User(name: String, age: Option[Int])


def checkUser(user: User) = user match {
  case User(name, Some(age)) => s" $name is $age year old"
  case User(name, None) => s"we don't know the age of $name"
}












// Match Tuple
//val hostPort = ("localhost", 80)
//
//def checkHostAndPort(hostPort: Tuple2[String, Int]) = hostPort match {
//  case ("localhost", 80) => "This is localhost running on port 80"
//  case ("localhost", port) => s"This is localhost running on port $port"
//  case (url, _) => s"This is $url"
//}


//checkHostAndPort("localhost", 9090)
//checkHostAndPort(hostPort)




