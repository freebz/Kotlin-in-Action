// 리스트 7.12  날짜의 범위 다루기

val now = LocalDate.now()
val vacation = now..now.plusDays(10)
println(now.plusWeeks(1) in vacation)
// true
