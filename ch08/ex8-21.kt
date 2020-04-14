// 리스트 8.21  함수 이름을 return 레이블로 사용하기

fun lookForAlice(people: List<Person>) {
    people.forEach {
	if (it.name == "Alice") return@forEach
    }
    println("Alice might be somewhere")
}
