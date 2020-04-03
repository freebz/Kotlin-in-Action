// 리스트 6.17  널 검사를 통해 자바 클래스 접근하기

fun yellAtSafe(person: Person) {
    println(person.name ?: "Anyone").toUpperCase() + "!!!")
}

yellAtSafe(Person(null))
// ANYONE!!!
