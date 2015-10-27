package module1

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FlatSpec, ShouldMatchers}

@RunWith(classOf[JUnitRunner])
class HelloScalaTest extends FlatSpec with Matchers {

  "it" should "work" in {
    val scala: HelloScala = new HelloScala()
    scala.test should equal("Hello")

    scala.TryOut("String", List()) should not equal true
  }

}
