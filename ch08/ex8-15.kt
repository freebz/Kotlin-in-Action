// 리스트 8.15  컬렉션을 직접 거르기

val result = mutableListOf<Person>()

for (person in people) {
    if (person.age < 30) result.add(person)
}

println(result)
// [Person(name=Alice, age=29)]
