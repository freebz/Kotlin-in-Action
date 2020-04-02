// 리스트 5.16  알파벳 만들기

fun alphabet(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
	result.append(letter)
    }
    result.append("\nNow I know the alphabet!")
    return result.toString()
}

println(alphabet())
// ABCDEFGHIJKLMNOPQRSTUVWXYZ
// Now I know the alphabet!
