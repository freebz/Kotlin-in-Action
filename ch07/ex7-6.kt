// 리스트 7.6  증가 연산자 정의하기

operator fun BigDecimal.inc() = this + BigDecimal.ONE

var bd = BigDecimal.ZERO
println(bd++)
// 0
println(++bd)
// 2
