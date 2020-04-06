// 리스트 7.1  plus 연산자 구현하기

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
	return Point(x + other.x, y + other.y)
    }
}

val p1 = Point(10, 20)
val p2 = Point(30, 40)
println(p1 + p2)
// Point(x=40, y=60)
