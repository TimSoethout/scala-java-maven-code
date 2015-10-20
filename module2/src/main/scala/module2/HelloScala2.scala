package module2

class HelloScala2 {

  case class TryOut(some: String, fields: List[String])

  def test = new module1.HelloWorld().hello()

  def someOther = new module1.HelloScala().test
}