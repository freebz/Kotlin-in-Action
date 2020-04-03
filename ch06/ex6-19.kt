// 리스트 6.19  자바 인터페이스를 여러 다른 널 가능성으로 구현하기

class StringPrinter : StringProcessor {
    override fun process(value: String) {
	println(value)
    }
}

class NullableStringPrinter : StringProcessor {
    override fun process(value: String?) {
	if (value != null) {
	    println(value)
	}
    }
}
