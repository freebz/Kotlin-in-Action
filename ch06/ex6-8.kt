// 리스트 6.8  스윙 액션에서 널 아님 단언 사용하기

class CopyRowAction(val list: JList<String>) : AbstractAction() {

    override fun isEnabled(): Bolean =
	list.selectedValue != null

    override fun actionPerformed(e: ActionEvent) {
	val value = list.selectedValue!!

	// value를 클립보드로 복사
    }
}
