// 리스트 8.20  레이블을 통해 로컬 리턴 사용하기

fun lookForAlice(people: List<Person>) {
    people.forEach label@{
	if (it.name == "Alice") return@label
    }
    println("Alice might be somewhere")
}

lookForAlice(people)
// Alice might be somewhere
