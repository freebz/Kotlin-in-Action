// 리스트 11.3  수신 객체 지정 람다를 변수에 저장하기

val appendExcl : StringBuilder.() -> Unit =
      { this.append("!") }

val stringBuilder = StringBuilder("Hi")
stringBuilder.appendExcl()
println(stringBuilder)
// Hi!

println(buildString(appendExcl))
// !
