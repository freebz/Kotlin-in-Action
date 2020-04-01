// 리스트 4.27  동반 객체에 이름 붙이기

class Person(val name: String) {
    companion object Loader {
	fun fromJSON(jsonText: String): Person = ...
    }
}

person = Person.Loader.fromJSON("{name: 'Dmitry'}")
person.name
// Dmitry
person2 = Person.fromJSON("{name: 'Brent'}")
person2.name
// Brent
