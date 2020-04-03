// 리스트 6.4  엘비스 연산자를 활용해서 널 값 다루기

fun strLenSafe(s: String?): Int = s?.length ?: 0

println(strLenSafe("abc"))
// 3

println(strLenSafe(null))
// 0
