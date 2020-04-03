// 리스트 6.27  컬렉션 파라미터가 있는 다른 자바 인터페이스

/* 자바 */
interface DataParser<T> {
    void parseData(String input
      List<T> output,
      List<String> errors);
}
