// 리스트 7.5  단일 연산자 정의하기

operator fun Point.unaryMinus() : Point {
    return Point(-x, -y)
}

val p = Point(10, 20)
println(-p)
// Point(x=-10, y=-20)
