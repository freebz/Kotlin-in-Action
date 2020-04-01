// 리스트 4.23  객체 선언을 사용해 Comparator 구현하기

object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(file1: File, file2: File): Int {
	return file1.path.compareTo(file2.path,
	  ignoreCase = true)
    }
}

println(CaseInsensitiveFileComparator.compare(
	    File("/User"), File("/user")))
// 0


val files = listOf(File("/Z"), File("/a"))
println(files.sortedWith(CaseInsensitiveFileComparator))
// [/a, /Z]
