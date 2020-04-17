// 리스트 9.17  in 프로젝션 타입 파라미터를 사용하는 데이터 복사 함수

fun <T> copyData(source: MutableList<T>,
		 destination: MutableList<in T>) {
    for (item in source) {
	destination.add(item)
    }
}
