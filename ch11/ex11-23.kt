// 리스트 11.23  중위 호출 연쇄를 지원하기 위한 API 정의

object start

infix fun String.should(x: start): StartWrapper = StartWrapper(this)

class StartWrapper(val value: String) {
   infix fun with(prefix: String) =
      if (!value.startsWith(prefix))
         throw AssertionError("String does not start with $prefix: $value")
      else
         Unit
}
