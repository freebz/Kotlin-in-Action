// 리스트 4.6  열린 메소드를 포함하는 열린 클래스 정의하기

open class RichButton : Clickable {

    fun disable() {}

    open fun animate() {}

    override fun click() {}

}
