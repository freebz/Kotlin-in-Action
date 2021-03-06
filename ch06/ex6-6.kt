// 리스트 6.6  안전한 연산자를 사용해 equals 구현하기

class Person(val firstName: String, val lastName: String) {
    override fun equals(o: Any?): Boolean {
	val otherPerson = o as? Person ?: return false

	return otherPerson.firstName == firstName &&
	       otherPerson.lastName == lastName
    }

    override fun hashCode(): Int =
	firstName.hashCode() * 37 + lastName.hashCode()
}

val p1 = Person("Dmitry", "Jemerov")
val p2 = Person("Dmitry", "Jemerov")
println(p1 == p2)
// true
println(p1.equals(42))
// false
