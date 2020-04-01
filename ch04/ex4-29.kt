// 리스트 4.29  동반 객체에 대한 학장 함수 정의하기

// 비즈니스 로직 모듈
class Person(val firstName: String, val lastName: String) {
    companion object {

    }
}

// 클라이언트/서버 통신 모듈
fun Person.Companion.fromJSON(json: String): Person {
    ...
}

val p = Person.fromJSON(json)
