// 리스트 4.2  단순한 인터페이스 구현하기

class Button : Clickable {
    override fun click() = println("I was clicked")
}

Button().click()
// I was clicked
