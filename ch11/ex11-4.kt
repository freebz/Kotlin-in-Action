// 리스트 11.4  코틀린 HTML 빌더를 사용해 간단한 HTML 표 만들기

fun createSimpleTable() = createHTML().
   table {
      tr {
	 td { +"cell" }
      }
   }
