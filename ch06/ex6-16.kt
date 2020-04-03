// 리스트 6.16  널 검사 없이 자바 클래스 접근하기

fun yellAt(person: Person) {
    println(person.name.toUpperCase() + "!!!")
}

yellAt(Person(null))
// java.lang.IllegalArgumentException: Parameter specified as non-null
// is null: method toUpperCase, parameter $receiver
