// 리스트 9.6  알려진 타입 인자를 사용해 타입 검사하기

fun printSum(c: Collection<Int>) {
    if (c is List<Int>) {
	println(c.sum())
    }
}

printSum(listOf(1, 2, 3))
// 6
