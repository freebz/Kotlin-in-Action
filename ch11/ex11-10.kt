// 리스트 11.10  HTML 빌더를 사용해 태그를 동적으로 생성하기

fun createAnotherTable() = table {
   for (i in 1..2) {
      tr {
	 td {
	 }
      }
   }
}

println(createAnotherTable())
// <table><tr><td></td></tr><tr><td></td></tr></table>
