// 리스트 2.21  분기에 복잡한 동작이 들어가 있는 when 사용하기

fun evalWithLogging(e: Expr): Int =
    when (e) {
	is Num -> {
	    println("num: ${e.value}")
	    e.value
	}
	is Sum -> {
	    val left = evalWithLogging(e.left)
	    val right = evalWithLogging(e.right)
	    println("sum: $left + $right")
	    left + right
	}
	else -> throw IllegalArgumentException("Unknown expression")
    }

println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
// num: 1
// num: 2
// sum: 1 + 2
// num: 4
// sum: 3 + 4
// 7
