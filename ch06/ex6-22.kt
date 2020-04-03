// 리스트 6.22  널이 될 수 있는 값으로 이뤄진 컬렉션 다루기

fun addValidNumbers(numbers: List<Int?>) {
    var sumOfValidNumbers = 0
    var invalidNumbers = 0
    for (number in numbers) {
	if (number != null) {
	    sumOfValidNumbers += number
	} else {
	    invalidNumbers++
	}
    }
    println("Sum of valid numbers: $sumOfValidNumbers")
    println("Invalid numbers: $invalidNumbers")
}

val reader = BufferedReader(StringReader("1\nabc\n42"))
val numbers = readNumbers(reader)
addValidNumbers(numbers)
// Sum of valid numbers: 43
// Invalid numbers: 1
