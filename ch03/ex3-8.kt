// 리스트 3.8  변경 가능한 확장 프로퍼티 선언하기

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
	this.setCharAt(length - 1, value)
    }
