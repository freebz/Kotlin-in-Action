// 리스트 5.19  apply를 사용해 알파벳 만들기

fun alphabet() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
	append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()
