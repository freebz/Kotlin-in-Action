// 리스트 4.9  직렬화할 수 있는 상태가 있는 뷰 선언

interface State: Serializable

interface View {

    fun getCurrentState(): State

    fun restoreState(state: State) {}

}
