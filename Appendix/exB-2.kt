// 리스트 B.2  문서화 주석 안에서 태그 사용하기

/**
* 복잡한 연산을 수행한다.
*
* @param true이면 연산을 원격에서 실행한다.
* @return 연산을 수행한 결과
* @throws IOException(원격 연결에 실패 시)
* @sample com.mycompany.SomethingTest.simple
*/
fun somethingComplicated(remote: Boolean): ComplicatedResult { ... }
