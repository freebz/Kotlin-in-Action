// 리스트 6.24  읽기 전용과 변경 가능한 컬렉션 인터페이스

fun <T> copyElements(source: Collection<T>,
		     target: MutableCollection<T>) {
    for (item in source) {
	target.add(item)
    }
}

val source: Collection<Int> = arrayListOf(3, 5, 7)
val target: MutableCollection<Int> = arrayListOf(1)
copyElements(source, target)
println(target)
// [1, 3, 5, 7]


val source: Collection<Int> = arrayListOf(3, 5, 7)
val target: Collection<Int> = arrayListOf(1)
copyElements(source, target)
// Error: type mismatch: inferred type is Collection<Int>
//    but MutableCollection<Int> was expected
