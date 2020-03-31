// 리스트 3.10  경로 파싱에 정규식 사용하기

fun parsePath(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
	val (directory, filename, extension) = matchResult.destructured
	println("Dir: $directory, name: $filename, ext: $extension")
    }
}
