// 리스트 8.22  무명 함수 안에서 return 사용하기

fun lookForAlice(people: List<Person>) {
    people.forEach(fun (person) {
        if (person.name == "Alice") return
	println("${person.name} is not Alice")
    })
}

lookForAlice(people)
// Bob is not Alice
