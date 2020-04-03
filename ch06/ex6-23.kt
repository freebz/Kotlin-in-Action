// 리스트 6.23  filterNotNull를 널이 될 수 있는 갮으로 이뤄진 컬렉션에 대해 사용하기

fun addValidNumbers(numbers: List<Int?>) {
    val validNumbers = numbers.filterNotNull()
    println("Sum of valid numbers: ${validNumbers.sum()}")
    println("Invalid numbers: ${numbers.size - validNumbers.size}")
}
