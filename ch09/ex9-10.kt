// 리스트 9.10  어떤 타입이 다른 타입의 하위 타입인지 검사하기

fun test(i: Int) {
    val n: Number = i

    fun f(s: String) { /*...*/ }
    f(i)

}
