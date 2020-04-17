// 리스트 9.14  무공변 파라미터 타입을 사용하는 데이터 복사 함수

fun <T> copyData(source: MutableList<T>,
		 destination: MutableList<T>) {
    for (item in source) {
	destination.add(item)
    }
}
