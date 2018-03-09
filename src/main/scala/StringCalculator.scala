import scala.util.matching.Regex


object StringCalculator extends App {

  def add(numbers: String) : Int = {

    val regexPattern = "[0-9]+".r
    val regexPattern2 = "[-]+".r

    val negNumbers = regexPattern2.findAllIn(numbers).toList
    val numbersPulled  = regexPattern.findAllMatchIn(numbers).toList

    numbers match {
      case x if negNumbers.contains("-") => throw new IllegalArgumentException ("requirement failed: -2,-3")
      case `numbers` => numbersPulled.map(x => x.toString.toInt).sum
      case _ => 0
    }
  }
}

/** calling .findAllMatchIn will find all matches within a given parameter (numbers) using the regex pattern you define in this case "[-][0-9]+" & "[0-9]+" **/

