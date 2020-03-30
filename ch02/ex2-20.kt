// 리스트 2.20  if 중첩 대신 when 사용하기

fun eval(e: Expr): Int =
    when (e) {
	is Num ->
	    e.value
	is Sum ->
	    eval(e.right) + eval(e.left)
	else ->
	    throw IllegalArgumentException("Unknown expression")
    }
