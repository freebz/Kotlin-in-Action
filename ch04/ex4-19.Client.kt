// 리스트 4.19  Client에 equals() 구현하기

class Client(val name: String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean {
	if (other == null || other !is Client)
	  return false
	return name == other.name &&
	  postalCode == other.postalCode
    }
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
}
