// 리스트 7.18  지연 초기화를 위임 프로퍼티를 통해 구현하기

class Person(val name: String) {
    val emails by lazy { loadEmails(this) }
}
