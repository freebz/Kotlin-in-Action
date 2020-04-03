// 리스트 6.13  널이 될 수 있는 타입 파라미터 다루기

fun <T> printHashCode(t: T) {
    println(t?.hashCode())
}

printHashCode(null)
// null
