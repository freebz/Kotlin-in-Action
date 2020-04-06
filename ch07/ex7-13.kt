// 리스트 7.13  날짜 범위에 대한 이터레이터 구현하기

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
    object : Iterator<LocalDate> {
	var current = start
	override fun hasNext() =
	    current <= endInclusive
	override fun next() = current.apply {
	    current = plusDays(1)
	}
    }

val newYear = LocalDate.ofYearDay(2017, 1)
val daysOff = newYear.minusDays(1)..newYear
for (dayOff in daysOff) { println(dayOff) }
// 2016-12-31
// 2017-01-01
