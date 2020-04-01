// 리스트 4.14  인터페이스의 프로퍼티 구현하기

interface User {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User

class SubscribingUser(val email: String) : User {
    override val nickname: String
	get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : User {
    override val nickname = getFacebookName(accountId)
}

println(PrivateUser("test@kotlinlang.org").nickname)
// test@kotlinlang.org
println(SubscribingUser("test@kotlinlang.org").nickname)
// test
