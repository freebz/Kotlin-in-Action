// 리스트 4.12  인터페이스 구현을 통해 식 표현하기

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int =
    when (e) {
	is Num -> e.value
	is Sum -> eval(e.right) + eval(e.left)
	else ->
	    throw IllegalArgumentException("Unknown expression")
    }
