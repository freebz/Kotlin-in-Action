// 리스트 6.7  널 아님 단언 사용하기

fun ignoreNulls(s: String?) {
    val sNotNull: String = s!!
    println(sNotNull.length)
}

ignoreNulls(null)
// Exception in thread "main" kotlin.KotlinNullPointerException
// at <...>.ignoreNulls(07_NotnullAssertions.kts:2)
