// 리스트 3.5  멤버 함수 오버라이드하기

open class View {
    open fun click() = println("View clicked")
}

class Button : View() {
    override fun click() = println("Button clicked")
}


val view: View = Button()
view.click()
// Button clicked
