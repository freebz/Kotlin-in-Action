// 리스트 5.18  with와 식을 본문으로 하는 함수를 활용해 알파벳 만들기

fun alphabet() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
	append(letter)
    }
    append("\nNow I know the alphabet!")
    toString()
}    
