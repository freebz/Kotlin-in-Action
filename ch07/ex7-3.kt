// 리스트 7.3  두 피연산자의 타입이 다른 연산자 정의하기

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

val p = Point(10, 20)
println(p * 1.5)
// Point(x=15, y=30)
