// 리스트 9.1  제네릭 함수 호출하기

val letters = ('a'..'z').toList()

println(letters.slice<Char>(0..2))
// [a, b, c]

println(letters.slice(10..13))
// [k, l, m, n]
