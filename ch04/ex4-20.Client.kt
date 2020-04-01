// 리스트 4.20  Client에 hashCode 구현하기

class Client(val name: String, val postalCode: Int) {
    ...
    override fun hashCode(): Int = name.hashCode() * 31 + postalCode
}
