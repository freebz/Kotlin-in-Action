// 리스트 5.3  컬렉션을 직접 검색하기

data class Person(val name: String, val age: Int)


fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person? = null
    for (person in people) {
	if (person.age > maxAge) {
	    maxAge = person.age
	    theOldest = person
	}
    }
    println(theOldest)
}

val people = listOf(Person("Alice", 29), Person("Bob", 31))
findTheOldest(people)
// Person(name=Bob, age=31)
