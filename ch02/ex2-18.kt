// 리스트 2.18  if 연쇄를 사용해 식을 계산하기

fun eval(e: Expr): Int {
    if (e is Num) {
	val n = e as Num
	return n.value
    }
    if (e is Sum) {
	return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}

println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
// 7
