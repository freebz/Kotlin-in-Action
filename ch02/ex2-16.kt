// 리스트 2.16  인자가 없는 when

fun mixOptimized(c1: Color, c2: Color) =
    when {
	(c1 == RED && c2 == YELLOW) ||
	(c1 == YELLOW && c2 == RED) ->
	    ORANGE
	(c1 == YELLOW && c2 == BLUE) ||
	(c1 == BLUE && c2 == YELLOW) ->
	    GREEN
	(c1 == BLUE && c2 == VIOLET) ||
	(c1 == VIOLET && c2 == BLUE) ->
	    INDIGO
	else -> throw Exception("Dirty color")
    }

println(mixOptimized(BLUE, YELLOW))
// GREEN
