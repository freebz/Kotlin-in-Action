// 리스트 8.10  일반 함수를 통해 중복 제거하기

fun List<SiteVisit>.averageDurationFor(os: OS) =
    filter { it.os == os }.map(SiteVisit::duration).average()

println(log.averageDurationFor(OS.WINDOWS))
// 23.0
println(log.averageDurationFor(OS.MAC))
// 22.0
