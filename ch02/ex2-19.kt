// 리스트 2.19  값을 만들어내는 if 식

fun eval(e: Expr): Int =
    if (e is Num) {
	e.value
    } else if (e is Sum) {
	eval(e.right) + eval(e.left)
    } else {
	throw IllegalArgumentException("Unknown expression")
    }

println(eval(Sum(Num(1), Num(2))))
// 3
