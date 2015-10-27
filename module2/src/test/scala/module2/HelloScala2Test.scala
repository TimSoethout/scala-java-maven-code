package module2

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}

@RunWith(classOf[JUnitRunner])
class HelloScala2Test extends FlatSpec with Matchers {

  "it" should "work" in {
    val scala: HelloScala2 = new HelloScala2()
    scala.test should equal("Hello")

    scala.TryOut("String", List()) should not equal true
  }

}
