// 리스트 5.4  람다를 사용해 컬렉션 검색하기

val people = listOf(Person("Alice", 29), Person("Bob", 31))
println(people.maxBy { it.age })
// Person(name=Bob, age=31)
