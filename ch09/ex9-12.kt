// 리스트 9.12  무공변 컬렉션 역할을 하는 클래스 사용하기

class Cat : Animal() {
    fun cleanLitter() { ... }
}

fun takeCareOfCats(cats: Herd<Cat>) {
    for (i in 0 until cats.size) {
	cats[i].cleanLitter()
	// feedAll(cats)
    }
}
