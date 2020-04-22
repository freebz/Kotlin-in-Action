// 리스트 11.5  HTML 빌더를 위한 태그 클래스 정의

open class Tag

class TABLE : Tag {
   fun tr(init : TR.() -> Unit)
}

class TR : Tag {
   fun td(init : TD.() -> Unit)
}

class TD : Tag
