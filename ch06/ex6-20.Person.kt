// 리스트 6.20  널이 될 수 있는 원시 타입

data class Person(val name: String,
		  val age: Int? = null) {
    fun isOlderThan(other: Person): Boolean? {
	if (age == null || other.age == null)
	    return null
	return age > other.age
    }
}

println(Person("Sam", 35).isOlderThan(Person("Amy", 42)))
// false
println(Person("Sam", 35).isOlderThan(Person("Jane")))
// null
