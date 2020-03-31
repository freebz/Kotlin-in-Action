// 리스트 3.2  디폴트 파라미터 값을 사용해 joinToString() 정의하기

fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String
