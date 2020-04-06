// 리스트 7.8  compareTo 메소드 구현하기

class Person(
    val firstName: String, val lastName: String
) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
	return compareValuesBy(this, other,
	  Person::lastName, Person::firstName)
    }
}

val p1 = Person("Alice", "Smith")
val p2 = Person("Bob", "Johson")
println(p1 < p2)
// false
