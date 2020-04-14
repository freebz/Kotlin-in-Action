// 리스트 8.4  함수 타입의 파라미터에 대한 디폴트 값 지정하기

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    transform: (T) -> String = { it.toString() }
): String {
    
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
	if (index > 0) result.append(separator)
	result.append(transform(element))
    }

    result.append(postfix)
    return result.toString()
}

val letters = listOf("Alpha", "Beta")
println(letters.joinToString())
// Alpha, Beta
println(letters.joinToString { it.toLowerCase() })
// alpha, beta
println(letters.joinToString(separator = "! ", postfix = "! ",
    transform = { it.toUpperCase() }))
// ALPHA! BETA!
