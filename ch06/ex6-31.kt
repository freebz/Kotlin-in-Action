// 리스트 6.31  컬렉션을 vararg 메소드에 넘기기

val strings = listOf("a", "b", "c")
println("%s/%s/%s".format(*strings.toTypedArray()))
// a/b/c
