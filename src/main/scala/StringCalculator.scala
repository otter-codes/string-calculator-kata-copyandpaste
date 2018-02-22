object StringCalculator {

  def add (numbers: String): Int = {
    val numbers2 = numbers.split(", ")
    if (numbers == "") 0
      else {
      numbers2.map(numbers => numbers.toInt).sum
    }
  }
}
