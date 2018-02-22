val numbers = "1,2,3,4"


val regexPattern = "[0-9]+".r

val numbersPulled = regexPattern.findAllMatchIn(numbers).toList

val sum = numbersPulled.map(x => x.toString.toInt).sum

if (numbers == "") {
  0
} else {
  sum
}
