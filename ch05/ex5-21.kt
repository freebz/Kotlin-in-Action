// 리스트 5.21  buildString으로 알파벳 만들기

fun alphabet() = buildString {
    for (letter in 'A'..'Z') {
	append(letter)
    }
    append("\nNow I know the alphabet!")
}
