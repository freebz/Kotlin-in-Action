// 리스트 4.15  세터에서 됫바침하는 필드 접근하기

class User(val name: String) {
    var address: String = "unspecified"
	set(value: String) {
	    println("""
              Address was changed for $name.
              "$field" -> "$value".""".trimIndent())
	    field = value
	}
}

val user = User("Alice")
user.address = "Elsenheimerstrasse 47, 80687 Muenchen"
// Address was changed for Alice.
// "unspecified" -> "Elsenheimerstrasse 47, 80687 Muenchen".
