// 리스트 9.5  제네릭 파입으로 타입 캐스팅하기

fun printSum(c: Collection<*>) {
    val intList = c as? List<Int>
      ?: throw IllegalArgumentException("List is expected")
    println(intList.sum())
}

printSum(listOf(1, 2, 3))
// 6

printSum(setOf(1, 2, 3))
// java.lang.IllegalArgumentException: List is expected

printSum(listOf("a", "b", "c"))
// java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Number
