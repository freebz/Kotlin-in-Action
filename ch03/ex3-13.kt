// 리스트 3.13  로컬 함수에서 바깥 함수의 파라미터 접근하기

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    fun validate(value: String, fieldName: String) {
	if (value.isEmpty()) {
	    throw IllegalArgumentException(
		"Can't save user ${user.id}: " +
		  "empty $fieldName")
	}
    }

    validate(user.name, "Name")
    validate(user.address, "Address")

    // user를 데이터베이스에 저장한다.

}
