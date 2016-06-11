abstract class Language {
  val name: String
  override def toString = name
}


trait JVM {
  override def toString = super.toString + " runs on JVM"
}

trait Static {
  override def toString = super.toString + " is Static"
}


class Scala extends Language with Static with JVM {
  override val name: String = "Scala"
}


println(new Scala)




