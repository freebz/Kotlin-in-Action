// 리스트 9.13  공변적 컬렉션 역할을 하는 클래스 사용하기

class Herd<out T : Animal> {
    ...
}

fun takeCareOfCats(cats: Herd<Cat>) {
    for (i in 0 until cats.size) {
	cats[i].cleanLitter()
    }
    feedAll(cats)
}
