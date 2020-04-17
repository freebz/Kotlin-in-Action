// 리스트 9.11  무공변 컬렉션 역할을 하는 클래스 정의하기

open class Animal {
    fun feed() { ... }
}

class Herd<T : Animal> {
    val size: Int get() = ...
    operator fun get(i: Int): T { ... }
}

fun feedAll(animals: Herd<Animal>) {
    for (i in 0 until animals.size) {
	animals[i].feed()
    }
}
