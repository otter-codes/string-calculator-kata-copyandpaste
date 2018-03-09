import scala.util.matching.Regex


object StringCalculator extends App {
  //
  //  def add(numbers: String): Int = {
  //
  //    val regexPattern = "(-)?[0-9]+".r
  //    val pulledNumbers = regexPattern.findAllIn(numbers).toList.map(x => x.toInt)
  //
  //    numbers match {
  //      case _ if pulledNumbers != pulledNumbers.filter(x => x > 0) => throw new IllegalArgumentException("requirement failed: -2,-3")
  //      case _ => pulledNumbers.sum
  //    }
  //  }
  //}

  /** calling .findAllMatchIn will find all matches within a given parameter (numbers) using the regex pattern you define in this case "[-][0-9]+" & "[0-9]+" **/

  def add(numbers: String): Int = {

    val regexPattern = "(-)?[0-9]+".r

    val pulledNumbers = regexPattern
                        .findAllIn(numbers)
                        .toList
                        .map(x => x.toInt)

    pulledNumbers match {
      case x if x.forall(_ > 0) => pulledNumbers.sum
      case _ => throw new IllegalArgumentException("requirement failed: -2,-3")
    }
  }
}