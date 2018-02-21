object  StringCalculator extends App {


  def add(numbers: String): Int = {

    val regexPull = "[0-9]+".r // pulls numbers out of list disregards other chars //
    val numberFromString = regexPull.findAllMatchIn(numbers).toList

    val regexPullNeg = "[-][0-9]+".r // pulls neg numbers out of list //
    val findNegativeString = regexPullNeg.findAllMatchIn(numbers).toList

    if (numbers == "") {
      0
    } else {
      findNegativeString.length match {
        case 0 => numberFromString.map(x => x.toString.toInt).sum
        case _ => throw new IllegalArgumentException
      }
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
