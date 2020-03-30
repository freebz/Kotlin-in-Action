// 리스트 2.12  when을 사용해 올바른 enum 값 찾기

fun getMnemonic(color: Color) =
    when (color) {
	Color.RED -> "Richard"
	Color.ORANGE -> "Of"
	Color.YELLOW -> "York"
	Color.GREEN -> "Green"
	Color.BLUE -> "Battle"
	Color.INDIGO -> "In"
	Color.VIOLET -> "Vain"
    }

println(getMnemonic(Color.BLUE))
// Battle
