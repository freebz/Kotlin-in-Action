// 리스트 7.7  equals 메소드 구현하기

class Point(val x: Int, val y: Int) {
    override fun equals(obj: Any?): Boolean {
	if (obj === this) return true
	if (obj !is Point) return false
	return obj.x == x && obj.y == y
    }
}

println(Point(10, 20) == Point(10, 20))
// true
println(Point(10, 20) != Point(5, 5))
// true
println(null == Point(1, 2))
// false
