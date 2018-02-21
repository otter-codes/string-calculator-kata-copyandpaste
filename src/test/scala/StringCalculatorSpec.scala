import org.scalatest.{MustMatchers, WordSpec}

class StringCalculatorSpec extends WordSpec with MustMatchers  {

  "StringCalculator" must {

    "return Integer 0 when provided with Empty string " in {

     StringCalculator.add("") mustEqual 0

    }

  }

}
