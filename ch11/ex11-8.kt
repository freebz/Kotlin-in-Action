// 리스트 11.8  태그 빌더 함수 정의하기

fun tr(init: TR.() -> Unit) {
   val tr = TR()
   tr.init()
   children.add(tr)
}
