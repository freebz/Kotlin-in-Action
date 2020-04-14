// 리스트 8.1  간단한 고차 함수 정의하기

fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("The result is $result")
}

twoAndThree { a, b -> a + b }
// The result is 5
twoAndThree { a, b -> a * b }
// The result is 6
