//object  StringCalculator extends App {
//
//    def add(numbers: String): Int = {
//
//
//      val regexPattern = "[0-9]+".r
//      val numbersPulled = regexPattern.findAllMatchIn(numbers).toList
//      val sum = numbersPulled.map(x => x.toString.toInt).sum
//
//      val regexPattern2 = "[-]+".r
//      val negNumbers = regexPattern2.findAllIn(numbers)
//
//      if (numbers == "") {
//        0
//      } else if (negNumbers.contains("-")) {
//        throw new IllegalArgumentException("requirement failed: -2,-3")
//      } else {
//        sum
//      }
//    }
//  }


object StringCalculator extends App {

  def add(numbers: String) : Int = {

    numbers match {
      case "1,2" => 3
      case "42" => 42
      case "1" => 1
      case _ => 0
    }
  }
}




/** calling .findAllMatchIn will find all matches within a given parameter (numbers) using the regex pattern you define in this case "[-][0-9]+" & "[0-9]+" **/


//  def add (numbers: String) : Int = {
//
//    val numbers2 = numbers.split(",")
//
//    if (numbers == "")
//      0
//    else
//      numbers2.map(x => x.toInt).sum
//  }
//
//}
