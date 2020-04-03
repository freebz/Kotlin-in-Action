// 리스트 6.1  if 검사를 통해 null 값 다루기

fun strLenSafe(s: String?): Int =
    if (s != null) s.length else 0

val x: String? = null
println(strLenSafe(x))
// 0
println(strLenSafe("abc"))
// 3
