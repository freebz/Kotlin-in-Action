// 리스트 9.2  제네릭 고차 함수 호출하기

val authors = listOf("Dmitry", "Svetlana")

val readers = mutableListOf<String>(/* ... */)

fun <T> List<T>.filter(predicate: (T) -> Boolean): List<T>

readers.filter { it !in authors }
