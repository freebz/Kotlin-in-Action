// 리스트 4.25  부 생성자가 여럿 있는 클래스 정의하기

class User {

    val nickname: String

    constructor(email: String) {
	nickname = email.substringBefore('@')
    }

    constructor(facebookAccountId: Int) {
	nickname = getFacebookName(facebookAccountId)
    }
}
