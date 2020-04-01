// 리스트 4.5  상속한 인터페이스의 메소드 구현 호출하기

class Button : Clickable, Focusable {
    override fun click() = println("I was clicked")
    override fun showOff() {
	super<Clickable>.showOff()
	super<Focusable>.showOff()
    }
}
