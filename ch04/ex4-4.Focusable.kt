// 리스트 4.4  동일한 메소드를 구현하는 다른 인터페이스 정의

interface Focusable {

    fun setFocus(b: Boolean) =
	println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable!")

}
