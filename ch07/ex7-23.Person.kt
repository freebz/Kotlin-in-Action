// 리스트 7.23  위임 프로퍼티를 통해 트로퍼티 변경 통지 받기

class Person(
    val name: String, age: Int, salary: Int
) : PropertyChangeAware() {
    var age: Int by ObservableProperty(age, changeSupport)
    var salary: Int by ObservableProperty(salary, changeSupport)
}
