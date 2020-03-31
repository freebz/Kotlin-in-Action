// 리스트 3.12  로컬 함수를 사용해 코드 중복 줄이기

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {

    fun validate(user: User,
		 value: String,
		 fieldName: String) {
	if (value.isEmpty()) {
	    throw IllegalArgumentException(
		"Can't save user ${user.id}: empty $fieldName")
	}
    }

    validate(user, user.name, "Name")
    validate(user, user.address, "Address")

    // user를 데이터베이스에 저장한다.

}
