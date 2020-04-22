// 리스트 11.21  코틀린테스트 DSL에 사용하기 위한 Matcher 선언

interface Matcher<T> {
   fun test(value: T)
}

class startWith(val prefix: String) : Matcher<String> {
   override fun test(value: String) {
      if (!value.startsWith(prefix))
      throw AssertionError("String $value does not start with $prefix")
   }
}
