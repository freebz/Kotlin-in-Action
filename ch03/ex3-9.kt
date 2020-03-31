// 리스트 3.9  String 확장 함수를 사용해 경로 파싱하기

fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir: $directory, name: $fileName, ext: $extension")
}

parsePath("/Users/yole/kotlin-book/chapter.adoc")
// Dir: /Users/yole/kotlin-book, name: chapter, ext: adoc
