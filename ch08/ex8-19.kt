// 리스트 8.19  forEach에 전달된 람다에서 return 사용하기

fun lookForAlice(people: List<Person>) {
    people.forEach {
	if (it.name == "Alice") {
	    println("Found!")
	    return
	}
    }
    println("Alice is not found")
}
