// 리스트 4.30  무명 객체로 이벤트 리스너 구현하기

window.addMouseListener(
    object : MouseAdapter() {
	override fun mouseClicked(e: MouseEvent) {
	    // ...
	}

	override fun mouseEntered(e: MouseEvent) {
	    // ...
	}
    }
}
