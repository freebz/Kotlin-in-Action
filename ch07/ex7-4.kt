// 리스트 7.4  결과 타입이 피연산자 타입과 다른 연산자 정의하기

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

println('a' * 3)
// aaa
