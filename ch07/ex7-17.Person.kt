// 리스트 7.17  지연 초기화를 뒷바침하는 프로퍼티를 통해 구현하기

class Email { /*... */ }
fun loadEmails(person: Person): List<Email> {
    println("${person.name}의 이메일을 가져옴")
    return listOf(/*...*/)
}


class Person(val name: String) {
    private var _emails: List<Email>? = null
    val emails: List<Email>
	get() {
	    if (_emails == null) {
		_emails = loadEmails(this)
	    }
	    return _emails!!
	}
}

val p = Person("Alice")
p.emails
// Load emails for Alice
p.emails
