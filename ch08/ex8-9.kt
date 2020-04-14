// 리스트 8.9  사이트 방문 데이터를 하드 코딩한 필터를 사용해 분석하기

val averageWindowsDuration = log
    .filter { it.os == OS.WINDOWS }
    .map(SiteVisit::duration)
    .average()

println(averageWindowsDuration)
// 23.0
