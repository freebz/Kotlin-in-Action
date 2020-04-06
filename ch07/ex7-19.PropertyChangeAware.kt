// 리스트 7.19  PropertyChangeSupport를 사용하기 위한 도우미 클래스

open class PropertyChangeAware {
    protected val changeSupport = PropertyChangeSupport(this)

    fun addPropertyChangeListener(listener: PropertyChangeListener) {
	changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener) {
	changeSupport.removePropertyChangeListener(listener)
    }

}
