// 리스트 3.4  joinToString()를 확장으로 정의하기

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
	if (index > 0) result.append(separator)
	result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

val list = listOf(1, 2, 3)
println(list.joinToString(separator = "; ",
    prefix = "(", postfix = ")"))
// (1; 2; 3)


val list = listOf(1, 2, 3)
println(list.joinToString(" "))
// 1 2 3
