// 리스트 3.14  검증 로직을 확장 함수로 추출하기

class User(val id: Int, val name: String, val address: String)

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
	if (value.isEmpty()) {
	    throw IllegalArgumentException(
		"Can't save user $id empty $fieldName")
	}
    }

    validate(name, "Name")
    validate(address, "Address")

}

fun saveUser(user: User) {
    
    user.validateBeforeSave()
    
    // user를 데이터베이스에 저장한다.

}
