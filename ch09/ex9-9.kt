// 리스트 9.9  filterIsInstance를 간단하게 정리한 버전

inline fun <reified T>
      Iterable<*>.filterIsInstance(): List<T> {
    val destination = mutableListOf<T>()
    for (element in this) {
	if (element is T) {
	    destination.add(element)
	}
    }
    return destination
}
