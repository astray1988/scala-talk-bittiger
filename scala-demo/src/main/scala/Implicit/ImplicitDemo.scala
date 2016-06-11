package Implicit

/**
  * Created by dylan on 6/4/16.
  */


// 3个类, 鸭子, 鸡, 伪装成为鸭子的鸡

class Duck {
  def makeDuckNoise() = "gua gua"
}

class Chicken {
  def makeChickenNoise() = "ge ge"
}

class Ducken(chicken: Chicken) extends Duck {
  override def makeDuckNoise() = chicken.makeChickenNoise()
}



object ImplicitDemo extends App {
  implicit def chickenToDuck(chicken: Chicken) = new Ducken(chicken)

  def giveMeADuck(duck: Duck) = duck.makeDuckNoise()

  println(giveMeADuck(new Duck))
  println(giveMeADuck(new Ducken(new Chicken)))
  println(giveMeADuck(new Chicken))







}
