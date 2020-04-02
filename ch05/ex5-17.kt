// 리스트 5.17  with를 사용해 알파벳 만들기

fun alphabet(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {
	for (letter in 'A'..'Z') {
	    this.append(letter)
	}
	append("\nNow I know the alphabet!")
	this.toString()
    }    
}
