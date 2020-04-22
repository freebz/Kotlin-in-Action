// 리스트 11.13  도우미 함수를 활용해 드롭다운 메뉴 만들기

fun dropdownExample() = createHTML().dropdown {
   dropdownButton { +"Dropdown" }
   dropdownMenu {
      item("#", "Action")
      item("#", "Another action")
      divider()
      dropdownHeader("Header")
      item("#", "Separated link")
   }
}
