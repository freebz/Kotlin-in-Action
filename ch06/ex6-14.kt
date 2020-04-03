// 리스트 6.14  타입 파라미터에 대해 널이 될 수 없는 상한을 사용하기

fun <T: Any> printHashCode(t: T) {
    println(t.hashCode())
}

printHashCode(null)
// Error: type parameter bound for `T` is not astisfied

printHashCode(42)
// 42
