// 리스트 7.25  값을 맵에 저장하는 프로퍼티 정의하기

class Person {
    // 추가 정보
    private val _attributes = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
	_attributes[attrName] = value
    }

    // 필수 정보
    val name: String
	get() = _attributes["name"]!!
}

val p = Person()
val data = mapOf("name" to "Dmitry", "company" to "JetBrains")
for ((attrName, value) in data)
    p.setAttribute(attrName, value)
println(p.name)
// Dmitry
