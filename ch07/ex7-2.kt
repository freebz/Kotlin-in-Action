// 리스트 7.2  연산자를 확장 함수로 정의하기

operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}
