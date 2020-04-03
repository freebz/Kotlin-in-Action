// 리스트 6.32  배열에 forEachIndexed 사용하기

fun main(args: Array<String>) {
    args.forEachIndexed { index, element ->
      println("Argument $index is: $element")
    }
}
