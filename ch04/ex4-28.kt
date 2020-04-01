// 리스트 4.28  동반 객체에서 인터페이스 구현하기

interface JSONFactory<T> {
    fun from JSON(jsonText: String): T
}

class Person(val name: String) {
    companion object : JSONFactory<Person> {
	override fun fromJSON(jsonText: String): Person = ...
    }
}
