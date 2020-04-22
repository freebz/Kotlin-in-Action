// 리스트 11.12  코틀린 HTML 빌더를 사용해 드롭다운 메뉴 만들기

fun buildDropdown() = createHTML().div(classes = "dropdown") {
   button(classes = "btn dropdown-toggle") {
      +"Dropdown"
      span(classes = "caret")
   }
   ul(classes = "dropdown-menu") {
      li { a("#") { +"Action" } }
      li { a("#") { +"Another action" } }
      li { role = "separator"; classes = setOf("divider") }
      li { classes = setOf("dropdown-header"); +"Header" }
      li { a("#") { +"Separated link" } }
   }
}
