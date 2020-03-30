// 리스트 2.25  in을 사용해 값이 범위에 속하는지 검사하기

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

println(isLetter('q'))
// true
println(isNotDigit('x'))
// true
