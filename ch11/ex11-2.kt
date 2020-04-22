// 리스트 11.2  수신 객체 지정 람다를 사용해 다시 정의한 buildString()

fun buildString(
      builderAction: StringBuilder.() -> Unit
) : String {
   val sb = StringBuilder()
   sb.builderAction()
   return sb.toString()
}

val s = buildString {
   this.append("Hello, ")
   append("World!")
}

println(s)
// Hello, World!
