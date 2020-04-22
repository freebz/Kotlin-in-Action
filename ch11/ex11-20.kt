// 리스트 11.20  should 함수 구현

infix fun <T> T.should(matcher: Matcher<T>) = matcher.test(this)
