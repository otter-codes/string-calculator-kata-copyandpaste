import org.scalatest.{MustMatchers, WordSpec}

class StringCalculatorSpec extends WordSpec with MustMatchers {

  "String Calculator" must {

    "return Int of '0' when provided with an empty string" in {

      StringCalculator.add("") mustEqual 0
    }

    "return Int of '1' when provided with 1" in {

      StringCalculator.add("1") mustEqual 1
    }

    "return Int of '42' when provided with 42" in {

      StringCalculator.add("42") mustEqual 42
    }

    "return Int of '3' when provided with 1, 2" in {

      StringCalculator.add("1, 2") mustEqual 3
    }
  }

}

