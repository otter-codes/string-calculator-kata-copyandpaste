object  StringCalculator extends App {


  def add(numbers: String): Int = {

    val regexPattern = "[0-9]+".r
    val numbersPulled = regexPattern.findAllMatchIn(numbers).toList
    val sum = numbersPulled.map(x => x.toString.toInt).sum

    if (numbers == "") {
      0
    } else {
      sum
    }
  }
}


//    val regexPull = "[0-9]+".r // pulls numbers out of list disregards other chars //
//    val numberFromString = regexPull.findAllMatchIn(numbers).toList
//
//    val regexPullNeg = "[-][0-9]+".r // pulls neg numbers out of list //
//    val findNegativeString = regexPullNeg.findAllMatchIn(numbers).toList
//
//    if (numbers == "") {
//      0
//    } else {
//      findNegativeString.length match {
//        case 0 => numberFromString.map(x => x.toString.toInt).sum
//        case _ => throw new IllegalArgumentException (s"requirement failed: $regexPullNeg")
//      }
//    }
//  }


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
