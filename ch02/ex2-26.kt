// 리스트 2.26  when에서 in 사용하기

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know..."
}

println(recognize('8'))
// It's a digit!
