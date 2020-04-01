// 리스트 4.31  무명 객체 안에서 로컬 변수 사용하기

fun countClicks(window: Window) {
    var clickCount = 0

    window.addMouseListener(object : MouseAdapter() {
	override fun mouseClicked(e: MouseEvent) {
	    clickCount++
	}
    })
    // ...
}
