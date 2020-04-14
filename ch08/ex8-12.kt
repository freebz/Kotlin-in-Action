// 리스트 8.12  고차 함수를 사용해 중복 제거하기

fun List<SiteVisit>.averageDurationFor(predicate: (SiteVisit) -> Boolean) =
    filter(predicate).map(SiteVisit::duration).average()


println(log.averageDurationFor {
    it.os in setOf(OS.ANDROID, OS.IOS) })
// 12.15


println(log.averageDurationFor {
    it.os == OS.IOS && it.path == "/signup" })
// 8.0
