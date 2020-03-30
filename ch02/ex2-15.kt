// 리스트 2.15  when의 분기 조건에 여러 다른 객체 사용하기

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
	setOf(RED, YELLOW) -> ORANGE
	setOf(YELLOW, BLUE) -> GREEN
	setOf(BLUE, VIOLET) -> INDIGO
	else -> throw Exception("Dirty color")
    }

println(mix(BLUE, YELLOW))
// GREEN
