package module1

class HelloScala {

  case class TryOut(some: String, fields: List[String])

  def test = if (true) "Hello" else "Some very elaborate scheme to get uncovered statements"

  def notCovered = 42
}