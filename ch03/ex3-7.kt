// 리스트 3.7  확장 프로퍼티 선언하기

val String.lastChar: Char
    get() = get(length - 1)
