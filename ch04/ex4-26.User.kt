// 리스트 4.26  부 생성자를 팩토리 메소드로 대신하기

class User private constructor(val nickname: String) {

    companion object {

	fun newSubscribingUser(email: String) =
	    User(email.substringBefore('@')

	fun newFacebookUser(accountId: Int) =
	    User(getFacebookName(accountId)

    }
}
