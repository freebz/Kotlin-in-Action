// 리스트 5.12  자연수의 시퀀스를 생성하고 사용하기

val naturalNumbers = generateSequence(0) { it + 1 }
val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
println(numbersTo100.sum())
// 5050
