// 리스트 3.11  코드 중복을 보여주는 예제

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    if (user.name.isEmpty()) {
	throw IllegalArgumentException(
	    "Can't save user ${user.id}: empty Name")
    }

    if (user.address.isEmpty()) {
	throw IllegalArgumentException(
	    "Can't save user ${user.id}: empty Address")
    }

    // user를 데이터베이스에 저장한다.

}

saveUser(User(1, "", ""))
// java.lang.IllegalArgumentException: Can't save user 1: empty Name
