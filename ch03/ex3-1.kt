// 리스트 3.1  joinToString() 함수의 초기 구현

fun <T> joinToString(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix: String
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
	if (index > 0) result.append(separator)
	result.append(element)
    }
    result.append(postfix)
    return result.toString()
}


val list = listOf(1, 2, 3)
println(joinToString(list, "; ", "(", ")"))
// (1; 2; 3)
