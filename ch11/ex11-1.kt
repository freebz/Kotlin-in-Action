// 리스트 11.1  람다를 인자로 받는 buildString() 정의하기

fun buildString(
      builderAction: (StringBuilder) -> Unit
): String {
   val sb = StringBuilder()
   builderAction(sb)
   return sb.toString()
}

val s = buildString {
   it.append("Hello, ")
   it.append("World!")
}

println(s)
// Hello, World!
