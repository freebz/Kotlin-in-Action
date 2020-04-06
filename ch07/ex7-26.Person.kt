// 리스트 7.26  값을 맵에 저장하는 위임 프로퍼티 사용하기

class Person {
    private val _attributes = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
	_attributes[attrName] = value
    }

    val name: String by _attributes
}
