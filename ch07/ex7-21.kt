// 리스트 7.21  도우미 클래스를 통해 프로퍼티 변경 통지 구현하기

class ObservableProperty(
    val propName: String, var propValue: Int,
    val changeSupport: PropertyChangeSupport
) {
    fun getValue(): Int = propValue
    fun setValue(newValue: Int) {
	val oldValue = propValue
	propValue = newValue
	changeSupport.firePropertyChange(propName, oldValue, newValue)
    }
}

class Person(
    val name: String, age: Int, salary: Int
) : PropertyChangeAware() {

    val _age = ObservableProperty("age", age, changeSupport)
    var age: Int
	get() = _age.getValue()
	set(value) { _age.setValue(value) }

    val _salary = ObservableProperty("salary", salary, changeSupport)
    var salary: Int
	get() = _salary.getValue()
	set(value) { _salary.setValue(value) }
}
