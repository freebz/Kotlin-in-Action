// 리스트 7.14  구조 분해 선언을 사용해 여러 값 반환하기

data class NameComponents(val name: String,
			  val extension: String)

fun splitFilename(fullName: String): NameComponents {
    val result = fullName.split('.', limit = 2)
    return NameComponents(result[0], result[1])
}

val (name, ext) = splitFilename("example.kt")
println(name)
// example
println(ext)
// kt
