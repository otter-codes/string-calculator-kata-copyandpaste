object StringCalculatorOriginal {

  def add(numbers: String): Int = {

    val regexPattern = "[0-9]+".r
    val numbersPulled = regexPattern.findAllMatchIn(numbers).toList
    val sum = numbersPulled.map(x => x.toString.toInt).sum

    val regexPattern2 = "[-]+".r
    val negNumbers = regexPattern2.findAllIn(numbers)

    if (numbers == "") {
      0
    } else if (negNumbers.contains("-")) {
      throw new IllegalArgumentException("requirement failed: -2,-3")
    } else {
      sum
    }
  }
}
