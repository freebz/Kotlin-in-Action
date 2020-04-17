// 리스트 9.4  타입 파라미터에 여러 제약을 가하기

fun <T> ensureTrailingPeriod(seq: T)
    where T : CharSequence, T : Appendable {
    if (!seq.endsWith('.')) {
	seq.append('.')
    }
}

val helloWorld = StringBuilder("Hello World")
ensureTrailingPeriod(helloWorld)
println(helloWorld)
// Hello World.
