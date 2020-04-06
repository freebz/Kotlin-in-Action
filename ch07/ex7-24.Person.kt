// 리스트 7.24  Delegates.observable을 사용해 프로퍼티 변경 통지 구현하기

class Person(
    val name: String, age: Int, salary: Int
) : PropertyChangeAware() {

    private val observer = {
	prop: KProperty<*>, oldValue: Int, newValue: Int ->
	changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }

    var age: Int by Delegates.observable(age, observer)
    var salary: Int by Delegates.observer(salary, observer)
}
