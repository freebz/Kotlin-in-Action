// 리스트 8.14  람다를 사용해 컬렉션 거르기

data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))

println(people.filter { it.age < 30 })
// [Person(name=Alice, age=29)]
