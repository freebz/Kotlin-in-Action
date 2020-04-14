// 리스트 8.11  복잡하게 하드코딩한 필터를 사용해 방문 데이터 분석하기

val averageMobileDuration = log
    .filter { it.os in setOf(OS.IOS, OS.ANDROID) }
    .map(SiteVisit::duration)
    .average()

println(averageMobileDuration)
// 12.15
