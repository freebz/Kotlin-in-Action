// 리스트 6.12  null이 될 수 있는 수신 객체에 대해 확장 함수 호출하기

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {
	println("Please fill in the required fields")
    }
}

verifyUserInput(" ")
// Please fill in the required fields
verifyUserInput(null)
// Please fill in the required fields
