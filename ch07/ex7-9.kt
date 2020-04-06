// 리스트 7.9  get 관례 구현하기

operator fun Point.get(index: Int): Int {
    return when(index) {
	0 -> x
	1 -> y
	else ->
	    throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

val p = Point(10, 20)
println(p[1])
// 20
