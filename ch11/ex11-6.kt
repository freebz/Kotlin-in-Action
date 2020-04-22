// 리스트 11.6  HTML 빌더 호출의 수신 객체를 명시한 코드

fun createSimpleTable() = createHTML().
   table {
      (this@table).tr {
	 (this@tr).td {
	    +"cell"
	 }
      }
   }
