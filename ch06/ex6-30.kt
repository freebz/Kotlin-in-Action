// 리스트 6.30  알파벳으로 이뤄진 배열 만들기

val letters = Array<String>(26) { i -> ('a' + i).toString() }
println(letters.joinToString(""))
// abcdefghijklmnopqrstuvwxyz
