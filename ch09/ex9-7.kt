// 리스트 9.7  실체화한 타입 파라미터를 사용하는 함수 정의하기

fun <T> isA(value: Any) = value is T
// Error: cannot check for instance of erased type: T

inline fun <reified T> isA(value: Any) = value is T

println(isA<String>("abc"))
// true

println(isA<String>(123))
// false
