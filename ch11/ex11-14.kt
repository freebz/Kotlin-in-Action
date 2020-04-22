// 리스트 11.14  Item 함수를 사용해 드롭다운 메뉴 만들기

ul {
   classes = setOf("dropdown-menu")
   item("#", "Action")
   item("#", "Another action")
   li { role = "separator"; classes = setOf("divider") }
   li { classes = setOf("dropdown-header"); +"Header" }
   item("#", "Separated link")
}
