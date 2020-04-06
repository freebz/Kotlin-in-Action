// 리스트 7.22  ObservableProperty를 프로퍼티 위임에 사용할 수 있게 바꾼 모습

class ObservableProperty(
    var propValue: Int, val changeSupport: PropertyChangeSupport
) {

    operator fun getValue(p: Person, prop: KProperty<*>): Int = propValue

    operator fun setValue(p: Person, prop: KProperty<*>, newValue: Int) {
	val oldValue = propValue
	propValue = newValue
	changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
}
