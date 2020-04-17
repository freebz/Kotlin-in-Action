// 리스트 9.15  타입 파라미터가 둘인 데이터 복사 함수

fun <T: R, R> copyData(source: MutableList<T>,
		       destination: MutableList<R>) {
    for (item in source) {
	destination.add(item)
    }
}

val ints = mutableListOf(1, 2, 3)
val anyItems = mutableListOf<Any>()
copyData(ints, anyItems)
println(anyItems)
// [1, 2, 3]
