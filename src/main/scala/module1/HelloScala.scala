package module1

class HelloScala {

  case class TryOut(some: String, fields: List[String])

  def test = "Hello"

  def someOther = 42

  def fromJava() = new HelloWorld().hello()
//  def fromJava() = new HelloWorld().fromScala()
}