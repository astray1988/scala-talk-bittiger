/**
  * 类型匹配
  */

trait Animal

case class Cat(name: String) extends Animal

case class Dog(name: String) extends Animal

case class Chicken(name: String) extends Animal

val dog = Dog("Dog")

val dog2 = Dog("Dog")

dog == dog2

Cat("Tim") == Cat("Tim")

def checkAnimal(animal: Animal) = animal match {
    case Dog(name) => s"This dog name is $name"

    case Cat(_) => s"This cat name is Kitty"

    case _ => "Other animals"
}

var animal: Animal = Dog("Tim")

println(checkAnimal(animal))





// Java反编译

/**
  *
  * Animal animal;
    String string;
    Animal animal2 = (animal = this.createAnimal());
    if ((animal2 instanceof Dog)) {
        return "this is a dog";
    }
    if (!((animal2 instanceof Cat))) return "other animal";
    Cat cat = (Cat)(animal2);
    String string2 = (string = cat.name());
    if ("kitty" == null) {
        if (string2 == null) return "this is a cat named kitty";
        return "other animal";
    } else {
        if (!("kitty".equals(string2))) return "other animal";
        return "this is a cat named kitty";
    }
  *
  */