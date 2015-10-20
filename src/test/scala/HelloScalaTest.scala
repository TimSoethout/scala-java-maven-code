import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, ShouldMatchers}
import module1.HelloScala

// @RunWith helps with running all tests at once in IntelliJ
@RunWith(classOf[JUnitRunner])
class HelloScalaTest extends FlatSpec with ShouldMatchers {

  "it" should "work" in {
    val scala: HelloScala = new HelloScala()
    scala.test should equal("Hello")

    scala.TryOut("String", List()) should not equal(true)
  }

}
