// 리스트 7.10  관례를 따르는 set 구현하기

data class MutablePoint(var x: Int, var y: Int)

operator fun MutablePoint.set(index: Int, value: Int) {
    when(index) {
	0 -> x = value
	1 -> y = value
	else ->
	    throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

val p = MutablePoint(10, 20)
p[1] = 42
println(p)
// MutablePoint(x=10, y=42)
