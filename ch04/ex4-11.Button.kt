// 리스트 4.11  중첩 클래스를 사용해 코틀린에서 View 구현하기

class Button : View {

    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) { /*...*/ }

    class ButtonState : State { /*...*/ }

}
