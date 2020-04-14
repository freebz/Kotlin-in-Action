// 리스트 8.3  하드 코딩을 통해 toString 사용 관례를 따르는 joinToString

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
