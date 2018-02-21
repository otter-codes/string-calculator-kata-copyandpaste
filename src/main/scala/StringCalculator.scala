object StringCalculator extends App {

  def add (numbers: String) : Int = {

    if (numbers == "") { 0

    } else {
      
      val numberPuller = "[0-9]+".r
      val negPuller = "[-][0-9]+".r
      val numbers2 = numbers.split(",")

      numbers2.map(x => x.toInt).sum

    }

  }

}


//    val delimiter_extractor = "//(.)\n(.*)".r

