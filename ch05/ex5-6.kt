// 리스트 5.6  이름 붙인 인자를 사용해 람다 넘기기

val people = listOf(Person("이몽룡", 29), Person("성춘향", 31))
val names = people.joinToString(separator = " ",
		     transform = { p: Person -> p.name })
println(names)
// 이몽룡 성춘향
