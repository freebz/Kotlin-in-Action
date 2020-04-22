// 리스트 11.24  날짜 조작 DSL 정의

import java.time.Period

import java.time.LocalDate

val Int.days: Period
   get() = Period.ofDays(this)

val Period.ago: LocalDate
   get() = LocalDate.now() - this

val Period.fromNow: LocalDate
   get() = LocalDate.now() + this

println(1.days.ago)
// 2016-08-16

println(1.days.fromNow)
// 2016-08-18
