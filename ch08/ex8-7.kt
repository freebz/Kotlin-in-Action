// 리스트 8.7  함수를 반환하는 함수를 UI 코드에서 사용하기

data class Person(
    val firstName: String,
    val lastName: String,
    val phoneNumber: String?
)

class ContactListFilters {
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false

    fun getPredicate(): (Person) -> Boolean {
	val startsWithPrefix = { p: Person ->
	    p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix)
	}

	if (!onlyWithPhoneNumber) {
	    return startsWithPrefix
	}

	return { startsWithPrefix(it)
	    && it.phoneNumber != null }
    }
}

val contacts = listOf(Person("Dmitry", "Jemerov", "123-4567"),
		      Person("Svetlana", "Isakova", null))
val contactListFilters = ContactListFilters()
with (contactListFilters) {
    prefix = "Dm"
    onlyWithPhoneNumber = true
}
println(contacts.filter(
    contactListFilters.getPredicate()))
// [Person(firstName=Dmitry, lastName=Jemerov, phoneNumber=123-4567)]
