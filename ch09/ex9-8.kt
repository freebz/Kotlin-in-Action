// 리스트 9.8  filterIsInstance 표준 라이브러리 함수 사용하기

val items = listOf("one", 2, "three")
println(items.filterIsInstance<String>())
// [one, three]
