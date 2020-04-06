// 리스트 7.16  구조 분해 선언을 사용해 맵 이터레이션하기

fun printEntries(map: Map<String, String>) {
    for ((key, value) in map) {
	println("$key -> $value")
    }
}

val map = mapOf("Oracle" to "Java", "JetBrains" to "Kotlin")
printEntries(map)
// Oracle -> Java
// JetBrains -> Kotlin
