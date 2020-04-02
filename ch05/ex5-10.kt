// 리스트 5.10  함수 파라미터를 람다 인에서 사용하기

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
	println("$prefix $it")
    }
}

val errors = listOf("403 Forbidden", "404 Not Found")
printMessagesWithPrefix(errors, "Error:")
// Error: 403 Forbidden
// Error: 404 Not Found
