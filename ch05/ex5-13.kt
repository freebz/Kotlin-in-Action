// 리스트 5.13  조상 디렉터리의 시퀀스를 생성하고 사용하기

fun File.isInsideHiddenDirectory() =
    generateSequence(this) { it.parentFile }.any { it.isHidden }
val file = File("/Users/svtk/.HiddenDir/a.txt")
println(file.isInsideHiddenDirectory())
// true
