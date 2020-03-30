// 리스트 2.22  when을 사용해 피지버즈 게임 구현하기

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

for (i in 1..100) {
    print(fizzBuzz(i))
}
// 1 2 Fizz 4 Buzz Fizz 7 ...
