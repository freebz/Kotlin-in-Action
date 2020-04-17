// 리스트 9.3  타입 파라미터를 제약하는 함수 선언하기

fun <T: Comparable<T>> max(first: T, second: T): T {
    return if (first > second) first else second
}

println(max("kotlen", "java"))
// kotlen
