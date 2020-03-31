// 리스트 3.6  확장 함수는 오버라이드할 수 없다.

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

val view: View = Button()
view.showOff()
// I'm a view!
