import org.scalatest.{MustMatchers, WordSpec}

class StringCalculatorSpec extends WordSpec with MustMatchers {

  "StringCalculator" must {

    "return Integer 0 when provided with Empty string '' " in {

      StringCalculator.add("") mustEqual 0

    }
    "return Integer 1 when provided with String '1' " in {
      StringCalculator.add("1") mustEqual 1

    }
    "return Integer 42 when provided with String '42' " in {
      StringCalculator.add("42") mustEqual 42
    }

    "return 3 when provided with String '1,2' " in {
      StringCalculator.add("1,2") mustEqual 3
    }

    "return 6 when provided with String '1,2,3' " in {
      StringCalculator.add("1,2,3") mustEqual 6
    }

    "return 6 when provided with the String '1\n2,3'" in {
      StringCalculator.add("1\n2,3") mustEqual 6
    }

    "return 3 when provided with the String '//;\n1;2' " ignore {
      StringCalculator.add("//;\n1;2") mustEqual 3
    }

    "throw Illegal Argument Exception with message 'requirement failed: -2,-3' when provided with String '1,-2,-3'" ignore {
      StringCalculator.add("1,-2,-3") mustEqual 0
    }
  }
}